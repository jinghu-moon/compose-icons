package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextAa: ImageVector
    get() {
        if (_textAa != null) return _textAa!!
        _textAa = phosphorThinIcon(
            name = "TextAa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 83.620 54.300 C 82.961 52.897 81.550 52.002 80.000 52.002 C 78.450 52.002 77.039 52.897 76.380 54.300 L 12.380 190.300 C 11.490 192.290 12.358 194.626 14.332 195.553 C 16.305 196.480 18.657 195.656 19.620 193.700 L 37.360 156.000 L 122.640 156.000 L 140.380 193.700 C 140.970 195.021 142.228 195.920 143.669 196.051 C 145.110 196.182 146.510 195.525 147.329 194.333 C 148.148 193.140 148.259 191.598 147.620 190.300 ZM 41.130 148.000 L 80.000 65.390 L 118.870 148.000 ZM 200.000 100.000 C 188.330 100.000 179.310 103.080 173.180 109.160 C 171.612 110.717 171.603 113.252 173.160 114.820 C 174.717 116.388 177.252 116.397 178.820 114.840 C 183.390 110.300 190.520 108.000 200.000 108.000 C 215.440 108.000 228.000 118.770 228.000 132.000 L 228.000 143.920 C 220.750 136.197 210.592 131.872 200.000 132.000 C 180.150 132.000 164.000 146.350 164.000 164.000 C 164.000 181.650 180.150 196.000 200.000 196.000 C 210.592 196.128 220.750 191.803 228.000 184.080 L 228.000 192.000 C 228.000 194.209 229.791 196.000 232.000 196.000 C 234.209 196.000 236.000 194.209 236.000 192.000 L 236.000 132.000 C 236.000 114.360 219.850 100.000 200.000 100.000 ZM 200.000 188.000 C 184.560 188.000 172.000 177.230 172.000 164.000 C 172.000 150.770 184.560 140.000 200.000 140.000 C 215.440 140.000 228.000 150.770 228.000 164.000 C 228.000 177.230 215.440 188.000 200.000 188.000 Z"),
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
        return _textAa!!
    }

private var _textAa: ImageVector? = null
