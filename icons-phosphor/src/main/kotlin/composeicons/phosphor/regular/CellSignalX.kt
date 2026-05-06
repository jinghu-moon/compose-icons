package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) return _cellSignalX!!
        _cellSignalX = phosphorRegularIcon(
            name = "CellSignalX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 194.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L184 187.31l-18.34 18.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L172.69 176 154.34 157.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L184 164.69l18.34-18.35c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L195.31 176ZM160 120c4.418 0 8-3.582 8-8v-40c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8ZM200 120c4.418 0 8-3.582 8-8v-80c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v80c0 4.418 3.582 8 8 8ZM120 104c-4.418 0-8 3.582-8 8v88c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-88c0-4.418-3.582-8-8-8ZM80 144c-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8ZM40 184c-4.418 0-8 3.582-8 8v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8c0-4.418-3.582-8-8-8Z"),
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
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
