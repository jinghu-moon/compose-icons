package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileVolume: ImageVector
    get() {
        if (_fileVolume != null) return _fileVolume!!
        _fileVolume = lucideOutlineIcon(
            name = "FileVolume",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 11.55f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(4.0f, 2.895431f, 4.895431f, 2.0f, 6.0f, 2.0f),
                    PathNode.LineTo(14.0f, 2.0f),
                    PathNode.CurveTo(14.640058f, 1.99843f, 15.254227f, 2.252594f, 15.706f, 2.706f),
                    PathNode.LineTo(19.294f, 6.294f),
                    PathNode.CurveTo(19.747406f, 6.745774f, 20.00157f, 7.359942f, 20.0f, 8.0f),
                    PathNode.LineTo(20.0f, 20.0f),
                    PathNode.CurveTo(20.0f, 21.10457f, 19.10457f, 22.0f, 18.0f, 22.0f),
                    PathNode.LineTo(16.05f, 22.0f)
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
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.CurveTo(13.333333f, 16.777779f, 13.333333f, 19.222221f, 12.0f, 21.0f)
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
                    PathNode.MoveTo(8.0f, 14.502f),
                    PathNode.CurveTo(8.000741f, 14.306249f, 7.887182f, 14.128069f, 7.709429f, 14.046079f),
                    PathNode.CurveTo(7.531674f, 13.964087f, 7.322422f, 13.993368f, 7.174f, 14.121f),
                    PathNode.LineTo(5.281f, 15.752f),
                    PathNode.CurveTo(5.100024f, 15.908214f, 4.869071f, 15.994422f, 4.63f, 15.995f),
                    PathNode.LineTo(3.5f, 15.995f),
                    PathNode.CurveTo(3.367218f, 15.995f, 3.23989f, 16.047815f, 3.146093f, 16.1418f),
                    PathNode.CurveTo(3.052296f, 16.235785f, 2.999735f, 16.363218f, 3.0f, 16.496f),
                    PathNode.LineTo(3.0f, 19.502f),
                    PathNode.CurveTo(2.999735f, 19.63478f, 3.052296f, 19.762215f, 3.146093f, 19.8562f),
                    PathNode.CurveTo(3.23989f, 19.950184f, 3.367218f, 20.003f, 3.5f, 20.003f),
                    PathNode.LineTo(4.629f, 20.003f),
                    PathNode.CurveTo(4.868415f, 20.00334f, 5.099763f, 20.089561f, 5.281f, 20.246f),
                    PathNode.LineTo(7.174f, 21.879f),
                    PathNode.CurveTo(7.322285f, 22.006512f, 7.531301f, 22.035866f, 7.708972f, 21.954128f),
                    PathNode.CurveTo(7.886643f, 21.87239f, 8.000349f, 21.69457f, 8.0f, 21.499f),
                    PathNode.Close
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
        return _fileVolume!!
    }

private var _fileVolume: ImageVector? = null
