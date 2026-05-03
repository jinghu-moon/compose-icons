package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartLine: ImageVector
    get() {
        if (_chartLine != null) return _chartLine!!
        _chartLine = phosphorFillIcon(
            name = "ChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 200.000 176.000 C 204.418 176.000 208.000 179.582 208.000 184.000 C 208.000 188.418 204.418 192.000 200.000 192.000 L 56.000 192.000 C 51.582 192.000 48.000 188.418 48.000 184.000 L 48.000 72.000 C 48.000 67.582 51.582 64.000 56.000 64.000 C 60.418 64.000 64.000 67.582 64.000 72.000 L 64.000 134.920 L 98.880 105.850 C 101.602 103.582 105.492 103.374 108.440 105.340 L 151.440 134.030 L 194.850 97.850 C 198.247 95.022 203.292 95.483 206.120 98.880 C 208.948 102.277 208.487 107.322 205.090 110.150 L 157.090 150.150 C 154.368 152.418 150.478 152.626 147.530 150.660 L 104.530 121.970 L 64.000 155.750 L 64.000 176.000 Z"),
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
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
