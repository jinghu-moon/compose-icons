package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = phosphorThinIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.49 83.06 172.94 31.51C170.688 29.26 167.634 27.997 164.45 28h-72.9c-3.184-.003-6.238 1.26-8.49 3.51L31.51 83.06C29.26 85.312 27.997 88.366 28 91.55v72.9c-.003 3.184 1.26 6.238 3.51 8.49l51.55 51.55c2.252 2.25 5.306 3.512 8.49 3.51h72.9c3.184 .003 6.238-1.26 8.49-3.51l51.55-51.55c2.25-2.252 3.512-5.306 3.51-8.49v-72.9c.003-3.184-1.26-6.238-3.51-8.49ZM220 164.45c.001 1.061-.42 2.079-1.17 2.83l-51.55 51.55c-.751 .75-1.769 1.171-2.83 1.17h-72.9c-1.061 .001-2.079-.42-2.83-1.17L37.17 167.28c-.75-.751-1.171-1.769-1.17-2.83v-72.9c-.001-1.061 .42-2.079 1.17-2.83L88.72 37.17c.751-.75 1.769-1.171 2.83-1.17h72.9c1.061-.001 2.079 .42 2.83 1.17l51.55 51.55c.75 .751 1.171 1.769 1.17 2.83Z"),
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
        return _octagon!!
    }

private var _octagon: ImageVector? = null
