package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Gavel: ImageVector
    get() {
        if (_gavel != null) return _gavel!!
        _gavel = phosphorThinIcon(
            name = "Gavel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.49 119.52l-16-16c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529l-1.17 1.17-55-55 1.18-1.17c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5l-16-16C134.248 13.261 131.19 11.991 128 11.991c-3.19 0-6.248 1.27-8.5 3.529l-64 64c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l16 16c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l1.17-1.18L102.34 124 34.14 192.21c-7.495 8.299-7.171 21.016 .736 28.924 7.907 7.907 20.624 8.231 28.924 .736L132 153.66l12.69 12.69-1.18 1.17c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l16 16c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l64-64c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5ZM77.17 106.83l-16-16C60.419 90.08 59.997 89.062 59.997 88c0-1.062 .422-2.08 1.173-2.83l64-64c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l16 16c1.558 1.561 1.558 4.089 0 5.65l-64 64c-.749 .752-1.766 1.176-2.828 1.178-1.062 .002-2.08-.418-2.832-1.168ZM58.17 216.21c-3.207 3.6-8.142 5.13-12.823 3.974-4.681-1.155-8.337-4.806-9.501-9.485-1.163-4.679 .359-9.617 3.954-12.829L108 129.66 126.34 148ZM95.31 105.66 145.66 55.31l55 55-50.35 50.35ZM234.83 130.83l-64 64c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173l-16-16c-1.558-1.561-1.558-4.089 0-5.65l64-64c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l16 16c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83Z"),
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
        return _gavel!!
    }

private var _gavel: ImageVector? = null
