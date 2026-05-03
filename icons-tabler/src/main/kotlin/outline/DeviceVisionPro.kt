package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceVisionPro: ImageVector
    get() {
        if (_deviceVisionPro != null) return _deviceVisionPro!!
        _deviceVisionPro = tablerOutlineIcon(
            name = "DeviceVisionPro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 7.000 C 13.143 7.000 14.235 7.035 15.275 7.104 C 16.292 7.172 17.225 7.311 18.073 7.524 C 18.886 7.727 19.593 8.029 20.192 8.433 C 20.762 8.817 21.220 9.346 21.520 9.964 C 21.846 10.621 22.000 11.444 22.000 12.430 C 22.000 13.436 21.811 14.340 21.426 15.137 C 21.051 15.916 20.540 16.533 19.889 16.985 C 19.256 17.425 18.500 17.656 17.729 17.645 C 17.220 17.645 16.759 17.577 16.347 17.435 C 15.938 17.296 15.546 17.112 15.177 16.887 C 14.821 16.667 14.472 16.435 14.132 16.192 C 13.812 15.961 13.478 15.750 13.131 15.562 C 12.785 15.369 12.397 15.266 12.001 15.261 C 11.628 15.261 11.251 15.358 10.869 15.561 C 10.553 15.731 10.219 15.941 9.869 16.191 C 9.547 16.421 9.199 16.653 8.822 16.886 C 8.454 17.112 8.063 17.295 7.654 17.434 C 7.241 17.576 6.782 17.644 6.276 17.644 C 5.503 17.655 4.746 17.425 4.111 16.985 C 3.460 16.533 2.949 15.915 2.574 15.137 C 2.189 14.339 2.000 13.437 2.000 12.428 C 1.996 11.448 2.150 10.626 2.477 9.968 C 2.777 9.349 3.236 8.821 3.807 8.437 C 4.407 8.034 5.114 7.733 5.927 7.530 C 6.846 7.307 7.783 7.165 8.727 7.107 C 9.767 7.036 10.857 7.000 12.000 7.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _deviceVisionPro!!
    }

private var _deviceVisionPro: ImageVector? = null
