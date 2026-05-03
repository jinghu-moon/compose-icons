package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = lucideOutlineIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 18.0f),
                    PathNode.LineTo(12.0f, 22.0f)
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
                    PathNode.MoveTo(2.0f, 14.499f),
                    PathNode.CurveTo(2.000456f, 16.77687f, 3.405007f, 18.818748f, 5.532076f, 19.63378f),
                    PathNode.CurveTo(7.659144f, 20.448812f, 10.068512f, 19.868322f, 11.591f, 18.174f),
                    PathNode.CurveTo(11.821677f, 17.959612f, 12.178848f, 17.960049f, 12.409f, 18.175f),
                    PathNode.CurveTo(13.931488f, 19.869322f, 16.340857f, 20.449812f, 18.467924f, 19.63478f),
                    PathNode.CurveTo(20.594994f, 18.819748f, 21.999544f, 16.777872f, 22.0f, 14.5f),
                    PathNode.CurveTo(22.0f, 12.21f, 20.5f, 10.5f, 19.0f, 9.0f),
                    PathNode.LineTo(13.508f, 3.688f),
                    PathNode.CurveTo(13.131211f, 3.254955f, 12.58652f, 3.00468f, 12.012514f, 3.000853f),
                    PathNode.CurveTo(11.438508f, 2.997026f, 10.890529f, 3.240017f, 10.508f, 3.668f),
                    PathNode.LineTo(5.0f, 8.999f),
                    PathNode.CurveTo(3.5f, 10.499f, 2.0f, 12.199f, 2.0f, 14.499f)
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
        return _spade!!
    }

private var _spade: ImageVector? = null
