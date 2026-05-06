package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingBridge2: ImageVector
    get() {
        if (_buildingBridge2 != null) return _buildingBridge2!!
        _buildingBridge2 = tablerOutlineIcon(
            name = "BuildingBridge2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 7h12c1.105 0 2 .895 2 2v9c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-2c0-2.209-1.791-4-4-4C9.791 12 8 13.791 8 16v2c0 .552-.448 1-1 1h-2C4.448 19 4 18.552 4 18v-9C4 7.895 4.895 7 6 7"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _buildingBridge2!!
    }

private var _buildingBridge2: ImageVector? = null
