package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandEmber: ImageVector
    get() {
        if (_brandEmber != null) return _brandEmber!!
        _brandEmber = tablerOutlineIcon(
            name = "BrandEmber",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 12.958f),
                    PathNode.CurveTo(11.466f, 14.605f, 14.112f, 11.762f, 15.17f, 10.664f),
                    PathNode.CurveTo(17.286f, 8.468f, 15.17f, 4.075f, 12.524f, 5.174f),
                    PathNode.CurveTo(9.88f, 6.27f, 6.174f, 12.86f, 9.35f, 17.252f),
                    PathNode.CurveTo(11.466f, 20.18f, 15.35f, 19.43f, 21.0f, 15.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandEmber!!
    }

private var _brandEmber: ImageVector? = null
