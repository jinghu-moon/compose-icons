package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAstro: ImageVector
    get() {
        if (_brandAstro != null) return _brandAstro!!
        _brandAstro = tablerOutlineIcon(
            name = "BrandAstro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.972f, 3.483f),
                    PathNode.CurveTo(15.135f, 3.679f, 15.219f, 3.943f, 15.385f, 4.47f),
                    PathNode.LineTo(19.025f, 16.0f),
                    PathNode.CurveTo(17.652613f, 15.313873f, 16.185953f, 14.835322f, 14.673f, 14.58f),
                    PathNode.LineTo(12.303f, 6.857f),
                    PathNode.CurveTo(12.260944f, 6.729338f, 12.14141f, 6.643322f, 12.007f, 6.644f),
                    PathNode.CurveTo(11.872691f, 6.643897f, 11.753592f, 6.730294f, 11.712f, 6.858f),
                    PathNode.LineTo(9.37f, 14.576f),
                    PathNode.CurveTo(7.850768f, 14.830226f, 6.377917f, 15.309493f, 5.0f, 15.998f),
                    PathNode.LineTo(8.657f, 4.468f),
                    PathNode.CurveTo(8.825f, 3.941f, 8.908f, 3.678f, 9.072f, 3.482f),
                    PathNode.CurveTo(9.216f, 3.31f, 9.403f, 3.176f, 9.616f, 3.094f),
                    PathNode.CurveTo(9.858f, 3.0f, 10.143f, 3.0f, 10.715f, 3.0f),
                    PathNode.LineTo(13.327f, 3.0f),
                    PathNode.CurveTo(13.899f, 3.0f, 14.185f, 3.0f, 14.427f, 3.094f),
                    PathNode.CurveTo(14.64f, 3.176f, 14.827f, 3.311f, 14.972f, 3.484f)
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
                    PathNode.MoveTo(9.0f, 18.0f),
                    PathNode.CurveTo(9.0f, 19.5f, 11.0f, 21.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(13.0f, 21.0f, 15.0f, 19.0f, 15.0f, 18.0f),
                    PathNode.QuadTo(12.0f, 19.5f, 9.0f, 18.0f)
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
        return _brandAstro!!
    }

private var _brandAstro: ImageVector? = null
