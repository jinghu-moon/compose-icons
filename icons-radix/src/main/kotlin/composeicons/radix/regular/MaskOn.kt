package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.MaskOn: ImageVector
    get() {
        if (_maskOn != null) return _maskOn!!
        _maskOn = radixIcon(
            name = "MaskOn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 1c.552 0 1 .448 1 1v11c0 .552-.448 1-1 1h-13C.448 14 0 13.552 0 13v-11C0 1.448 .448 1 1 1h13ZM7.5 4.375C5.774 4.375 4.375 5.774 4.375 7.5c0 1.726 1.399 3.125 3.125 3.125 1.726 0 3.125-1.399 3.125-3.125C10.625 5.774 9.226 4.375 7.5 4.375Z"),
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
        return _maskOn!!
    }

private var _maskOn: ImageVector? = null
