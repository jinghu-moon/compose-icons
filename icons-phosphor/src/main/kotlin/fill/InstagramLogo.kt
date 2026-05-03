package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.InstagramLogo: ImageVector
    get() {
        if (_instagramLogo != null) return _instagramLogo!!
        _instagramLogo = phosphorFillIcon(
            name = "InstagramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 24.000 L 80.000 24.000 C 49.086 24.033 24.033 49.086 24.000 80.000 L 24.000 176.000 C 24.033 206.914 49.086 231.967 80.000 232.000 L 176.000 232.000 C 206.914 231.967 231.967 206.914 232.000 176.000 L 232.000 80.000 C 231.967 49.086 206.914 24.033 176.000 24.000 ZM 128.000 176.000 C 101.490 176.000 80.000 154.510 80.000 128.000 C 80.000 101.490 101.490 80.000 128.000 80.000 C 154.510 80.000 176.000 101.490 176.000 128.000 C 175.972 154.498 154.498 175.972 128.000 176.000 ZM 188.000 80.000 C 181.373 80.000 176.000 74.627 176.000 68.000 C 176.000 61.373 181.373 56.000 188.000 56.000 C 194.627 56.000 200.000 61.373 200.000 68.000 C 200.000 74.627 194.627 80.000 188.000 80.000 ZM 160.000 128.000 C 160.000 145.673 145.673 160.000 128.000 160.000 C 110.327 160.000 96.000 145.673 96.000 128.000 C 96.000 110.327 110.327 96.000 128.000 96.000 C 145.673 96.000 160.000 110.327 160.000 128.000 Z"),
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
