package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Puzzle: ImageVector
    get() {
        if (_puzzle != null) return _puzzle!!
        _puzzle = tablerFilledIcon(
            name = "Puzzle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 2.000 C 11.589 2.000 12.902 3.238 12.995 4.824 L 13.000 5.000 L 13.000 6.000 L 16.000 6.000 C 17.047 6.000 17.917 6.806 17.995 7.850 L 18.000 8.000 L 18.000 11.000 L 19.000 11.000 C 20.624 10.998 21.954 12.289 22.002 13.912 C 22.049 15.535 20.797 16.901 19.176 16.995 L 19.000 17.000 L 18.000 17.000 L 18.000 20.000 C 18.000 21.047 17.194 21.917 16.150 21.995 L 16.000 22.000 L 13.000 22.000 C 11.953 22.000 11.083 21.194 11.005 20.150 L 11.000 20.000 L 11.000 19.000 C 10.999 18.471 10.587 18.034 10.059 18.003 C 9.530 17.972 9.069 18.358 9.007 18.883 L 9.000 19.000 L 9.000 20.000 C 9.000 21.047 8.194 21.917 7.150 21.995 L 7.000 22.000 L 4.000 22.000 C 2.953 22.000 2.083 21.194 2.005 20.150 L 2.000 20.000 L 2.000 17.000 C 2.000 15.953 2.806 15.083 3.850 15.005 L 4.000 15.000 L 5.000 15.000 C 5.529 14.999 5.966 14.587 5.997 14.059 C 6.028 13.530 5.642 13.069 5.117 13.007 L 5.000 13.000 L 4.000 13.000 C 2.953 13.000 2.083 12.194 2.005 11.150 L 2.000 11.000 L 2.000 8.000 C 2.000 6.953 2.806 6.083 3.850 6.005 L 4.000 6.000 L 7.000 6.000 L 7.000 5.000 C 7.000 3.343 8.343 2.000 10.000 2.000 Z"),
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
        return _puzzle!!
    }

private var _puzzle: ImageVector? = null
