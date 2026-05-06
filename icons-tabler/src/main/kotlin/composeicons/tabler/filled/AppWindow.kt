package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AppWindow: ImageVector
    get() {
        if (_appWindow != null) return _appWindow!!
        _appWindow = tablerFilledIcon(
            name = "AppWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-14C3.343 20 2 18.657 2 17v-10C2 5.343 3.343 4 5 4ZM6.01 7l-.127 .007c-.525 .062-.911 .523-.88 1.052C5.034 8.587 5.471 8.999 6 9l.127-.007c.525-.062 .911-.523 .88-1.052C6.976 7.413 6.539 7.001 6.01 7ZM9.01 7l-.127 .007c-.525 .062-.911 .523-.88 1.052C8.034 8.587 8.471 8.999 9 9l.127-.007c.525-.062 .911-.523 .88-1.052C9.976 7.413 9.539 7.001 9.01 7Z"),
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
        return _appWindow!!
    }

private var _appWindow: ImageVector? = null
