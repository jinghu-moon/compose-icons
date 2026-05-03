package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterS: ImageVector
    get() {
        if (_hexagonLetterS != null) return _hexagonLetterS!!
        _hexagonLetterS = tablerFilledIcon(
            name = "HexagonLetterS",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.666 1.429 L 20.416 5.409 L 20.512 5.472 L 20.605 5.550 L 20.711 5.624 C 21.470 6.193 21.940 7.067 21.995 8.014 L 22.000 8.218 L 22.000 15.502 C 22.000 16.677 21.357 17.758 20.377 18.295 L 13.573 22.597 C 12.593 23.135 11.407 23.135 10.373 22.565 L 3.678 18.328 C 2.645 17.762 2.002 16.679 2.000 15.502 L 2.000 8.217 C 2.000 7.111 2.570 6.089 3.476 5.512 L 10.426 1.414 C 11.426 0.862 12.640 0.862 13.666 1.429M 13.000 7.000 L 11.000 7.000 C 9.895 7.000 9.000 7.895 9.000 9.000 L 9.000 11.000 C 9.000 12.105 9.895 13.000 11.000 13.000 L 13.000 13.000 L 13.000 15.000 L 11.000 15.000 C 11.000 14.448 10.552 14.000 10.000 14.000 C 9.448 14.000 9.000 14.448 9.000 15.000 C 9.000 16.105 9.895 17.000 11.000 17.000 L 13.000 17.000 C 14.105 17.000 15.000 16.105 15.000 15.000 L 15.000 13.000 C 15.000 11.895 14.105 11.000 13.000 11.000 L 11.000 11.000 L 11.000 9.000 L 13.000 9.000 L 13.007 9.117 C 13.069 9.642 13.530 10.028 14.059 9.997 C 14.587 9.966 14.999 9.529 15.000 9.000 C 15.000 7.895 14.105 7.000 13.000 7.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _hexagonLetterS!!
    }

private var _hexagonLetterS: ImageVector? = null
