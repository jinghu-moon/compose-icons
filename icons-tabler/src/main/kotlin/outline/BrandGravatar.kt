package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGravatar: ImageVector
    get() {
        if (_brandGravatar != null) return _brandGravatar!!
        _brandGravatar = tablerOutlineIcon(
            name = "BrandGravatar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.640 5.632 C 2.602 8.667 2.130 13.425 4.514 16.997 C 6.898 20.568 11.474 21.958 15.441 20.316 C 19.409 18.674 21.664 14.457 20.827 10.246 C 19.990 6.034 16.294 3.000 12.000 3.000 L 12.000 10.714"),
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
        return _brandGravatar!!
    }

private var _brandGravatar: ImageVector? = null
