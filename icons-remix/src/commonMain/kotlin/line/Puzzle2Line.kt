package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Puzzle2Line: ImageVector
    get() {
        if (_puzzle2Line != null) return _puzzle2Line!!
        _puzzle2Line = remixIcon(
            name = "Puzzle2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 5.000 C 7.000 2.791 8.791 1.000 11.000 1.000 C 13.209 1.000 15.000 2.791 15.000 5.000 L 20.000 5.000 C 20.552 5.000 21.000 5.448 21.000 6.000 L 21.000 10.171 C 21.000 10.495 20.842 10.800 20.577 10.987 C 20.312 11.175 19.973 11.222 19.667 11.113 C 19.459 11.040 19.236 11.000 19.000 11.000 C 17.895 11.000 17.000 11.895 17.000 13.000 C 17.000 14.105 17.895 15.000 19.000 15.000 C 19.236 15.000 19.459 14.960 19.667 14.887 C 19.973 14.778 20.312 14.825 20.577 15.013 C 20.842 15.200 21.000 15.505 21.000 15.829 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 6.000 C 3.000 5.448 3.448 5.000 4.000 5.000 L 7.000 5.000 ZM 11.000 3.000 C 9.895 3.000 9.000 3.895 9.000 5.000 C 9.000 5.236 9.040 5.460 9.114 5.667 C 9.222 5.973 9.175 6.312 8.987 6.577 C 8.800 6.842 8.495 7.000 8.171 7.000 L 5.000 7.000 L 5.000 19.000 L 19.000 19.000 L 19.000 17.000 C 16.791 17.000 15.000 15.209 15.000 13.000 C 15.000 10.791 16.791 9.000 19.000 9.000 L 19.000 7.000 L 13.829 7.000 C 13.505 7.000 13.200 6.842 13.013 6.577 C 12.825 6.312 12.778 5.973 12.887 5.667 C 12.960 5.460 13.000 5.236 13.000 5.000 C 13.000 3.895 12.105 3.000 11.000 3.000 Z"),
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
        return _puzzle2Line!!
    }

private var _puzzle2Line: ImageVector? = null
