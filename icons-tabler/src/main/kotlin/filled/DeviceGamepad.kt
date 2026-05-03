package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceGamepad: ImageVector
    get() {
        if (_deviceGamepad != null) return _deviceGamepad!!
        _deviceGamepad = tablerFilledIcon(
            name = "DeviceGamepad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 5.000 C 21.657 5.000 23.000 6.343 23.000 8.000 L 23.000 16.000 C 23.000 17.657 21.657 19.000 20.000 19.000 L 4.000 19.000 C 2.343 19.000 1.000 17.657 1.000 16.000 L 1.000 8.000 C 1.000 6.343 2.343 5.000 4.000 5.000 ZM 8.000 9.000 L 7.883 9.007 C 7.380 9.066 7.000 9.493 7.000 10.000 L 7.000 11.000 L 6.000 11.000 C 5.448 11.000 5.000 11.448 5.000 12.000 L 5.007 12.117 C 5.066 12.620 5.493 13.000 6.000 13.000 L 7.000 13.000 L 7.000 14.000 C 7.000 14.552 7.448 15.000 8.000 15.000 L 8.117 14.993 C 8.620 14.934 9.000 14.507 9.000 14.000 L 9.000 13.000 L 10.000 13.000 C 10.552 13.000 11.000 12.552 11.000 12.000 L 10.993 11.883 C 10.934 11.380 10.507 11.000 10.000 11.000 L 9.000 11.000 L 9.000 10.000 C 9.000 9.448 8.552 9.000 8.000 9.000M 18.000 12.000 C 17.448 12.000 17.000 12.448 17.000 13.000 L 17.000 13.010 C 17.000 13.562 17.448 14.010 18.000 14.010 C 18.552 14.010 19.000 13.562 19.000 13.010 L 19.000 13.000 C 19.000 12.448 18.552 12.000 18.000 12.000M 15.000 10.000 C 14.448 10.000 14.000 10.448 14.000 11.000 L 14.000 11.010 C 14.000 11.562 14.448 12.010 15.000 12.010 C 15.552 12.010 16.000 11.562 16.000 11.010 L 16.000 11.000 C 16.000 10.448 15.552 10.000 15.000 10.000"),
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
        return _deviceGamepad!!
    }

private var _deviceGamepad: ImageVector? = null
