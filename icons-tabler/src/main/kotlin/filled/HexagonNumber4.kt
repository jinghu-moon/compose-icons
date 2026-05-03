package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonNumber4: ImageVector
    get() {
        if (_hexagonNumber4 != null) return _hexagonNumber4!!
        _hexagonNumber4 = tablerFilledIcon(
            name = "HexagonNumber4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.425 1.414 C 11.426 0.862 12.640 0.862 13.641 1.414 L 20.416 5.409 C 20.483 5.449 20.543 5.493 20.596 5.542 L 20.604 5.549 L 20.711 5.625 C 21.470 6.194 21.939 7.068 21.995 8.015 L 22.000 8.218 L 22.000 15.502 C 22.000 16.677 21.357 17.758 20.377 18.295 L 13.573 22.597 C 12.593 23.135 11.407 23.135 10.373 22.565 L 3.678 18.328 C 2.645 17.763 2.002 16.680 2.000 15.502 L 2.000 8.217 C 1.999 7.051 2.631 5.976 3.650 5.409 ZM 14.000 7.000 C 13.493 7.000 13.066 7.380 13.007 7.883 L 13.000 8.000 L 13.000 11.000 L 11.000 11.000 L 11.000 8.000 L 10.993 7.883 C 10.933 7.380 10.507 7.001 10.000 7.001 C 9.493 7.001 9.067 7.380 9.007 7.883 L 9.000 8.000 L 9.000 11.000 L 9.005 11.150 C 9.079 12.134 9.859 12.917 10.843 12.994 L 11.000 13.000 L 13.000 13.000 L 13.000 16.000 L 13.007 16.117 C 13.067 16.620 13.493 16.999 14.000 16.999 C 14.507 16.999 14.933 16.620 14.993 16.117 L 15.000 16.000 L 15.000 8.000 L 14.993 7.883 C 14.934 7.380 14.507 7.000 14.000 7.000 Z"),
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
        return _hexagonNumber4!!
    }

private var _hexagonNumber4: ImageVector? = null
