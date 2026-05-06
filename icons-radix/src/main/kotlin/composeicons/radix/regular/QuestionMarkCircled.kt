package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.QuestionMarkCircled: ImageVector
    get() {
        if (_questionMarkCircled != null) return _questionMarkCircled!!
        _questionMarkCircled = radixIcon(
            name = "QuestionMarkCircled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.499 .877c3.657 0 6.623 2.965 6.623 6.622 0 3.658-2.965 6.623-6.623 6.623C3.842 14.122 .877 11.156 .877 7.499 .877 3.842 3.842 .877 7.499 .877ZM7.499 1.826C4.367 1.827 1.827 4.367 1.826 7.499c0 3.133 2.54 5.672 5.673 5.673 3.133 0 5.673-2.54 5.673-5.673C13.172 4.366 10.632 1.826 7.499 1.826ZM7.5 9.75c.414 0 .75 .336 .75 .75 0 .414-.336 .75-.75 .75-.414 0-.75-.336-.75-.75 0-.414 .336-.75 .75-.75ZM7.5 3.825c1.435 0 2.55 1.103 2.55 2.425 0 1.104-.73 1.64-1.265 1.965-.299 .182-.48 .271-.635 .392-.065 .051-.091 .083-.1 .097l-.002 .001c-.002 .302-.246 .546-.549 .546-.304 0-.55-.246-.55-.55 0-.468 .282-.773 .524-.962 .221-.172 .54-.341 .74-.463 .465-.283 .735-.534 .735-1.025C8.95 5.572 8.365 4.925 7.5 4.925c-.865 0-1.45 .647-1.45 1.325 0 .304-.246 .55-.55 .55-.304 0-.55-.246-.55-.55C4.95 4.928 6.065 3.825 7.5 3.825Z"),
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
        return _questionMarkCircled!!
    }

private var _questionMarkCircled: ImageVector? = null
