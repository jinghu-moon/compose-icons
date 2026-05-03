package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CakeOff: ImageVector
    get() {
        if (_cakeOff != null) return _cakeOff!!
        _cakeOff = tablerOutlineIcon(
            name = "CakeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 17.000 L 21.000 12.000 C 21.000 10.343 19.657 9.000 18.000 9.000 L 13.000 9.000M 9.000 9.000 L 6.000 9.000 C 4.343 9.000 3.000 10.343 3.000 12.000 L 3.000 20.000 L 20.000 20.000"),
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
        pathData = parseSvgPathData("M 3.000 14.803 C 3.312 14.938 3.654 15.007 4.000 15.000 C 4.791 15.017 5.539 14.643 6.000 14.000 C 6.461 13.357 7.209 12.983 8.000 13.000 C 8.791 12.983 9.539 13.357 10.000 14.000 C 10.461 14.643 11.209 15.017 12.000 15.000 C 12.791 15.017 13.539 14.643 14.000 14.000M 18.000 14.000 C 18.461 14.643 19.209 15.017 20.000 15.000 C 20.350 15.007 20.692 14.938 21.000 14.803"),
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
        pathData = parseSvgPathData("M 10.172 6.188 C 10.242 6.030 10.335 5.878 10.450 5.737 L 12.000 4.000 L 13.465 5.638 C 13.905 6.111 14.090 6.767 13.961 7.400 C 13.832 8.033 13.405 8.565 12.815 8.828"),
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
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _cakeOff!!
    }

private var _cakeOff: ImageVector? = null
