package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) return _codepenLogo!!
        _codepenLogo = phosphorBoldIcon(
            name = "CodepenLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.680 85.430 L 133.680 29.430 C 130.128 27.517 125.852 27.517 122.300 29.430 L 18.300 85.430 C 14.416 87.527 11.996 91.586 12.000 96.000 L 12.000 160.000 C 12.000 164.418 14.428 168.479 18.320 170.570 L 122.320 226.570 C 125.872 228.483 130.148 228.483 133.700 226.570 L 237.700 170.570 C 241.584 168.473 244.004 164.414 244.000 160.000 L 244.000 96.000 C 244.000 91.582 241.572 87.521 237.680 85.430 ZM 220.000 139.910 L 197.880 128.000 L 220.000 116.090 ZM 172.570 114.370 L 140.000 96.830 L 140.000 60.090 L 206.690 96.000 ZM 128.000 138.370 L 108.740 128.000 L 128.000 117.630 L 147.260 128.000 ZM 116.000 60.090 L 116.000 96.830 L 83.430 114.370 L 49.310 96.000 ZM 36.000 116.090 L 58.120 128.000 L 36.000 139.910 ZM 83.430 141.630 L 116.000 159.170 L 116.000 195.910 L 49.310 160.000 ZM 140.000 195.910 L 140.000 159.170 L 172.570 141.630 L 206.690 160.000 Z"),
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
