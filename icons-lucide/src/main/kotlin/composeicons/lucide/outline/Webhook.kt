package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Webhook: ImageVector
    get() {
        if (_webhook != null) return _webhook!!
        _webhook = lucideOutlineIcon(
            name = "Webhook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 16.98f),
                    PathNode.LineTo(12.01f, 16.98f),
                    PathNode.CurveTo(10.91f, 16.98f, 10.06f, 17.92f, 9.53f, 18.88f),
                    PathNode.CurveTo(8.666756f, 20.499804f, 6.811878f, 21.324234f, 5.03107f, 20.879623f),
                    PathNode.CurveTo(3.250263f, 20.435013f, 2.000573f, 18.83547f, 2.0f, 17.0f),
                    PathNode.CurveTo(2.01f, 16.3f, 2.2f, 15.6f, 2.57f, 15.0f)
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
                    PathNode.MoveTo(6.0f, 17.0f),
                    PathNode.LineTo(9.13f, 11.22f),
                    PathNode.CurveTo(9.66f, 10.25f, 9.23f, 9.04f, 8.63f, 8.12f),
                    PathNode.CurveTo(7.859053f, 6.887028f, 7.817968f, 5.332787f, 8.522699f, 4.060806f),
                    PathNode.CurveTo(9.227431f, 2.788826f, 10.566952f, 1.9995f, 12.021112f, 1.999333f),
                    PathNode.CurveTo(13.475272f, 1.999165f, 14.814975f, 2.788182f, 15.52f, 4.06f)
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
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.LineTo(15.13f, 11.73f),
                    PathNode.CurveTo(15.66f, 12.7f, 16.9f, 13.0f, 18.0f, 13.0f),
                    PathNode.CurveTo(20.209139f, 13.0f, 22.0f, 14.790861f, 22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 19.209139f, 20.209139f, 21.0f, 18.0f, 21.0f)
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
        return _webhook!!
    }

private var _webhook: ImageVector? = null
