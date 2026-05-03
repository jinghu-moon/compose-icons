package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) return _codepenLogo!!
        _codepenLogo = phosphorThinIcon(
            name = "CodepenLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.000 92.550 C 234.000 92.550 233.950 92.550 233.910 92.480 L 129.910 36.480 C 128.724 35.840 127.296 35.840 126.110 36.480 L 22.110 92.480 L 22.000 92.560 C 20.770 93.270 20.009 94.580 20.000 96.000 L 20.000 160.000 C 20.005 161.424 20.767 162.738 22.000 163.450 C 22.028 163.476 22.058 163.499 22.090 163.520 L 126.090 219.520 C 127.276 220.160 128.704 220.160 129.890 219.520 L 233.890 163.520 C 233.921 163.502 233.948 163.478 233.970 163.450 C 235.203 162.738 235.965 161.424 235.970 160.000 L 235.970 96.000 C 235.971 94.582 235.222 93.270 234.000 92.550 ZM 228.000 153.300 L 181.000 128.000 L 228.000 102.700 ZM 172.570 123.460 L 132.000 101.610 L 132.000 46.700 L 223.560 96.000 ZM 128.000 147.460 L 91.870 128.000 L 128.000 108.540 L 164.130 128.000 ZM 124.000 46.700 L 124.000 101.610 L 83.430 123.460 L 32.440 96.000 ZM 28.000 102.700 L 75.000 128.000 L 28.000 153.300 ZM 83.430 132.540 L 124.000 154.390 L 124.000 209.300 L 32.440 160.000 ZM 132.000 209.300 L 132.000 154.390 L 172.570 132.540 L 223.570 160.000 Z"),
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
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
