package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ToolsLine: ImageVector
    get() {
        if (_toolsLine != null) return _toolsLine!!
        _toolsLine = remixIcon(
            name = "ToolsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.329 3.272 C 6.563 2.833 7.992 3.107 8.979 4.094 C 10.100 5.215 10.302 6.907 9.584 8.234 L 20.293 18.944 L 18.879 20.358 L 8.170 9.649 C 6.843 10.367 5.151 10.165 4.030 9.044 C 3.042 8.057 2.768 6.627 3.207 5.393 L 5.444 7.630 C 6.030 8.216 6.979 8.216 7.565 7.630 C 8.151 7.044 8.151 6.094 7.565 5.509 L 5.329 3.272 ZM 15.697 5.155 L 18.879 3.387 L 20.293 4.802 L 18.525 7.984 L 16.757 8.337 L 14.636 10.458 L 13.222 9.044 L 15.343 6.923 L 15.697 5.155 ZM 8.979 13.287 L 10.394 14.701 L 5.090 20.004 C 4.700 20.395 4.066 20.395 3.676 20.004 C 3.313 19.642 3.287 19.070 3.598 18.677 L 3.676 18.590 L 8.979 13.287 Z"),
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
        return _toolsLine!!
    }

private var _toolsLine: ImageVector? = null
