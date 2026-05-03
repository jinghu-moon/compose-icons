package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Group2Line: ImageVector
    get() {
        if (_group2Line != null) return _group2Line!!
        _group2Line = remixIcon(
            name = "Group2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.550 11.500 C 8.307 11.500 7.300 10.493 7.300 9.250 C 7.300 8.007 8.307 7.000 9.550 7.000 C 10.793 7.000 11.800 8.007 11.800 9.250 C 11.800 10.493 10.793 11.500 9.550 11.500 ZM 10.000 19.748 L 10.000 16.400 C 10.000 15.912 10.144 15.463 10.404 15.062 C 10.109 15.021 9.807 15.000 9.500 15.000 C 7.932 15.000 6.494 15.555 5.371 16.480 C 6.449 18.072 8.086 19.255 10.000 19.748 ZM 4.453 14.660 C 5.864 13.617 7.610 13.000 9.500 13.000 C 10.543 13.000 11.543 13.188 12.467 13.532 C 13.345 13.189 14.392 13.000 15.500 13.000 C 17.160 13.000 18.685 13.424 19.706 14.156 C 19.898 13.470 20.000 12.747 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 12.932 4.160 13.828 4.453 14.660 ZM 18.879 16.086 C 18.486 15.553 17.171 15.000 15.500 15.000 C 13.494 15.000 12.000 15.797 12.000 16.400 L 12.000 20.000 C 14.925 20.000 17.484 18.430 18.879 16.086 ZM 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 15.500 12.500 C 14.395 12.500 13.500 11.605 13.500 10.500 C 13.500 9.395 14.395 8.500 15.500 8.500 C 16.605 8.500 17.500 9.395 17.500 10.500 C 17.500 11.605 16.605 12.500 15.500 12.500 Z"),
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
        return _group2Line!!
    }

private var _group2Line: ImageVector? = null
