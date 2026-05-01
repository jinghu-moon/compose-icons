package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaneTilt: ImageVector
    get() {
        if (_planeTilt != null) return _planeTilt!!
        _planeTilt = tablerOutlineIcon(
            name = "PlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.5f, 6.5f),
                    PathNode.LineTo(17.5f, 3.6f),
                    PathNode.CurveTo(18.300814f, 2.799187f, 19.599188f, 2.799187f, 20.4f, 3.6f),
                    PathNode.CurveTo(21.200813f, 4.400813f, 21.200813f, 5.699188f, 20.4f, 6.5f),
                    PathNode.LineTo(17.5f, 9.5f),
                    PathNode.LineTo(20.0f, 17.0f),
                    PathNode.LineTo(17.5f, 19.55f),
                    PathNode.LineTo(14.0f, 13.0f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.LineTo(11.0f, 19.0f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.LineTo(7.5f, 16.5f),
                    PathNode.LineTo(3.0f, 15.0f),
                    PathNode.LineTo(5.0f, 13.0f),
                    PathNode.LineTo(8.0f, 13.0f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.LineTo(4.5f, 6.5f),
                    PathNode.LineTo(7.0f, 4.0f),
                    PathNode.LineTo(14.5f, 6.5f)
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
        return _planeTilt!!
    }

private var _planeTilt: ImageVector? = null
