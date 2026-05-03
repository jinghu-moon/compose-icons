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
                pathData = parseSvgPathData("M 6.000 7.000 L 18.000 7.000 C 19.105 7.000 20.000 7.895 20.000 9.000 L 20.000 18.000 C 20.000 18.552 19.552 19.000 19.000 19.000 L 17.000 19.000 C 16.448 19.000 16.000 18.552 16.000 18.000 L 16.000 16.000 C 16.000 13.791 14.209 12.000 12.000 12.000 C 9.791 12.000 8.000 13.791 8.000 16.000 L 8.000 18.000 C 8.000 18.552 7.552 19.000 7.000 19.000 L 5.000 19.000 C 4.448 19.000 4.000 18.552 4.000 18.000 L 4.000 9.000 C 4.000 7.895 4.895 7.000 6.000 7.000"),
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
