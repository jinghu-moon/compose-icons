package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Edit2Fill: ImageVector
    get() {
        if (_edit2Fill != null) return _edit2Fill!!
        _edit2Fill = remixIcon(
            name = "Edit2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.243 18.997 L 21.000 18.997 L 21.000 20.997 L 3.000 20.997 L 3.000 16.754 L 12.899 6.855 L 17.142 11.097 L 9.243 18.997 ZM 14.314 5.440 L 16.435 3.319 C 16.826 2.928 17.459 2.928 17.849 3.319 L 20.678 6.147 C 21.068 6.538 21.068 7.171 20.678 7.562 L 18.556 9.683 L 14.314 5.440 Z"),
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
        return _edit2Fill!!
    }

private var _edit2Fill: ImageVector? = null
