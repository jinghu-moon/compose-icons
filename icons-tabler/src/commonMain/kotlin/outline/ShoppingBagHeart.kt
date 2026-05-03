package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShoppingBagHeart: ImageVector
    get() {
        if (_shoppingBagHeart != null) return _shoppingBagHeart!!
        _shoppingBagHeart = tablerOutlineIcon(
            name = "ShoppingBagHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.5f, 21.0f),
                    PathNode.LineTo(8.574f, 21.0f),
                    PathNode.CurveTo(7.093275f, 20.99993f, 5.83407f, 19.91952f, 5.609f, 18.456f),
                    PathNode.LineTo(4.354f, 10.304f),
                    PathNode.CurveTo(4.265299f, 9.727221f, 4.432933f, 9.140471f, 4.812946f, 8.697603f),
                    PathNode.CurveTo(5.192958f, 8.254736f, 5.747442f, 7.999931f, 6.331f, 8.0f),
                    PathNode.LineTo(17.67f, 8.0f),
                    PathNode.CurveTo(18.25356f, 7.999931f, 18.808043f, 8.254736f, 19.188057f, 8.697603f),
                    PathNode.CurveTo(19.568068f, 9.140471f, 19.7357f, 9.727221f, 19.647f, 10.304f),
                    PathNode.CurveTo(19.59f, 10.672f, 19.547f, 10.948f, 19.52f, 11.132f)
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
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 22.0f),
                    PathNode.LineTo(21.35f, 18.716f),
                    PathNode.CurveTo(21.765032f, 18.31326f, 21.999672f, 17.759872f, 22.000614f, 17.181555f),
                    PathNode.CurveTo(22.001554f, 16.603237f, 21.768719f, 16.04909f, 21.355f, 15.645f),
                    PathNode.CurveTo(20.486048f, 14.795191f, 19.098206f, 14.792529f, 18.226f, 15.639f),
                    PathNode.LineTo(18.002f, 15.859f),
                    PathNode.LineTo(17.779f, 15.639f),
                    PathNode.CurveTo(16.910172f, 14.78984f, 15.52308f, 14.787179f, 14.651f, 15.633f),
                    PathNode.CurveTo(14.235836f, 16.035604f, 14.001016f, 16.588917f, 13.999886f, 17.167234f),
                    PathNode.CurveTo(13.998755f, 17.745552f, 14.231412f, 18.299776f, 14.645f, 18.704f),
                    PathNode.LineTo(18.0f, 22.0f)
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
        return _shoppingBagHeart!!
    }

private var _shoppingBagHeart: ImageVector? = null
