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
                pathData = parseSvgPathData("M128 80c-26.51 0-48 21.49-48 48 0 26.51 21.49 48 48 48 26.51 0 48-21.49 48-48C175.972 101.502 154.498 80.028 128 80ZM128 160C110.327 160 96 145.673 96 128c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32ZM176 24h-96C49.086 24.033 24.033 49.086 24 80v96c.033 30.914 25.086 55.967 56 56h96c30.914-.033 55.967-25.086 56-56v-96C231.967 49.086 206.914 24.033 176 24ZM216 176c0 22.091-17.909 40-40 40h-96C57.909 216 40 198.091 40 176v-96C40 57.909 57.909 40 80 40h96c22.091 0 40 17.909 40 40ZM192 76c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
