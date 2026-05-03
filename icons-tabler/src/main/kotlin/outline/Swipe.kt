package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Swipe: ImageVector
    get() {
        if (_swipe != null) return _swipe!!
        _swipe = tablerOutlineIcon(
            name = "Swipe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 16.572 L 15.000 18.992 C 14.999 20.101 14.100 20.999 12.991 21.000 L 5.010 21.000 C 3.900 21.000 3.001 20.101 3.000 18.991 L 3.000 11.010 C 3.000 9.900 3.899 9.001 5.009 9.000 L 7.963 9.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 9.167 4.511 C 9.459 3.425 10.576 2.780 11.663 3.070 L 19.489 5.167 C 20.575 5.459 21.220 6.576 20.930 7.663 L 18.833 15.489 C 18.541 16.575 17.424 17.220 16.337 16.930 L 8.510 14.833 C 7.424 14.541 6.779 13.424 7.069 12.337 L 9.167 4.510 L 9.167 4.511"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _swipe!!
    }

private var _swipe: ImageVector? = null
