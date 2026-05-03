package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MonitorPlay: ImageVector
    get() {
        if (_monitorPlay != null) return _monitorPlay!!
        _monitorPlay = phosphorLightIcon(
            name = "MonitorPlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 163.330 115.000 L 115.330 83.000 C 113.488 81.771 111.118 81.656 109.166 82.703 C 107.214 83.749 105.997 85.785 106.000 88.000 L 106.000 152.000 C 105.997 154.215 107.214 156.251 109.166 157.297 C 111.118 158.344 113.488 158.229 115.330 157.000 L 163.330 125.000 C 165.006 123.888 166.013 122.011 166.013 120.000 C 166.013 117.989 165.006 116.112 163.330 115.000 ZM 118.000 140.790 L 118.000 99.210 L 149.180 120.000 ZM 208.000 42.000 L 48.000 42.000 C 35.850 42.000 26.000 51.850 26.000 64.000 L 26.000 176.000 C 26.000 188.150 35.850 198.000 48.000 198.000 L 208.000 198.000 C 220.150 198.000 230.000 188.150 230.000 176.000 L 230.000 64.000 C 230.000 51.850 220.150 42.000 208.000 42.000 ZM 218.000 176.000 C 218.000 181.523 213.523 186.000 208.000 186.000 L 48.000 186.000 C 42.477 186.000 38.000 181.523 38.000 176.000 L 38.000 64.000 C 38.000 58.477 42.477 54.000 48.000 54.000 L 208.000 54.000 C 213.523 54.000 218.000 58.477 218.000 64.000 ZM 166.000 224.000 C 166.000 227.314 163.314 230.000 160.000 230.000 L 96.000 230.000 C 92.686 230.000 90.000 227.314 90.000 224.000 C 90.000 220.686 92.686 218.000 96.000 218.000 L 160.000 218.000 C 163.314 218.000 166.000 220.686 166.000 224.000 Z"),
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
        return _monitorPlay!!
    }

private var _monitorPlay: ImageVector? = null
