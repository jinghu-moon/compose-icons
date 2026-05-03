package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCardK: ImageVector
    get() {
        if (_playCardK != null) return _playCardK!!
        _playCardK = tablerFilledIcon(
            name = "PlayCardK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 2.000 C 18.657 2.000 20.000 3.343 20.000 5.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 5.000 C 4.000 3.343 5.343 2.000 7.000 2.000 ZM 17.010 18.000 L 17.000 18.000 C 16.471 18.001 16.034 18.413 16.003 18.941 C 15.972 19.470 16.358 19.931 16.883 19.993 L 17.010 20.000 C 17.562 20.000 18.010 19.552 18.010 19.000 C 18.010 18.448 17.562 18.000 17.010 18.000M 10.000 8.000 C 9.448 8.000 9.000 8.448 9.000 9.000 L 9.000 15.000 C 9.000 15.552 9.448 16.000 10.000 16.000 C 10.552 16.000 11.000 15.552 11.000 15.000 L 11.000 13.415 L 13.293 15.707 C 13.649 16.063 14.215 16.099 14.613 15.790 L 14.707 15.707 L 14.790 15.613 C 15.099 15.215 15.063 14.649 14.707 14.293 L 12.415 12.000 L 14.707 9.707 C 14.967 9.456 15.071 9.084 14.980 8.734 C 14.888 8.385 14.615 8.112 14.266 8.020 C 13.916 7.929 13.544 8.033 13.293 8.293 L 11.000 10.584 L 11.000 9.000 C 11.000 8.493 10.620 8.066 10.117 8.007 ZM 7.010 4.000 L 7.000 4.000 C 6.471 4.001 6.034 4.413 6.003 4.941 C 5.972 5.470 6.358 5.931 6.883 5.993 L 7.010 6.000 C 7.562 6.000 8.010 5.552 8.010 5.000 C 8.010 4.448 7.562 4.000 7.010 4.000"),
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
        return _playCardK!!
    }

private var _playCardK: ImageVector? = null
