package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartFunnel: ImageVector
    get() {
        if (_chartFunnel != null) return _chartFunnel!!
        _chartFunnel = tablerOutlineIcon(
            name = "ChartFunnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.387f, 3.0f),
                    PathNode.LineTo(19.613f, 3.0f),
                    PathNode.CurveTo(19.934269f, 3.000244f, 20.235855f, 3.154826f, 20.423635f, 3.4155f),
                    PathNode.CurveTo(20.611416f, 3.676175f, 20.662521f, 4.011195f, 20.561f, 4.316f),
                    PathNode.LineTo(15.456f, 19.632f),
                    PathNode.CurveTo(15.183856f, 20.449085f, 14.419215f, 21.000208f, 13.558f, 21.0f),
                    PathNode.LineTo(10.442f, 21.0f),
                    PathNode.CurveTo(9.580785f, 21.000208f, 8.816144f, 20.449085f, 8.544f, 19.632f),
                    PathNode.LineTo(3.44f, 4.316f),
                    PathNode.CurveTo(3.338535f, 4.011362f, 3.389525f, 3.67653f, 3.577073f, 3.415905f),
                    PathNode.CurveTo(3.76462f, 3.15528f, 4.06591f, 3.000565f, 4.387f, 3.0f)
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
                    PathNode.MoveTo(5.0f, 9.0f),
                    PathNode.LineTo(19.0f, 9.0f)
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
                    PathNode.MoveTo(7.0f, 15.0f),
                    PathNode.LineTo(17.0f, 15.0f)
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
        return _chartFunnel!!
    }

private var _chartFunnel: ImageVector? = null
