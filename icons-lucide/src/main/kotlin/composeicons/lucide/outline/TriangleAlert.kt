package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TriangleAlert: ImageVector
    get() {
        if (_triangleAlert != null) return _triangleAlert!!
        _triangleAlert = lucideOutlineIcon(
            name = "TriangleAlert",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.73f, 18.0f),
                    PathNode.LineTo(13.73f, 4.0f),
                    PathNode.CurveTo(13.374878f, 3.373379f, 12.710254f, 2.986104f, 11.99f, 2.986104f),
                    PathNode.CurveTo(11.269746f, 2.986104f, 10.605123f, 3.373379f, 10.25f, 4.0f),
                    PathNode.LineTo(2.25f, 18.0f),
                    PathNode.CurveTo(1.891089f, 18.621584f, 1.892786f, 19.387835f, 2.254446f, 20.007824f),
                    PathNode.CurveTo(2.616107f, 20.627811f, 3.282266f, 21.006458f, 4.0f, 21.0f),
                    PathNode.LineTo(20.0f, 21.0f),
                    PathNode.CurveTo(20.714165f, 20.999268f, 21.373749f, 20.61778f, 21.730513f, 19.999113f),
                    PathNode.CurveTo(22.087278f, 19.380444f, 22.087084f, 18.618484f, 21.73f, 18.0f)
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
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.LineTo(12.0f, 13.0f)
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
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.LineTo(12.01f, 17.0f)
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
        return _triangleAlert!!
    }

private var _triangleAlert: ImageVector? = null
