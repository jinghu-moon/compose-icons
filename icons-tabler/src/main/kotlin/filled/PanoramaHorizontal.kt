package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PanoramaHorizontal: ImageVector
    get() {
        if (_panoramaHorizontal != null) return _panoramaHorizontal!!
        _panoramaHorizontal = tablerFilledIcon(
            name = "PanoramaHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.310 4.591 C 19.923 4.366 20.607 4.454 21.143 4.827 C 21.679 5.200 21.999 5.811 22.000 6.464 L 22.000 17.464 C 22.000 18.846 20.620 19.844 19.306 19.361 C 14.427 17.516 9.572 17.516 4.694 19.361 C 3.390 19.856 2.000 18.880 2.000 17.490 L 2.000 6.458 C 2.004 5.809 2.322 5.203 2.854 4.831 C 3.386 4.459 4.065 4.369 4.676 4.588 L 4.701 4.600 L 5.149 4.762 C 9.721 6.385 14.272 6.384 18.852 4.759 Z"),
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
        return _panoramaHorizontal!!
    }

private var _panoramaHorizontal: ImageVector? = null
