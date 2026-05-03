package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBluesky: ImageVector
    get() {
        if (_brandBluesky != null) return _brandBluesky!!
        _brandBluesky = tablerOutlineIcon(
            name = "BrandBluesky",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.335 5.144 C 4.681 3.945 2.000 3.017 2.000 5.970 C 2.000 6.560 2.350 10.923 2.556 11.631 C 3.269 14.094 5.686 14.381 8.000 14.000 C 3.955 14.665 3.111 17.208 5.333 19.410 C 6.363 20.428 7.246 21.000 8.000 21.000 C 10.000 21.000 11.134 18.231 11.500 17.500 C 11.833 16.833 12.000 16.333 12.000 16.000 C 12.000 16.333 12.167 16.833 12.500 17.500 C 12.866 18.231 14.000 21.000 16.000 21.000 C 16.754 21.000 17.637 20.429 18.667 19.410 C 20.889 17.207 20.045 14.664 16.000 14.000 C 18.314 14.380 20.730 14.094 21.444 11.631 C 21.650 10.923 22.000 6.559 22.000 5.970 C 22.000 3.017 19.320 3.945 17.665 5.144 C 15.372 6.806 12.905 10.192 12.000 12.000 C 11.095 10.192 8.628 6.806 6.335 5.144"),
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
        return _brandBluesky!!
    }

private var _brandBluesky: ImageVector? = null
