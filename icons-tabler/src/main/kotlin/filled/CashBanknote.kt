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
                pathData = parseSvgPathData("M 19.000 5.000 C 20.657 5.000 22.000 6.343 22.000 8.000 L 22.000 16.000 C 22.000 17.657 20.657 19.000 19.000 19.000 L 5.000 19.000 C 3.343 19.000 2.000 17.657 2.000 16.000 L 2.000 8.000 C 2.000 6.343 3.343 5.000 5.000 5.000 ZM 12.000 9.000 C 10.402 9.000 9.084 10.254 9.004 11.850 L 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 C 13.657 15.000 15.000 13.657 15.000 12.000 C 15.000 10.343 13.657 9.000 12.000 9.000M 18.010 11.000 L 18.000 11.000 C 17.448 11.000 17.000 11.448 17.000 12.000 C 17.000 12.552 17.448 13.000 18.000 13.000 L 18.010 13.000 C 18.562 13.000 19.010 12.552 19.010 12.000 C 19.010 11.448 18.562 11.000 18.010 11.000M 6.010 11.000 L 6.000 11.000 C 5.448 11.003 5.002 11.453 5.005 12.005 C 5.008 12.557 5.458 13.003 6.010 13.000 C 6.562 13.000 7.010 12.552 7.010 12.000 C 7.010 11.448 6.562 11.000 6.010 11.000"),
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
