package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterI: ImageVector
    get() {
        if (_hexagonLetterI != null) return _hexagonLetterI!!
        _hexagonLetterI = tablerFilledIcon(
            name = "HexagonLetterI",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.666 1.429 L 20.416 5.409 L 20.512 5.472 L 20.605 5.550 L 20.711 5.624 C 21.470 6.193 21.940 7.067 21.995 8.014 L 22.000 8.218 L 22.000 15.502 C 22.000 16.677 21.357 17.758 20.377 18.295 L 13.573 22.597 C 12.593 23.135 11.407 23.135 10.373 22.565 L 3.678 18.328 C 2.645 17.762 2.002 16.679 2.000 15.502 L 2.000 8.217 C 2.000 7.111 2.570 6.089 3.476 5.512 L 10.426 1.414 C 11.426 0.862 12.640 0.862 13.666 1.429M 12.000 7.000 C 11.448 7.000 11.000 7.448 11.000 8.000 L 11.000 16.000 C 11.000 16.552 11.448 17.000 12.000 17.000 C 12.552 17.000 13.000 16.552 13.000 16.000 L 13.000 8.000 C 13.000 7.448 12.552 7.000 12.000 7.000"),
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
        return _hexagonLetterI!!
    }

private var _hexagonLetterI: ImageVector? = null
