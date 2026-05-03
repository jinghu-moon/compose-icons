package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DogBowl: ImageVector
    get() {
        if (_dogBowl != null) return _dogBowl!!
        _dogBowl = tablerOutlineIcon(
            name = "DogBowl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 15.000 L 15.586 9.415 C 14.946 8.775 14.815 7.785 15.268 7.001 C 15.720 6.217 16.643 5.835 17.517 6.069 C 18.392 6.303 19.000 7.095 19.000 8.000 C 19.905 7.999 20.698 8.607 20.933 9.482 C 21.168 10.356 20.786 11.279 20.002 11.732 C 19.218 12.185 18.227 12.054 17.587 11.414 L 14.000 15.000"),
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
        pathData = parseSvgPathData("M 12.000 13.000 L 8.414 9.415 C 9.054 8.775 9.185 7.785 8.732 7.001 C 8.280 6.217 7.357 5.835 6.483 6.069 C 5.608 6.303 5.000 7.095 5.000 8.000 C 4.095 7.999 3.302 8.607 3.067 9.482 C 2.832 10.356 3.214 11.279 3.998 11.732 C 4.782 12.185 5.773 12.054 6.413 11.414 L 10.000 15.000"),
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
        pathData = parseSvgPathData("M 3.000 20.000 L 21.000 20.000 C 20.825 18.329 20.954 16.655 19.000 15.000 L 5.000 15.000 C 3.667 16.000 3.000 17.667 3.000 20.000"),
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
        return _dogBowl!!
    }

private var _dogBowl: ImageVector? = null
