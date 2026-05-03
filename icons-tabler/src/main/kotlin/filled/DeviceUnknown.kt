package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceUnknown: ImageVector
    get() {
        if (_deviceUnknown != null) return _deviceUnknown!!
        _deviceUnknown = tablerFilledIcon(
            name = "DeviceUnknown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 C 18.657 2.000 20.000 3.343 20.000 5.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 5.000 C 4.000 3.343 5.343 2.000 7.000 2.000 ZM 12.000 15.000 C 11.448 15.000 11.000 15.448 11.000 16.000 L 11.000 16.010 C 11.000 16.562 11.448 17.010 12.000 17.010 C 12.552 17.010 13.000 16.562 13.000 16.010 L 13.000 16.000 C 13.000 15.448 12.552 15.000 12.000 15.000M 13.368 8.327 C 12.135 7.697 10.631 7.998 9.737 9.055 C 9.395 9.478 9.454 10.096 9.868 10.447 C 10.283 10.798 10.903 10.754 11.263 10.347 C 11.557 9.999 12.053 9.900 12.458 10.108 C 12.871 10.317 13.087 10.783 12.978 11.234 C 12.870 11.684 12.466 12.001 12.003 12.000 C 11.451 11.998 11.002 12.445 11.000 12.997 C 10.998 13.549 11.445 13.998 11.997 14.000 C 13.386 14.004 14.596 13.055 14.922 11.705 C 15.248 10.355 14.605 8.957 13.368 8.327"),
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
        return _deviceUnknown!!
    }

private var _deviceUnknown: ImageVector? = null
