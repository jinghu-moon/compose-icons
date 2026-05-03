package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Rosette: ImageVector
    get() {
        if (_rosette != null) return _rosette!!
        _rosette = tablerFilledIcon(
            name = "Rosette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.010 2.011 C 12.788 2.011 13.539 2.294 14.123 2.808 L 14.277 2.953 L 14.975 3.651 C 15.167 3.841 15.417 3.961 15.685 3.992 L 15.820 4.000 L 16.820 4.000 C 18.517 4.000 19.919 5.324 20.015 7.018 L 20.020 7.200 L 20.020 8.200 C 20.020 8.470 20.112 8.733 20.278 8.943 L 20.368 9.043 L 21.065 9.741 C 22.264 10.933 22.329 12.853 21.212 14.123 L 21.067 14.277 L 20.369 14.975 C 20.179 15.167 20.059 15.417 20.028 15.685 L 20.020 15.820 L 20.020 16.820 C 20.020 18.517 18.696 19.919 17.002 20.015 L 16.820 20.020 L 15.820 20.020 C 15.550 20.020 15.289 20.111 15.077 20.278 L 14.977 20.368 L 14.279 21.065 C 13.087 22.264 11.167 22.329 9.897 21.212 L 9.743 21.067 L 9.045 20.369 C 8.853 20.179 8.603 20.059 8.335 20.028 L 8.200 20.020 L 7.200 20.020 C 5.503 20.020 4.101 18.696 4.005 17.002 L 4.000 16.820 L 4.000 15.820 C 4.000 15.550 3.909 15.289 3.742 15.077 L 3.652 14.977 L 2.955 14.279 C 1.756 13.087 1.691 11.167 2.808 9.897 L 2.953 9.743 L 3.651 9.045 C 3.841 8.853 3.961 8.603 3.992 8.335 L 4.000 8.200 L 4.000 7.200 L 4.005 7.018 C 4.097 5.394 5.394 4.097 7.018 4.005 L 7.200 4.000 L 8.200 4.000 C 8.470 4.000 8.731 3.909 8.943 3.742 L 9.043 3.652 L 9.741 2.955 C 10.342 2.351 11.158 2.011 12.010 2.011 Z"),
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
        return _rosette!!
    }

private var _rosette: ImageVector? = null
