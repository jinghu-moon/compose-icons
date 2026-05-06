package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Terminal: ImageVector
    get() {
        if (_terminal != null) return _terminal!!
        _terminal = phosphorLightIcon(
            name = "Terminal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 132.48l-72 64c-2.485 2.209-6.291 1.985-8.5-.5-2.209-2.485-1.985-6.291 .5-8.5L103 128 36 68.49c-2.485-2.209-2.709-6.015-.5-8.5 2.209-2.485 6.015-2.709 8.5-.5l72 64c1.292 1.139 2.031 2.778 2.031 4.5 0 1.722-.74 3.361-2.031 4.5ZM216 186h-96c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h96c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _terminal!!
    }

private var _terminal: ImageVector? = null
