package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhoneSpark: ImageVector
    get() {
        if (_phoneSpark != null) return _phoneSpark!!
        _phoneSpark = tablerOutlineIcon(
            name = "PhoneSpark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.584 19.225 C 6.598 16.630 3.340 11.610 3.000 6.000 C 3.000 4.895 3.895 4.000 5.000 4.000 L 9.000 4.000 L 11.000 9.000 L 8.500 10.500 C 9.571 12.672 11.328 14.429 13.500 15.500 L 15.000 13.000 L 15.650 13.260"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 19.000 22.500 C 19.419 20.770 20.770 19.419 22.500 19.000 C 20.770 18.581 19.419 17.230 19.000 15.500 C 18.581 17.230 17.230 18.581 15.500 19.000 C 17.230 19.419 18.581 20.770 19.000 22.500"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _phoneSpark!!
    }

private var _phoneSpark: ImageVector? = null
