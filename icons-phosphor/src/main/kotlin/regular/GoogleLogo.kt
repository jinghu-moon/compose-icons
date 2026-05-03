package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GoogleLogo: ImageVector
    get() {
        if (_googleLogo != null) return _googleLogo!!
        _googleLogo = phosphorRegularIcon(
            name = "GoogleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 128.000 C 224.002 174.664 190.449 214.571 144.478 222.580 C 98.506 230.590 53.434 204.382 37.655 160.467 C 21.876 116.551 39.961 67.650 80.517 44.570 C 121.074 21.490 172.353 30.916 202.050 66.910 C 203.995 69.098 204.589 72.174 203.599 74.929 C 202.609 77.684 200.194 79.679 197.301 80.129 C 194.408 80.580 191.501 79.414 189.720 77.090 C 165.458 47.672 123.806 39.467 90.200 57.485 C 56.593 75.504 40.376 114.737 51.450 151.225 C 62.525 187.713 97.813 211.314 135.765 207.613 C 173.717 203.913 203.782 173.940 207.600 136.000 L 128.000 136.000 C 123.582 136.000 120.000 132.418 120.000 128.000 C 120.000 123.582 123.582 120.000 128.000 120.000 L 216.000 120.000 C 220.418 120.000 224.000 123.582 224.000 128.000 Z"),
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
        return _googleLogo!!
    }

private var _googleLogo: ImageVector? = null
