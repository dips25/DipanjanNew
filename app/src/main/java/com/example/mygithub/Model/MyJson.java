package com.example.mygithub.Model;

import java.util.ArrayList;
import java.util.Date;

import com.example.mygithub.Model.MyJson.*;

public class MyJson {
    // import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
    public static class AdditionalProperties{
        public String type;
    }

    public static class Admin{
        public String type;
    }

    public class AdvancedSecurity{
        public String type;
        public Properties properties;
    }

    public static class AllowAutoMerge{
        public String type;
        public String description;
        public boolean mydefault;
        public ArrayList<Boolean> examples;
    }

    public static class AllowForking{
        public String type;
        public String description;
        public ArrayList<Boolean> examples;
    }

    public static class AllowMergeCommit{
        public String type;
        public String description;

        public boolean mydefault;
        public ArrayList<Boolean> examples;
    }

    public static class AllowRebaseMerge{
        public String description;

        public boolean mydefault;
        public String type;
        public ArrayList<Boolean> examples;
    }

    public static class AllowSquashMerge{
        public String type;
        public String description;

        public boolean mydefault;
        public ArrayList<Boolean> examples;
    }

    public static class AllowUpdateBranch{
        public String type;
        public String description;

        public boolean mydefault;
        public ArrayList<Boolean> examples;
    }

    public class AllVersions{
        public FreeProTeamLatest freeProTeamLatest;
        public EnterpriseCloudLatest enterprise;
        public EnterpriseServer39 enterpriseServer39;
        public EnterpriseServer38 enterpriseServer38;
        public EnterpriseServer37 enterpriseServer37;
        public EnterpriseServer36 enterpriseServer36;
        public GithubAeLatest github;
    }

    public static class AnonymousAccessEnabled{
        public String type;
        public String description;

        public boolean mydefault;
    }

    public class AnyOf{
        public String type;
        public String title;
        public String description;
        public Properties properties;
        public ArrayList<String> required;
    }

    public static class Archived{
        public String type;
        public String description;

        public boolean mydefault;
    }

    public static class ArchiveUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public static class AssigneesUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public static class AutomatedPageContext{
        public String title;
        public String intro;
        public String renderedPage;
        public ArrayList<Object> miniTocItems;
        public String product;
        public String permissions;
    }

    public static class AvatarUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public static class Banner{
        public String api_versioned;
        public String api_version_info;
        public String ghes_api_versioned;
        public String redirect_notice;
        public String redirect_repo;
        public String redirect_enterprise;
        public String actions_api_title;
    }

    public static class BlobsUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public static class Body{
        public String type;
        public ArrayList<String> examples;
    }

    public class BodyParameter{
        public String type;
        public String name;
        public String in;
        public String description;
        public boolean isRequired;

        public boolean mydefault;

        public ArrayList<String> myenum;
        public ArrayList<ChildParamsGroup> childParamsGroups;
        public String homepage;

        public boolean myprivate;
        public boolean has_issues;
        public boolean has_projects;
        public boolean has_wiki;
        public String event_type;
        public ClientPayload client_payload;
        public ArrayList<String> names;
        public String new_owner;
        public ArrayList<Integer> team_ids;
        public String new_name;
        public String owner;
        public boolean include_all_branches;
        public boolean is_template;
    }

    public static class BranchesUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public static class Breadcrumb{
        public String href;
        public String title;
    }

    public static class ChildPage{
        public String href;
        public String title;
        public ArrayList<ChildPage> childPages;
    }

    public static class ChildParamsGroup{
        public String type;
        public String name;
        public String description;
        public ArrayList<ChildParamsGroup> childParamsGroups;
    }

    public static class ChildTocItem{
        public String fullPath;
        public String title;
    }

    public static class ClientPayload{
        public boolean unit;
        public boolean integration;
    }

    public static class CloneUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class CodeExample{
        public String key;
        public Request request;
        public Response response;
    }

    public static class CodeExample2{
        public String search_button;
        public String search_examples;
    }

    public static class CodeOfConduct{
        public String title;
        public String description;
        public String type;
        public Properties properties;
        public ArrayList<String> required;
    }

    public static class CodeSampleOptions{
        public String ghcli;
        public String javascript;
        public String curl;
    }

    public static class CollaboratorsUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public static class Column{
        public String description;
        public String type;
        public ArrayList<Integer> examples;
    }

    public static class CommentsUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class Commit{
        public String type;
        public Properties properties;
        public ArrayList<String> required;
    }

    public static class CommitsUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public static class CommunityRedirect{
    }

    public static class CompareUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public static class ContentsUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public static class ContributionCta{
        public String title;
        public String body;
        public String button;
        public String to_guidelines;
    }

    public static class Contributions{
        public String type;
    }

    public static class ContributorsUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public static class CreatedAt{
        public ArrayList<String> type;
        public String format;
        public ArrayList<Date> examples;
    }

    public static class CurrentLearningTrack{
    }

    public static class CurrentProduct{
        public String id;
        public String name;
        public String href;
        public String dir;
        public String toc;
        public boolean wip;
        public boolean hidden;
        public ArrayList<String> versions;
    }

    public class Data{
        public Ui ui;
        public Reusables reusables;
        public Variables variables;
    }

    public static class De{
        public String name;
        public String code;
        public String nativeName;
    }

    public static class DefaultBranch{
        public String type;
        public String description;
        public ArrayList<String> examples;
    }

    public static class DeleteBranchOnMerge{
        public String type;
        public String description;

        public boolean mydefault;
        public ArrayList<Boolean> examples;
    }

    public class DependabotSecurityUpdates{
        public String description;
        public String type;
        public Properties properties;
    }

    public static class DeploymentsUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public static class Description{
        public ArrayList<String> type;
        public ArrayList<String> examples;
        public String description;
    }

    public class Disabled{
        public String type;
        public String description;
    }

    public class DownloadsUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class Email{
        public ArrayList<String> type;
    }

    public class En{
        public String name;
        public String code;
    }

    public class EnterpriseCloudLatest{
        public String version;
        public String versionTitle;
        public String latestVersion;
        public String currentRelease;
        public String openApiVersionName;
        public String miscVersionName;
        public ArrayList<String> apiVersions;
        public String latestApiVersion;
        public String plan;
        public String planTitle;
        public String shortName;
        public ArrayList<String> releases;
        public String latestRelease;
        public boolean hasNumberedReleases;
        public String openApiBaseName;
        public String miscBaseName;
    }

    public class EnterpriseDeprecation{
        public String version_was_deprecated;
        public String version_will_be_deprecated;
        public String deprecation_details;
    }

    public class EnterpriseServer36{
        public String version;
        public String versionTitle;
        public String latestVersion;
        public String currentRelease;
        public String openApiVersionName;
        public String miscVersionName;
        public ArrayList<Object> apiVersions;
        public String latestApiVersion;
        public String plan;
        public String planTitle;
        public String shortName;
        public ArrayList<String> releases;
        public String latestRelease;
        public boolean hasNumberedReleases;
        public String openApiBaseName;
        public String miscBaseName;
    }

    public class EnterpriseServer37{
        public String version;
        public String versionTitle;
        public String latestVersion;
        public String currentRelease;
        public String openApiVersionName;
        public String miscVersionName;
        public ArrayList<Object> apiVersions;
        public String latestApiVersion;
        public String plan;
        public String planTitle;
        public String shortName;
        public ArrayList<String> releases;
        public String latestRelease;
        public boolean hasNumberedReleases;
        public String openApiBaseName;
        public String miscBaseName;
    }

    public class EnterpriseServer38{
        public String version;
        public String versionTitle;
        public String latestVersion;
        public String currentRelease;
        public String openApiVersionName;
        public String miscVersionName;
        public ArrayList<Object> apiVersions;
        public String latestApiVersion;
        public String plan;
        public String planTitle;
        public String shortName;
        public ArrayList<String> releases;
        public String latestRelease;
        public boolean hasNumberedReleases;
        public String openApiBaseName;
        public String miscBaseName;
    }

    public class EnterpriseServer39{
        public String version;
        public String versionTitle;
        public String latestVersion;
        public String currentRelease;
        public String openApiVersionName;
        public String miscVersionName;
        public ArrayList<String> apiVersions;
        public String latestApiVersion;
        public String plan;
        public String planTitle;
        public String shortName;
        public ArrayList<String> releases;
        public String latestRelease;
        public boolean hasNumberedReleases;
        public String openApiBaseName;
        public String miscBaseName;
    }

    public class EnterpriseServerReleases{
        public boolean isOldestReleaseDeprecated;
        public String oldestSupported;
        public String nextDeprecationDate;
        public ArrayList<String> supported;
    }

    public class Errors{
        public String type;
        public Items items;
        public String oops;
        public String something_went_wrong;
        public String we_track_errors;
        public String page_doesnt_exist;
    }

    public class Es{
        public String name;
        public String code;
        public String nativeName;
    }

    public class EventsUrl{
        public String type;
        public ArrayList<String> examples;
        public String format;
    }

    public class FeaturedLinks{
    }

    public class FeatureFlags{
    }

    public class Filters{
        public String type;
        public String topic;
        public String all;
    }

    public class FollowersUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class FollowingUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class Footer{
        public String support_heading;
        public String legal_heading;
        public String imprint;
        public String terms;
        public String privacy;
        public String status;
        public String pricing;
        public String expert_services;
        public String blog;
    }

    public class Fork{
        public String type;
    }

    public class Forks{
        public String type;
        public ArrayList<Integer> examples;
    }

    public class ForksCount{
        public String type;
        public ArrayList<Integer> examples;
    }

    public class ForksUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class Fr{
        public String name;
        public String code;
        public String nativeName;
    }

    public class FreeProTeamLatest{
        public String version;
        public String versionTitle;
        public String latestVersion;
        public String currentRelease;
        public String openApiVersionName;
        public String miscVersionName;
        public ArrayList<String> apiVersions;
        public String latestApiVersion;
        public String plan;
        public String planTitle;
        public String shortName;
        public ArrayList<String> releases;
        public String latestRelease;
        public boolean nonEnterpriseDefault;
        public boolean hasNumberedReleases;
        public String openApiBaseName;
        public String miscBaseName;
    }

    public class FullName{
        public String type;
        public ArrayList<String> examples;
    }

    public class GistsUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class GitCommitsUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class GithubAeLatest{
        public String version;
        public String versionTitle;
        public String latestVersion;
        public String currentRelease;
        public String openApiVersionName;
        public String miscVersionName;
        public ArrayList<Object> apiVersions;
        public String latestApiVersion;
        public String plan;
        public String planTitle;
        public String shortName;
        public ArrayList<String> releases;
        public String latestRelease;
        public String internalLatestRelease;
        public boolean hasNumberedReleases;
        public String openApiBaseName;
        public String miscBaseName;
    }

    public class GitRefsUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class GitTagsUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class GitUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class Graphql{
        public Reference reference;
        public Overview overview;
    }

    public class GravatarId{
        public ArrayList<String> type;
        public ArrayList<String> examples;
    }

    public class GuidesFound{
        public String multiple;
        public String one;
        public String none;
    }

    public class GuideTypes{
        public String overview;
        public String quick_start;
        public String tutorial;
        public String how_to;
        public String reference;
    }

    public class HasDiscussions{
        public String type;
        public String description;

        public boolean mydefault;
        public ArrayList<Boolean> examples;
    }

    public class HasDownloads{
        public String type;
        public String description;

        public boolean mydefault;
        public ArrayList<Boolean> examples;
    }

    public class HasIssues{
        public String type;
        public String description;
        public boolean mydefault;
        public ArrayList<Boolean> examples;
    }

    public class HasPages{
        public String type;
    }

    public class HasProjects{
        public String type;
        public String description;

        public boolean mydefault;
        public ArrayList<Boolean> examples;
    }

    public class HasWiki{
        public String type;
        public String description;

        public boolean mydefault;
        public ArrayList<Boolean> examples;
    }

    public class Header{
        public String github_docs;
        public String contact;
        public Notices notices;
        public String sign_up_cta;
        public String menu;
    }

    public class Homepage{
        public ArrayList<String> type;
        public String format;
        public ArrayList<String> examples;
        public String explore_by_product;
        public String version_picker;
        public String description;
    }

    public class HooksUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class HtmlUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class Id{
        public String type;
        public ArrayList<Integer> examples;
        public String description;
    }

    public class IssueCommentUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class IssueEventsUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class IssuesUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class IsTemplate{
        public String type;
        public String description;

        public boolean mydefault;
        public ArrayList<Boolean> examples;
    }

    public class Items{
        public String title;
        public String description;
        public String type;
        public Properties properties;
        public ArrayList<String> required;
    }

    public class Ja{
        public String name;
        public String code;
        public String nativeName;
    }

    public class Key{
        public String type;
        public ArrayList<String> examples;
    }

    public class KeysUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class Kind{
        public String description;
        public String type;
        public ArrayList<String> examples;
    }

    public class Ko{
        public String name;
        public String code;
        public String nativeName;
    }

    public class LabelsUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class Language{
        public ArrayList<String> type;
    }

    public class Languages{
        public En en;
        public Zh zh;
        public Es es;
        public Pt pt;
        public Ru ru;
        public Ja ja;
        public Fr fr;
        public De de;
        public Ko ko;
    }

    public class LanguagesContext{
        public Languages languages;
    }

    public class LanguagesUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class LanguageVariant{
        public String name;
        public String code;
        public String hreflang;
        public String href;
    }

    public class LdapDn{
        public String description;
        public String type;
        public ArrayList<String> examples;
    }

    public class LearningTrackNav{
        public String prev_guide;
        public String next_guide;
        public String more_guides;
        public String current_progress;
    }

    public class License{
        public ArrayList<String> type;
        public Properties properties;
        public ArrayList<AnyOf> anyOf;
    }

    public class Line{
        public String description;
        public String type;
        public ArrayList<Integer> examples;
    }

    public class Login{
        public String type;
        public ArrayList<String> examples;
    }

    public class MainContext{
        public ArrayList<Breadcrumb> breadcrumbs;
        public Object homepageLinks;
        public CommunityRedirect communityRedirect;
        public CurrentProduct currentProduct;
        public String currentLayoutName;
        public boolean isHomepageVersion;
        public boolean isFPT;
        public String error;
        public Data data;
        public String currentCategory;
        public String currentPathWithoutLanguage;
        public String relativePath;
        public Page page;
        public EnterpriseServerReleases enterpriseServerReleases;
        public ArrayList<String> enterpriseServerVersions;
        public AllVersions allVersions;
        public String currentVersion;
        public Object currentProductTree;
        public SidebarTree sidebarTree;
        public FeatureFlags featureFlags;
        public SearchVersions searchVersions;
        public String nonEnterpriseDefaultVersion;
        public int status;
        public String fullUrl;
    }

    public class Maintain{
        public String type;
    }

    public class MasterBranch{
        public String type;
    }

    public class MembersUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class MergeCommitMessage{
        public String type;
        public ArrayList<String> myenum;
        public String description;
        public ArrayList<String> examples;
    }

    public class MergeCommitTitle{
        public String type;
        public ArrayList<String> myenum;
        public String description;
        public ArrayList<String> examples;
    }

    public class MergesUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class Message{
        public String description;
        public String type;
        public ArrayList<String> examples;
    }

    public class Meta{
        public String default_description;
    }

    public class MilestonesUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class MirrorUrl{
        public ArrayList<String> type;
        public String format;
        public ArrayList<String> examples;
    }

    public class Name{
        public String type;
        public ArrayList<String> examples;
        public String description;
    }

    public class Names{
        public String type;
        public Items items;
    }

    public class NetworkCount{
        public String type;
        public ArrayList<Integer> examples;
    }

    public class NodeId{
        public String type;
        public ArrayList<String> examples;
    }

    public class Notices{
        public String ghae_silent_launch;
        public String release_candidate;
        public String early_access;
        public String release_notes_use_latest;
        public String ghes_release_notes_upgrade_patch_only;
        public String ghes_release_notes_upgrade_release_only;
        public String ghes_release_notes_upgrade_patch_and_release;
    }

    public class NotificationSetting{
        public String type;
        public String description;
        public ArrayList<String> examples;
    }

    public class NotificationsUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class OpenIssues{
        public String type;
        public ArrayList<Integer> examples;
    }

    public class OpenIssuesCount{
        public String type;
        public ArrayList<Integer> examples;
    }

    public class Organization{
        public ArrayList<AnyOf> anyOf;
    }

    public class OrganizationsUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class Overview{
        public String preview_header;
        public String preview_schema_members;
        public String announced;
        public String updates;
        public Permissions permissions;
    }

    public class Owner{
        public String title;
        public String description;
        public String type;
        public Properties properties;
        public ArrayList<String> required;
    }

    public class Page{
        public ArrayList<LanguageVariant> languageVariants;
        public String documentType;
        public Object type;
        public String title;
        public String fullTitle;
        public ArrayList<String> topics;
        public String introPlainText;
        public ArrayList<Permalink> permalinks;
        public boolean hidden;
        public boolean noEarlyAccessBanner;
    }

    public class PageProps{
        public ArrayList<RestOperation> restOperations;
        public MainContext mainContext;
        public AutomatedPageContext automatedPageContext;
        public TocLandingContext tocLandingContext;
    }

    public class Pages{
        public String article_version;
        public String miniToc;
        public String all_enterprise_releases;
        public String about_versions;
        public String permissions_statement;
        public String video_from_transcript;
    }

    public class Parameter{
        public String name;
        public String description;
        public String in;
        public boolean required;
        public Schema schema;
        public String org;
        public String owner;
        public String repo;
        public String template_owner;
        public String template_repo;
        public String username;
    }

    public class ParameterTable{
        public String body;
        public String mydefault;
        public String description;
        public String enum_description_title;
        public String headers;
        public String name;
        public String path;
        public String query;
        public String required;
        public String see_preview_notice;
        public String see_preview_notices;
        public String type;
        public String single_enum_description;
    }

    public class Parent{
        public ArrayList<AnyOf> anyOf;
        public String title;
        public String description;
        public String type;
        public Properties properties;
        public ArrayList<String> required;
    }

    public class Path{
        public String description;
        public String type;
        public ArrayList<String> examples;
    }

    public class Permalink{
        public String title;
        public String pageVersion;
        public String href;
        public String relativePath;
        public String languageCode;
    }

    public class Permission{
        public String type;
        public String description;
        public ArrayList<String> examples;
    }

    public class Permissions{
        public String type;
        public Properties properties;
        public ArrayList<String> required;
        public String access;
        public String endpoints;
        public String tokens;
        public String additionalPermissions;
        public String uat;
        public String iat;
    }

    public class Picker{
        public String language_picker_default_text;
        public String product_picker_default_text;
        public String version_picker_default_text;
    }

    public class Policies{
        public String translation;
    }

    public class Privacy{
        public String type;
        public String description;
        public ArrayList<String> examples;
    }

    public class Private{
        public String type;
        public String description;
        public boolean mydefault;
    }

    public class ProductGuides{
        public String learning_paths_title;
        public String start_path;
        public String learning_paths_desc;
        public String more_guides;
        public String load_more;
        public String all_guides_title;
        public String filter_instructions;
        public Filters filters;
        public GuidesFound guides_found;
        public GuideTypes guide_types;
    }

    public class ProductLanding{
        public String quickstart;
        public String reference;
        public String overview;
        public String guides;
        public String explore_guides;
        public String code_examples;
        public String search_code_examples;
        public String search_results_for;
        public String matches_displayed;
        public String show_more;
        public String explore_people_and_projects;
        public String sorry;
        public String no_example;
        public String try_another;
        public String no_result;
        public String learn;
        public String communities_using_discussions;
        public String add_your_community;
        public String sponsor_community;
        public String supported_releases;
        public String release_notes_for;
        public String upgrade_from;
        public String browse_all_docs;
        public String browse_all;
        public String docs;
        public String explore_release_notes;
        public String view;
        public String view_transcript;
        public String all_docs;
        public CodeExample code_example;
    }

    public class Products{
        public Graphql graphql;
        public Rest rest;
        public Webhooks webhooks;
    }

    public class Properties{
        public Id id;
        public NodeId node_id;
        public Name name;
        public FullName full_name;
        public Owner owner;
        public Private myprivate;
        public HtmlUrl html_url;
        public Description description;
        public Fork fork;
        public Url url;
        public ArchiveUrl archive_url;
        public AssigneesUrl assignees_url;
        public BlobsUrl blobs_url;
        public BranchesUrl branches_url;
        public CollaboratorsUrl collaborators_url;
        public CommentsUrl comments_url;
        public CommitsUrl commits_url;
        public CompareUrl compare_url;
        public ContentsUrl contents_url;
        public ContributorsUrl contributors_url;
        public DeploymentsUrl deployments_url;
        public DownloadsUrl downloads_url;
        public EventsUrl events_url;
        public ForksUrl forks_url;
        public GitCommitsUrl git_commits_url;
        public GitRefsUrl git_refs_url;
        public GitTagsUrl git_tags_url;
        public GitUrl git_url;
        public IssueCommentUrl issue_comment_url;
        public IssueEventsUrl issue_events_url;
        public IssuesUrl issues_url;
        public KeysUrl keys_url;
        public LabelsUrl labels_url;
        public LanguagesUrl languages_url;
        public MergesUrl merges_url;
        public MilestonesUrl milestones_url;
        public NotificationsUrl notifications_url;
        public PullsUrl pulls_url;
        public ReleasesUrl releases_url;
        public SshUrl ssh_url;
        public StargazersUrl stargazers_url;
        public StatusesUrl statuses_url;
        public SubscribersUrl subscribers_url;
        public SubscriptionUrl subscription_url;
        public TagsUrl tags_url;
        public TeamsUrl teams_url;
        public TreesUrl trees_url;
        public CloneUrl clone_url;
        public MirrorUrl mirror_url;
        public HooksUrl hooks_url;
        public SvnUrl svn_url;
        public Homepage homepage;
        public Language language;
        public ForksCount forks_count;
        public StargazersCount stargazers_count;
        public WatchersCount watchers_count;
        public Size size;
        public DefaultBranch default_branch;
        public OpenIssuesCount open_issues_count;
        public IsTemplate is_template;
        public Topics topics;
        public HasIssues has_issues;
        public HasProjects has_projects;
        public HasWiki has_wiki;
        public HasPages has_pages;
        public HasDownloads has_downloads;
        public HasDiscussions has_discussions;
        public Archived archived;
        public Disabled disabled;
        public Visibility visibility;
        public PushedAt pushed_at;
        public CreatedAt created_at;
        public UpdatedAt updated_at;
        public Permissions permissions;
        public RoleName role_name;
        public TempCloneToken temp_clone_token;
        public DeleteBranchOnMerge delete_branch_on_merge;
        public SubscribersCount subscribers_count;
        public NetworkCount network_count;
        public CodeOfConduct code_of_conduct;
        public License license;
        public Forks forks;
        public OpenIssues open_issues;
        public Watchers watchers;
        public AllowForking allow_forking;
        public WebCommitSignoffRequired web_commit_signoff_required;
        public SecurityAndAnalysis security_and_analysis;
        public Login login;
        public AvatarUrl avatar_url;
        public GravatarId gravatar_id;
        public FollowersUrl followers_url;
        public FollowingUrl following_url;
        public GistsUrl gists_url;
        public StarredUrl starred_url;
        public SubscriptionsUrl subscriptions_url;
        public OrganizationsUrl organizations_url;
        public ReposUrl repos_url;
        public ReceivedEventsUrl received_events_url;
        public Type type;
        public SiteAdmin site_admin;
        public Contributions contributions;
        public Email email;
        public Commit commit;
        public ZipballUrl zipball_url;
        public TarballUrl tarball_url;
        public Slug slug;
        public Privacy privacy;
        public NotificationSetting notification_setting;
        public Permission permission;
        public MembersUrl members_url;
        public RepositoriesUrl repositories_url;
        public Parent parent;
        public Organization organization;
        public AllowRebaseMerge allow_rebase_merge;
        public TemplateRepository template_repository;
        public AllowSquashMerge allow_squash_merge;
        public AllowAutoMerge allow_auto_merge;
        public AllowUpdateBranch allow_update_branch;
        public UseSquashPrTitleAsDefault use_squash_pr_title_as_default;
        public SquashMergeCommitTitle squash_merge_commit_title;
        public SquashMergeCommitMessage squash_merge_commit_message;
        public MergeCommitTitle merge_commit_title;
        public MergeCommitMessage merge_commit_message;
        public AllowMergeCommit allow_merge_commit;
        public MasterBranch master_branch;
        public StarredAt starred_at;
        public AnonymousAccessEnabled anonymous_access_enabled;
        public Status status;
        public Sha sha;
        public LdapDn ldap_dn;
        public Admin admin;
        public Maintain maintain;
        public Push push;
        public Triage triage;
        public Pull pull;
        public Source source;
        public Errors errors;
        public Names names;
        public Key key;
        public SpdxId spdx_id;
        public Body body;
        public AdvancedSecurity advanced_security;
        public DependabotSecurityUpdates dependabot_security_updates;
        public SecretScanning secret_scanning;
        public SecretScanningPushProtection secret_scanning_push_protection;
        public Line line;
        public Column column;
        public Kind kind;
        public Suggestion suggestion;
        public Message message;
        public Path path;
    }

    public class Props{
        public PageProps pageProps;
        public LanguagesContext languagesContext;
        public boolean __N_SSP;
    }

    public class Pt{
        public String name;
        public String code;
        public String nativeName;
    }

    public class Pull{
        public String type;
    }

    public class PullsUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class Push{
        public String type;
    }

    public class PushedAt{
        public ArrayList<String> type;
        public String format;
        public ArrayList<Date> examples;
    }

    public class Query{
        public String apiVersion;
        public String versionId;
        public String category;
    }

    public class ReceivedEventsUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class Reference{

        public String myimplements;
        public String fields;
        public String arguments;
        public String name;
        public String type;
        public String description;
        public String input_fields;
        public String return_fields;
        public String implemented_by;
        public String values;
        public String possible_types;
        public String preview_notice;
        public String deprecation_notice;
        public String preview_period;
        public String in;
        public String notes;
        public String parameters;
        public String response;
        public String example_response;
        public String status_code;
        public String http_status_code;
        public String code_sample;
        public String code_samples;
        public String preview_notices;
        public String preview_header_is_required;
        public String preview_notice_to_change;
        public String works_with;
        public String api_reference;
        public String enum_description_title;
        public String required;
        public String headers;
        public String query;
        public String path;
        public String body;
        public ResponseOptions response_options;
        public CodeSampleOptions code_sample_options;
    }

    public class ReleaseCandidate{
        public Object version;
    }

    public class ReleaseNotes{
        public String banner_text;
    }

    public class ReleasesUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class RephraseAvailability{
        public String repository;
        public String organization;
        public String app;
        public String business;
        public String marketplace;
        public String sponsors_listing;
    }

    public class RepositoriesUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class ReposUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class Request{
        public String description;
        public String acceptHeader;
        public Parameter parameters;
        public String contentType;
        public BodyParameter bodyParameters;
    }

    public class Response{
        public String statusCode;
        public String contentType;
        public String description;
        public Object example;
        public Schema schema;
    }

    public class ResponseOptions{
        public String example;
        public String schema;
    }

    public class Rest{
        public Banner banner;
        public Versioning versioning;
        public Overview overview;
        public Reference reference;
    }

    public class RestOperation{
        public String serverUrl;
        public String verb;
        public String requestPath;
        public String title;
        public String category;
        public String subcategory;
        public ArrayList<Parameter> parameters;
        public ArrayList<BodyParameter> bodyParameters;
        public boolean enabledForGitHubApps;
        public ArrayList<CodeExample> codeExamples;
        public ArrayList<Object> previews;
        public String descriptionHTML;
        public ArrayList<StatusCode> statusCodes;
    }

    public class Reusables{
        public EnterpriseDeprecation enterprise_deprecation;
        public Policies policies;
    }

    public class RoleName{
        public String type;
        public ArrayList<String> examples;
    }

    public class Root{
        public Props props;
        public String page;
        public Query query;
        public String buildId;
        public boolean isFallback;
        public boolean gssp;
        public boolean customServer;
        public boolean appGip;
        public String locale;
        public ArrayList<String> locales;
        public String defaultLocale;
        public ArrayList<Object> scriptLoader;
    }

    public class Ru{
        public String name;
        public String code;
        public String nativeName;
    }

    public class Schema{
        public String type;

        public ArrayList<String> myenum;

        public Object mydefault;
        public String format;
        public Items items;
        public String title;
        public String description;
        public Properties properties;
        public ArrayList<String> required;
        public AdditionalProperties additionalProperties;
    }

    public class ScrollButton{
        public String scroll_to_top;
    }

    public class Search{
        public String need_help;
        public String placeholder;
        public String search_results_for;
        public String no_content;
        public String matches_found;
        public String matches_displayed;
        public String search_error;
        public String description;
        public String label;
        public String n_results;
        public String one_result;
        public String search_validation_error;
    }

    public class SearchVersions{
        public String free;
        public String enterprisecloud;
        public String enterpriseserver1;
        public String enterpriseserver2;
        public String enterpriseserver3;
        public String enterpriseserver4;
        public String github;
    }

    public class SecretScanning{
        public String type;
        public Properties properties;
    }

    public class SecretScanningPushProtection{
        public String type;
        public Properties properties;
    }

    public class SecurityAndAnalysis{
        public ArrayList<String> type;
        public Properties properties;
    }

    public class Sha{
        public String type;
    }

    public class SidebarTree{
        public String href;
        public String title;
        public ArrayList<ChildPage> childPages;
    }

    public class SiteAdmin{
        public String type;
    }

    public class Size{
        public String description;
        public String type;
        public ArrayList<Integer> examples;
    }

    public class Slug{
        public String type;
        public ArrayList<String> examples;
    }

    public class Source{
        public String title;
        public String description;
        public String type;
        public Properties properties;
        public ArrayList<String> required;
        public ArrayList<String> examples;
    }

    public class SpdxId{
        public String type;
        public ArrayList<String> examples;
    }

    public class SquashMergeCommitMessage{
        public String type;

        public ArrayList<String> myenum;
        public String description;
        public ArrayList<String> examples;
    }

    public class SquashMergeCommitTitle{
        public String type;

        public ArrayList<String> myenum;
        public String description;
        public ArrayList<String> examples;
    }

    public class SshUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class StargazersCount{
        public String type;
        public ArrayList<Integer> examples;
    }

    public class StargazersUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class StarredAt{
        public String type;
        public ArrayList<String> examples;
    }

    public class StarredUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class Status{
        public String type;

        public ArrayList<String> myenum;
        public String description;
    }

    public class StatusCode{
        public String httpStatusCode;
        public String description;
    }

    public class StatusesUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class SubscribersCount{
        public String type;
        public ArrayList<Integer> examples;
    }

    public class SubscribersUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class SubscriptionsUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class SubscriptionUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class Suggestion{
        public String description;
        public ArrayList<String> type;
        public ArrayList<String> examples;
    }

    public class Support{
        public String still_need_help;
        public String contact_support;
        public String ask_community;
    }

    public class Survey{
        public String able_to_find;
        public String yes;
        public String no;
        public String comment_yes_label;
        public String comment_no_label;
        public String optional;
        public String required;
        public String email_placeholder;
        public String email_label;
        public String email_validation;
        public String send;
        public String feedback;
        public String not_support;
        public String privacy_policy;
    }

    public class SvnUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class TagsUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class TarballUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class TeamsUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }

    public class TempCloneToken{
        public String type;
    }

    public class TemplateRepository{
        public ArrayList<String> type;
        public Properties properties;
        public ArrayList<AnyOf> anyOf;
    }

    public class Toc{
        public String getting_started;
        public String popular;
        public String startHere;
        public String whats_new;
        public String videos;
        public String all_changelogs;
    }

    public class TocItem{
        public String fullPath;
        public String title;
        public ArrayList<ChildTocItem> childTocItems;
    }

    public class TocLandingContext{
        public String title;
        public String productCallout;
        public String intro;
        public ArrayList<TocItem> tocItems;
        public String variant;
        public FeaturedLinks featuredLinks;
        public String renderedPage;
        public CurrentLearningTrack currentLearningTrack;
    }

    public class ToggleImages{
        public String off;
        public String on;
        public String hide_single;
        public String show_single;
    }

    public class Topics{
        public String type;
        public Items items;
        public ArrayList<String> examples;
    }

    public class TreesUrl{
        public String type;
        public ArrayList<String> examples;
    }

    public class Triage{
        public String type;
    }

    public class Type{
        public String type;
        public ArrayList<String> examples;
    }

    public class Ui{
        public Meta meta;
        public Header header;
        public Picker picker;
        public ReleaseNotes release_notes;
        public Search search;
        public Homepage homepage;
        public Toc toc;
        public Pages pages;
        public Errors errors;
        public Support support;
        public Survey survey;
        public ContributionCta contribution_cta;
        public ParameterTable parameter_table;
        public Products products;
        public Footer footer;
        public ProductLanding product_landing;
        public ProductGuides product_guides;
        public LearningTrackNav learning_track_nav;
        public ToggleImages toggle_images;
        public ScrollButton scroll_button;
    }

    public class UpdatedAt{
        public ArrayList<String> type;
        public String format;
        public ArrayList<Date> examples;
    }

    public class Url{
        public String type;
        public String format;
        public ArrayList<String> examples;
        public String description;
    }

    public class UseSquashPrTitleAsDefault{
        public String type;
        public String description;

        public boolean mydefault;
        public boolean deprecated;
        public ArrayList<Boolean> examples;
    }

    public class Variables{
        public ReleaseCandidate release_candidate;
    }

    public class Versioning{
        public String about_versions;
    }

    public class Visibility{
        public String type;
        public String description;

        public String mydefault;
        public ArrayList<String> examples;
    }

    public class Watchers{
        public String type;
        public ArrayList<Integer> examples;
    }

    public class WatchersCount{
        public String type;
        public ArrayList<Integer> examples;
    }

    public class WebCommitSignoffRequired{
        public String type;
        public ArrayList<Boolean> examples;
        public String description;
        public boolean mydefault;
    }

    public class Webhooks{
        public String action_type_switch_error;
        public String action_type;
        public String availability;
        public String webhook_payload_object;
        public String webhook_payload_example;
        public RephraseAvailability rephrase_availability;
    }

    public class Zh{
        public String name;
        public String code;
        public String nativeName;
    }

    public class ZipballUrl{
        public String type;
        public String format;
        public ArrayList<String> examples;
    }


}
