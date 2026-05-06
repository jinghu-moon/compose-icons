package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SoundcloudLogo: ImageVector
    get() {
        if (_soundcloudLogo != null) return _soundcloudLogo!!
        _soundcloudLogo = phosphorRegularIcon(
            name = "SoundcloudLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 120v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM48 88c-4.418 0-8 3.582-8 8v96c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-96c0-4.418-3.582-8-8-8ZM80 80c-4.418 0-8 3.582-8 8v104c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-104c0-4.418-3.582-8-8-8ZM112 48c-4.418 0-8 3.582-8 8v136c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-136c0-4.418-3.582-8-8-8ZM222.84 106.34C216.195 67.994 182.918 39.993 144 40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 32.887-.116 60.467 24.8 63.68 57.53 .376 3.495 2.989 6.335 6.44 7 16.336 3.006 27.656 18.01 26.062 34.543C238.587 171.606 224.609 184.171 208 184h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64c23.623 .018 43.748-17.156 47.444-40.488 3.697-23.332-10.133-45.886-32.604-53.172Z"),
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
