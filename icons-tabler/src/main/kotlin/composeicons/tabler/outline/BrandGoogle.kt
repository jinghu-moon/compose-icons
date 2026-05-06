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
                pathData = parseSvgPathData("M20.945 11c.478 4.272-2.132 8.286-6.231 9.582C10.615 21.877 6.172 20.094 4.107 16.323 2.042 12.552 2.932 7.848 6.232 5.093 9.531 2.337 14.319 2.299 17.661 5.003L15.006 7.395C13.056 6.123 10.517 6.216 8.665 7.628 6.814 9.04 6.053 11.465 6.764 13.682c.711 2.217 2.741 3.746 5.068 3.817 2.327 .072 4.447-1.33 5.293-3.499h-4.125v-3h7.945"),
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
