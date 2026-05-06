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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-6C7.343 22 6 20.657 6 19v-14C6 3.343 7.343 2 9 2h2v1c0 .507 .38 .934 .883 .993L12 4c.552 0 1-.448 1-1v-1ZM10 17c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127C10.934 17.38 10.507 17 10 17M14 17c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127C14.934 17.38 14.507 17 14 17M10 14c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127C10.934 14.38 10.507 14 10 14M14 14c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127C14.934 14.38 14.507 14 14 14M12 7C10.411 7 9.098 8.238 9.005 9.824L9 10c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 8.343 13.657 7 12 7"),
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
        return _deviceRemote!!
    }

private var _deviceRemote: ImageVector? = null
