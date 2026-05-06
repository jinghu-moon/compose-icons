package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = phosphorFillIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 128v-64C80 37.49 101.49 16 128 16c26.51 0 48 21.49 48 48v64c0 26.51-21.49 48-48 48C101.49 176 80 154.51 80 128ZM208 128c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 35.346-28.654 64-64 64C92.654 192 64 163.346 64 128c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 .05 41.066 31.145 75.443 72 79.6v32.4c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32.4c40.855-4.157 71.95-38.534 72-79.6Z"),
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
        return _microphone!!
    }

private var _microphone: ImageVector? = null
