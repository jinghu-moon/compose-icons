package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Settings: ImageVector
    get() {
        if (_settings != null) return _settings!!
        _settings = tablerFilledIcon(
            name = "Settings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.647 4.081 C 14.701 4.306 14.860 4.491 15.073 4.579 C 15.287 4.668 15.530 4.649 15.727 4.529 C 18.166 3.044 20.957 5.834 19.472 8.273 C 19.352 8.470 19.333 8.713 19.421 8.926 C 19.510 9.140 19.695 9.298 19.919 9.353 C 22.694 10.026 22.694 13.973 19.919 14.647 C 19.694 14.701 19.509 14.860 19.421 15.073 C 19.332 15.287 19.351 15.530 19.471 15.727 C 20.956 18.166 18.166 20.957 15.727 19.472 C 15.530 19.352 15.287 19.333 15.074 19.421 C 14.860 19.510 14.702 19.695 14.647 19.919 C 13.974 22.694 10.027 22.694 9.353 19.919 C 9.299 19.694 9.140 19.509 8.927 19.421 C 8.713 19.332 8.470 19.351 8.273 19.471 C 5.834 20.956 3.043 18.166 4.528 15.727 C 4.648 15.530 4.667 15.287 4.579 15.074 C 4.490 14.860 4.305 14.702 4.081 14.647 C 1.306 13.974 1.306 10.027 4.081 9.353 C 4.306 9.299 4.491 9.140 4.579 8.927 C 4.668 8.713 4.649 8.470 4.529 8.273 C 3.044 5.834 5.834 3.043 8.273 4.528 C 8.470 4.649 8.713 4.668 8.927 4.580 C 9.141 4.491 9.299 4.306 9.353 4.081 C 10.026 1.306 13.973 1.306 14.647 4.081 ZM 12.000 9.000 C 10.343 9.000 9.000 10.343 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 C 13.657 15.000 15.000 13.657 15.000 12.000 C 15.000 10.343 13.657 9.000 12.000 9.000"),
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
        return _settings!!
    }

private var _settings: ImageVector? = null
