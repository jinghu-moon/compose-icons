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
                pathData = parseSvgPathData("M12.707 14.293l3 3c.188 .187 .293 .442 .293 .707v2c0 1.105-.895 2-2 2h-4C8.895 22 8 21.105 8 20v-2c0-.265 .105-.52 .293-.707l3-3c.391-.39 1.023-.39 1.414 0M6 8c.265 0 .52 .105 .707 .293l3 3c.39 .391 .39 1.023 0 1.414l-3 3C6.52 15.895 6.265 16 6 16h-2C2.895 16 2 15.105 2 14v-4C2 8.895 2.895 8 4 8ZM20 8c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-2c-.265-0-.52-.105-.707-.293l-3-3c-.39-.391-.39-1.023 0-1.414l3-3C17.48 8.105 17.735 8 18 8ZM14 2c1.105 0 2 .895 2 2v2c-0 .265-.105 .52-.293 .707l-3 3c-.391 .39-1.023 .39-1.414 0l-3-3C8.105 6.52 8 6.265 8 6v-2C8 2.895 8.895 2 10 2Z"),
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
