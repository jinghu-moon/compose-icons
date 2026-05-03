package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.GuitarPick: ImageVector
    get() {
        if (_guitarPick != null) return _guitarPick!!
        _guitarPick = tablerFilledIcon(
            name = "GuitarPick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 10.387 2.000 9.118 2.104 8.175 2.323 L 7.945 2.380 C 4.926 3.088 3.000 4.883 3.000 8.000 C 3.000 11.367 4.939 16.274 7.220 19.125 C 7.540 19.525 7.884 19.911 8.250 20.283 L 8.617 20.643 C 10.506 22.442 13.474 22.447 15.369 20.654 C 15.874 20.178 16.345 19.667 16.779 19.126 C 19.270 16.013 21.000 11.832 21.000 8.000 C 21.000 4.975 19.187 3.194 16.290 2.438 L 16.024 2.372 C 15.088 2.122 13.743 2.000 12.000 2.000 Z"),
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
        return _guitarPick!!
    }

private var _guitarPick: ImageVector? = null
