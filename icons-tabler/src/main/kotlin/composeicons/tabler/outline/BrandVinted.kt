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
                pathData = parseSvgPathData("M11.028 6c0 7.695-.292 11.728 0 12C13.074 13 15.274 5.358 16.28 3.901c.343-.497 .768-.93 1.257-1.277 .603-.39 1.292-.76 1.463-.575-.07 2.319-4.023 15.822-4.209 16.314-.642 1.556-1.894 2.78-3.465 3.386C8.113 22.529 7.897 21.303 7.49 20.615 6.54 18.512 5.808 6.355 6.045 5 6.095 4.477 6.188 3.149 8.536 3c2.359-.354 2.547 1.404 2.492 3"),
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
