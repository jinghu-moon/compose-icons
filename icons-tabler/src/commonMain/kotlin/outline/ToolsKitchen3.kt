package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ToolsKitchen3: ImageVector
    get() {
        if (_toolsKitchen3 != null) return _toolsKitchen3!!
        _toolsKitchen3 = tablerOutlineIcon(
            name = "ToolsKitchen3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 4.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.MoveTo(4.0f, 4.0f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.CurveTo(4.0f, 8.656855f, 5.343146f, 10.0f, 7.0f, 10.0f),
                    PathNode.CurveTo(8.656855f, 10.0f, 10.0f, 8.656855f, 10.0f, 7.0f),
                    PathNode.LineTo(10.0f, 4.0f)
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
                    PathNode.MoveTo(14.0f, 8.0f),
                    PathNode.CurveTo(14.0f, 10.209139f, 15.343145f, 12.0f, 17.0f, 12.0f),
                    PathNode.CurveTo(18.656855f, 12.0f, 20.0f, 10.209139f, 20.0f, 8.0f),
                    PathNode.CurveTo(20.0f, 5.790861f, 18.656855f, 4.0f, 17.0f, 4.0f),
                    PathNode.CurveTo(15.343145f, 4.0f, 14.0f, 5.790861f, 14.0f, 8.0f)
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
                    PathNode.MoveTo(17.0f, 12.0f),
                    PathNode.LineTo(17.0f, 21.0f)
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
        return _toolsKitchen3!!
    }

private var _toolsKitchen3: ImageVector? = null
