package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceImac: ImageVector
    get() {
        if (_deviceImac != null) return _deviceImac!!
        _deviceImac = tablerFilledIcon(
            name = "DeviceImac",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 22.000 C 7.448 22.000 7.000 21.552 7.000 21.000 C 7.000 20.448 7.448 20.000 8.000 20.000 L 8.616 20.000 L 8.866 18.000 L 4.000 18.000 C 2.895 18.000 2.000 17.105 2.000 16.000 L 2.000 4.000 C 2.000 2.895 2.895 2.000 4.000 2.000 L 20.000 2.000 C 21.105 2.000 22.000 2.895 22.000 4.000 L 22.000 16.000 C 22.000 17.105 21.105 18.000 20.000 18.000 L 15.133 18.000 L 15.383 20.000 L 16.000 20.000 C 16.552 20.000 17.000 20.448 17.000 21.000 C 17.000 21.552 16.552 22.000 16.000 22.000 ZM 13.116 18.000 L 10.883 18.000 L 10.633 20.000 L 13.366 20.000 Z"),
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
        return _deviceImac!!
    }

private var _deviceImac: ImageVector? = null
