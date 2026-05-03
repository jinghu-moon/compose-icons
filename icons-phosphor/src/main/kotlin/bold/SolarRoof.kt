package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SolarRoof: ImageVector
    get() {
        if (_solarRoof != null) return _solarRoof!!
        _solarRoof = phosphorBoldIcon(
            name = "SolarRoof",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 250.730 122.630 L 210.730 42.630 C 208.697 38.567 204.543 36.001 200.000 36.000 L 56.000 36.000 C 51.457 36.001 47.303 38.567 45.270 42.630 L 5.270 122.630 C 4.435 124.297 4.000 126.136 4.000 128.000 L 4.000 184.000 C 4.000 195.046 12.954 204.000 24.000 204.000 L 232.000 204.000 C 243.046 204.000 252.000 195.046 252.000 184.000 L 252.000 128.000 C 252.000 126.136 251.565 124.297 250.730 122.630 ZM 96.580 60.000 L 104.580 76.000 L 83.420 76.000 L 75.420 60.000 ZM 144.580 60.000 L 152.580 76.000 L 131.420 76.000 L 123.420 60.000 ZM 103.420 116.000 L 95.420 100.000 L 116.580 100.000 L 124.580 116.000 ZM 151.420 116.000 L 143.420 100.000 L 164.580 100.000 L 172.580 116.000 ZM 199.420 116.000 L 191.420 100.000 L 212.580 100.000 L 220.580 116.000 ZM 200.580 76.000 L 179.420 76.000 L 171.420 60.000 L 192.580 60.000 ZM 28.000 130.830 L 56.000 74.830 L 84.000 130.830 L 84.000 180.000 L 28.000 180.000 ZM 108.000 180.000 L 108.000 140.000 L 228.000 140.000 L 228.000 180.000 Z"),
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
        return _solarRoof!!
    }

private var _solarRoof: ImageVector? = null
