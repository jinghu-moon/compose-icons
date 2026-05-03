package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Webhook: ImageVector
    get() {
        if (_webhook != null) return _webhook!!
        _webhook = tablerOutlineIcon(
            name = "Webhook",
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
                    PathNode.MoveTo(15.066f, 20.502f),
                    PathNode.CurveTo(16.529875f, 21.309961f, 18.341845f, 21.122154f, 19.608892f, 20.031137f),
                    PathNode.CurveTo(20.875942f, 18.940119f, 21.330698f, 17.176117f, 20.749039f, 15.608506f),
                    PathNode.CurveTo(20.16738f, 14.040895f, 18.672043f, 13.000471f, 17.0f, 13.0f),
                    PathNode.CurveTo(16.294f, 13.0f, 15.576f, 13.179f, 15.0f, 13.5f),
                    PathNode.LineTo(12.0f, 8.0f)
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
                    PathNode.MoveTo(16.0f, 8.0f),
                    PathNode.CurveTo(16.0f, 5.790861f, 14.209139f, 4.0f, 12.0f, 4.0f),
                    PathNode.CurveTo(9.790861f, 4.0f, 8.0f, 5.790861f, 8.0f, 8.0f),
                    PathNode.CurveTo(8.0f, 9.506f, 8.77f, 10.818f, 10.0f, 11.5f),
                    PathNode.LineTo(7.0f, 17.0f)
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
        return _webhook!!
    }

private var _webhook: ImageVector? = null
