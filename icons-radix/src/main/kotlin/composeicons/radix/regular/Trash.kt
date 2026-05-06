package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = radixIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.5 3c.276 0 .5 .224 .5 .5C12 3.776 11.776 4 11.5 4h-.5v8l-.005 .102c-.048 .47-.422 .845-.893 .893L10 13h-5l-.103-.005c-.47-.048-.845-.422-.893-.893L4 12v-8h-.5C3.224 4 3 3.776 3 3.5 3 3.224 3.224 3 3.5 3h8ZM5 12h5v-8h-5v8ZM9.5 1c.276 0 .5 .224 .5 .5C10 1.776 9.776 2 9.5 2h-4C5.224 2 5 1.776 5 1.5 5 1.224 5.224 1 5.5 1h4Z"),
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
        return _trash!!
    }

private var _trash: ImageVector? = null
