package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandApple: ImageVector
    get() {
        if (_brandApple != null) return _brandApple!!
        _brandApple = tablerOutlineIcon(
            name = "BrandApple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.286001f, 7.008f),
                    PathNode.CurveTo(5.07f, 7.008f, 4.0f, 10.238f, 4.0f, 12.928f),
                    PathNode.CurveTo(4.0f, 16.157f, 6.143f, 21.0f, 8.286001f, 21.0f),
                    PathNode.CurveTo(9.451f, 20.95f, 10.085f, 20.462f, 11.5f, 20.462f),
                    PathNode.CurveTo(12.906f, 20.462f, 13.107f, 21.0f, 14.714f, 21.0f),
                    PathNode.CurveTo(16.321f, 21.0f, 19.0f, 17.771f, 19.0f, 15.619f),
                    PathNode.CurveTo(18.97f, 15.608f, 16.351f, 15.185f, 16.321f, 12.389f),
                    PathNode.CurveTo(16.301f, 10.054f, 18.91f, 9.21f, 19.0f, 9.161f),
                    PathNode.CurveTo(17.904f, 7.555f, 15.838f, 7.048f, 15.25f, 7.008f),
                    PathNode.CurveTo(13.715f, 6.888f, 12.218f, 8.085f, 11.5f, 8.085f),
                    PathNode.CurveTo(10.771f, 8.085f, 9.464f, 7.008f, 8.286001f, 7.008f)
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
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.CurveTo(13.104569f, 4.0f, 14.0f, 3.10457f, 14.0f, 2.0f),
                    PathNode.CurveTo(12.895431f, 2.0f, 12.0f, 2.895431f, 12.0f, 4.0f)
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
        return _brandApple!!
    }

private var _brandApple: ImageVector? = null
