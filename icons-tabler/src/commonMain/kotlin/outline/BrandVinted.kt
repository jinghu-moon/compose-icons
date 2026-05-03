package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVinted: ImageVector
    get() {
        if (_brandVinted != null) return _brandVinted!!
        _brandVinted = tablerOutlineIcon(
            name = "BrandVinted",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.028f, 6.0f),
                    PathNode.CurveTo(11.028f, 13.695f, 10.736f, 17.728f, 11.028f, 18.0f),
                    PathNode.CurveTo(13.074f, 13.0f, 15.274f, 5.358f, 16.28f, 3.901f),
                    PathNode.CurveTo(16.623f, 3.404f, 17.048f, 2.971f, 17.537f, 2.624f),
                    PathNode.CurveTo(18.14f, 2.234f, 18.829f, 1.864f, 19.0f, 2.049f),
                    PathNode.CurveTo(18.93f, 4.368f, 14.977f, 17.871f, 14.791f, 18.363f),
                    PathNode.CurveTo(14.149426f, 19.919226f, 12.896606f, 21.143482f, 11.326f, 21.749f),
                    PathNode.CurveTo(8.113f, 22.529f, 7.897f, 21.303f, 7.49f, 20.615f),
                    PathNode.CurveTo(6.54f, 18.512f, 5.808f, 6.355f, 6.045f, 5.0f),
                    PathNode.CurveTo(6.095f, 4.477f, 6.188f, 3.149f, 8.536f, 3.0f),
                    PathNode.CurveTo(10.895f, 2.646f, 11.083f, 4.404f, 11.028f, 6.0f)
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
        return _brandVinted!!
    }

private var _brandVinted: ImageVector? = null
