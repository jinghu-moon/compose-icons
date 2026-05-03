package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceCctv: ImageVector
    get() {
        if (_deviceCctv != null) return _deviceCctv!!
        _deviceCctv = tablerFilledIcon(
            name = "DeviceCctv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 8.000 L 20.000 14.000 C 20.000 18.418 16.418 22.000 12.000 22.000 C 7.582 22.000 4.000 18.418 4.000 14.000 L 4.000 8.000 ZM 12.000 10.000 C 9.859 10.000 8.097 11.687 8.004 13.826 L 8.000 14.000 C 8.000 16.209 9.791 18.000 12.000 18.000 C 14.209 18.000 16.000 16.209 16.000 14.000 C 16.000 11.791 14.209 10.000 12.000 10.000M 12.010 13.000 C 12.539 13.001 12.976 13.413 13.007 13.941 C 13.038 14.470 12.652 14.931 12.127 14.993 L 12.000 15.000 C 11.471 14.999 11.034 14.587 11.003 14.059 C 10.972 13.530 11.358 13.069 11.883 13.007 ZM 2.000 5.000 L 2.000 4.000 C 2.000 2.895 2.895 2.000 4.000 2.000 L 20.000 2.000 C 21.105 2.000 22.000 2.895 22.000 4.000 L 22.000 5.000 C 22.000 6.105 21.105 7.000 20.000 7.000 L 4.000 7.000 C 2.895 7.000 2.000 6.105 2.000 5.000"),
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
        return _deviceCctv!!
    }

private var _deviceCctv: ImageVector? = null
