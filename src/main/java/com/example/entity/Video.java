package com.example.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 视频表
 * </p>
 *
 * @author ${author}
 * @since 2019-08-30
 */
public class Video extends Model<Video> {

    private static final long serialVersionUID = 1L;

    /**
     * videoId
     */
	@TableId(value="video_id", type= IdType.AUTO)
	private Long videoId;
    /**
     * 用户ID
     */
	@TableField("user_id")
	private Long userId;
    /**
     * 音频ID
     */
	@TableField("audio_id")
	private Long audioId;
    /**
     * 分类ID
     */
	@TableField("category_id")
	private Long categoryId;
    /**
     * 视频播放地址
     */
	@TableField("video_playUrl")
	private String videoPlayUrl;
    /**
     * 网络播放地址
     */
	@TableField("video_webUrl")
	private String videoWebUrl;
    /**
     * 视频封面
     */
	@TableField("video_cover")
	private String videoCover;
    /**
     * 视频类型
     */
	@TableField("video_type")
	private String videoType;
    /**
     * 视频标签
     */
	@TableField("video_tag")
	private String videoTag;
    /**
     * 视频标题
     */
	@TableField("video_title")
	private String videoTitle;
    /**
     * 视频描述
     */
	@TableField("video_description")
	private String videoDescription;
    /**
     * 视频分类
     */
	@TableField("video_category")
	private String videoCategory;
    /**
     * 视频状态
     */
	@TableField("video_status")
	private String videoStatus;
    /**
     * 视频时长
     */
	@TableField("video_duration")
	private Long videoDuration;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 喜欢/点赞 数量
     */
	@TableField("like_count")
	private Long likeCount;
    /**
     * 分享数量
     */
	@TableField("share_count")
	private Long shareCount;
	@TableField("download_count")
	private Long downloadCount;
    /**
     * 评论数量
     */
	@TableField("comment_count")
	private Long commentCount;
    /**
     * 视频宽度
     */
	@TableField("video_width")
	private Long videoWidth;
    /**
     * 视频高度
     */
	@TableField("video_height")
	private Long videoHeight;


	public Long getVideoId() {
		return videoId;
	}

	public Video setVideoId(Long videoId) {
		this.videoId = videoId;
		return this;
	}

	public Long getUserId() {
		return userId;
	}

	public Video setUserId(Long userId) {
		this.userId = userId;
		return this;
	}

	public Long getAudioId() {
		return audioId;
	}

	public Video setAudioId(Long audioId) {
		this.audioId = audioId;
		return this;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public Video setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
		return this;
	}

	public String getVideoPlayUrl() {
		return videoPlayUrl;
	}

	public Video setVideoPlayUrl(String videoPlayUrl) {
		this.videoPlayUrl = videoPlayUrl;
		return this;
	}

	public String getVideoWebUrl() {
		return videoWebUrl;
	}

	public Video setVideoWebUrl(String videoWebUrl) {
		this.videoWebUrl = videoWebUrl;
		return this;
	}

	public String getVideoCover() {
		return videoCover;
	}

	public Video setVideoCover(String videoCover) {
		this.videoCover = videoCover;
		return this;
	}

	public String getVideoType() {
		return videoType;
	}

	public Video setVideoType(String videoType) {
		this.videoType = videoType;
		return this;
	}

	public String getVideoTag() {
		return videoTag;
	}

	public Video setVideoTag(String videoTag) {
		this.videoTag = videoTag;
		return this;
	}

	public String getVideoTitle() {
		return videoTitle;
	}

	public Video setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
		return this;
	}

	public String getVideoDescription() {
		return videoDescription;
	}

	public Video setVideoDescription(String videoDescription) {
		this.videoDescription = videoDescription;
		return this;
	}

	public String getVideoCategory() {
		return videoCategory;
	}

	public Video setVideoCategory(String videoCategory) {
		this.videoCategory = videoCategory;
		return this;
	}

	public String getVideoStatus() {
		return videoStatus;
	}

	public Video setVideoStatus(String videoStatus) {
		this.videoStatus = videoStatus;
		return this;
	}

	public Long getVideoDuration() {
		return videoDuration;
	}

	public Video setVideoDuration(Long videoDuration) {
		this.videoDuration = videoDuration;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public Video setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Long getLikeCount() {
		return likeCount;
	}

	public Video setLikeCount(Long likeCount) {
		this.likeCount = likeCount;
		return this;
	}

	public Long getShareCount() {
		return shareCount;
	}

	public Video setShareCount(Long shareCount) {
		this.shareCount = shareCount;
		return this;
	}

	public Long getDownloadCount() {
		return downloadCount;
	}

	public Video setDownloadCount(Long downloadCount) {
		this.downloadCount = downloadCount;
		return this;
	}

	public Long getCommentCount() {
		return commentCount;
	}

	public Video setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
		return this;
	}

	public Long getVideoWidth() {
		return videoWidth;
	}

	public Video setVideoWidth(Long videoWidth) {
		this.videoWidth = videoWidth;
		return this;
	}

	public Long getVideoHeight() {
		return videoHeight;
	}

	public Video setVideoHeight(Long videoHeight) {
		this.videoHeight = videoHeight;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.videoId;
	}

}
