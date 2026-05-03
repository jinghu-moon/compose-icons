package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pig: ImageVector
    get() {
        if (_pig != null) return _pig!!
        _pig = tablerOutlineIcon(
            name = "Pig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 11.000 L 15.000 11.010"),
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
                pathData = parseSvgPathData("M 16.000 3.000 L 16.000 6.803 C 17.238 7.519 18.180 8.652 18.658 10.000 L 19.999 10.000 C 20.551 10.000 20.999 10.448 20.999 11.000 L 20.999 13.000 C 20.999 13.552 20.551 14.000 19.999 14.000 L 18.657 14.000 C 18.321 14.950 17.750 15.801 16.999 16.473 L 16.999 18.500 C 16.999 19.328 16.327 20.000 15.499 20.000 C 14.671 20.000 13.999 19.328 13.999 18.500 L 13.999 17.917 C 13.669 17.972 13.334 18.000 12.999 18.000 L 8.999 18.000 C 8.664 18.000 8.329 17.972 7.999 17.917 L 7.999 18.500 C 7.999 19.328 7.327 20.000 6.499 20.000 C 5.671 20.000 4.999 19.328 4.999 18.500 L 4.999 16.500 L 4.999 16.473 C 3.144 14.815 2.505 12.184 3.393 9.859 C 4.281 7.535 6.511 6.000 8.999 6.000 L 11.499 6.000 L 15.999 3.000"),
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
        return _pig!!
    }

private var _pig: ImageVector? = null
