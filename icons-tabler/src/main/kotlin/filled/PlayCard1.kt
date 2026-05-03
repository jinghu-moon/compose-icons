package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCard1: ImageVector
    get() {
        if (_playCard1 != null) return _playCard1!!
        _playCard1 = tablerFilledIcon(
            name = "PlayCard1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 2.000 C 18.657 2.000 20.000 3.343 20.000 5.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 5.000 C 4.000 3.343 5.343 2.000 7.000 2.000 ZM 17.010 18.000 L 17.000 18.000 C 16.471 18.001 16.034 18.413 16.003 18.941 C 15.972 19.470 16.358 19.931 16.883 19.993 L 17.010 20.000 C 17.562 20.000 18.010 19.552 18.010 19.000 C 18.010 18.448 17.562 18.000 17.010 18.000M 12.000 8.000 C 11.448 8.000 11.000 8.448 11.000 9.000 L 11.000 15.000 C 11.000 15.552 11.448 16.000 12.000 16.000 C 12.552 16.000 13.000 15.552 13.000 15.000 L 13.000 9.000 C 13.000 8.448 12.552 8.000 12.000 8.000M 7.010 4.000 L 7.000 4.000 C 6.471 4.001 6.034 4.413 6.003 4.941 C 5.972 5.470 6.358 5.931 6.883 5.993 L 7.010 6.000 C 7.562 6.000 8.010 5.552 8.010 5.000 C 8.010 4.448 7.562 4.000 7.010 4.000"),
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
        return _playCard1!!
    }

private var _playCard1: ImageVector? = null
