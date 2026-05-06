package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SoundcloudLogo: ImageVector
    get() {
        if (_soundcloudLogo != null) return _soundcloudLogo!!
        _soundcloudLogo = phosphorThinIcon(
            name = "SoundcloudLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 120v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM48 92c-2.209 0-4 1.791-4 4v96c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-96c0-2.209-1.791-4-4-4ZM80 84c-2.209 0-4 1.791-4 4v104c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-104c0-2.209-1.791-4-4-4ZM112 52c-2.209 0-4 1.791-4 4v136c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-136c0-2.209-1.791-4-4-4ZM219.27 109.46C214.013 71.923 181.903 43.998 144 44c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 34.943-.121 64.246 26.354 67.66 61.13 .175 1.759 1.485 3.194 3.22 3.53 18.211 3.536 30.753 20.331 28.972 38.796C242.071 173.921 226.551 188.009 208 188h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h64c22.115 .015 40.805-16.388 43.661-38.318 2.856-21.93-11.01-42.572-32.391-48.222Z"),
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
        return _soundcloudLogo!!
    }

private var _soundcloudLogo: ImageVector? = null
