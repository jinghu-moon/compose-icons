package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceMobile: ImageVector
    get() {
        if (_deviceMobile != null) return _deviceMobile!!
        _deviceMobile = tablerFilledIcon(
            name = "DeviceMobile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 2c1.589-0 2.902 1.238 2.995 2.824L19 5v14c0 1.589-1.238 2.902-2.824 2.995L16 22h-8C6.411 22 5.098 20.762 5.005 19.176L5 19v-14C5 3.411 6.238 2.098 7.824 2.005L8 2h8ZM12 16c-.507 0-.934 .38-.993 .883L11 17l.007 .127c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L13 17.01l-.007-.127C12.934 16.38 12.507 16 12 16ZM13 4h-2l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L11 6h2l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L13 4Z"),
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
        return _deviceMobile!!
    }

private var _deviceMobile: ImageVector? = null
