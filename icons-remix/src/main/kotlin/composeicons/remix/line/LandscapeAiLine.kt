package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LandscapeAiLine: ImageVector
    get() {
        if (_landscapeAiLine != null) return _landscapeAiLine!!
        _landscapeAiLine = remixIcon(
            name = "LandscapeAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.213 8.628l-.247 .566c-.18 .414-.753 .414-.934 0L4.787 8.628C4.347 7.619 3.555 6.816 2.568 6.377L1.808 6.039c-.411-.183-.411-.78 0-.963l.717-.319C3.538 4.307 4.344 3.474 4.776 2.431l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338C7.445 6.816 6.653 7.619 6.213 8.628ZM15 6l-3.73 6.216L9 8 2 21h21L15 6ZM14.987 19 12.39 14.238l2.508-4.18L19.667 19h-4.679ZM12.652 19h-7.303L9 12.219 12.652 19Z"),
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
        return _landscapeAiLine!!
    }

private var _landscapeAiLine: ImageVector? = null
