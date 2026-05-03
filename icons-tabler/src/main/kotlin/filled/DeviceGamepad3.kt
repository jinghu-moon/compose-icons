package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceGamepad3: ImageVector
    get() {
        if (_deviceGamepad3 != null) return _deviceGamepad3!!
        _deviceGamepad3 = tablerFilledIcon(
            name = "DeviceGamepad3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.707 14.293 L 15.707 17.293 C 15.895 17.480 16.000 17.735 16.000 18.000 L 16.000 20.000 C 16.000 21.105 15.105 22.000 14.000 22.000 L 10.000 22.000 C 8.895 22.000 8.000 21.105 8.000 20.000 L 8.000 18.000 C 8.000 17.735 8.105 17.480 8.293 17.293 L 11.293 14.293 C 11.684 13.903 12.316 13.903 12.707 14.293M 6.000 8.000 C 6.265 8.000 6.520 8.105 6.707 8.293 L 9.707 11.293 C 10.097 11.684 10.097 12.316 9.707 12.707 L 6.707 15.707 C 6.520 15.895 6.265 16.000 6.000 16.000 L 4.000 16.000 C 2.895 16.000 2.000 15.105 2.000 14.000 L 2.000 10.000 C 2.000 8.895 2.895 8.000 4.000 8.000 ZM 20.000 8.000 C 21.105 8.000 22.000 8.895 22.000 10.000 L 22.000 14.000 C 22.000 15.105 21.105 16.000 20.000 16.000 L 18.000 16.000 C 17.735 16.000 17.480 15.895 17.293 15.707 L 14.293 12.707 C 13.903 12.316 13.903 11.684 14.293 11.293 L 17.293 8.293 C 17.480 8.105 17.735 8.000 18.000 8.000 ZM 14.000 2.000 C 15.105 2.000 16.000 2.895 16.000 4.000 L 16.000 6.000 C 16.000 6.265 15.895 6.520 15.707 6.707 L 12.707 9.707 C 12.316 10.097 11.684 10.097 11.293 9.707 L 8.293 6.707 C 8.105 6.520 8.000 6.265 8.000 6.000 L 8.000 4.000 C 8.000 2.895 8.895 2.000 10.000 2.000 Z"),
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
        return _deviceGamepad3!!
    }

private var _deviceGamepad3: ImageVector? = null
