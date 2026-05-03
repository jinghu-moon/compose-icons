package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonNumber1: ImageVector
    get() {
        if (_hexagonNumber1 != null) return _hexagonNumber1!!
        _hexagonNumber1 = tablerFilledIcon(
            name = "HexagonNumber1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.425 1.414 C 11.426 0.862 12.640 0.862 13.641 1.414 L 20.416 5.409 C 20.483 5.449 20.543 5.493 20.596 5.542 L 20.604 5.549 L 20.711 5.625 C 21.470 6.194 21.939 7.068 21.995 8.015 L 22.000 8.218 L 22.000 15.502 C 22.000 16.677 21.357 17.758 20.377 18.295 L 13.573 22.597 C 12.593 23.135 11.407 23.135 10.373 22.565 L 3.678 18.328 C 2.645 17.763 2.002 16.680 2.000 15.502 L 2.000 8.217 C 1.999 7.051 2.631 5.976 3.650 5.409 ZM 11.377 7.217 L 11.293 7.293 L 9.293 9.293 L 9.210 9.387 C 8.930 9.748 8.930 10.252 9.210 10.613 L 9.293 10.707 L 9.387 10.790 C 9.748 11.070 10.252 11.070 10.613 10.790 L 10.707 10.707 L 11.000 10.414 L 11.000 16.000 L 11.007 16.117 C 11.067 16.620 11.493 16.999 12.000 16.999 C 12.507 16.999 12.933 16.620 12.993 16.117 L 13.000 16.000 L 13.000 8.000 L 12.994 7.886 C 12.911 7.109 11.986 6.726 11.377 7.216 Z"),
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
        return _hexagonNumber1!!
    }

private var _hexagonNumber1: ImageVector? = null
