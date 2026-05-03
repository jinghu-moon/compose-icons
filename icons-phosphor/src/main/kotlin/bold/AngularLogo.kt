package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AngularLogo: ImageVector
    get() {
        if (_angularLogo != null) return _angularLogo!!
        _angularLogo = phosphorBoldIcon(
            name = "AngularLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.610 60.920 L 132.610 20.920 C 129.653 19.687 126.327 19.687 123.370 20.920 L 27.370 60.920 C 22.355 63.009 19.369 68.206 20.090 73.590 L 36.090 193.590 C 36.616 197.528 39.058 200.951 42.610 202.730 L 122.610 242.730 C 125.990 244.421 129.970 244.421 133.350 242.730 L 213.350 202.730 C 216.902 200.951 219.344 197.528 219.870 193.590 L 235.870 73.590 C 236.594 68.211 233.617 63.015 228.610 60.920 ZM 197.000 184.110 L 128.000 218.580 L 59.050 184.110 L 45.110 79.540 L 128.000 45.000 L 210.890 79.540 ZM 117.510 82.170 L 77.510 154.170 C 74.290 159.969 76.381 167.280 82.180 170.500 C 87.979 173.720 95.290 171.629 98.510 165.830 L 106.170 152.000 L 149.830 152.000 L 157.510 165.830 C 160.730 171.629 168.041 173.720 173.840 170.500 C 179.639 167.280 181.730 159.969 178.510 154.170 L 138.510 82.170 C 136.397 78.350 132.375 75.979 128.010 75.979 C 123.645 75.979 119.623 78.350 117.510 82.170 ZM 119.510 128.000 L 128.000 112.710 L 136.490 128.000 Z"),
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
        return _angularLogo!!
    }

private var _angularLogo: ImageVector? = null
