package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GasPump: ImageVector
    get() {
        if (_gasPump != null) return _gasPump!!
        _gasPump = phosphorFillIcon(
            name = "GasPump",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241 69.66 221.66 50.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L229.66 81c1.493 1.494 2.334 3.518 2.34 5.63v81.37c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-40c0-13.255-10.745-24-24-24h-16v-48C176 42.745 165.255 32 152 32h-80C58.745 32 48 42.745 48 56v152h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h160c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-88h16c4.418 0 8 3.582 8 8v40c0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24v-81.37c.024-6.364-2.496-12.474-7-16.97ZM144 120h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
