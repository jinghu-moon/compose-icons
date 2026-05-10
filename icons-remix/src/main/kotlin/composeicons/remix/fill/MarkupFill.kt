package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MarkupFill: ImageVector
    get() {
        if (_markupFill != null) return _markupFill!!
        _markupFill = remixIcon(
            name = "MarkupFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 21.997c-5.523 0-10-4.477-10-10C2 6.474 6.477 1.997 12 1.997c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM17.051 18.201l-.862-3.447c-.111-.445-.511-.757-.97-.757h-6.438c-.459 0-.859 .312-.97 .757l-.862 3.447c1.377 1.123 3.136 1.796 5.051 1.796 1.915 0 3.674-.673 5.051-1.796ZM10 11.997h4v-1.5L12.962 6.862c-.095-.332-.355-.592-.687-.687-.531-.152-1.085 .156-1.236 .687L10 10.497v1.5Z"),
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
        return _markupFill!!
    }

private var _markupFill: ImageVector? = null
