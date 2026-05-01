package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNotion: ImageVector
    get() {
        if (_brandNotion != null) return _brandNotion!!
        _brandNotion = tablerOutlineIcon(
            name = "BrandNotion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 17.5f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(11.5f, 11.0f),
                    PathNode.LineTo(15.5f, 17.0f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.LineTo(16.0f, 10.5f)
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
                    PathNode.MoveTo(19.077f, 20.071f),
                    PathNode.LineTo(7.547f, 20.958f),
                    PathNode.CurveTo(7.206356f, 20.98399f, 6.876015f, 20.834282f, 6.671f, 20.561f),
                    PathNode.LineTo(4.2f, 17.267f),
                    PathNode.CurveTo(4.070178f, 17.093904f, 4.0f, 16.88337f, 4.0f, 16.667f),
                    PathNode.LineTo(4.0f, 5.926f),
                    PathNode.CurveTo(4.000016f, 5.403593f, 4.402144f, 4.969226f, 4.923f, 4.929f),
                    PathNode.LineTo(16.312f, 4.053f),
                    PathNode.CurveTo(16.757725f, 4.018871f, 17.202034f, 4.135053f, 17.574f, 4.383f),
                    PathNode.LineTo(19.109f, 5.406f),
                    PathNode.CurveTo(19.66552f, 5.77682f, 19.999878f, 6.401253f, 20.0f, 7.07f),
                    PathNode.LineTo(20.0f, 19.074f),
                    PathNode.CurveTo(19.999983f, 19.596407f, 19.597857f, 20.030775f, 19.077f, 20.071f)
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
                    PathNode.MoveTo(4.5f, 5.5f),
                    PathNode.LineTo(7.0f, 8.0f)
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
                    PathNode.MoveTo(20.0f, 7.0f),
                    PathNode.LineTo(7.0f, 8.0f),
                    PathNode.LineTo(7.0f, 20.5f)
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
        return _brandNotion!!
    }

private var _brandNotion: ImageVector? = null
