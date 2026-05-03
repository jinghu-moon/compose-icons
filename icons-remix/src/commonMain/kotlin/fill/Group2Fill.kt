package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Group2Fill: ImageVector
    get() {
        if (_group2Fill != null) return _group2Fill!!
        _group2Fill = remixIcon(
            name = "Group2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 19.748 L 10.000 16.400 C 10.000 15.117 10.995 14.108 12.467 13.532 C 11.543 13.188 10.543 13.000 9.500 13.000 C 7.610 13.000 5.864 13.617 4.453 14.660 C 5.332 17.154 7.413 19.082 10.000 19.748 ZM 18.879 16.086 C 18.486 15.553 17.171 15.000 15.500 15.000 C 13.494 15.000 12.000 15.797 12.000 16.400 L 12.000 20.000 C 14.925 20.000 17.484 18.430 18.879 16.086 ZM 9.550 11.500 C 10.793 11.500 11.800 10.493 11.800 9.250 C 11.800 8.007 10.793 7.000 9.550 7.000 C 8.307 7.000 7.300 8.007 7.300 9.250 C 7.300 10.493 8.307 11.500 9.550 11.500 ZM 15.500 12.500 C 16.605 12.500 17.500 11.605 17.500 10.500 C 17.500 9.395 16.605 8.500 15.500 8.500 C 14.395 8.500 13.500 9.395 13.500 10.500 C 13.500 11.605 14.395 12.500 15.500 12.500 ZM 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 Z"),
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
        return _group2Fill!!
    }

private var _group2Fill: ImageVector? = null
