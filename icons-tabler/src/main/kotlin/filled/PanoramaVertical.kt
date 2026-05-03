package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PanoramaVertical: ImageVector
    get() {
        if (_panoramaVertical != null) return _panoramaVertical!!
        _panoramaVertical = tablerFilledIcon(
            name = "PanoramaVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.530 2.000 C 18.920 2.000 19.894 3.389 19.400 4.692 L 19.387 4.718 L 19.231 5.149 C 17.608 9.721 17.609 14.272 19.234 18.852 L 19.402 19.310 C 19.627 19.923 19.539 20.607 19.166 21.143 C 18.793 21.679 18.182 21.999 17.529 22.000 L 6.529 22.000 C 5.143 22.000 4.135 20.614 4.632 19.306 C 6.477 14.427 6.477 9.572 4.632 4.694 C 4.137 3.390 5.112 2.000 6.502 2.000 Z"),
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
        return _panoramaVertical!!
    }

private var _panoramaVertical: ImageVector? = null
