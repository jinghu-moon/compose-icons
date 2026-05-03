package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonNumber0: ImageVector
    get() {
        if (_hexagonNumber0 != null) return _hexagonNumber0!!
        _hexagonNumber0 = tablerFilledIcon(
            name = "HexagonNumber0",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.425 1.414 C 11.426 0.862 12.640 0.862 13.641 1.414 L 20.416 5.409 C 20.483 5.449 20.543 5.493 20.596 5.542 L 20.604 5.549 L 20.711 5.625 C 21.470 6.194 21.939 7.068 21.995 8.015 L 22.000 8.218 L 22.000 15.502 C 22.000 16.677 21.357 17.758 20.377 18.295 L 13.573 22.597 C 12.593 23.135 11.407 23.135 10.373 22.565 L 3.678 18.328 C 2.645 17.763 2.002 16.680 2.000 15.502 L 2.000 8.217 C 1.999 7.051 2.631 5.976 3.650 5.409 ZM 12.000 7.000 C 10.411 7.000 9.098 8.238 9.005 9.824 L 9.000 10.000 L 9.000 14.000 L 9.005 14.176 C 9.097 15.763 10.410 17.003 12.000 17.003 C 13.590 17.003 14.903 15.763 14.995 14.176 L 15.000 14.000 L 15.000 10.000 L 14.995 9.824 C 14.902 8.238 13.589 7.000 12.000 7.000 ZM 12.000 9.000 C 12.507 9.000 12.934 9.380 12.993 9.883 L 13.000 10.000 L 13.000 14.000 L 12.993 14.117 C 12.933 14.620 12.507 14.999 12.000 14.999 C 11.493 14.999 11.067 14.620 11.007 14.117 L 11.000 14.000 L 11.000 10.000 L 11.007 9.883 C 11.066 9.380 11.493 9.000 12.000 9.000 Z"),
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
        return _hexagonNumber0!!
    }

private var _hexagonNumber0: ImageVector? = null
