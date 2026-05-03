package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandEmber: ImageVector
    get() {
        if (_brandEmber != null) return _brandEmber!!
        _brandEmber = tablerOutlineIcon(
            name = "BrandEmber",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 12.958 C 11.466 14.605 14.112 11.762 15.170 10.664 C 17.286 8.468 15.170 4.075 12.524 5.174 C 9.880 6.270 6.174 12.860 9.350 17.252 C 11.466 20.180 15.350 19.430 21.000 15.000"),
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
        return _brandEmber!!
    }

private var _brandEmber: ImageVector? = null
