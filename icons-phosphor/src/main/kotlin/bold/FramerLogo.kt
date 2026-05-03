package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) return _framerLogo!!
        _framerLogo = phosphorBoldIcon(
            name = "FramerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 104.000 L 212.000 40.000 C 212.000 33.373 206.627 28.000 200.000 28.000 L 56.000 28.000 C 50.998 27.974 46.504 31.053 44.723 35.728 C 42.942 40.402 44.248 45.691 48.000 49.000 L 96.440 92.000 L 56.000 92.000 C 49.373 92.000 44.000 97.373 44.000 104.000 L 44.000 168.000 C 44.000 171.185 45.266 174.239 47.520 176.490 L 119.520 248.490 C 122.953 251.919 128.113 252.943 132.595 251.085 C 137.078 249.227 140.000 244.852 140.000 240.000 L 140.000 180.000 L 200.000 180.000 C 205.002 180.026 209.496 176.947 211.277 172.272 C 213.058 167.598 211.752 162.309 208.000 159.000 L 159.590 116.000 L 200.000 116.000 C 206.627 116.000 212.000 110.627 212.000 104.000 ZM 168.440 156.000 L 128.000 156.000 C 121.373 156.000 116.000 161.373 116.000 168.000 L 116.000 211.000 L 68.000 163.000 L 68.000 116.000 L 123.440 116.000 ZM 188.000 92.000 L 132.560 92.000 L 87.560 52.000 L 188.000 52.000 Z"),
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
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
