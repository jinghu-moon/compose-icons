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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 6.000 C 19.657 6.000 21.000 7.343 21.000 9.000 L 21.000 18.000 C 21.000 19.105 20.105 20.000 19.000 20.000 L 17.000 20.000 C 15.895 20.000 15.000 19.105 15.000 18.000 L 15.000 16.000 C 15.000 14.343 13.657 13.000 12.000 13.000 C 10.343 13.000 9.000 14.343 9.000 16.000 L 9.000 18.000 C 9.000 19.105 8.105 20.000 7.000 20.000 L 5.000 20.000 C 3.895 20.000 3.000 19.105 3.000 18.000 L 3.000 9.000 C 3.000 7.343 4.343 6.000 6.000 6.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _buildingBridge2!!
    }

private var _buildingBridge2: ImageVector? = null
