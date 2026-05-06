package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CigaretteSlash: ImageVector
    get() {
        if (_cigaretteSlash != null) return _cigaretteSlash!!
        _cigaretteSlash = phosphorThinIcon(
            name = "CigaretteSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.51 62c8.22-14.61 8.21-23.23 6.75-27.9-.732-2.732-2.506-5.069-4.94-6.51-2.001-.909-2.895-3.262-2-5.27 .436-.969 1.241-1.725 2.235-2.1 .994-.375 2.097-.339 3.065 .1 .66 .29 6.52 3.09 9.16 11 3 9 .53 20.66-7.29 34.57-8.22 14.61-8.21 23.24-6.75 27.91 .727 2.732 2.502 5.068 4.94 6.5 1.8 .734 2.811 2.657 2.397 4.556-.414 1.899-2.135 3.226-4.077 3.144-.562-.004-1.116-.123-1.63-.35-.66-.3-6.52-3.09-9.16-11C194.23 87.59 196.69 76 204.51 62ZM157.22 96.61c2.64 8 8.5 10.75 9.16 11 .508 .24 1.059 .373 1.62 .39 1.884 .005 3.517-1.305 3.919-3.146 .402-1.841-.535-3.713-2.249-4.494-2.438-1.432-4.213-3.768-4.94-6.5-1.46-4.67-1.47-13.3 6.75-27.91 7.82-13.91 10.28-25.54 7.29-34.57-2.64-7.95-8.5-10.75-9.16-11-.968-.439-2.071-.475-3.065-.1-.994 .375-1.799 1.131-2.235 2.1-.895 2.008-.001 4.361 2 5.27 2.434 1.441 4.208 3.778 4.94 6.51 1.46 4.67 1.47 13.29-6.75 27.9C156.69 76 154.23 87.59 157.22 96.61ZM211 213.31c.982 1.054 1.32 2.555 .887 3.929-.433 1.374-1.572 2.408-2.981 2.709-1.409 .3-2.87-.18-3.826-1.258L177.14 188h-145.14c-6.627 0-12-5.373-12-12v-32c0-6.627 5.373-12 12-12h94.23L45 42.69C43.514 41.033 43.653 38.486 45.31 37c1.657-1.486 4.204-1.347 5.69 .31ZM32 180h52v-40h-52c-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4ZM169.87 180 133.5 140h-41.5v40ZM224 132h-45.48c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h45.48c2.209 0 4 1.791 4 4v32c0 2.209-1.791 4-4 4h-1.84c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h1.84c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12Z"),
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
        return _cigaretteSlash!!
    }

private var _cigaretteSlash: ImageVector? = null
