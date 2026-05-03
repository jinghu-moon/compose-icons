package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cardboards: ImageVector
    get() {
        if (_cardboards != null) return _cardboards!!
        _cardboards = tablerFilledIcon(
            name = "Cardboards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 5.000 C 20.657 5.000 22.000 6.343 22.000 8.000 L 22.000 16.500 C 22.000 18.433 20.433 20.000 18.500 20.000 L 17.438 20.000 C 16.224 19.998 15.077 19.444 14.320 18.496 L 12.780 16.576 C 12.590 16.339 12.303 16.202 12.000 16.202 C 11.697 16.202 11.410 16.339 11.220 16.576 L 9.682 18.493 C 8.924 19.444 7.776 19.998 6.560 20.000 L 5.500 20.000 C 3.567 20.000 2.000 18.433 2.000 16.500 L 2.000 8.000 C 2.000 6.343 3.343 5.000 5.000 5.000 ZM 8.000 10.000 C 6.953 10.000 6.083 10.806 6.005 11.850 L 6.000 12.000 C 6.000 13.105 6.895 14.000 8.000 14.000 C 9.105 14.000 10.000 13.105 10.000 12.000 C 10.000 10.895 9.105 10.000 8.000 10.000M 16.000 10.000 C 14.953 10.000 14.083 10.806 14.005 11.850 L 14.000 12.000 C 14.000 13.105 14.895 14.000 16.000 14.000 C 17.105 14.000 18.000 13.105 18.000 12.000 C 18.000 10.895 17.105 10.000 16.000 10.000"),
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
        return _cardboards!!
    }

private var _cardboards: ImageVector? = null
