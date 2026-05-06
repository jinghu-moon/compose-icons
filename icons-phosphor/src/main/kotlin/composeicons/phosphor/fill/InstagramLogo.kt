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
                pathData = parseSvgPathData("M176 24h-96C49.086 24.033 24.033 49.086 24 80v96c.033 30.914 25.086 55.967 56 56h96c30.914-.033 55.967-25.086 56-56v-96C231.967 49.086 206.914 24.033 176 24ZM128 176C101.49 176 80 154.51 80 128c0-26.51 21.49-48 48-48 26.51 0 48 21.49 48 48-.028 26.498-21.502 47.972-48 48ZM188 80c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM160 128c0 17.673-14.327 32-32 32C110.327 160 96 145.673 96 128c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32Z"),
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
