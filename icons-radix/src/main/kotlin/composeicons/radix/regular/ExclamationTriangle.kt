package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ExclamationTriangle: ImageVector
    get() {
        if (_exclamationTriangle != null) return _exclamationTriangle!!
        _exclamationTriangle = radixIcon(
            name = "ExclamationTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.642 .483c.467-.587 1.403-.546 1.803 .125l6.395 10.729c.437 .733-.092 1.663-.945 1.663h-12.788C.253 12.999-.275 12.07 .162 11.337L6.555 .608 6.642 .483ZM7.452 1.084l-.037 .037L1.02 11.848c-.04 .066 .009 .151 .086 .151h12.788c.077-0 .126-.085 .086-.151L7.586 1.121C7.557 1.072 7.496 1.059 7.452 1.084ZM7.499 9.726c.414 0 .75 .336 .75 .75-0 .414-.336 .75-.75 .75-.414-0-.75-.336-.75-.75 0-.414 .336-.75 .75-.75ZM7.499 3.787c.382 0 .688 .317 .674 .699L8.019 8.487c-.011 .279-.24 .5-.52 .5C7.22 8.987 6.992 8.766 6.981 8.487L6.827 4.486c-.015-.382 .291-.699 .673-.699Z"),
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
        return _exclamationTriangle!!
    }

private var _exclamationTriangle: ImageVector? = null
