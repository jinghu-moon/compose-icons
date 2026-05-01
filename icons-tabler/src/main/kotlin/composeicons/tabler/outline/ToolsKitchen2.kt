package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ToolsKitchen2: ImageVector
    get() {
        if (_toolsKitchen2 != null) return _toolsKitchen2!!
        _toolsKitchen2 = tablerOutlineIcon(
            name = "ToolsKitchen2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 3.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.CurveTo(13.977f, 11.319f, 14.184f, 7.594f, 19.0f, 3.0f),
                    PathNode.MoveTo(19.0f, 15.0f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.LineTo(18.0f, 21.0f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.MoveTo(8.0f, 4.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.MoveTo(5.0f, 4.0f),
                    PathNode.LineTo(5.0f, 7.0f),
                    PathNode.CurveTo(5.0f, 8.656855f, 6.343146f, 10.0f, 8.0f, 10.0f),
                    PathNode.CurveTo(9.656855f, 10.0f, 11.0f, 8.656855f, 11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 4.0f)
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
        return _toolsKitchen2!!
    }

private var _toolsKitchen2: ImageVector? = null
