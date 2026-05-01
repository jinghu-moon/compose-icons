package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileHeadphone: ImageVector
    get() {
        if (_fileHeadphone != null) return _fileHeadphone!!
        _fileHeadphone = lucideOutlineIcon(
            name = "FileHeadphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 6.835f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(4.0f, 2.895431f, 4.895431f, 2.0f, 6.0f, 2.0f),
                    PathNode.LineTo(14.0f, 2.0f),
                    PathNode.CurveTo(14.640058f, 1.99843f, 15.254227f, 2.252594f, 15.706f, 2.706f),
                    PathNode.LineTo(19.294f, 6.294f),
                    PathNode.CurveTo(19.747406f, 6.745774f, 20.00157f, 7.359942f, 20.0f, 8.0f),
                    PathNode.LineTo(20.0f, 20.0f),
                    PathNode.CurveTo(20.0f, 21.10457f, 19.10457f, 22.0f, 18.0f, 22.0f),
                    PathNode.LineTo(17.657f, 22.0f)
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
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 7.552285f, 14.447715f, 8.0f, 15.0f, 8.0f),
                    PathNode.LineTo(20.0f, 8.0f)
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
                    PathNode.MoveTo(2.0f, 19.0f),
                    PathNode.CurveTo(2.0f, 17.89543f, 2.895431f, 17.0f, 4.0f, 17.0f),
                    PathNode.CurveTo(5.10457f, 17.0f, 6.0f, 17.89543f, 6.0f, 19.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(6.0f, 21.10457f, 5.10457f, 22.0f, 4.0f, 22.0f),
                    PathNode.CurveTo(2.895431f, 22.0f, 2.0f, 21.10457f, 2.0f, 20.0f),
                    PathNode.LineTo(2.0f, 16.0f),
                    PathNode.CurveTo(2.0f, 12.686292f, 4.686292f, 10.0f, 8.0f, 10.0f),
                    PathNode.CurveTo(11.313708f, 10.0f, 14.0f, 12.686292f, 14.0f, 16.0f),
                    PathNode.LineTo(14.0f, 20.0f),
                    PathNode.CurveTo(14.0f, 21.10457f, 13.104569f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(10.895431f, 22.0f, 10.0f, 21.10457f, 10.0f, 20.0f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.CurveTo(10.0f, 17.89543f, 10.895431f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(13.104569f, 17.0f, 14.0f, 17.89543f, 14.0f, 19.0f)
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
        return _fileHeadphone!!
    }

private var _fileHeadphone: ImageVector? = null
