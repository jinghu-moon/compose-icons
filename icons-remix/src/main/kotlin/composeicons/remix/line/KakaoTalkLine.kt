package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.KakaoTalkLine: ImageVector
    get() {
        if (_kakaoTalkLine != null) return _kakaoTalkLine!!
        _kakaoTalkLine = remixIcon(
            name = "KakaoTalkLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.679 18.123C3.093 16.566 1.501 14.112 1.501 11.405 1.501 6.701 6.249 3 12.001 3c5.752 0 10.5 3.701 10.5 8.405 0 4.704-4.748 8.405-10.5 8.405-.442 0-.881-.022-1.318-.066L6.918 22.203c-.616 .326-.957 .425-1.485 .066-.621-.423-.597-.892-.382-1.559l.627-2.587ZM3.501 11.405c0 2.132 1.418 4.123 3.781 5.321l.706 .358-.187 .77-.401 1.649 2.799-1.831 .366 .047c.474 .061 .952 .092 1.434 .092 4.741 0 8.5-2.93 8.5-6.405C20.501 7.93 16.742 5 12.001 5 7.26 5 3.501 7.93 3.501 11.405ZM17.908 11.059l1.513 2.155c.15 .213 .098 .508-.115 .657-.083 .058-.177 .086-.271 .086-.148 0-.295-.07-.387-.201L17.221 11.724l-.428 .414v1.363c0 .261-.211 .472-.472 .472-.26 0-.472-.211-.472-.472v-1.439c-.017-.073-.018-.149 0-.222v-2.557c0-.261 .211-.472 .472-.472 .261 0 .472 .211 .472 .472v1.542L18.722 8.958c.188-.181 .486-.176 .667 .011 .181 .187 .176 .486-.011 .667l-1.47 1.423ZM14.95 12.984c.261 0 .472 .211 .472 .472 0 .261-.211 .472-.472 .472h-1.932c-.26 0-.472-.211-.472-.472v-4.159c0-.261 .211-.472 .472-.472 .261 0 .472 .211 .472 .472v3.687h1.46ZM9.093 11.892h1.333L9.789 10.185l-.696 1.708ZM11.616 12.38l.345 .925c.091 .244-.033 .516-.277 .607-.054 .02-.11 .03-.165 .03-.192 0-.371-.117-.442-.307l-.298-.799h-2.07l-.331 .812c-.098 .241-.374 .357-.615 .259-.241-.098-.357-.374-.259-.615L9.165 9.217c.116-.28 .375-.454 .653-.446 .283 .008 .529 .194 .628 .473l1.045 2.801c.078 .084 .127 .196 .127 .32 0 .005-.001 .01-.002 .016ZM8.294 9.302c0 .261-.211 .472-.472 .472h-1.14v3.736c0 .261-.211 .472-.472 .472-.261 0-.472-.211-.472-.472v-3.736h-1.16c-.261 0-.472-.211-.472-.472 0-.261 .211-.472 .472-.472h3.244c.261 0 .472 .211 .472 .472Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _kakaoTalkLine!!
    }

private var _kakaoTalkLine: ImageVector? = null
