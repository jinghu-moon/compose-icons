package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Subway: ImageVector
    get() {
        if (_subway != null) return _subway!!
        _subway = phosphorThinIcon(
            name = "Subway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 96v112c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-112C211.961 62.879 185.121 36.039 152 36h-48C70.879 36.039 44.039 62.879 44 96v112c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-112C36.039 58.461 66.461 28.039 104 28h48c37.539 .039 67.961 30.461 68 68ZM180 96v72c0 11.046-8.954 20-20 20h-1.53l5.11 10.21c.475 .949 .554 2.049 .218 3.056-.336 1.007-1.058 1.84-2.008 2.314-.557 .273-1.169 .417-1.79 .42-1.516 .001-2.902-.855-3.58-2.21L149.53 188h-43.06l-6.89 13.79c-.678 1.355-2.064 2.211-3.58 2.21-.621-.003-1.233-.147-1.79-.42-.95-.474-1.672-1.307-2.008-2.314-.336-1.007-.257-2.107 .218-3.056L97.53 188h-1.53C84.954 188 76 179.046 76 168v-72C76 84.954 84.954 76 96 76h64c11.046 0 20 8.954 20 20ZM84 96v52h88v-52c0-6.627-5.373-12-12-12h-64C89.373 84 84 89.373 84 96ZM116 156v24h24v-24ZM96 180h12v-24h-24v12c0 6.627 5.373 12 12 12ZM172 168v-12h-24v24h12c6.627 0 12-5.373 12-12Z"),
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
        return _subway!!
    }

private var _subway: ImageVector? = null
