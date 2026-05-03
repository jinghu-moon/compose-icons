package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ladle: ImageVector
    get() {
        if (_ladle != null) return _ladle!!
        _ladle = tablerOutlineIcon(
            name = "Ladle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 14.000 L 3.000 15.000 C 3.000 18.314 5.686 21.000 9.000 21.000 C 12.314 21.000 15.000 18.314 15.000 15.000 L 15.000 6.000 C 15.000 4.343 16.343 3.000 18.000 3.000 C 19.657 3.000 21.000 4.343 21.000 6.000"),
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
                pathData = parseSvgPathData("M 9.000 16.000 C 8.337 16.000 7.700 15.964 7.104 15.898 L 6.604 15.834 C 4.481 15.526 3.000 14.821 3.000 14.000 C 3.000 13.180 4.482 12.474 6.603 12.166 L 7.103 12.102 C 7.733 12.033 8.366 11.999 9.000 12.000 C 9.663 12.000 10.300 12.036 10.896 12.102 L 11.396 12.166 C 13.519 12.474 15.000 13.179 15.000 14.000 C 15.000 14.820 13.518 15.526 11.397 15.834 L 10.897 15.898 C 10.267 15.967 9.634 16.001 9.000 16.000"),
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
        return _ladle!!
    }

private var _ladle: ImageVector? = null
