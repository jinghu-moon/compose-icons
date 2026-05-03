package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.StitchesLogo: ImageVector
    get() {
        if (_stitchesLogo != null) return _stitchesLogo!!
        _stitchesLogo = radixIcon(
            name = "StitchesLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.500 0.850 C 11.173 0.850 14.150 3.828 14.150 7.500 C 14.150 11.173 11.173 14.150 7.500 14.150 C 3.828 14.150 0.850 11.173 0.850 7.500 C 0.850 3.828 3.828 0.850 7.500 0.850 ZM 6.849 13.111 C 7.063 13.135 7.280 13.150 7.500 13.150 C 9.825 13.150 11.820 11.745 12.687 9.740 L 6.849 13.111 ZM 7.826 5.199 L 11.362 7.821 L 11.429 7.882 C 11.569 8.038 11.585 8.276 11.455 8.451 C 11.417 8.502 11.370 8.540 11.318 8.570 L 11.319 8.572 L 9.873 9.405 C 9.870 9.407 9.867 9.409 9.864 9.411 L 8.411 10.248 C 8.398 10.257 8.384 10.264 8.370 10.272 L 4.687 12.399 C 4.967 12.560 5.261 12.698 5.569 12.810 L 13.062 8.484 C 13.118 8.164 13.150 7.836 13.150 7.500 C 13.150 5.802 12.400 4.279 11.214 3.244 L 7.826 5.199 ZM 1.912 6.656 C 1.871 6.931 1.850 7.213 1.850 7.500 C 1.850 9.240 2.637 10.794 3.873 11.830 L 7.324 9.837 L 3.725 7.265 L 3.718 7.258 C 3.698 7.244 3.680 7.227 3.662 7.209 L 3.657 7.204 L 3.655 7.202 C 3.647 7.193 3.640 7.183 3.633 7.174 C 3.622 7.160 3.611 7.146 3.602 7.130 C 3.601 7.128 3.598 7.126 3.597 7.123 C 3.594 7.118 3.592 7.112 3.589 7.107 C 3.581 7.090 3.572 7.074 3.566 7.057 C 3.561 7.044 3.557 7.030 3.553 7.017 C 3.552 7.012 3.550 7.008 3.549 7.003 L 3.539 6.954 C 3.539 6.949 3.539 6.944 3.538 6.939 C 3.531 6.860 3.544 6.780 3.579 6.705 L 3.623 6.632 C 3.629 6.625 3.636 6.618 3.642 6.611 C 3.655 6.595 3.669 6.579 3.684 6.566 C 3.689 6.561 3.695 6.557 3.701 6.552 C 3.716 6.539 3.732 6.527 3.748 6.517 C 3.753 6.514 3.758 6.511 3.762 6.508 L 10.421 2.662 C 10.149 2.498 9.861 2.357 9.561 2.240 L 1.912 6.656 ZM 4.815 6.938 L 8.180 9.343 L 8.806 8.983 L 5.509 6.537 L 4.815 6.938 ZM 6.358 6.047 L 9.656 8.492 L 10.274 8.134 L 6.977 5.689 L 6.358 6.047 ZM 7.500 1.850 C 5.113 1.850 3.072 3.331 2.245 5.424 L 8.329 1.911 C 8.059 1.872 7.782 1.850 7.500 1.850 Z"),
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
        return _stitchesLogo!!
    }

private var _stitchesLogo: ImageVector? = null
