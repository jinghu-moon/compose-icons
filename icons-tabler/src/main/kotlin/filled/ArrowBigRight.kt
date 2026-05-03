package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigRight: ImageVector
    get() {
        if (_arrowBigRight != null) return _arrowBigRight!!
        _arrowBigRight = tablerFilledIcon(
            name = "ArrowBigRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.089 3.634 C 11.421 3.976 11.000 4.663 11.000 5.414 L 10.999 8.000 L 4.000 8.000 C 2.895 8.000 2.000 8.895 2.000 10.000 L 2.000 14.000 L 2.005 14.150 C 2.083 15.194 2.953 16.000 4.000 16.000 L 10.999 15.999 L 11.000 18.586 C 11.000 19.395 11.487 20.124 12.235 20.433 C 12.982 20.743 13.842 20.572 14.414 20.000 L 21.000 13.414 C 21.781 12.633 21.781 11.367 21.000 10.586 L 14.414 4.000 C 13.842 3.428 12.982 3.256 12.234 3.566 L 12.089 3.634 Z"),
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
        return _arrowBigRight!!
    }

private var _arrowBigRight: ImageVector? = null
