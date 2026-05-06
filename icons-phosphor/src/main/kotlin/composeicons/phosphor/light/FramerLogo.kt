package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) return _framerLogo!!
        _framerLogo = phosphorLightIcon(
            name = "FramerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206 104v-64c0-3.314-2.686-6-6-6h-144c-2.491-.004-4.726 1.533-5.614 3.86-.888 2.328-.246 4.962 1.614 6.62L112.22 98h-56.22c-3.314 0-6 2.686-6 6v64c.001 1.591 .634 3.116 1.76 4.24l72 72c1.716 1.714 4.295 2.226 6.535 1.298 2.241-.928 3.702-3.113 3.705-5.538v-66h66c2.491 .004 4.726-1.533 5.614-3.86 .888-2.328 .246-4.962-1.614-6.62L143.78 110h56.22c3.314 0 6-2.686 6-6ZM184.22 162h-56.22c-3.314 0-6 2.686-6 6v57.51l-60-60v-55.51h63.72ZM194 98h-63.72L71.78 46h122.22Z"),
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
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
