package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BeerBottle: ImageVector
    get() {
        if (_beerBottle != null) return _beerBottle!!
        _beerBottle = phosphorLightIcon(
            name = "BeerBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.240 43.760 L 212.240 11.760 C 209.876 9.557 206.192 9.622 203.907 11.907 C 201.622 14.192 201.557 17.876 203.760 20.240 L 206.870 23.350 L 149.490 66.350 L 110.820 74.090 C 109.659 74.319 108.593 74.890 107.760 75.730 L 24.440 159.070 C 15.850 167.661 15.850 181.589 24.440 190.180 L 65.820 231.560 C 74.411 240.150 88.339 240.150 96.930 231.560 L 180.240 148.240 C 181.080 147.407 181.651 146.341 181.880 145.180 L 189.620 106.510 L 232.620 49.130 L 235.730 52.240 C 238.094 54.443 241.778 54.378 244.063 52.093 C 246.348 49.808 246.413 46.124 244.210 43.760 ZM 88.440 223.070 C 84.535 226.974 78.205 226.974 74.300 223.070 L 32.930 181.700 C 29.026 177.795 29.026 171.465 32.930 167.560 L 40.000 160.490 L 95.510 216.000 ZM 104.000 207.510 L 48.490 152.000 L 96.000 104.490 L 151.510 160.000 ZM 179.200 100.400 C 178.661 101.114 178.291 101.942 178.120 102.820 L 170.470 141.000 L 160.000 151.510 L 104.490 96.000 L 115.000 85.530 L 153.220 77.880 C 154.098 77.709 154.926 77.339 155.640 76.800 L 215.480 31.920 L 224.120 40.560 Z"),
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
        return _beerBottle!!
    }

private var _beerBottle: ImageVector? = null
