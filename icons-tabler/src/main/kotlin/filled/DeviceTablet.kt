package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceTablet: ImageVector
    get() {
        if (_deviceTablet != null) return _deviceTablet!!
        _deviceTablet = tablerFilledIcon(
            name = "DeviceTablet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 2.000 C 19.047 2.000 19.917 2.806 19.995 3.850 L 20.000 4.000 L 20.000 20.000 C 20.000 21.047 19.194 21.917 18.150 21.995 L 18.000 22.000 L 6.000 22.000 C 4.953 22.000 4.083 21.194 4.005 20.150 L 4.000 20.000 L 4.000 4.000 C 4.000 2.953 4.806 2.083 5.850 2.005 L 6.000 2.000 L 18.000 2.000 ZM 12.000 15.000 C 11.012 15.000 10.173 15.721 10.023 16.697 L 10.005 16.851 L 10.000 17.000 L 10.005 17.150 C 10.086 18.232 11.016 19.052 12.099 18.998 C 13.183 18.943 14.026 18.035 13.999 16.950 C 13.972 15.866 13.085 15.000 12.000 15.000 Z"),
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
        return _deviceTablet!!
    }

private var _deviceTablet: ImageVector? = null
