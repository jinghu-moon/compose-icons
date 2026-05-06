package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Face: ImageVector
    get() {
        if (_face != null) return _face!!
        _face = radixIcon(
            name = "Face",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.499 .877c3.657 0 6.623 2.965 6.623 6.622 0 3.658-2.965 6.623-6.623 6.623C3.842 14.122 .877 11.156 .877 7.499 .877 3.842 3.842 .877 7.499 .877ZM7.499 1.826C4.367 1.827 1.827 4.367 1.826 7.499c0 3.133 2.54 5.672 5.673 5.673 3.133 0 5.673-2.54 5.673-5.673C13.172 4.366 10.632 1.826 7.499 1.826ZM9.962 9.214c.158-.226 .47-.282 .696-.124 .226 .158 .282 .47 .124 .696-.722 1.035-1.923 1.714-3.282 1.714C6.225 11.5 5.089 10.903 4.358 9.976L4.217 9.786 4.168 9.697c-.092-.213-.025-.469 .173-.607 .198-.138 .461-.113 .63 .047l.066 .077 .105 .143c.55 .697 1.402 1.143 2.357 1.144C8.519 10.5 9.419 9.992 9.962 9.214ZM5.375 5.1c.483 0 .875 .392 .875 .875 0 .483-.392 .875-.875 .875-.483 0-.875-.392-.875-.875 0-.483 .392-.875 .875-.875ZM9.625 5.1c.483 0 .875 .392 .875 .875 0 .483-.392 .875-.875 .875-.483 0-.875-.392-.875-.875 0-.483 .392-.875 .875-.875Z"),
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
        return _face!!
    }

private var _face: ImageVector? = null
