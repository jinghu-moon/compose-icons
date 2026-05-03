package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Champagne: ImageVector
    get() {
        if (_champagne != null) return _champagne!!
        _champagne = phosphorLightIcon(
            name = "Champagne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 142.260 10.000 L 97.650 10.000 C 95.073 10.023 92.799 11.690 92.000 14.140 C 90.530 18.650 56.470 124.870 86.150 165.710 C 92.900 174.990 102.250 180.330 114.010 181.660 L 114.010 234.000 L 96.000 234.000 C 92.686 234.000 90.000 236.686 90.000 240.000 C 90.000 243.314 92.686 246.000 96.000 246.000 L 144.000 246.000 C 147.314 246.000 150.000 243.314 150.000 240.000 C 150.000 236.686 147.314 234.000 144.000 234.000 L 126.000 234.000 L 126.000 181.660 C 137.760 180.330 147.110 174.990 153.850 165.710 C 183.530 124.870 149.480 18.650 148.010 14.140 C 147.200 11.655 144.874 9.980 142.260 10.000 ZM 102.080 22.000 L 137.830 22.000 C 140.070 29.480 144.830 46.290 148.580 66.000 L 91.340 66.000 C 95.090 46.290 99.850 29.480 102.080 22.000 ZM 144.080 158.660 C 138.550 166.290 130.660 170.000 120.000 170.000 C 109.340 170.000 101.400 166.290 95.860 158.660 C 85.460 144.420 83.210 116.550 89.250 78.000 L 150.670 78.000 C 156.710 116.550 154.450 144.420 144.100 158.660 ZM 230.000 52.000 C 230.000 57.523 225.523 62.000 220.000 62.000 C 214.477 62.000 210.000 57.523 210.000 52.000 C 210.000 46.477 214.477 42.000 220.000 42.000 C 225.523 42.000 230.000 46.477 230.000 52.000 ZM 206.000 20.000 C 206.000 25.523 201.523 30.000 196.000 30.000 C 190.477 30.000 186.000 25.523 186.000 20.000 C 186.000 14.477 190.477 10.000 196.000 10.000 C 201.523 10.000 206.000 14.477 206.000 20.000 ZM 206.000 100.000 C 206.000 105.523 201.523 110.000 196.000 110.000 C 190.477 110.000 186.000 105.523 186.000 100.000 C 186.000 94.477 190.477 90.000 196.000 90.000 C 201.523 90.000 206.000 94.477 206.000 100.000 Z"),
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
        return _champagne!!
    }

private var _champagne: ImageVector? = null
