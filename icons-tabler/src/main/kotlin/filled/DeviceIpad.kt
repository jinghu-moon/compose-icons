package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceIpad: ImageVector
    get() {
        if (_deviceIpad != null) return _deviceIpad!!
        _deviceIpad = tablerFilledIcon(
            name = "DeviceIpad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 2.000 C 19.657 2.000 21.000 3.343 21.000 5.000 L 21.000 19.000 C 21.000 20.657 19.657 22.000 18.000 22.000 L 6.000 22.000 C 4.343 22.000 3.000 20.657 3.000 19.000 L 3.000 5.000 C 3.000 3.343 4.343 2.000 6.000 2.000 ZM 15.000 18.000 L 9.000 18.000 C 8.448 18.000 8.000 18.448 8.000 19.000 C 8.000 19.552 8.448 20.000 9.000 20.000 L 15.000 20.000 C 15.552 20.000 16.000 19.552 16.000 19.000 C 16.000 18.448 15.552 18.000 15.000 18.000"),
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
        return _deviceIpad!!
    }

private var _deviceIpad: ImageVector? = null
