package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BeerBottle: ImageVector
    get() {
        if (_beerBottle != null) return _beerBottle!!
        _beerBottle = phosphorThinIcon(
            name = "BeerBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 242.830 45.170 L 210.830 13.170 C 209.267 11.607 206.733 11.607 205.170 13.170 C 203.607 14.733 203.607 17.267 205.170 18.830 L 209.910 23.570 L 150.330 68.260 L 111.220 76.080 C 110.462 76.242 109.767 76.621 109.220 77.170 L 25.860 160.490 C 18.052 168.300 18.052 180.960 25.860 188.770 L 67.230 230.140 C 75.040 237.948 87.700 237.948 95.510 230.140 L 178.830 146.830 C 179.388 146.269 179.767 145.556 179.920 144.780 L 187.740 105.670 L 232.430 46.090 L 237.170 50.830 C 238.733 52.393 241.267 52.393 242.830 50.830 C 244.393 49.267 244.393 46.733 242.830 45.170 ZM 89.830 224.480 C 87.578 226.739 84.520 228.009 81.330 228.009 C 78.140 228.009 75.082 226.739 72.830 224.480 L 31.510 183.110 C 29.251 180.858 27.981 177.800 27.981 174.610 C 27.981 171.420 29.251 168.362 31.510 166.110 L 40.000 157.660 L 98.340 216.000 ZM 104.000 210.340 L 45.660 152.000 L 96.000 101.660 L 154.340 160.000 ZM 180.800 101.600 C 180.439 102.077 180.192 102.632 180.080 103.220 L 172.320 142.000 L 160.000 154.340 L 101.660 96.000 L 114.000 83.680 L 152.810 75.920 C 153.398 75.808 153.953 75.561 154.430 75.200 L 215.650 29.280 L 226.750 40.380 Z"),
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
