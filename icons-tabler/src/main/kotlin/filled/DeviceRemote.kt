package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceRemote: ImageVector
    get() {
        if (_deviceRemote != null) return _deviceRemote!!
        _deviceRemote = tablerFilledIcon(
            name = "DeviceRemote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 2.000 C 16.657 2.000 18.000 3.343 18.000 5.000 L 18.000 19.000 C 18.000 20.657 16.657 22.000 15.000 22.000 L 9.000 22.000 C 7.343 22.000 6.000 20.657 6.000 19.000 L 6.000 5.000 C 6.000 3.343 7.343 2.000 9.000 2.000 L 11.000 2.000 L 11.000 3.000 C 11.000 3.507 11.380 3.934 11.883 3.993 L 12.000 4.000 C 12.552 4.000 13.000 3.552 13.000 3.000 L 13.000 2.000 ZM 10.000 17.000 C 9.448 17.000 9.000 17.448 9.000 18.000 L 9.007 18.127 C 9.069 18.652 9.530 19.038 10.059 19.007 C 10.587 18.976 10.999 18.539 11.000 18.010 L 10.993 17.883 C 10.934 17.380 10.507 17.000 10.000 17.000M 14.000 17.000 C 13.448 17.000 13.000 17.448 13.000 18.000 L 13.007 18.127 C 13.069 18.652 13.530 19.038 14.059 19.007 C 14.587 18.976 14.999 18.539 15.000 18.010 L 14.993 17.883 C 14.934 17.380 14.507 17.000 14.000 17.000M 10.000 14.000 C 9.448 14.000 9.000 14.448 9.000 15.000 L 9.007 15.127 C 9.069 15.652 9.530 16.038 10.059 16.007 C 10.587 15.976 10.999 15.539 11.000 15.010 L 10.993 14.883 C 10.934 14.380 10.507 14.000 10.000 14.000M 14.000 14.000 C 13.448 14.000 13.000 14.448 13.000 15.000 L 13.007 15.127 C 13.069 15.652 13.530 16.038 14.059 16.007 C 14.587 15.976 14.999 15.539 15.000 15.010 L 14.993 14.883 C 14.934 14.380 14.507 14.000 14.000 14.000M 12.000 7.000 C 10.411 7.000 9.098 8.238 9.005 9.824 L 9.000 10.000 C 9.000 11.657 10.343 13.000 12.000 13.000 C 13.657 13.000 15.000 11.657 15.000 10.000 C 15.000 8.343 13.657 7.000 12.000 7.000"),
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
        return _deviceRemote!!
    }

private var _deviceRemote: ImageVector? = null
