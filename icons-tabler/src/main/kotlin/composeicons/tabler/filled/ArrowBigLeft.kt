package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigLeft: ImageVector
    get() {
        if (_arrowBigLeft != null) return _arrowBigLeft!!
        _arrowBigLeft = tablerFilledIcon(
            name = "ArrowBigLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.586 4 3 10.586c-.781 .781-.781 2.047 0 2.828L9.586 20c.572 .572 1.432 .744 2.18 .434l.145-.068c.668-.342 1.089-1.029 1.089-1.78v-2.586h7c1.105 0 2-.895 2-2v-4l-.005-.15C21.917 8.806 21.047 8 20 8L13 7.999v-2.585C13 4.605 12.513 3.876 11.765 3.567 11.018 3.257 10.158 3.428 9.586 4Z"),
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
        return _arrowBigLeft!!
    }

private var _arrowBigLeft: ImageVector? = null
