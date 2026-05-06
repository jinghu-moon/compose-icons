package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ExclamationCircled: ImageVector
    get() {
        if (_exclamationCircled != null) return _exclamationCircled!!
        _exclamationCircled = radixIcon(
            name = "ExclamationCircled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.499 .877c3.657 0 6.623 2.965 6.623 6.622 0 3.658-2.965 6.623-6.623 6.623C3.842 14.122 .877 11.156 .877 7.499 .877 3.842 3.842 .877 7.499 .877ZM7.499 1.826C4.367 1.827 1.827 4.367 1.826 7.499c0 3.133 2.54 5.672 5.673 5.673 3.133 0 5.673-2.54 5.673-5.673C13.172 4.366 10.632 1.826 7.499 1.826ZM7.5 9.726c.414 0 .75 .336 .75 .75 0 .414-.336 .75-.75 .75-.414 0-.75-.336-.75-.75 0-.414 .336-.75 .75-.75ZM7.5 3.786c.382 0 .688 .318 .673 .7L8.02 8.487c-.011 .279-.24 .499-.52 .499C7.221 8.986 6.991 8.766 6.981 8.487L6.827 4.486c-.015-.382 .291-.7 .673-.7Z"),
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
        return _exclamationCircled!!
    }

private var _exclamationCircled: ImageVector? = null
