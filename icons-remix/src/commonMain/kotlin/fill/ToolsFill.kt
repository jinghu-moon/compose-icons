package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ToolsFill: ImageVector
    get() {
        if (_toolsFill != null) return _toolsFill!!
        _toolsFill = remixIcon(
            name = "ToolsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.329 3.272 C 6.563 2.833 7.992 3.107 8.979 4.094 C 9.967 5.082 10.241 6.512 9.802 7.745 L 20.646 18.590 L 18.525 20.712 L 7.679 9.867 C 6.446 10.306 5.016 10.031 4.030 9.044 C 3.042 8.057 2.768 6.627 3.207 5.393 L 5.444 7.630 C 6.030 8.216 6.979 8.216 7.565 7.630 C 8.151 7.044 8.151 6.094 7.565 5.509 L 5.329 3.272 ZM 15.697 5.155 L 18.879 3.387 L 20.293 4.802 L 18.525 7.984 L 16.757 8.337 L 14.636 10.458 L 13.222 9.044 L 15.343 6.923 L 15.697 5.155 ZM 8.626 12.933 L 10.747 15.055 L 5.797 20.004 C 5.212 20.590 4.262 20.590 3.676 20.004 C 3.125 19.453 3.092 18.579 3.579 17.990 L 3.676 17.883 L 8.626 12.933 Z"),
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
        return _toolsFill!!
    }

private var _toolsFill: ImageVector? = null
