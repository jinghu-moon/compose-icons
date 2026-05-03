package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.InstagramLogo: ImageVector
    get() {
        if (_instagramLogo != null) return _instagramLogo!!
        _instagramLogo = phosphorRegularIcon(
            name = "InstagramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 80.000 C 101.490 80.000 80.000 101.490 80.000 128.000 C 80.000 154.510 101.490 176.000 128.000 176.000 C 154.510 176.000 176.000 154.510 176.000 128.000 C 175.972 101.502 154.498 80.028 128.000 80.000 ZM 128.000 160.000 C 110.327 160.000 96.000 145.673 96.000 128.000 C 96.000 110.327 110.327 96.000 128.000 96.000 C 145.673 96.000 160.000 110.327 160.000 128.000 C 160.000 145.673 145.673 160.000 128.000 160.000 ZM 176.000 24.000 L 80.000 24.000 C 49.086 24.033 24.033 49.086 24.000 80.000 L 24.000 176.000 C 24.033 206.914 49.086 231.967 80.000 232.000 L 176.000 232.000 C 206.914 231.967 231.967 206.914 232.000 176.000 L 232.000 80.000 C 231.967 49.086 206.914 24.033 176.000 24.000 ZM 216.000 176.000 C 216.000 198.091 198.091 216.000 176.000 216.000 L 80.000 216.000 C 57.909 216.000 40.000 198.091 40.000 176.000 L 40.000 80.000 C 40.000 57.909 57.909 40.000 80.000 40.000 L 176.000 40.000 C 198.091 40.000 216.000 57.909 216.000 80.000 ZM 192.000 76.000 C 192.000 82.627 186.627 88.000 180.000 88.000 C 173.373 88.000 168.000 82.627 168.000 76.000 C 168.000 69.373 173.373 64.000 180.000 64.000 C 186.627 64.000 192.000 69.373 192.000 76.000 Z"),
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
        return _instagramLogo!!
    }

private var _instagramLogo: ImageVector? = null
