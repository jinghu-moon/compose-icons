package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = phosphorLightIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M69.69 62.1C68.871 59.653 66.58 58.004 64 58.004c-2.58 0-4.871 1.65-5.69 4.096L18.31 182.1c-.611 1.83-.305 3.841 .823 5.407 1.127 1.565 2.938 2.493 4.867 2.493h80c1.929-0 3.74-.928 4.867-2.493 1.127-1.565 1.433-3.577 .823-5.407ZM32.32 178 64 83l31.68 95ZM206 76C206 48.386 183.614 26 156 26c-27.614 0-50 22.386-50 50 0 27.614 22.386 50 50 50 27.601-.033 49.967-22.399 50-50ZM118 76c0-20.987 17.013-38 38-38 20.987 0 38 17.013 38 38 0 20.987-17.013 38-38 38C135.013 114 118 96.987 118 76ZM224 146h-88c-3.314 0-6 2.686-6 6v56c0 3.314 2.686 6 6 6h88c3.314 0 6-2.686 6-6v-56c0-3.314-2.686-6-6-6ZM218 202h-76v-44h76Z"),
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
        return _shapes!!
    }

private var _shapes: ImageVector? = null
