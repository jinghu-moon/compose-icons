package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Clipboard: ImageVector
    get() {
        if (_clipboard != null) return _clipboard!!
        _clipboard = radixIcon(
            name = "Clipboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.25 0C10.664 0 11 .336 11 .75v.25h.5C12.328 1 13 1.672 13 2.5v10C13 13.328 12.328 14 11.5 14h-8C2.672 14 2 13.328 2 12.5v-10C2 1.672 2.672 1 3.5 1h.5v-.25C4 .336 4.336 0 4.75 0h5.5ZM3.5 2C3.224 2 3 2.224 3 2.5v10c0 .276 .224 .5 .5 .5h8c.276 0 .5-.224 .5-.5v-10C12 2.224 11.776 2 11.5 2h-.5v.25C11 2.664 10.664 3 10.25 3h-5.5C4.336 3 4 2.664 4 2.25v-.25h-.5ZM5 2h5v-1h-5v1Z"),
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
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
