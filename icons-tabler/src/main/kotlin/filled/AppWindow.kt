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
                pathData = parseSvgPathData("M 19.000 4.000 C 20.657 4.000 22.000 5.343 22.000 7.000 L 22.000 17.000 C 22.000 18.657 20.657 20.000 19.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 L 2.000 7.000 C 2.000 5.343 3.343 4.000 5.000 4.000 ZM 6.010 7.000 L 5.883 7.007 C 5.358 7.069 4.972 7.530 5.003 8.059 C 5.034 8.587 5.471 8.999 6.000 9.000 L 6.127 8.993 C 6.652 8.931 7.038 8.470 7.007 7.941 C 6.976 7.413 6.539 7.001 6.010 7.000 ZM 9.010 7.000 L 8.883 7.007 C 8.358 7.069 7.972 7.530 8.003 8.059 C 8.034 8.587 8.471 8.999 9.000 9.000 L 9.127 8.993 C 9.652 8.931 10.038 8.470 10.007 7.941 C 9.976 7.413 9.539 7.001 9.010 7.000 Z"),
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
