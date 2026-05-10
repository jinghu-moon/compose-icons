package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.KakaoTalkFill: ImageVector
    get() {
        if (_kakaoTalkFill != null) return _kakaoTalkFill!!
        _kakaoTalkFill = remixIcon(
            name = "KakaoTalkFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 3c5.799 0 10.5 3.664 10.5 8.185 0 4.52-4.701 8.185-10.5 8.185-.588 0-1.165-.038-1.727-.111L5.866 22.142c-.501 .265-.678 .236-.472-.413l.892-3.678C3.406 16.592 1.501 14.062 1.501 11.185 1.501 6.664 6.202 3 12.001 3ZM17.908 11.059 19.378 9.636c.187-.181 .192-.48 .011-.667-.181-.187-.48-.192-.667-.011l-1.928 1.866v-1.542c0-.261-.211-.472-.472-.472-.26 0-.472 .211-.472 .472v2.557c-.018 .073-.017 .149 0 .222v1.439c0 .261 .211 .472 .472 .472 .261 0 .472-.211 .472-.472v-1.363l.428-.414 1.428 2.033c.092 .131 .238 .201 .387 .201 .094 0 .188-.028 .271-.086 .213-.15 .265-.444 .115-.657L17.908 11.059ZM14.95 12.984h-1.46v-3.687c0-.261-.211-.472-.472-.472-.26 0-.472 .211-.472 .472v4.159c0 .261 .211 .472 .472 .472h1.932c.261 0 .472-.211 .472-.472 0-.26-.211-.472-.472-.472ZM9.093 11.892l.696-1.708 .637 1.708h-1.333ZM11.616 12.38c0-.005 .002-.01 .002-.016 0-.124-.049-.236-.127-.32L10.445 9.244c-.098-.28-.345-.466-.628-.473-.278-.008-.537 .166-.653 .446L7.503 13.292c-.098 .241 .018 .517 .259 .615 .241 .098 .517-.018 .615-.259l.331-.812h2.07l.298 .799c.071 .19 .251 .307 .442 .307 .055 0 .11-.01 .165-.03 .244-.091 .368-.363 .277-.607l-.345-.925ZM8.294 9.302c0-.261-.211-.472-.472-.472h-3.244c-.261 0-.472 .211-.472 .472 0 .261 .211 .472 .472 .472h1.16v3.736c0 .261 .211 .472 .472 .472 .261 0 .472-.211 .472-.472v-3.736h1.14c.261 0 .472-.211 .472-.472Z"),
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
        return _kakaoTalkFill!!
    }

private var _kakaoTalkFill: ImageVector? = null
