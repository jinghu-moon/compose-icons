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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 2c1.047-0 1.917 .806 1.995 1.85L20 4v16c0 1.047-.806 1.917-1.85 1.995L18 22h-12C4.953 22 4.083 21.194 4.005 20.15L4 20v-16C4 2.953 4.806 2.083 5.85 2.005L6 2h12ZM12 15c-.988-0-1.827 .721-1.977 1.697l-.018 .154L10 17l.005 .15c.081 1.082 1.011 1.902 2.094 1.848 1.084-.054 1.926-.962 1.9-2.047C13.972 15.866 13.085 15 12 15Z"),
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
        return _deviceTablet!!
    }

private var _deviceTablet: ImageVector? = null
