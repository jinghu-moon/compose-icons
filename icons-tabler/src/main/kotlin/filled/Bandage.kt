package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bandage: ImageVector
    get() {
        if (_bandage != null) return _bandage!!
        _bandage = tablerFilledIcon(
            name = "Bandage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.207 3.793 C 22.460 6.046 22.539 9.673 20.386 12.021 L 20.207 12.207 L 12.207 20.207 C 9.919 22.493 6.223 22.532 3.887 20.295 C 1.551 18.058 1.430 14.364 3.614 11.979 L 3.793 11.793 L 11.793 3.793 C 14.117 1.470 17.883 1.470 20.207 3.793 ZM 12.000 13.000 C 11.448 13.000 11.000 13.448 11.000 14.000 L 11.007 14.127 C 11.069 14.652 11.530 15.038 12.059 15.007 C 12.587 14.976 12.999 14.539 13.000 14.010 L 12.993 13.883 C 12.934 13.380 12.507 13.000 12.000 13.000 ZM 14.000 11.000 C 13.448 11.000 13.000 11.448 13.000 12.000 L 13.007 12.127 C 13.069 12.652 13.530 13.038 14.059 13.007 C 14.587 12.976 14.999 12.539 15.000 12.010 L 14.993 11.883 C 14.934 11.380 14.507 11.000 14.000 11.000 ZM 10.000 11.000 C 9.448 11.000 9.000 11.448 9.000 12.000 L 9.007 12.127 C 9.069 12.652 9.530 13.038 10.059 13.007 C 10.587 12.976 10.999 12.539 11.000 12.010 L 10.993 11.883 C 10.934 11.380 10.507 11.000 10.000 11.000 ZM 12.000 9.000 C 11.448 9.000 11.000 9.448 11.000 10.000 L 11.007 10.127 C 11.069 10.652 11.530 11.038 12.059 11.007 C 12.587 10.976 12.999 10.539 13.000 10.010 L 12.993 9.883 C 12.934 9.380 12.507 9.000 12.000 9.000 Z"),
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
        return _bandage!!
    }

private var _bandage: ImageVector? = null
