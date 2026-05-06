package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Mobile: ImageVector
    get() {
        if (_mobile != null) return _mobile!!
        _mobile = radixIcon(
            name = "Mobile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.5 1C11.328 1 12 1.672 12 2.5v10C12 13.328 11.328 14 10.5 14h-6C3.672 14 3 13.328 3 12.5v-10C3 1.672 3.672 1 4.5 1h6ZM4.5 2C4.224 2 4 2.224 4 2.5v10c0 .276 .224 .5 .5 .5h6c.276 0 .5-.224 .5-.5v-10C11 2.224 10.776 2 10.5 2h-6ZM9.07 11.657c.16 .033 .279 .174 .279 .343 0 .169-.12 .31-.279 .343L9 12.35h-3c-.193 0-.35-.156-.35-.35 0-.193 .156-.35 .35-.35h3l.07 .007Z"),
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
        return _mobile!!
    }

private var _mobile: ImageVector? = null
