package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingBridge2: ImageVector
    get() {
        if (_buildingBridge2 != null) return _buildingBridge2!!
        _buildingBridge2 = tablerOutlineIcon(
            name = "BuildingBridge2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 7.0f),
                    PathNode.LineTo(18.0f, 7.0f),
                    PathNode.CurveTo(19.10457f, 7.0f, 20.0f, 7.895431f, 20.0f, 9.0f),
                    PathNode.LineTo(20.0f, 18.0f),
                    PathNode.CurveTo(20.0f, 18.552284f, 19.552284f, 19.0f, 19.0f, 19.0f),
                    PathNode.LineTo(17.0f, 19.0f),
                    PathNode.CurveTo(16.447716f, 19.0f, 16.0f, 18.552284f, 16.0f, 18.0f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.CurveTo(16.0f, 13.790861f, 14.209139f, 12.0f, 12.0f, 12.0f),
                    PathNode.CurveTo(9.790861f, 12.0f, 8.0f, 13.790861f, 8.0f, 16.0f),
                    PathNode.LineTo(8.0f, 18.0f),
                    PathNode.CurveTo(8.0f, 18.552284f, 7.552285f, 19.0f, 7.0f, 19.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(4.447716f, 19.0f, 4.0f, 18.552284f, 4.0f, 18.0f),
                    PathNode.LineTo(4.0f, 9.0f),
                    PathNode.CurveTo(4.0f, 7.895431f, 4.895431f, 7.0f, 6.0f, 7.0f)
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
        return _buildingBridge2!!
    }

private var _buildingBridge2: ImageVector? = null
