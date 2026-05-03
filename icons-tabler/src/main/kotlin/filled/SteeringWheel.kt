package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) return _steeringWheel!!
        _steeringWheel = tablerFilledIcon(
            name = "SteeringWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 4.000 12.000 C 4.000 16.032 7.000 19.433 11.000 19.937 L 11.000 14.830 C 10.068 14.501 9.358 13.734 9.102 12.780 L 4.032 11.276 Q 4.001 11.636 4.000 12.001M 19.967 11.276 L 14.898 12.779 C 14.642 13.733 13.933 14.500 13.001 14.830 L 13.001 19.938 C 17.185 19.411 20.242 15.726 19.986 11.516 ZM 8.000 5.072 C 6.355 6.022 5.101 7.526 4.464 9.316 L 9.276 10.742 C 9.766 9.679 10.830 8.999 12.000 8.999 C 13.170 8.999 14.234 9.679 14.724 10.742 L 19.536 9.316 C 18.739 7.079 16.990 5.312 14.762 4.492 C 12.534 3.673 10.056 3.885 8.000 5.072"),
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
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
