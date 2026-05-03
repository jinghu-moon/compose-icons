package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceVisionPro: ImageVector
    get() {
        if (_deviceVisionPro != null) return _deviceVisionPro!!
        _deviceVisionPro = tablerFilledIcon(
            name = "DeviceVisionPro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 6.000 Q 13.740 6.000 15.342 6.106 Q 16.961 6.213 18.315 6.554 Q 19.703 6.899 20.751 7.604 C 21.465 8.085 22.039 8.746 22.416 9.520 C 22.813 10.321 23.000 11.289 23.000 12.430 C 23.000 13.586 22.778 14.638 22.327 15.570 C 21.877 16.504 21.254 17.255 20.459 17.806 C 19.658 18.362 18.704 18.655 17.729 18.645 Q 16.797 18.646 16.026 18.382 C 15.546 18.218 15.085 18.002 14.652 17.738 C 14.275 17.505 13.906 17.260 13.545 17.002 C 13.258 16.793 12.957 16.604 12.644 16.435 C 12.447 16.326 12.226 16.266 12.001 16.261 C 11.792 16.261 11.575 16.318 11.343 16.441 Q 10.923 16.667 10.450 17.005 C 10.090 17.261 9.721 17.506 9.345 17.738 C 8.915 18.002 8.457 18.217 7.979 18.380 C 7.435 18.560 6.864 18.650 6.291 18.644 C 5.309 18.659 4.348 18.366 3.541 17.806 C 2.747 17.256 2.123 16.504 1.673 15.572 Q 0.998 14.165 1.000 12.432 C 0.995 11.297 1.182 10.327 1.577 9.532 C 1.955 8.754 2.532 8.089 3.250 7.606 C 3.949 7.136 4.761 6.790 5.692 6.557 C 6.666 6.321 7.659 6.171 8.660 6.110 Q 10.259 6.000 12.000 6.000"),
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
        return _deviceVisionPro!!
    }

private var _deviceVisionPro: ImageVector? = null
