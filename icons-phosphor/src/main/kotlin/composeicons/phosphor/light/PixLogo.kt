package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PixLogo: ImageVector
    get() {
        if (_pixLogo != null) return _pixLogo!!
        _pixLogo = phosphorLightIcon(
            name = "PixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233.91 118.14l-96-96c-2.613-2.619-6.161-4.09-9.86-4.09-3.699 0-7.247 1.472-9.86 4.09L22.19 118.19c-2.619 2.613-4.09 6.161-4.09 9.86 0 3.699 1.472 7.247 4.09 9.86l96.05 96c2.613 2.618 6.161 4.09 9.86 4.09 3.699 0 7.247-1.472 9.86-4.09l96-96c2.618-2.613 4.09-6.161 4.09-9.86 0-3.699-1.472-7.247-4.09-9.86ZM126.62 30.57c.773-.737 1.987-.737 2.76 0L188.81 90h-28.81c-1.591 .001-3.116 .634-4.24 1.76L128 119.52 100.24 91.76C99.116 90.634 97.591 90.001 96 90h-28.81ZM30 128c-.002-.518 .204-1.014 .57-1.38L55.19 102h38.32l26 26-26 26h-38.32L30.57 129.38c-.366-.366-.572-.862-.57-1.38ZM129.38 225.43c-.773 .737-1.987 .737-2.76 0L67.19 166h28.81c1.591-.001 3.116-.634 4.24-1.76L128 136.48l27.76 27.76c1.124 1.126 2.649 1.759 4.24 1.76h28.81ZM225.43 129.38 200.81 154h-38.32l-26-26 26-26h38.32l24.62 24.62c.737 .773 .737 1.987 0 2.76Z"),
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
        return _pixLogo!!
    }

private var _pixLogo: ImageVector? = null
