package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ferry: ImageVector
    get() {
        if (_ferry != null) return _ferry!!
        _ferry = tablerFilledIcon(
            name = "Ferry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 12c.359 0 .691 .193 .869 .505 .178 .312 .174 .696-.009 1.005l-2.202 3.709c-.757 1.115-2.017 1.783-3.365 1.781h-15.293c-.317 0-.615-.15-.804-.404-.189-.255-.246-.583-.153-.887l1.521-5c.128-.421 .517-.709 .957-.709ZM19 13c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1M13.894 5.553 14.617 7h.874c.356 0 .685 .189 .864 .497L18.392 11h-12.832L6.533 7.716C6.659 7.292 7.048 7 7.491 7h4.89l-.275-.553c-.227-.49-.023-1.072 .461-1.314 .483-.242 1.071-.056 1.327 .42"),
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
        return _ferry!!
    }

private var _ferry: ImageVector? = null
