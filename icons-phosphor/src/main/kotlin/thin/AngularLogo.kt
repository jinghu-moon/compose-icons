package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AngularLogo: ImageVector
    get() {
        if (_angularLogo != null) return _angularLogo!!
        _angularLogo = phosphorThinIcon(
            name = "AngularLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 225.540 68.310 L 129.540 28.310 C 128.554 27.899 127.446 27.899 126.460 28.310 L 30.460 68.310 C 28.777 68.995 27.766 70.728 28.000 72.530 L 44.000 192.530 C 44.174 193.843 44.986 194.985 46.170 195.580 L 126.170 235.580 C 127.297 236.144 128.623 236.144 129.750 235.580 L 209.750 195.580 C 210.934 194.985 211.746 193.843 211.920 192.530 L 227.920 72.530 C 228.166 70.748 227.192 69.022 225.540 68.310 ZM 204.320 189.370 L 128.000 227.530 L 51.680 189.370 L 36.370 74.510 L 128.000 36.330 L 219.630 74.510 ZM 124.500 86.060 L 84.500 158.060 C 83.429 159.993 84.127 162.429 86.060 163.500 C 87.993 164.571 90.429 163.873 91.500 161.940 L 103.690 140.000 L 152.310 140.000 L 164.500 161.940 C 165.571 163.873 168.007 164.571 169.940 163.500 C 171.873 162.429 172.571 159.993 171.500 158.060 L 131.500 86.060 C 130.796 84.787 129.455 83.996 128.000 83.996 C 126.545 83.996 125.204 84.787 124.500 86.060 ZM 147.870 132.000 L 108.130 132.000 L 128.000 96.240 Z"),
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
