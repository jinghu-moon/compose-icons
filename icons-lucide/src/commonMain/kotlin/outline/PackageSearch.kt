package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PackageSearch: ImageVector
    get() {
        if (_packageSearch != null) return _packageSearch!!
        _packageSearch = lucideOutlineIcon(
            name = "PackageSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 22.0f),
                    PathNode.LineTo(12.0f, 12.0f)
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
                    PathNode.MoveTo(20.27f, 18.27f),
                    PathNode.LineTo(22.0f, 20.0f)
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
                    PathNode.MoveTo(21.0f, 10.498f),
                    PathNode.LineTo(21.0f, 8.0f),
                    PathNode.CurveTo(20.999268f, 7.286202f, 20.618168f, 6.626899f, 20.0f, 6.27f),
                    PathNode.LineTo(13.0f, 2.27f),
                    PathNode.CurveTo(12.381198f, 1.912734f, 11.618802f, 1.912734f, 11.0f, 2.27f),
                    PathNode.LineTo(4.0f, 6.27f),
                    PathNode.CurveTo(3.381832f, 6.626899f, 3.000732f, 7.286202f, 3.0f, 8.0f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.CurveTo(3.001089f, 16.713442f, 3.382141f, 17.37228f, 4.0f, 17.729f),
                    PathNode.LineTo(11.0f, 21.729f),
                    PathNode.CurveTo(11.618624f, 22.086575f, 12.38102f, 22.086956f, 13.0f, 21.73f),
                    PathNode.LineTo(13.98f, 21.171f)
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
                    PathNode.MoveTo(3.29f, 7.0f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.LineTo(20.71f, 7.0f)
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
                    PathNode.MoveTo(7.5f, 4.27f),
                    PathNode.LineTo(16.497f, 9.418f)
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
                    PathNode.MoveTo(21.0f, 16.5f),
                    PathNode.CurveTo(21.0f, 17.880713f, 19.880713f, 19.0f, 18.5f, 19.0f),
                    PathNode.CurveTo(17.119287f, 19.0f, 16.0f, 17.880713f, 16.0f, 16.5f),
                    PathNode.CurveTo(16.0f, 15.119288f, 17.119287f, 14.0f, 18.5f, 14.0f),
                    PathNode.CurveTo(19.880713f, 14.0f, 21.0f, 15.119288f, 21.0f, 16.5f),
                    PathNode.Close
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
        return _packageSearch!!
    }

private var _packageSearch: ImageVector? = null
