package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoneybagHeart: ImageVector
    get() {
        if (_moneybagHeart != null) return _moneybagHeart!!
        _moneybagHeart = tablerOutlineIcon(
            name = "MoneybagHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.500 3.000 L 14.500 3.000 C 15.328 3.000 16.000 3.672 16.000 4.500 C 16.000 6.433 14.433 8.000 12.500 8.000 L 11.500 8.000 C 9.567 8.000 8.000 6.433 8.000 4.500 C 8.000 3.672 8.672 3.000 9.500 3.000"),
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
        pathData = parseSvgPathData("M 11.500 21.000 L 8.000 21.000 C 5.791 21.000 4.000 19.209 4.000 17.000 L 4.000 16.000 C 3.999 12.564 6.194 9.511 9.451 8.416 C 12.708 7.321 16.301 8.428 18.376 11.167"),
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
        pathData = parseSvgPathData("M 18.000 22.000 L 21.350 18.716 C 21.765 18.313 22.000 17.760 22.001 17.182 C 22.002 16.603 21.769 16.049 21.355 15.645 C 20.486 14.794 19.098 14.791 18.226 15.639 L 18.002 15.859 L 17.779 15.639 C 16.911 14.789 15.523 14.786 14.651 15.633 C 14.236 16.036 14.001 16.589 14.000 17.167 C 13.999 17.746 14.231 18.300 14.645 18.704 L 18.000 22.000"),
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
        return _moneybagHeart!!
    }

private var _moneybagHeart: ImageVector? = null
