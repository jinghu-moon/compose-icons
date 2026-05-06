package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CounterClockwiseClock: ImageVector
    get() {
        if (_counterClockwiseClock != null) return _counterClockwiseClock!!
        _counterClockwiseClock = radixIcon(
            name = "CounterClockwiseClock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 .85c4.063 0 6.65 3.336 6.65 6.65-0 3.314-2.588 6.649-6.65 6.649C5.557 14.15 3.938 13.381 2.786 12.208l-.226-.24C2.123 11.477 1.764 10.925 1.489 10.337l-.131-.297c-.105-.255 .017-.547 .272-.652 .223-.092 .475-.01 .604 .183l.048 .09c.246 .597 .591 1.155 1.024 1.643l.191 .204c.972 .989 2.336 1.642 4.001 1.643 3.44-0 5.65-2.814 5.65-5.649C13.15 4.665 10.94 1.85 7.5 1.85 4.89 1.85 3.52 3.666 2.879 4.792l-.111 .208h1.732c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5h-3C1.224 6 1 5.776 1 5.5v-3c0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5v1.812l.001-.001C2.706 3.069 4.336 .85 7.5 .85ZM7.5 4c.276 0 .5 .224 .5 .5v2.793L9.854 9.147l.064 .078c.128 .194 .106 .458-.064 .629-.171 .171-.435 .192-.629 .064L9.146 9.854l-2-2C7.053 7.76 7 7.633 7 7.5v-3c0-.276 .224-.5 .5-.5Z"),
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
        return _counterClockwiseClock!!
    }

private var _counterClockwiseClock: ImageVector? = null
