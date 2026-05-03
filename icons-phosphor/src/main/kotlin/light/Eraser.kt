package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = phosphorLightIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 223.570 81.810 L 182.190 40.430 C 178.064 36.302 172.467 33.983 166.630 33.983 C 160.793 33.983 155.196 36.302 151.070 40.430 L 32.430 159.070 C 23.840 167.661 23.840 181.589 32.430 190.180 L 62.500 220.240 C 63.624 221.366 65.149 221.999 66.740 222.000 L 216.000 222.000 C 219.314 222.000 222.000 219.314 222.000 216.000 C 222.000 212.686 219.314 210.000 216.000 210.000 L 126.490 210.000 L 223.570 112.920 C 232.160 104.329 232.160 90.401 223.570 81.810 ZM 109.510 210.000 L 69.220 210.000 L 40.920 181.700 C 39.042 179.824 37.987 177.279 37.987 174.625 C 37.987 171.971 39.042 169.426 40.920 167.550 L 96.000 112.480 L 151.520 168.000 ZM 215.080 104.440 L 160.000 159.510 L 104.480 104.000 L 159.560 48.930 C 163.465 45.026 169.795 45.026 173.700 48.930 L 215.080 90.300 C 218.984 94.205 218.984 100.535 215.080 104.440 Z"),
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
        return _eraser!!
    }

private var _eraser: ImageVector? = null
