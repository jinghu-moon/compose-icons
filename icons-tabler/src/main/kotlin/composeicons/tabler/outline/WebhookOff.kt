package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WebhookOff: ImageVector
    get() {
        if (_webhookOff != null) return _webhookOff!!
        _webhookOff = tablerOutlineIcon(
            name = "WebhookOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.876f, 13.61f),
                    PathNode.CurveTo(3.246573f, 14.63107f, 2.574267f, 16.667072f, 3.275257f, 18.457666f),
                    PathNode.CurveTo(3.976248f, 20.248262f, 5.852143f, 21.286682f, 7.741715f, 20.930119f),
                    PathNode.CurveTo(9.631286f, 20.573553f, 10.999754f, 18.922918f, 11.0f, 17.0f),
                    PathNode.LineTo(17.0f, 17.0f)
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
                    PathNode.MoveTo(15.066f, 20.502f),
                    PathNode.CurveTo(16.626698f, 21.363504f, 18.56913f, 21.088228f, 19.829f, 19.827f),
                    PathNode.MoveTo(21.0f, 17.0f),
                    PathNode.CurveTo(21.0f, 14.790861f, 19.209139f, 13.0f, 17.0f, 13.0f)
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
                    PathNode.MoveTo(16.0f, 8.0f),
                    PathNode.CurveTo(16.000061f, 6.383262f, 15.026869f, 4.925452f, 13.533693f, 4.305557f),
                    PathNode.CurveTo(12.040519f, 3.685661f, 10.320993f, 4.025583f, 9.176f, 5.167f),
                    PathNode.MoveTo(8.0f, 8.0f),
                    PathNode.CurveTo(8.0f, 9.506f, 8.77f, 10.818f, 10.0f, 11.5f),
                    PathNode.LineTo(7.0f, 17.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _webhookOff!!
    }

private var _webhookOff: ImageVector? = null
