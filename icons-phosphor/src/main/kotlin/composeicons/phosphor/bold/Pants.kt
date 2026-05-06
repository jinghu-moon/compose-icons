package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pants: ImageVector
    get() {
        if (_pants != null) return _pants!!
        _pants = phosphorBoldIcon(
            name = "Pants",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.85 213.52l-22-176C204.599 27.509 196.088 19.998 186 20h-116C59.912 19.998 51.401 27.509 50.15 37.52L28.15 213.52c-.711 5.693 1.056 11.417 4.854 15.718 3.797 4.301 9.259 6.763 14.996 6.762h40.69c9.133 .028 17.117-6.152 19.38-15L128 144l19.91 76.94c2.26 8.867 10.25 15.069 19.4 15.06h40.69c5.737 .001 11.199-2.461 14.996-6.762 3.797-4.301 5.565-10.025 4.854-15.718ZM182.47 44l2 16h-112.94l2-16ZM85.6 212h-33.07L63.73 122.4C81.351 117.49 94.113 102.214 95.81 84h20.19v10.47ZM170.41 212 140 94.47v-10.47h20.19c1.695 18.212 14.459 33.486 32.08 38.39L203.47 212Z"),
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
        return _pants!!
    }

private var _pants: ImageVector? = null
