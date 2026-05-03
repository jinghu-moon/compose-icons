package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCardStar: ImageVector
    get() {
        if (_playCardStar != null) return _playCardStar!!
        _playCardStar = tablerFilledIcon(
            name = "PlayCardStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 C 18.657 2.000 20.000 3.343 20.000 5.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 5.000 C 4.000 3.343 5.343 2.000 7.000 2.000 ZM 17.010 18.000 L 17.000 18.000 C 16.471 18.001 16.034 18.413 16.003 18.941 C 15.972 19.470 16.358 19.931 16.883 19.993 L 17.010 20.000 C 17.562 20.000 18.010 19.552 18.010 19.000 C 18.010 18.448 17.562 18.000 17.010 18.000M 12.030 8.500 L 11.915 8.505 C 11.531 8.545 11.191 8.778 11.017 9.128 L 10.507 10.155 L 9.369 10.321 C 8.946 10.380 8.589 10.678 8.455 11.089 L 8.422 11.214 C 8.345 11.593 8.466 11.985 8.744 12.253 L 9.564 13.050 L 9.370 14.177 C 9.300 14.609 9.477 15.034 9.824 15.285 L 9.931 15.353 C 10.264 15.541 10.670 15.548 11.009 15.371 L 12.031 14.835 L 13.050 15.370 C 13.427 15.570 13.890 15.538 14.240 15.284 L 14.340 15.204 C 14.621 14.945 14.756 14.559 14.690 14.176 L 14.496 13.050 L 15.319 12.251 C 15.629 11.949 15.739 11.499 15.606 11.090 L 15.564 10.980 C 15.406 10.625 15.076 10.376 14.691 10.321 L 13.553 10.155 L 13.045 9.129 C 12.855 8.743 12.461 8.499 12.031 8.499M 7.010 4.000 L 7.000 4.000 C 6.471 4.001 6.034 4.413 6.003 4.941 C 5.972 5.470 6.358 5.931 6.883 5.993 L 7.010 6.000 C 7.562 6.000 8.010 5.552 8.010 5.000 C 8.010 4.448 7.562 4.000 7.010 4.000"),
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
        return _playCardStar!!
    }

private var _playCardStar: ImageVector? = null
