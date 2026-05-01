package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DatabaseZap: ImageVector
    get() {
        if (_databaseZap != null) return _databaseZap!!
        _databaseZap = lucideOutlineIcon(
            name = "DatabaseZap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 5.0f),
                    PathNode.CurveTo(21.0f, 6.656854f, 16.970562f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(7.029437f, 8.0f, 3.0f, 6.656854f, 3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 3.343146f, 7.029437f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(16.970562f, 2.0f, 21.0f, 3.343146f, 21.0f, 5.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 5.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(2.988698f, 19.975946f, 4.402309f, 20.892729f, 6.789636f, 21.45773f),
                    PathNode.CurveTo(9.176963f, 22.02273f, 12.239594f, 22.165325f, 15.0f, 21.84f)
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
                    PathNode.MoveTo(21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 8.0f)
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
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.LineTo(18.0f, 17.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.LineTo(19.0f, 22.0f)
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
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.002931f, 12.94801f, 4.349962f, 13.839778f, 6.632965f, 14.405112f),
                    PathNode.CurveTo(8.915967f, 14.970446f, 11.866279f, 15.142817f, 14.59f, 14.87f)
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
        return _databaseZap!!
    }

private var _databaseZap: ImageVector? = null
