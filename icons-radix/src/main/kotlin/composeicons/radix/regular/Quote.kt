package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Quote: ImageVector
    get() {
        if (_quote != null) return _quote!!
        _quote = radixIcon(
            name = "Quote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.425 3.441c.631-.205 1.359-.201 1.954 .105 1.374 .706 1.969 2.526 1.415 4.454-.248 .865-.684 1.705-1.608 2.552-.924 .848-2.206 1.348-2.8 1.348C8.173 11.9 8 11.732 8 11.525c0-.207 .176-.375 .386-.375 .679 0 1.286-.37 2.005-.914 .55-.417 .979-.95 1.217-1.414 .455-.888 .47-2.14-.265-2.473-.353 .386-.814 .61-1.366 .61C8.777 6.959 8.07 5.994 8.101 5.12 8.13 4.285 8.66 3.69 9.425 3.441ZM3.425 3.441c.631-.205 1.359-.201 1.954 .105C6.753 4.252 7.348 6.072 6.795 8c-.248 .865-.684 1.705-1.609 2.552-.924 .848-2.206 1.348-2.8 1.348C2.173 11.9 2 11.732 2 11.525c0-.207 .176-.375 .386-.375 .679 0 1.286-.37 2.005-.914 .55-.417 .98-.95 1.217-1.414C6.063 7.934 6.078 6.682 5.343 6.349c-.353 .386-.814 .61-1.366 .61C2.777 6.959 2.07 5.994 2.101 5.12 2.13 4.285 2.66 3.69 3.425 3.441Z"),
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
        return _quote!!
    }

private var _quote: ImageVector? = null
