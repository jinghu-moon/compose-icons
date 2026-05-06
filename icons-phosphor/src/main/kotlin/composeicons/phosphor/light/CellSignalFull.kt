package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CellSignalFull: ImageVector
    get() {
        if (_cellSignalFull != null) return _cellSignalFull!!
        _cellSignalFull = phosphorLightIcon(
            name = "CellSignalFull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M166 72v128c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-128c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM200 26c-3.314 0-6 2.686-6 6v168c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-168c0-3.314-2.686-6-6-6ZM120 106c-3.314 0-6 2.686-6 6v88c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-88c0-3.314-2.686-6-6-6ZM80 146c-3.314 0-6 2.686-6 6v48c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6ZM40 186c-3.314 0-6 2.686-6 6v8c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-8c0-3.314-2.686-6-6-6Z"),
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
        return _cellSignalFull!!
    }

private var _cellSignalFull: ImageVector? = null
