package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StarOfDavid: ImageVector
    get() {
        if (_starOfDavid != null) return _starOfDavid!!
        _starOfDavid = phosphorLightIcon(
            name = "StarOfDavid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 198.910 128.000 L 229.210 75.000 C 230.283 73.141 230.282 70.851 229.207 68.994 C 228.131 67.137 226.146 65.995 224.000 66.000 L 163.490 66.000 L 133.210 13.000 C 132.142 11.130 130.154 9.976 128.000 9.976 C 125.846 9.976 123.858 11.130 122.790 13.000 L 92.500 66.000 L 32.000 66.000 C 29.854 65.995 27.869 67.137 26.793 68.994 C 25.718 70.851 25.717 73.141 26.790 75.000 L 57.070 128.000 L 26.790 181.000 C 25.717 182.859 25.718 185.149 26.793 187.006 C 27.869 188.863 29.854 190.005 32.000 190.000 L 92.500 190.000 L 122.790 243.000 C 123.858 244.870 125.846 246.024 128.000 246.024 C 130.154 246.024 132.142 244.870 133.210 243.000 L 163.490 190.000 L 224.000 190.000 C 226.146 190.005 228.131 188.863 229.207 187.006 C 230.282 185.149 230.283 182.859 229.210 181.000 ZM 213.660 78.000 L 192.000 115.910 L 170.340 78.000 ZM 185.090 128.000 L 156.530 178.000 L 99.460 178.000 L 70.900 128.000 L 99.460 78.000 L 156.530 78.000 ZM 128.000 28.090 L 149.670 66.000 L 106.320 66.000 ZM 42.340 78.000 L 85.640 78.000 L 64.000 115.910 ZM 42.340 177.920 L 64.000 140.090 L 85.640 178.000 ZM 128.000 227.910 L 106.320 190.000 L 149.670 190.000 ZM 170.340 178.000 L 192.000 140.090 L 213.660 178.000 Z"),
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
        return _starOfDavid!!
    }

private var _starOfDavid: ImageVector? = null
