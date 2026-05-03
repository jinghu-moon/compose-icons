package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PlaneTakeoff: ImageVector
    get() {
        if (_planeTakeoff != null) return _planeTakeoff!!
        _planeTakeoff = lucideOutlineIcon(
            name = "PlaneTakeoff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 22.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
                    PathNode.MoveTo(6.36f, 17.4f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.LineTo(2.0f, 13.0f),
                    PathNode.LineTo(3.1f, 12.45f),
                    PathNode.CurveTo(3.666095f, 12.164742f, 4.333905f, 12.164742f, 4.9f, 12.45f),
                    PathNode.LineTo(5.07f, 12.55f),
                    PathNode.CurveTo(5.636095f, 12.835258f, 6.303905f, 12.835258f, 6.87f, 12.55f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.LineTo(5.0f, 6.0f),
                    PathNode.LineTo(5.9f, 5.55f),
                    PathNode.CurveTo(6.578463f, 5.216237f, 7.387149f, 5.293623f, 7.99f, 5.75f),
                    PathNode.LineTo(12.01f, 8.75f),
                    PathNode.CurveTo(12.615076f, 9.210422f, 13.42889f, 9.287928f, 14.11f, 8.95f),
                    PathNode.LineTo(18.3f, 6.89f),
                    PathNode.CurveTo(18.835438f, 6.62009f, 19.452265f, 6.559477f, 20.03f, 6.72f),
                    PathNode.LineTo(21.0f, 7.0f),
                    PathNode.CurveTo(21.405872f, 7.112713f, 21.739422f, 7.402183f, 21.908157f, 7.788142f),
                    PathNode.CurveTo(22.076893f, 8.174101f, 22.06288f, 8.615521f, 21.87f, 8.99f),
                    PathNode.LineTo(21.49f, 9.75f),
                    PathNode.CurveTo(21.26f, 10.21f, 20.89f, 10.59f, 20.42f, 10.83f),
                    PathNode.LineTo(7.58f, 17.2f),
                    PathNode.CurveTo(7.202445f, 17.387009f, 6.775475f, 17.450005f, 6.36f, 17.38f),
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
        return _planeTakeoff!!
    }

private var _planeTakeoff: ImageVector? = null
