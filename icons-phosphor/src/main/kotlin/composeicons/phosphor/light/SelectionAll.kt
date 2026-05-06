package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SelectionAll: ImageVector
    get() {
        if (_selectionAll != null) return _selectionAll!!
        _selectionAll = phosphorLightIcon(
            name = "SelectionAll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M106 40c0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-32c-3.314 0-6-2.686-6-6ZM144 210h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM208 34h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24c1.105 0 2 .895 2 2v24c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-24c0-7.732-6.268-14-14-14ZM216 106c-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6ZM216 178c-3.314 0-6 2.686-6 6v24c0 1.105-.895 2-2 2h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24c7.732 0 14-6.268 14-14v-24c0-3.314-2.686-6-6-6ZM40 150c3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6ZM72 210h-24c-1.105 0-2-.895-2-2v-24c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v24c0 7.732 6.268 14 14 14h24c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM40 78c3.314 0 6-2.686 6-6v-24c0-1.105 .895-2 2-2h24c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-24C40.268 34 34 40.268 34 48v24c0 3.314 2.686 6 6 6ZM176 182h-96c-3.314 0-6-2.686-6-6v-96c0-3.314 2.686-6 6-6h96c3.314 0 6 2.686 6 6v96c0 3.314-2.686 6-6 6ZM170 86h-84v84h84Z"),
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
        return _selectionAll!!
    }

private var _selectionAll: ImageVector? = null
