package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterX: ImageVector
    get() {
        if (_hexagonLetterX != null) return _hexagonLetterX!!
        _hexagonLetterX = tablerFilledIcon(
            name = "HexagonLetterX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.666 1.429 L 20.416 5.409 L 20.512 5.472 L 20.605 5.550 L 20.711 5.624 C 21.470 6.193 21.940 7.067 21.995 8.014 L 22.000 8.218 L 22.000 15.502 C 22.000 16.677 21.357 17.758 20.377 18.295 L 13.573 22.597 C 12.593 23.135 11.407 23.135 10.373 22.565 L 3.678 18.328 C 2.645 17.762 2.002 16.679 2.000 15.502 L 2.000 8.217 C 2.000 7.111 2.570 6.089 3.476 5.512 L 10.426 1.414 C 11.426 0.862 12.640 0.862 13.666 1.429M 14.447 7.106 C 13.953 6.859 13.353 7.059 13.106 7.553 L 12.000 9.763 L 10.894 7.553 C 10.667 7.099 10.137 6.887 9.660 7.059 L 9.553 7.106 C 9.059 7.353 8.859 7.953 9.106 8.447 L 10.880 12.000 L 9.105 15.553 C 8.878 16.006 9.026 16.558 9.450 16.836 L 9.552 16.894 C 10.046 17.141 10.646 16.941 10.893 16.447 L 12.000 14.237 L 13.106 16.447 C 13.333 16.901 13.863 17.113 14.340 16.941 L 14.447 16.894 C 14.941 16.647 15.141 16.047 14.894 15.553 L 13.118 12.000 L 14.894 8.447 C 15.121 7.994 14.973 7.442 14.549 7.164 Z"),
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
        return _hexagonLetterX!!
    }

private var _hexagonLetterX: ImageVector? = null
