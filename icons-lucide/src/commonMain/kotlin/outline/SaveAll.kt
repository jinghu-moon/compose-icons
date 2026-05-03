package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SaveAll: ImageVector
    get() {
        if (_saveAll != null) return _saveAll!!
        _saveAll = lucideOutlineIcon(
            name = "SaveAll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 2.0f),
                    PathNode.LineTo(10.0f, 5.0f),
                    PathNode.CurveTo(10.0f, 5.552285f, 10.447715f, 6.0f, 11.0f, 6.0f),
                    PathNode.LineTo(16.0f, 6.0f)
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
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.CurveTo(18.0f, 11.447715f, 17.552284f, 11.0f, 17.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.CurveTo(10.447715f, 11.0f, 10.0f, 11.447715f, 10.0f, 12.0f),
                    PathNode.LineTo(10.0f, 18.0f)
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
                    PathNode.LineTo(4.0f, 22.0f),
                    PathNode.CurveTo(2.895431f, 22.0f, 2.0f, 21.10457f, 2.0f, 20.0f),
                    PathNode.LineTo(2.0f, 6.0f)
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
                    PathNode.MoveTo(8.0f, 18.0f),
                    PathNode.CurveTo(6.895431f, 18.0f, 6.0f, 17.10457f, 6.0f, 16.0f),
                    PathNode.LineTo(6.0f, 4.0f),
                    PathNode.CurveTo(6.0f, 2.895431f, 6.895431f, 2.0f, 8.0f, 2.0f),
                    PathNode.LineTo(17.172f, 2.0f),
                    PathNode.CurveTo(17.702389f, 2.000113f, 18.211014f, 2.210901f, 18.586f, 2.586f),
                    PathNode.LineTo(21.414f, 5.414f),
                    PathNode.CurveTo(21.789099f, 5.788986f, 21.999887f, 6.297611f, 22.0f, 6.828f),
                    PathNode.LineTo(22.0f, 16.0f),
                    PathNode.CurveTo(22.000006f, 16.53217f, 21.78792f, 17.042398f, 21.410683f, 17.41776f),
                    PathNode.CurveTo(21.033443f, 17.793123f, 20.522163f, 18.00266f, 19.99f, 18.0f),
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
        return _saveAll!!
    }

private var _saveAll: ImageVector? = null
