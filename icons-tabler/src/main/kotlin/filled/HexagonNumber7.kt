package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonNumber7: ImageVector
    get() {
        if (_hexagonNumber7 != null) return _hexagonNumber7!!
        _hexagonNumber7 = tablerFilledIcon(
            name = "HexagonNumber7",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.425 1.414 C 11.426 0.862 12.640 0.862 13.641 1.414 L 20.416 5.409 C 20.483 5.449 20.543 5.493 20.596 5.542 L 20.604 5.549 L 20.711 5.625 C 21.470 6.194 21.939 7.068 21.995 8.015 L 22.000 8.218 L 22.000 15.502 C 22.000 16.677 21.357 17.758 20.377 18.295 L 13.573 22.597 C 12.593 23.135 11.407 23.135 10.373 22.565 L 3.678 18.328 C 2.645 17.763 2.002 16.680 2.000 15.502 L 2.000 8.217 C 1.999 7.051 2.631 5.976 3.650 5.409 ZM 14.000 7.000 L 10.000 7.000 L 9.883 7.007 C 9.424 7.061 9.061 7.424 9.007 7.883 L 9.000 8.000 L 9.007 8.117 C 9.061 8.576 9.424 8.939 9.883 8.993 L 10.000 9.000 L 12.718 9.000 L 11.030 15.757 L 11.008 15.872 C 10.943 16.375 11.265 16.847 11.757 16.970 C 12.249 17.093 12.755 16.828 12.935 16.354 L 12.970 16.243 L 14.970 8.243 L 14.991 8.131 C 15.026 7.865 14.953 7.596 14.788 7.384 C 14.623 7.173 14.380 7.036 14.113 7.006 L 14.000 7.000 Z"),
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
        return _hexagonNumber7!!
    }

private var _hexagonNumber7: ImageVector? = null
