package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCard3: ImageVector
    get() {
        if (_playCard3 != null) return _playCard3!!
        _playCard3 = tablerFilledIcon(
            name = "PlayCard3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 2.000 C 18.657 2.000 20.000 3.343 20.000 5.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 5.000 C 4.000 3.343 5.343 2.000 7.000 2.000 ZM 17.010 18.000 L 17.000 18.000 C 16.471 18.001 16.034 18.413 16.003 18.941 C 15.972 19.470 16.358 19.931 16.883 19.993 L 17.010 20.000 C 17.562 20.000 18.010 19.552 18.010 19.000 C 18.010 18.448 17.562 18.000 17.010 18.000M 12.500 8.000 L 10.000 8.000 C 9.448 8.000 9.000 8.448 9.000 9.000 C 9.000 9.552 9.448 10.000 10.000 10.000 L 12.500 10.000 C 12.759 10.000 12.975 10.197 12.999 10.455 C 13.022 10.713 12.845 10.946 12.590 10.992 L 12.500 11.000 L 11.000 11.000 C 9.713 11.000 9.668 12.864 10.867 12.993 L 11.000 13.000 L 12.500 13.000 C 12.776 13.000 13.000 13.224 13.000 13.500 C 13.000 13.776 12.776 14.000 12.500 14.000 L 10.000 14.000 C 9.448 14.000 9.000 14.448 9.000 15.000 C 9.000 15.552 9.448 16.000 10.000 16.000 L 12.500 16.000 C 13.881 16.000 15.000 14.881 15.000 13.500 L 14.995 13.336 C 14.964 12.862 14.798 12.407 14.518 12.024 L 14.499 12.000 L 14.518 11.976 C 15.074 11.216 15.156 10.208 14.730 9.369 C 14.303 8.529 13.442 8.000 12.500 8.000M 7.010 4.000 L 7.000 4.000 C 6.471 4.001 6.034 4.413 6.003 4.941 C 5.972 5.470 6.358 5.931 6.883 5.993 L 7.010 6.000 C 7.562 6.000 8.010 5.552 8.010 5.000 C 8.010 4.448 7.562 4.000 7.010 4.000"),
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
        return _playCard3!!
    }

private var _playCard3: ImageVector? = null
