package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Pilcrow: ImageVector
    get() {
        if (_pilcrow != null) return _pilcrow!!
        _pilcrow = radixIcon(
            name = "Pilcrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 5.5C3 7.983 4.992 9 7 9v3.5c0 .276 .224 .5 .5 .5C7.776 13 8 12.776 8 12.5v-3.5-5.9h1v9.4c0 .276 .224 .5 .5 .5 .276 0 .5-.224 .5-.5v-9.4h1.5l.111-.011c.25-.051 .438-.273 .438-.539 0-.266-.188-.488-.438-.539l-.111-.011h-1.986C9.509 2 9.505 2 9.5 2c-.005 0-.009 0-.014 0h-1.486v-0h-.5-.5C4.992 2 3 3.017 3 5.5Z"),
                pathFillType = PathFillType.EvenOdd,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _pilcrow!!
    }

private var _pilcrow: ImageVector? = null
