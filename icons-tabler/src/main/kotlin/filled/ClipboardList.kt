package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClipboardList: ImageVector
    get() {
        if (_clipboardList != null) return _clipboardList!!
        _clipboardList = tablerFilledIcon(
            name = "ClipboardList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.997 4.170 C 19.197 4.593 20.000 5.727 20.000 7.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 7.000 C 4.000 5.727 4.803 4.593 6.003 4.170 C 6.094 6.311 7.857 8.000 10.000 8.000 L 14.000 8.000 C 16.053 8.000 17.773 6.446 17.980 4.403 ZM 9.010 15.000 L 9.000 15.000 C 8.471 15.001 8.034 15.413 8.003 15.941 C 7.972 16.470 8.358 16.931 8.883 16.993 L 9.010 17.000 C 9.562 17.000 10.010 16.552 10.010 16.000 C 10.010 15.448 9.562 15.000 9.010 15.000M 15.000 15.000 L 13.000 15.000 C 12.448 15.000 12.000 15.448 12.000 16.000 C 12.000 16.552 12.448 17.000 13.000 17.000 L 15.000 17.000 C 15.552 17.000 16.000 16.552 16.000 16.000 C 16.000 15.448 15.552 15.000 15.000 15.000M 9.010 11.000 L 9.000 11.000 C 8.471 11.001 8.034 11.413 8.003 11.941 C 7.972 12.470 8.358 12.931 8.883 12.993 L 9.010 13.000 C 9.562 13.000 10.010 12.552 10.010 12.000 C 10.010 11.448 9.562 11.000 9.010 11.000M 15.000 11.000 L 13.000 11.000 C 12.448 11.000 12.000 11.448 12.000 12.000 C 12.000 12.552 12.448 13.000 13.000 13.000 L 15.000 13.000 C 15.552 13.000 16.000 12.552 16.000 12.000 C 16.000 11.448 15.552 11.000 15.000 11.000M 14.000 2.000 C 15.105 2.000 16.000 2.895 16.000 4.000 C 16.000 5.105 15.105 6.000 14.000 6.000 L 10.000 6.000 C 8.895 6.000 8.000 5.105 8.000 4.000 C 8.000 2.895 8.895 2.000 10.000 2.000 Z"),
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
        return _clipboardList!!
    }

private var _clipboardList: ImageVector? = null
