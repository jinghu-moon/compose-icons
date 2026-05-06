package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BuildingBridge2: ImageVector
    get() {
        if (_buildingBridge2 != null) return _buildingBridge2!!
        _buildingBridge2 = tablerFilledIcon(
            name = "BuildingBridge2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 6c1.657 0 3 1.343 3 3v9c0 1.105-.895 2-2 2h-2c-1.105 0-2-.895-2-2v-2c0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3v2c0 1.105-.895 2-2 2h-2C3.895 20 3 19.105 3 18v-9C3 7.343 4.343 6 6 6Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _buildingBridge2!!
    }

private var _buildingBridge2: ImageVector? = null
