package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GitPrDraftLine: ImageVector
    get() {
        if (_gitPrDraftLine != null) return _gitPrDraftLine!!
        _gitPrDraftLine = remixIcon(
            name = "GitPrDraftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 6C5 5.448 5.448 5 6 5c.552 0 1 .448 1 1C7 6.552 6.552 7 6 7 5.448 7 5 6.552 5 6ZM6 3C4.343 3 3 4.343 3 6c0 1.306 .835 2.417 2 2.829v6.341C3.835 15.583 3 16.694 3 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C9 16.694 8.165 15.583 7 15.171v-6.341C8.165 8.417 9 7.306 9 6 9 4.343 7.657 3 6 3ZM5 18c0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 .552-.448 1-1 1C5.448 19 5 18.552 5 18ZM18 17c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1ZM15 18c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3ZM18 7.5c.828 0 1.5-.672 1.5-1.5C19.5 5.172 18.828 4.5 18 4.5c-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5ZM19.5 11.5C19.5 12.328 18.828 13 18 13c-.828 0-1.5-.672-1.5-1.5C16.5 10.672 17.172 10 18 10c.828 0 1.5 .672 1.5 1.5Z"),
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
        return _gitPrDraftLine!!
    }

private var _gitPrDraftLine: ImageVector? = null
