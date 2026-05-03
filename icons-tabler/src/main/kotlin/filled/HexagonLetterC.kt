package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterC: ImageVector
    get() {
        if (_hexagonLetterC != null) return _hexagonLetterC!!
        _hexagonLetterC = tablerFilledIcon(
            name = "HexagonLetterC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.666 1.429 L 20.416 5.409 L 20.512 5.472 L 20.605 5.550 L 20.711 5.624 C 21.470 6.193 21.940 7.067 21.995 8.014 L 22.000 8.218 L 22.000 15.502 C 22.000 16.677 21.357 17.758 20.377 18.295 L 13.573 22.597 C 12.593 23.135 11.407 23.135 10.373 22.565 L 3.678 18.328 C 2.645 17.762 2.002 16.679 2.000 15.502 L 2.000 8.217 C 2.000 7.111 2.570 6.089 3.476 5.512 L 10.426 1.414 C 11.426 0.862 12.640 0.862 13.666 1.429M 12.000 7.000 C 10.343 7.000 9.000 8.343 9.000 10.000 L 9.000 14.000 C 9.000 15.657 10.343 17.000 12.000 17.000 C 13.657 17.000 15.000 15.657 15.000 14.000 C 14.999 13.471 14.587 13.034 14.059 13.003 C 13.530 12.972 13.069 13.358 13.007 13.883 L 13.000 14.000 C 13.000 14.552 12.552 15.000 12.000 15.000 C 11.448 15.000 11.000 14.552 11.000 14.000 L 11.000 10.000 C 11.001 9.471 11.413 9.034 11.941 9.003 C 12.470 8.972 12.931 9.358 12.993 9.883 L 13.000 10.000 C 13.000 10.552 13.448 11.000 14.000 11.000 C 14.552 11.000 15.000 10.552 15.000 10.000 C 15.000 8.343 13.657 7.000 12.000 7.000"),
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
        return _hexagonLetterC!!
    }

private var _hexagonLetterC: ImageVector? = null
