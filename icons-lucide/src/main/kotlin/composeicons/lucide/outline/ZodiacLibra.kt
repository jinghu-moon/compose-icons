package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacLibra: ImageVector
    get() {
        if (_zodiacLibra != null) return _zodiacLibra!!
        _zodiacLibra = lucideOutlineIcon(
            name = "ZodiacLibra",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 16.0f),
                    PathNode.LineTo(9.857f, 16.0f),
                    PathNode.CurveTo(10.019f, 15.988f, 10.047f, 15.677f, 9.895f, 15.62f),
                    PathNode.CurveTo(7.178645f, 14.601775f, 5.579799f, 11.785997f, 6.097208f, 8.931587f),
                    PathNode.CurveTo(6.614617f, 6.077178f, 9.100075f, 4.001747f, 12.001f, 4.001747f),
                    PathNode.CurveTo(14.901925f, 4.001747f, 17.387383f, 6.077178f, 17.904793f, 8.931587f),
                    PathNode.CurveTo(18.422201f, 11.785997f, 16.823355f, 14.601775f, 14.107f, 15.62f),
                    PathNode.CurveTo(13.954f, 15.677f, 13.982f, 15.988f, 14.145f, 16.0f),
                    PathNode.LineTo(21.0f, 16.0f)
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
                    PathNode.MoveTo(3.0f, 20.0f),
                    PathNode.LineTo(21.0f, 20.0f)
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
        return _zodiacLibra!!
    }

private var _zodiacLibra: ImageVector? = null
