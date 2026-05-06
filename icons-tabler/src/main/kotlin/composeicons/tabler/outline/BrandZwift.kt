package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandZwift: ImageVector
    get() {
        if (_brandZwift != null) return _brandZwift!!
        _brandZwift = tablerOutlineIcon(
            name = "BrandZwift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.5 4C4.035 4 3 5.101 3 6.5 3 7.899 4.035 9 5.5 9h2.5L3.363 16.19c-.479 .777-.484 1.757-.011 2.538C3.825 19.515 4.702 20 5.652 20h10.848C17.965 20 19 18.899 19 17.5 19 16.101 17.965 15 16.5 15h-2.5L21 4h-15.5"),
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
        return _brandZwift!!
    }

private var _brandZwift: ImageVector? = null
