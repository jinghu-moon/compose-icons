package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ScrollToBottomFill: ImageVector
    get() {
        if (_scrollToBottomFill != null) return _scrollToBottomFill!!
        _scrollToBottomFill = remixIcon(
            name = "ScrollToBottomFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.859 2h-1.718C9.127 2 8.047 2.278 7.069 2.801 6.092 3.324 5.324 4.092 4.801 5.069 4.278 6.047 4 7.127 4 9.141v5.718c0 2.014 .278 3.094 .801 4.072 .523 .978 1.29 1.745 2.268 2.268 .978 .523 2.058 .801 4.072 .801h1.718c2.014 0 3.094-.278 4.072-.801 .978-.523 1.745-1.29 2.268-2.268 .523-.978 .801-2.058 .801-4.072v-5.718C20 7.127 19.722 6.047 19.199 5.069 18.676 4.092 17.908 3.324 16.931 2.801 15.953 2.278 14.873 2 12.859 2ZM11 11v-5h2v5h-2ZM7.758 13.758 9.172 12.344l2.828 2.828 2.828-2.828 1.414 1.414-4.243 4.243L7.758 13.758Z"),
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
        return _scrollToBottomFill!!
    }

private var _scrollToBottomFill: ImageVector? = null
