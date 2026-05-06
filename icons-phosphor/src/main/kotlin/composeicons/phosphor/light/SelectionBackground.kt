package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SelectionBackground: ImageVector
    get() {
        if (_selectionBackground != null) return _selectionBackground!!
        _selectionBackground = phosphorLightIcon(
            name = "SelectionBackground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 82h-112C40.268 82 34 88.268 34 96v112c0 7.732 6.268 14 14 14h112c7.732 0 14-6.268 14-14v-112c0-7.732-6.268-14-14-14ZM162 208c0 1.105-.895 2-2 2h-112c-1.105 0-2-.895-2-2v-112c0-1.105 .895-2 2-2h112c1.105 0 2 .895 2 2ZM138 40c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6ZM222 48v8c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-8c0-1.105-.895-2-2-2h-8c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h8c7.732 0 14 6.268 14 14ZM222 96v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM222 152v8c0 7.732-6.268 14-14 14h-8c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h8c1.105 0 2-.895 2-2v-8c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM82 56v-8C82 40.268 88.268 34 96 34h8c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-8c-1.105 0-2 .895-2 2v8c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6Z"),
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
        return _selectionBackground!!
    }

private var _selectionBackground: ImageVector? = null
