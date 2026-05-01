package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandShopee: ImageVector
    get() {
        if (_brandShopee != null) return _brandShopee!!
        _brandShopee = tablerOutlineIcon(
            name = "BrandShopee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 7.0f),
                    PathNode.LineTo(4.867f, 19.143f),
                    PathNode.CurveTo(4.942147f, 20.191366f, 5.815948f, 21.00269f, 6.867f, 21.0f),
                    PathNode.LineTo(17.143f, 21.0f),
                    PathNode.CurveTo(18.194052f, 21.00269f, 19.067854f, 20.191366f, 19.143f, 19.143f),
                    PathNode.LineTo(20.01f, 7.0f),
                    PathNode.LineTo(4.01f, 7.0f),
                    PathNode.LineTo(4.0f, 7.0f)
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
                    PathNode.MoveTo(8.5f, 7.0f),
                    PathNode.CurveTo(8.5f, 5.347f, 10.0f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(14.0f, 3.0f, 15.5f, 5.347f, 15.5f, 7.0f)
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
                    PathNode.MoveTo(9.5f, 17.0f),
                    PathNode.CurveTo(9.913f, 17.462f, 10.5f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(13.5f, 18.0f, 14.5f, 17.103f, 14.5f, 16.0f),
                    PathNode.CurveTo(14.5f, 14.897f, 13.5f, 14.5f, 12.0f, 14.0f),
                    PathNode.CurveTo(10.5f, 13.5f, 10.0f, 12.53f, 10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 10.896f, 11.0f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(13.0f, 10.0f, 13.5f, 10.0f, 14.5f, 11.0f)
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
        return _brandShopee!!
    }

private var _brandShopee: ImageVector? = null
