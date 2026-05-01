package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWish: ImageVector
    get() {
        if (_brandWish != null) return _brandWish!!
        _brandWish = tablerOutlineIcon(
            name = "BrandWish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 6.0f),
                    PathNode.LineTo(7.981f, 8.392f),
                    PathNode.LineTo(7.342f, 14.429f),
                    PathNode.CurveTo(7.162f, 15.322f, 7.402f, 16.248f, 7.992f, 16.943f),
                    PathNode.CurveTo(8.583301f, 17.639523f, 9.459785f, 18.028622f, 10.373f, 18.0f),
                    PathNode.CurveTo(12.421971f, 17.938688f, 14.146902f, 16.448368f, 14.505f, 14.43f),
                    PathNode.CurveTo(14.325f, 15.323f, 14.565f, 16.249f, 15.155f, 16.944f),
                    PathNode.CurveTo(15.746274f, 17.639872f, 16.622297f, 18.02856f, 17.535f, 18.0f),
                    PathNode.CurveTo(19.583973f, 17.938688f, 21.308903f, 16.448368f, 21.667f, 14.43f),
                    PathNode.LineTo(22.0f, 9.797f)
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
                    PathNode.MoveTo(14.504f, 14.429f),
                    PathNode.LineTo(14.838f, 11.429f)
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
        return _brandWish!!
    }

private var _brandWish: ImageVector? = null
