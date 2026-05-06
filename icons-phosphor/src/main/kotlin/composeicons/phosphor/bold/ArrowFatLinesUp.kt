package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatLinesUp: ImageVector
    get() {
        if (_arrowFatLinesUp != null) return _arrowFatLinesUp!!
        _arrowFatLinesUp = phosphorBoldIcon(
            name = "ArrowFatLinesUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.49 111.51l-96-96c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L23.49 111.51c-3.439 3.435-4.466 8.604-2.602 13.093 1.864 4.488 6.252 7.409 11.112 7.397h36v4c0 6.627 5.373 12 12 12h96c6.627 0 12-5.373 12-12v-4h36c4.856 .004 9.236-2.92 11.095-7.407 1.859-4.487 .83-9.651-2.605-13.083ZM176 108c-6.627 0-12 5.373-12 12v4h-72v-4c0-6.627-5.373-12-12-12h-19L128 41l67 67ZM188 216c0 6.627-5.373 12-12 12h-96c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h96c6.627 0 12 5.373 12 12ZM188 176c0 6.627-5.373 12-12 12h-96c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h96c6.627 0 12 5.373 12 12Z"),
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
        return _arrowFatLinesUp!!
    }

private var _arrowFatLinesUp: ImageVector? = null
