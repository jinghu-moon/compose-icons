package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceWatch: ImageVector
    get() {
        if (_deviceWatch != null) return _deviceWatch!!
        _deviceWatch = tablerFilledIcon(
            name = "DeviceWatch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 2.000 C 15.552 2.000 16.000 2.448 16.000 3.000 L 16.000 5.126 C 17.726 5.571 19.000 7.136 19.000 9.000 L 19.000 15.000 C 19.000 16.824 17.766 18.418 16.000 18.874 L 16.000 21.000 C 16.000 21.552 15.552 22.000 15.000 22.000 L 9.000 22.000 C 8.448 22.000 8.000 21.552 8.000 21.000 L 8.000 18.874 C 6.234 18.418 5.000 16.824 5.000 15.000 L 5.000 9.000 C 5.000 7.176 6.234 5.582 8.000 5.126 L 8.000 3.000 C 8.000 2.448 8.448 2.000 9.000 2.000 ZM 14.000 19.000 L 10.000 19.000 L 10.000 20.000 L 14.000 20.000 ZM 14.000 4.000 L 10.000 4.000 L 10.000 5.000 L 14.000 5.000 Z"),
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
        return _deviceWatch!!
    }

private var _deviceWatch: ImageVector? = null
