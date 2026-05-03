package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigDown: ImageVector
    get() {
        if (_arrowBigDown != null) return _arrowBigDown!!
        _arrowBigDown = tablerFilledIcon(
            name = "ArrowBigDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 2.000 L 9.850 2.005 C 8.806 2.083 8.000 2.953 8.000 4.000 L 8.000 10.999 L 5.414 11.000 C 4.605 11.000 3.876 11.487 3.567 12.235 C 3.257 12.982 3.428 13.842 4.000 14.414 L 10.586 21.000 C 11.367 21.781 12.633 21.781 13.414 21.000 L 20.000 14.414 C 20.572 13.842 20.744 12.982 20.434 12.234 L 20.366 12.089 C 20.024 11.421 19.337 11.000 18.586 11.000 L 16.000 10.999 L 16.000 4.000 C 16.000 2.895 15.105 2.000 14.000 2.000 L 10.000 2.000 Z"),
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
        return _arrowBigDown!!
    }

private var _arrowBigDown: ImageVector? = null
