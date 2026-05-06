package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SelectionPlus: ImageVector
    get() {
        if (_selectionPlus != null) return _selectionPlus!!
        _selectionPlus = phosphorLightIcon(
            name = "SelectionPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M150 40c0 3.314-2.686 6-6 6h-32c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6ZM144 210h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM210 48v24c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-24c0-7.732-6.268-14-14-14h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24c1.105 0 2 .895 2 2ZM216 106c-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6ZM40 150c3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6ZM72 210h-24c-1.105 0-2-.895-2-2v-24c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v24c0 7.732 6.268 14 14 14h24c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM72 34h-24C40.268 34 34 40.268 34 48v24c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-24c0-1.105 .895-2 2-2h24c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM240 210h-18v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _selectionPlus!!
    }

private var _selectionPlus: ImageVector? = null
