package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) return _speakerSimpleSlash!!
        _speakerSimpleSlash = phosphorThinIcon(
            name = "SpeakerSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 152v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM232 84c-2.209 0-4 1.791-4 4v80c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-80c0-2.209-1.791-4-4-4ZM219 213.31c.982 1.054 1.32 2.555 .887 3.929-.433 1.374-1.572 2.408-2.981 2.709-1.409 .3-2.87-.18-3.826-1.258l-49-53.94v59.25c-.001 1.526-.87 2.919-2.24 3.59-.571 .284-1.202 .425-1.84 .41-.89-.004-1.754-.299-2.46-.84L86.63 172h-46.63c-6.627 0-12-5.373-12-12v-64C28 89.373 33.373 84 40 84h50.59L53 42.69C51.514 41.033 51.653 38.486 53.31 37c1.657-1.486 4.204-1.347 5.69 .31ZM156 156 97.87 92h-57.87c-2.209 0-4 1.791-4 4v64c0 2.209 1.791 4 4 4h48c.89 .003 1.754 .298 2.46 .84l65.54 51ZM122.61 66.2 156 40.2v66.65c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-74.85c.002-1.53-.868-2.927-2.242-3.599-1.374-.672-3.011-.502-4.218 .439l-39.85 31c-1.742 1.359-2.054 3.873-.695 5.615 1.359 1.742 3.873 2.054 5.615 .695Z"),
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
        return _speakerSimpleSlash!!
    }

private var _speakerSimpleSlash: ImageVector? = null
