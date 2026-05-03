package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVinted: ImageVector
    get() {
        if (_brandVinted != null) return _brandVinted!!
        _brandVinted = tablerOutlineIcon(
            name = "BrandVinted",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.028 6.000 C 11.028 13.695 10.736 17.728 11.028 18.000 C 13.074 13.000 15.274 5.358 16.280 3.901 C 16.623 3.404 17.048 2.971 17.537 2.624 C 18.140 2.234 18.829 1.864 19.000 2.049 C 18.930 4.368 14.977 17.871 14.791 18.363 C 14.149 19.919 12.897 21.143 11.326 21.749 C 8.113 22.529 7.897 21.303 7.490 20.615 C 6.540 18.512 5.808 6.355 6.045 5.000 C 6.095 4.477 6.188 3.149 8.536 3.000 C 10.895 2.646 11.083 4.404 11.028 6.000"),
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
        return _brandVinted!!
    }

private var _brandVinted: ImageVector? = null
