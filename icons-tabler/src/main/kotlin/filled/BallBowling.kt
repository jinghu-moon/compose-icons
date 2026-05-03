package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BallBowling: ImageVector
    get() {
        if (_ballBowling != null) return _ballBowling!!
        _ballBowling = tablerFilledIcon(
            name = "BallBowling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 20.120 5.114 22.050 8.423 22.057 12.011 C 22.065 15.600 20.150 18.917 17.038 20.705 C 13.926 22.492 10.096 22.475 7.000 20.660 C 2.258 17.880 0.649 11.794 3.397 7.033 C 6.146 2.273 12.221 0.623 17.000 3.340M 14.000 11.000 C 13.448 11.000 13.000 11.448 13.000 12.000 L 13.000 12.010 C 13.000 12.562 13.448 13.010 14.000 13.010 C 14.552 13.010 15.000 12.562 15.000 12.010 L 15.000 12.000 C 15.000 11.448 14.552 11.000 14.000 11.000M 11.000 8.000 C 10.448 8.000 10.000 8.448 10.000 9.000 L 10.000 9.010 C 10.000 9.562 10.448 10.010 11.000 10.010 C 11.552 10.010 12.000 9.562 12.000 9.010 L 12.000 9.000 C 12.000 8.448 11.552 8.000 11.000 8.000M 15.000 7.000 C 14.448 7.000 14.000 7.448 14.000 8.000 L 14.000 8.010 C 14.000 8.562 14.448 9.010 15.000 9.010 C 15.552 9.010 16.000 8.562 16.000 8.010 L 16.000 8.000 C 16.000 7.448 15.552 7.000 15.000 7.000"),
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
        return _ballBowling!!
    }

private var _ballBowling: ImageVector? = null
