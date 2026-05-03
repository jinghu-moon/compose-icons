package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterZ: ImageVector
    get() {
        if (_hexagonLetterZ != null) return _hexagonLetterZ!!
        _hexagonLetterZ = tablerFilledIcon(
            name = "HexagonLetterZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.666 1.429 L 20.416 5.409 L 20.512 5.472 L 20.605 5.550 L 20.711 5.624 C 21.470 6.193 21.940 7.067 21.995 8.014 L 22.000 8.218 L 22.000 15.502 C 22.000 16.677 21.357 17.758 20.377 18.295 L 13.573 22.597 C 12.593 23.135 11.407 23.135 10.373 22.565 L 3.678 18.328 C 2.645 17.762 2.002 16.679 2.000 15.502 L 2.000 8.217 C 2.000 7.111 2.570 6.089 3.476 5.512 L 10.426 1.414 C 11.426 0.862 12.640 0.862 13.666 1.429M 14.000 7.000 L 10.000 7.000 C 9.448 7.000 9.000 7.448 9.000 8.000 L 9.007 8.117 C 9.066 8.620 9.493 9.000 10.000 9.000 L 12.382 9.000 L 9.106 15.553 C 8.951 15.863 8.968 16.231 9.150 16.526 C 9.332 16.820 9.654 17.000 10.000 17.000 L 14.000 17.000 C 14.552 17.000 15.000 16.552 15.000 16.000 L 14.993 15.883 C 14.934 15.380 14.507 15.000 14.000 15.000 L 11.618 15.000 L 14.894 8.447 C 15.049 8.137 15.032 7.769 14.850 7.474 C 14.668 7.180 14.346 7.000 14.000 7.000"),
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
        return _hexagonLetterZ!!
    }

private var _hexagonLetterZ: ImageVector? = null
