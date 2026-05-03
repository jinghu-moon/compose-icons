package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonNumber2: ImageVector
    get() {
        if (_hexagonNumber2 != null) return _hexagonNumber2!!
        _hexagonNumber2 = tablerFilledIcon(
            name = "HexagonNumber2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.425 1.414 C 11.426 0.862 12.640 0.862 13.641 1.414 L 20.416 5.409 C 20.483 5.449 20.543 5.493 20.596 5.542 L 20.604 5.549 L 20.711 5.625 C 21.470 6.194 21.939 7.068 21.995 8.015 L 22.000 8.218 L 22.000 15.502 C 22.000 16.677 21.357 17.758 20.377 18.295 L 13.573 22.597 C 12.593 23.135 11.407 23.135 10.373 22.565 L 3.678 18.328 C 2.645 17.763 2.002 16.680 2.000 15.502 L 2.000 8.217 C 1.999 7.051 2.631 5.976 3.650 5.409 ZM 13.000 7.000 L 10.000 7.000 L 9.883 7.007 C 9.380 7.067 9.001 7.493 9.001 8.000 C 9.001 8.507 9.380 8.933 9.883 8.993 L 10.000 9.000 L 13.000 9.000 L 13.000 11.000 L 11.000 11.000 L 10.850 11.005 C 9.866 11.079 9.083 11.859 9.006 12.843 L 9.000 13.000 L 9.000 15.000 L 9.005 15.150 C 9.079 16.134 9.859 16.917 10.843 16.994 L 11.000 17.000 L 14.000 17.000 L 14.117 16.993 C 14.620 16.933 14.999 16.507 14.999 16.000 C 14.999 15.493 14.620 15.067 14.117 15.007 L 14.000 15.000 L 11.000 15.000 L 11.000 13.000 L 13.000 13.000 L 13.150 12.995 C 14.134 12.921 14.917 12.141 14.994 11.157 L 15.000 11.000 L 15.000 9.000 L 14.995 8.850 C 14.921 7.866 14.141 7.083 13.157 7.006 L 13.000 7.000 Z"),
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
        return _hexagonNumber2!!
    }

private var _hexagonNumber2: ImageVector? = null
