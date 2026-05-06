package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowUUpRight: ImageVector
    get() {
        if (_arrowUUpRight != null) return _arrowUUpRight!!
        _arrowUUpRight = phosphorThinIcon(
            name = "ArrowUUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M173.17 133.17 214.34 92h-126.34C59.281 92 36 115.281 36 144c0 28.719 23.281 52 52 52h88c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-88C54.863 204 28 177.137 28 144 28 110.863 54.863 84 88 84h126.34L173.17 42.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0l48 48c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-48 48c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66Z"),
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
        return _arrowUUpRight!!
    }

private var _arrowUUpRight: ImageVector? = null
