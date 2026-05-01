package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileBadge: ImageVector
    get() {
        if (_fileBadge != null) return _fileBadge!!
        _fileBadge = lucideOutlineIcon(
            name = "FileBadge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 22.0f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.CurveTo(19.10457f, 22.0f, 20.0f, 21.10457f, 20.0f, 20.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.CurveTo(20.00157f, 7.359942f, 19.747406f, 6.745774f, 19.294f, 6.294f),
                    PathNode.LineTo(15.706f, 2.706f),
                    PathNode.CurveTo(15.254227f, 2.252594f, 14.640058f, 1.99843f, 14.0f, 2.0f),
                    PathNode.LineTo(6.0f, 2.0f),
                    PathNode.CurveTo(4.895431f, 2.0f, 4.0f, 2.895431f, 4.0f, 4.0f),
                    PathNode.LineTo(4.0f, 7.3f)
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
                    PathNode.MoveTo(7.69f, 16.479f),
                    PathNode.LineTo(8.98f, 21.359f),
                    PathNode.CurveTo(9.035898f, 21.54889f, 8.974512f, 21.753876f, 8.823444f, 21.881786f),
                    PathNode.CurveTo(8.672377f, 22.009695f, 8.460073f, 22.036444f, 8.282f, 21.95f),
                    PathNode.LineTo(6.439f, 21.101f),
                    PathNode.CurveTo(6.161553f, 20.96564f, 5.837139f, 20.966007f, 5.56f, 21.102f),
                    PathNode.LineTo(3.714f, 21.952f),
                    PathNode.CurveTo(3.536055f, 22.035336f, 3.325796f, 22.00672f, 3.176592f, 21.878862f),
                    PathNode.CurveTo(3.027389f, 21.751005f, 2.966905f, 21.54761f, 3.022f, 21.359f),
                    PathNode.LineTo(4.312f, 16.479f)
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
                    PathNode.MoveTo(9.0f, 14.0f),
                    PathNode.CurveTo(9.0f, 15.656855f, 7.656854f, 17.0f, 6.0f, 17.0f),
                    PathNode.CurveTo(4.343146f, 17.0f, 3.0f, 15.656855f, 3.0f, 14.0f),
                    PathNode.CurveTo(3.0f, 12.343145f, 4.343146f, 11.0f, 6.0f, 11.0f),
                    PathNode.CurveTo(7.656854f, 11.0f, 9.0f, 12.343145f, 9.0f, 14.0f),
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
        return _fileBadge!!
    }

private var _fileBadge: ImageVector? = null
