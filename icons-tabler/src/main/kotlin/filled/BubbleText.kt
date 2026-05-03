package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BubbleText: ImageVector
    get() {
        if (_bubbleText != null) return _bubbleText!!
        _bubbleText = tablerFilledIcon(
            name = "BubbleText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.400 2.000 L 12.653 2.005 C 14.825 2.093 16.801 3.288 17.888 5.171 L 17.977 5.334 L 18.155 5.373 C 20.014 5.809 21.577 7.060 22.409 8.779 L 22.514 9.007 C 23.363 10.954 23.179 13.198 22.025 14.981 C 20.870 16.764 18.898 17.850 16.774 17.872 L 16.630 17.870 L 16.593 17.922 C 15.322 19.597 13.176 20.355 11.135 19.848 L 10.949 19.797 L 7.514 21.857 C 7.223 22.032 6.862 22.047 6.557 21.897 C 6.253 21.746 6.045 21.452 6.006 21.114 L 6.000 21.000 L 6.000 18.565 L 5.945 18.539 C 5.289 18.207 4.747 17.685 4.391 17.041 L 4.289 16.842 C 3.972 16.176 3.864 15.430 3.977 14.702 L 4.015 14.492 L 3.899 14.400 C 2.136 12.940 1.397 10.580 2.012 8.375 L 2.083 8.137 C 2.850 5.782 5.027 4.174 7.503 4.133 L 7.660 4.133 L 7.810 3.968 C 8.943 2.776 10.496 2.072 12.140 2.005 ZM 14.000 13.000 L 9.000 13.000 C 8.448 13.000 8.000 13.448 8.000 14.000 C 8.000 14.552 8.448 15.000 9.000 15.000 L 14.000 15.000 C 14.552 15.000 15.000 14.552 15.000 14.000 C 15.000 13.448 14.552 13.000 14.000 13.000M 17.000 9.000 L 7.000 9.000 C 6.448 9.000 6.000 9.448 6.000 10.000 C 6.000 10.552 6.448 11.000 7.000 11.000 L 17.000 11.000 C 17.552 11.000 18.000 10.552 18.000 10.000 C 18.000 9.448 17.552 9.000 17.000 9.000"),
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
        return _bubbleText!!
    }

private var _bubbleText: ImageVector? = null
