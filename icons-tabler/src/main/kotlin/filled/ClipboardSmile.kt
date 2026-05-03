package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClipboardSmile: ImageVector
    get() {
        if (_clipboardSmile != null) return _clipboardSmile!!
        _clipboardSmile = tablerFilledIcon(
            name = "ClipboardSmile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.997 4.170 C 19.197 4.593 20.000 5.727 20.000 7.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 7.000 C 4.000 5.727 4.803 4.593 6.003 4.170 C 6.094 6.311 7.857 8.000 10.000 8.000 L 14.000 8.000 C 16.053 8.000 17.773 6.446 17.980 4.403 ZM 14.821 15.429 C 14.670 15.211 14.438 15.063 14.177 15.016 C 13.916 14.969 13.647 15.028 13.429 15.179 C 12.570 15.777 11.430 15.777 10.571 15.179 C 10.118 14.864 9.494 14.976 9.179 15.429 C 8.864 15.882 8.976 16.506 9.429 16.821 C 10.974 17.897 13.026 17.897 14.571 16.821 C 14.789 16.670 14.937 16.438 14.984 16.177 C 15.031 15.916 14.972 15.647 14.821 15.429M 10.010 12.000 L 10.000 12.000 C 9.471 12.001 9.034 12.413 9.003 12.941 C 8.972 13.470 9.358 13.931 9.883 13.993 L 10.010 14.000 C 10.562 14.000 11.010 13.552 11.010 13.000 C 11.010 12.448 10.562 12.000 10.010 12.000M 14.010 12.000 L 14.000 12.000 C 13.471 12.001 13.034 12.413 13.003 12.941 C 12.972 13.470 13.358 13.931 13.883 13.993 L 14.010 14.000 C 14.562 14.000 15.010 13.552 15.010 13.000 C 15.010 12.448 14.562 12.000 14.010 12.000M 14.000 2.000 C 15.105 2.000 16.000 2.895 16.000 4.000 C 16.000 5.105 15.105 6.000 14.000 6.000 L 10.000 6.000 C 8.895 6.000 8.000 5.105 8.000 4.000 C 8.000 2.895 8.895 2.000 10.000 2.000 Z"),
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
        return _clipboardSmile!!
    }

private var _clipboardSmile: ImageVector? = null
