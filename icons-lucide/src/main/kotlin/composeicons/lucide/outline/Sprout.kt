package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sprout: ImageVector
    get() {
        if (_sprout != null) return _sprout!!
        _sprout = lucideOutlineIcon(
            name = "Sprout",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 9.536f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 4.790861f, 15.790861f, 3.0f, 18.0f, 3.0f),
                    PathNode.LineTo(19.5f, 3.0f),
                    PathNode.CurveTo(19.776142f, 3.0f, 20.0f, 3.223858f, 20.0f, 3.5f),
                    PathNode.LineTo(20.0f, 5.0f),
                    PathNode.CurveTo(20.0f, 7.209139f, 18.209139f, 9.0f, 16.0f, 9.0f),
                    PathNode.CurveTo(13.790861f, 9.0f, 12.0f, 10.790861f, 12.0f, 13.0f),
                    PathNode.CurveTo(12.0f, 15.0f, 13.0f, 16.0f, 13.0f, 18.0f),
                    PathNode.CurveTo(13.0f, 19.081852f, 12.649111f, 20.13452f, 12.0f, 21.0f)
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
                    PathNode.MoveTo(4.0f, 9.0f),
                    PathNode.CurveTo(5.515088f, 7.863684f, 7.542148f, 7.680904f, 9.236068f, 8.527864f),
                    PathNode.CurveTo(10.929988f, 9.374825f, 12.0f, 11.10614f, 12.0f, 13.0f),
                    PathNode.CurveTo(10.484912f, 14.136316f, 8.457852f, 14.319096f, 6.763932f, 13.472136f),
                    PathNode.CurveTo(5.070012f, 12.625175f, 4.0f, 10.89386f, 4.0f, 9.0f)
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
                    PathNode.MoveTo(5.0f, 21.0f),
                    PathNode.LineTo(19.0f, 21.0f)
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
        return _sprout!!
    }

private var _sprout: ImageVector? = null
