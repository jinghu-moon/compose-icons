package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SelectionForeground: ImageVector
    get() {
        if (_selectionForeground != null) return _selectionForeground!!
        _selectionForeground = phosphorLightIcon(
            name = "SelectionForeground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M62 216c0 3.314-2.686 6-6 6h-8c-7.732 0-14-6.268-14-14v-8c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v8c0 1.105 .895 2 2 2h8c3.314 0 6 2.686 6 6ZM112 210h-16c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h16c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM40 166c3.314 0 6-2.686 6-6v-16c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v16c0 3.314 2.686 6 6 6ZM168 194c-3.314 0-6 2.686-6 6v8c0 1.105-.895 2-2 2h-8c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h8c7.732 0 14-6.268 14-14v-8c0-3.314-2.686-6-6-6ZM168 110c3.314 0 6-2.686 6-6v-8c0-7.732-6.268-14-14-14h-8c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h8c1.105 0 2 .895 2 2v8c0 3.314 2.686 6 6 6ZM56 82h-8C40.268 82 34 88.268 34 96v8c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-8c0-1.105 .895-2 2-2h8c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM208 34h-112C88.268 34 82 40.268 82 48v40h0c0 3.314 2.686 6 6 6h24c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-34c0-1.105 .895-2 2-2h112c1.105 0 2 .895 2 2v112c0 1.105-.895 2-2 2h-34v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v24c0 3.314 2.686 6 6 6h40c7.732 0 14-6.268 14-14v-112c0-7.732-6.268-14-14-14Z"),
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
        return _selectionForeground!!
    }

private var _selectionForeground: ImageVector? = null
