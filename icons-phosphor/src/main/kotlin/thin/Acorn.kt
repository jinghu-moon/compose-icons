package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Acorn: ImageVector
    get() {
        if (_acorn != null) return _acorn!!
        _acorn = phosphorThinIcon(
            name = "Acorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 104.000 C 227.967 75.295 204.705 52.033 176.000 52.000 L 132.000 52.000 L 132.000 48.000 C 132.000 32.536 144.536 20.000 160.000 20.000 C 162.209 20.000 164.000 18.209 164.000 16.000 C 164.000 13.791 162.209 12.000 160.000 12.000 C 140.118 12.000 124.000 28.118 124.000 48.000 L 124.000 52.000 L 80.000 52.000 C 51.295 52.033 28.033 75.295 28.000 104.000 C 28.006 109.080 31.210 113.607 36.000 115.300 L 36.000 128.000 C 36.000 161.610 68.290 187.540 94.240 208.370 C 109.540 220.660 124.000 232.270 124.000 240.000 C 124.000 242.209 125.791 244.000 128.000 244.000 C 130.209 244.000 132.000 242.209 132.000 240.000 C 132.000 232.270 146.460 220.660 161.760 208.370 C 187.710 187.540 220.000 161.610 220.000 128.000 L 220.000 115.300 C 224.790 113.607 227.994 109.080 228.000 104.000 ZM 156.750 202.130 C 144.240 212.180 133.520 220.780 128.000 228.920 C 122.480 220.780 111.760 212.180 99.250 202.130 C 74.630 182.370 44.000 157.780 44.000 128.000 L 44.000 116.000 L 212.000 116.000 L 212.000 128.000 C 212.000 157.780 181.370 182.370 156.750 202.130 ZM 216.000 108.000 L 40.000 108.000 C 37.791 108.000 36.000 106.209 36.000 104.000 C 36.028 79.711 55.711 60.028 80.000 60.000 L 176.000 60.000 C 200.289 60.028 219.972 79.711 220.000 104.000 C 220.000 106.209 218.209 108.000 216.000 108.000 Z"),
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
        return _acorn!!
    }

private var _acorn: ImageVector? = null
