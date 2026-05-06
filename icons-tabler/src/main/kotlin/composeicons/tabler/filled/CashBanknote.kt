package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CashBanknote: ImageVector
    get() {
        if (_cashBanknote != null) return _cashBanknote!!
        _cashBanknote = tablerFilledIcon(
            name = "CashBanknote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 5c1.657 0 3 1.343 3 3v8c0 1.657-1.343 3-3 3h-14C3.343 19 2 17.657 2 16v-8C2 6.343 3.343 5 5 5ZM12 9c-1.598 0-2.916 1.254-2.996 2.85L9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9M18.01 11h-.01c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1M6.01 11h-.01c-.552 .003-.998 .453-.995 1.005 .003 .552 .453 .998 1.005 .995 .552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _cashBanknote!!
    }

private var _cashBanknote: ImageVector? = null
