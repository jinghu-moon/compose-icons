package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.IdCard: ImageVector
    get() {
        if (_idCard != null) return _idCard!!
        _idCard = radixIcon(
            name = "IdCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 3c.552 0 1 .448 1 1v7c0 .552-.448 1-1 1h-13L.897 11.995C.393 11.944 0 11.518 0 11v-7c0-.552 .448-1 1-1h13ZM1 11h13v-7h-13v7ZM5.75 5c.138 0 .25 .112 .25 .25v4.5c-0 .138-.112 .25-.25 .25h-3.5c-.138 0-.25-.112-.25-.25v-4.5c0-.138 .112-.25 .25-.25h3.5ZM12.5 9c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-5c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h5ZM10.5 7c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-3C7.224 8 7 7.776 7 7.5c0-.276 .224-.5 .5-.5h3ZM11.5 5c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-4C7.224 6 7 5.776 7 5.5c0-.276 .224-.5 .5-.5h4Z"),
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
        return _idCard!!
    }

private var _idCard: ImageVector? = null
