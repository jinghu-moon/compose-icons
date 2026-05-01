package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShoppingBagMinus: ImageVector
    get() {
        if (_shoppingBagMinus != null) return _shoppingBagMinus!!
        _shoppingBagMinus = tablerOutlineIcon(
            name = "ShoppingBagMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.5f, 21.0f),
                    PathNode.LineTo(8.574f, 21.0f),
                    PathNode.CurveTo(7.093275f, 20.99993f, 5.83407f, 19.91952f, 5.609f, 18.456f),
                    PathNode.LineTo(4.354f, 10.304f),
                    PathNode.CurveTo(4.265299f, 9.727221f, 4.432933f, 9.140471f, 4.812946f, 8.697603f),
                    PathNode.CurveTo(5.192958f, 8.254736f, 5.747442f, 7.999931f, 6.331f, 8.0f),
                    PathNode.LineTo(17.67f, 8.0f),
                    PathNode.CurveTo(18.25356f, 7.999931f, 18.808043f, 8.254736f, 19.188057f, 8.697603f),
                    PathNode.CurveTo(19.568068f, 9.140471f, 19.7357f, 9.727221f, 19.647f, 10.304f),
                    PathNode.LineTo(18.917f, 15.048f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 11.0f),
                    PathNode.LineTo(9.0f, 6.0f),
                    PathNode.CurveTo(9.0f, 4.343146f, 10.343145f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(13.656855f, 3.0f, 15.0f, 4.343146f, 15.0f, 6.0f),
                    PathNode.LineTo(15.0f, 11.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 19.0f),
                    PathNode.LineTo(22.0f, 19.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shoppingBagMinus!!
    }

private var _shoppingBagMinus: ImageVector? = null
