package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GardenCart: ImageVector
    get() {
        if (_gardenCart != null) return _gardenCart!!
        _gardenCart = tablerOutlineIcon(
            name = "GardenCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 17.500 C 15.000 18.881 16.119 20.000 17.500 20.000 C 18.881 20.000 20.000 18.881 20.000 17.500 C 20.000 16.119 18.881 15.000 17.500 15.000 C 16.119 15.000 15.000 16.119 15.000 17.500"),
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
                pathData = parseSvgPathData("M 6.000 8.000 L 6.000 19.000 C 6.000 19.432 6.278 19.815 6.689 19.949 C 7.100 20.084 7.550 19.939 7.806 19.591 L 11.500 14.500 L 11.500 14.555"),
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
                pathData = parseSvgPathData("M 6.000 8.000 L 21.000 8.000 L 17.500 15.000 L 10.400 14.253 C 8.924 14.098 7.655 13.138 7.104 11.760 L 4.251 4.630 C 4.100 4.250 3.732 4.000 3.323 4.000 L 2.000 4.000"),
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
        return _gardenCart!!
    }

private var _gardenCart: ImageVector? = null
