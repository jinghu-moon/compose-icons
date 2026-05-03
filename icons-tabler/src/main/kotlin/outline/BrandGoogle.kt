package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogle: ImageVector
    get() {
        if (_brandGoogle != null) return _brandGoogle!!
        _brandGoogle = tablerOutlineIcon(
            name = "BrandGoogle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.945 11.000 C 21.423 15.272 18.812 19.286 14.714 20.582 C 10.615 21.877 6.172 20.094 4.107 16.323 C 2.042 12.552 2.932 7.848 6.232 5.093 C 9.531 2.337 14.319 2.299 17.661 5.003 L 15.006 7.395 C 13.056 6.123 10.517 6.216 8.665 7.628 C 6.814 9.040 6.053 11.465 6.764 13.682 C 7.475 15.898 9.505 17.427 11.832 17.499 C 14.159 17.570 16.279 16.169 17.125 14.000 L 13.000 14.000 L 13.000 11.000 L 20.945 11.000"),
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
        return _brandGoogle!!
    }

private var _brandGoogle: ImageVector? = null
