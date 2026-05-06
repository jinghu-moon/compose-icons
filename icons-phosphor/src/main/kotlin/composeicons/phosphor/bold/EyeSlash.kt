package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) return _eyeSlash!!
        _eyeSlash = phosphorBoldIcon(
            name = "EyeSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786l16 17.65C20.67 88.66 5.72 121.58 5 123.13c-1.37 3.106-1.37 6.644 0 9.75 .37 .82 9.13 20.26 28.49 39.61C59.37 198.34 92 212 128 212c17.496 .097 34.836-3.303 51-10l20.09 22.1c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM128 188C98.41 188 72.53 177.27 51.09 156.12 42.657 147.77 35.4 138.309 29.52 128 34.79 118.69 48.31 98.1 71.52 83.71l90.09 99.11C150.745 186.289 139.405 188.037 128 188ZM251 132.88c-.36 .81-9 20-28 39.16-2.964 3.29-7.498 4.68-11.797 3.617-4.298-1.063-7.662-4.407-8.751-8.699-1.088-4.292 .275-8.835 3.547-11.818 7.981-8.115 14.866-17.239 20.48-27.14C220.604 117.688 213.347 108.228 204.91 99.88 183.46 78.73 157.59 68 128 68c-3.35 0-6.7 .14-10 .42-4.329 .464-8.57-1.454-11.081-5.01-2.511-3.557-2.899-8.194-1.014-12.119 1.886-3.924 5.749-6.52 10.095-6.781 3.93-.34 8-.51 12-.51 36 0 68.63 13.67 94.49 39.52 19.35 19.35 28.11 38.8 28.48 39.61 1.379 3.101 1.39 6.64 .03 9.75Z"),
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
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
