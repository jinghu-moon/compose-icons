package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationHeart: ImageVector
    get() {
        if (_navigationHeart != null) return _navigationHeart!!
        _navigationHeart = tablerOutlineIcon(
            name = "NavigationHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.721 11.067 L 12.000 3.000 L 4.030 20.275 C 3.960 20.475 4.013 20.699 4.165 20.847 C 4.315 20.995 4.539 21.040 4.735 20.963 L 10.349 19.060"),
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
        pathData = parseSvgPathData("M 18.000 22.000 L 21.350 18.716 C 21.765 18.313 22.000 17.760 22.001 17.182 C 22.002 16.603 21.769 16.049 21.355 15.645 C 20.486 14.795 19.098 14.793 18.226 15.639 L 18.002 15.859 L 17.779 15.639 C 16.910 14.790 15.523 14.787 14.651 15.633 C 14.236 16.036 14.001 16.589 14.000 17.167 C 13.999 17.746 14.231 18.300 14.645 18.704 L 18.000 22.000"),
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
        return _navigationHeart!!
    }

private var _navigationHeart: ImageVector? = null
