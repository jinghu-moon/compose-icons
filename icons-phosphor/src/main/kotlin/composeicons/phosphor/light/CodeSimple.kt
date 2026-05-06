package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) return _codeSimple!!
        _codeSimple = phosphorLightIcon(
            name = "CodeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 68.49 25 128l67 59.52c2.485 2.209 2.709 6.015 .5 8.5-2.209 2.485-6.015 2.709-8.5 .5l-72-64c-1.292-1.139-2.031-2.778-2.031-4.5 0-1.722 .74-3.361 2.031-4.5L84 59.52c2.485-2.209 6.291-1.985 8.5 .5 2.209 2.485 1.985 6.291-.5 8.5ZM244 123.49 172 59.49c-2.485-2.209-6.291-1.985-8.5 .5-2.209 2.485-1.985 6.291 .5 8.5L231 128l-67 59.52c-2.485 2.209-2.709 6.015-.5 8.5 2.209 2.485 6.015 2.709 8.5 .5l72-64c1.292-1.139 2.031-2.778 2.031-4.5 0-1.722-.74-3.361-2.031-4.5Z"),
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
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
