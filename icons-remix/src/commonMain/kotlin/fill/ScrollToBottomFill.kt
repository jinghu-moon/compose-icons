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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.859 2.000 L 11.141 2.000 C 9.127 2.000 8.047 2.278 7.069 2.801 C 6.092 3.324 5.324 4.092 4.801 5.069 C 4.278 6.047 4.000 7.127 4.000 9.141 L 4.000 14.859 C 4.000 16.873 4.278 17.953 4.801 18.931 C 5.324 19.908 6.092 20.676 7.069 21.199 C 8.047 21.722 9.127 22.000 11.141 22.000 L 12.859 22.000 C 14.873 22.000 15.953 21.722 16.931 21.199 C 17.908 20.676 18.676 19.908 19.199 18.931 C 19.722 17.953 20.000 16.873 20.000 14.859 L 20.000 9.141 C 20.000 7.127 19.722 6.047 19.199 5.069 C 18.676 4.092 17.908 3.324 16.931 2.801 C 15.953 2.278 14.873 2.000 12.859 2.000 ZM 11.000 11.000 L 11.000 6.000 L 13.000 6.000 L 13.000 11.000 L 11.000 11.000 ZM 7.758 13.758 L 9.172 12.344 L 12.000 15.172 L 14.829 12.344 L 16.243 13.758 L 12.000 18.001 L 7.758 13.758 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _scrollToBottomFill!!
    }

private var _scrollToBottomFill: ImageVector? = null
