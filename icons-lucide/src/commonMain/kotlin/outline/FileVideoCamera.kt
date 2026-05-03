package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileVideoCamera: ImageVector
    get() {
        if (_fileVideoCamera != null) return _fileVideoCamera!!
        _fileVideoCamera = lucideOutlineIcon(
            name = "FileVideoCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 12.0f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(4.0f, 2.895431f, 4.895431f, 2.0f, 6.0f, 2.0f),
                    PathNode.LineTo(14.0f, 2.0f),
                    PathNode.CurveTo(14.640058f, 1.99843f, 15.254227f, 2.252594f, 15.706f, 2.706f),
                    PathNode.LineTo(19.294f, 6.294f),
                    PathNode.CurveTo(19.747406f, 6.745774f, 20.00157f, 7.359942f, 20.0f, 8.0f),
                    PathNode.LineTo(20.0f, 20.0f),
                    PathNode.CurveTo(20.0f, 21.10457f, 19.10457f, 22.0f, 18.0f, 22.0f)
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
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 7.552285f, 14.447715f, 8.0f, 15.0f, 8.0f),
                    PathNode.LineTo(20.0f, 8.0f)
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
                    PathNode.MoveTo(10.0f, 17.843f),
                    PathNode.LineTo(13.033f, 16.088f),
                    PathNode.CurveTo(13.232316f, 15.969494f, 13.480143f, 15.968069f, 13.680807f, 16.084276f),
                    PathNode.CurveTo(13.881473f, 16.200483f, 14.003583f, 16.416143f, 14.0f, 16.648f),
                    PathNode.LineTo(14.0f, 21.352f),
                    PathNode.CurveTo(13.997377f, 21.581247f, 13.87418f, 21.792158f, 13.675785f, 21.907051f),
                    PathNode.CurveTo(13.477389f, 22.021944f, 13.233141f, 22.023825f, 13.033f, 21.912f),
                    PathNode.LineTo(10.0f, 20.157f)
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
                    PathNode.MoveTo(4.0f, 16.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(9.552285f, 16.0f, 10.0f, 16.447716f, 10.0f, 17.0f),
                    PathNode.LineTo(10.0f, 21.0f),
                    PathNode.CurveTo(10.0f, 21.552284f, 9.552285f, 22.0f, 9.0f, 22.0f),
                    PathNode.LineTo(4.0f, 22.0f),
                    PathNode.CurveTo(3.447715f, 22.0f, 3.0f, 21.552284f, 3.0f, 21.0f),
                    PathNode.LineTo(3.0f, 17.0f),
                    PathNode.CurveTo(3.0f, 16.447716f, 3.447715f, 16.0f, 4.0f, 16.0f),
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
        return _fileVideoCamera!!
    }

private var _fileVideoCamera: ImageVector? = null
