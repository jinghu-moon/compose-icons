package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PigMoney: ImageVector
    get() {
        if (_pigMoney != null) return _pigMoney!!
        _pigMoney = tablerOutlineIcon(
            name = "PigMoney",
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
                pathData = parseSvgPathData("M 5.173 8.378 C 3.956 7.442 3.641 5.739 4.444 4.430 C 5.247 3.122 6.908 2.631 8.294 3.292 C 9.679 3.953 10.342 5.554 9.829 7.001"),
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
                pathData = parseSvgPathData("M 16.000 4.000 L 16.000 7.803 C 17.238 8.519 18.180 9.652 18.658 11.000 L 19.999 11.000 C 20.551 11.000 20.999 11.448 20.999 12.000 L 20.999 14.000 C 20.999 14.552 20.551 15.000 19.999 15.000 L 18.657 15.000 C 18.321 15.950 17.750 16.800 16.999 17.473 L 16.999 19.500 C 16.999 20.328 16.327 21.000 15.499 21.000 C 14.671 21.000 13.999 20.328 13.999 19.500 L 13.999 18.917 C 13.669 18.972 13.334 19.000 12.999 19.000 L 8.999 19.000 C 8.664 19.000 8.329 18.972 7.999 18.917 L 7.999 19.500 C 7.999 20.328 7.327 21.000 6.499 21.000 C 5.671 21.000 4.999 20.328 4.999 19.500 L 4.999 17.500 L 4.999 17.473 C 3.144 15.815 2.505 13.184 3.393 10.859 C 4.281 8.535 6.511 7.000 8.999 7.000 L 11.499 7.000 L 15.999 4.000"),
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
        return _pigMoney!!
    }

private var _pigMoney: ImageVector? = null
