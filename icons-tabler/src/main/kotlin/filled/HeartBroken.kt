package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HeartBroken: ImageVector
    get() {
        if (_heartBroken != null) return _heartBroken!!
        _heartBroken = tablerFilledIcon(
            name = "HeartBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.001 3.800 L 11.000 5.763 L 9.106 9.553 L 9.059 9.663 C 8.911 10.076 9.049 10.537 9.400 10.800 L 12.732 13.299 L 11.106 16.553 C 11.036 16.692 11.000 16.845 11.000 17.000 L 11.000 20.417 L 3.803 13.290 C 1.670 11.214 1.383 7.888 3.126 5.476 C 4.870 3.064 8.119 2.295 10.759 3.669 ZM 16.771 3.061 L 17.017 3.098 C 19.235 3.481 21.052 5.073 21.724 7.222 C 22.395 9.370 21.807 11.714 20.201 13.291 L 20.157 13.328 L 13.000 20.416 L 13.000 17.235 L 14.894 13.447 L 14.941 13.337 C 15.089 12.924 14.951 12.463 14.600 12.200 L 11.267 9.700 L 12.894 6.447 C 12.964 6.308 13.000 6.155 13.000 6.000 L 13.000 3.813 C 14.140 3.156 15.465 2.891 16.770 3.061"),
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
        return _heartBroken!!
    }

private var _heartBroken: ImageVector? = null
