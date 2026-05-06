package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Waveform: ImageVector
    get() {
        if (_waveform != null) return _waveform!!
        _waveform = phosphorThinIcon(
            name = "Waveform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52 96v64c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-64c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM88 28c-2.209 0-4 1.791-4 4v192c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-192c0-2.209-1.791-4-4-4ZM128 60c-2.209 0-4 1.791-4 4v128c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-128c0-2.209-1.791-4-4-4ZM168 92c-2.209 0-4 1.791-4 4v64c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-64c0-2.209-1.791-4-4-4ZM208 76c-2.209 0-4 1.791-4 4v96c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-96c0-2.209-1.791-4-4-4Z"),
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
        return _waveform!!
    }

private var _waveform: ImageVector? = null
