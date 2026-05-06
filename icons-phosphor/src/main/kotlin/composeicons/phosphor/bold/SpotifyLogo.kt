package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) return _spotifyLogo!!
        _spotifyLogo = phosphorBoldIcon(
            name = "SpotifyLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM194.59 127.64c-1.5 2.807-4.053 4.904-7.099 5.829-3.046 .925-6.334 .601-9.141-.899-31.456-16.836-69.244-16.836-100.7 0-1.735 .94-3.677 1.432-5.65 1.43-5.503-.001-10.299-3.745-11.637-9.082-1.338-5.338 1.126-10.901 5.977-13.498 38.514-20.621 84.786-20.621 123.3 0 5.842 3.115 8.057 10.374 4.95 16.22ZM178.59 163.64c-1.488 2.817-4.034 4.927-7.078 5.865-3.044 .938-6.337 .627-9.152-.865-21.474-11.456-47.246-11.456-68.72 0-5.831 2.978-12.972 .733-16.05-5.046-3.078-5.779-.955-12.958 4.77-16.134 28.526-15.211 62.754-15.211 91.28 0 5.819 3.115 8.03 10.343 4.95 16.18Z"),
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
        return _spotifyLogo!!
    }

private var _spotifyLogo: ImageVector? = null
