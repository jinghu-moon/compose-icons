package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatLineUp: ImageVector
    get() {
        if (_arrowFatLineUp != null) return _arrowFatLineUp!!
        _arrowFatLineUp = phosphorBoldIcon(
            name = "ArrowFatLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.48 111.51l-96-96c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L23.48 111.51c-3.44 3.436-4.467 8.608-2.6 13.097 1.867 4.489 6.258 7.409 11.12 7.393h36v44c0 6.627 5.373 12 12 12h96c6.627 0 12-5.373 12-12v-44h36c4.855-0 9.231-2.925 11.087-7.411 1.856-4.486 .827-9.648-2.607-13.079ZM176 108c-6.627 0-12 5.373-12 12v44h-72v-44c0-6.627-5.373-12-12-12h-19L128 41l67 67ZM188 216c0 6.627-5.373 12-12 12h-96c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h96c6.627 0 12 5.373 12 12Z"),
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
        return _arrowFatLineUp!!
    }

private var _arrowFatLineUp: ImageVector? = null
