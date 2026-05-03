package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingCastle: ImageVector
    get() {
        if (_buildingCastle != null) return _buildingCastle!!
        _buildingCastle = tablerOutlineIcon(
            name = "BuildingCastle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 19.000 L 15.000 17.000 C 15.000 15.343 13.657 14.000 12.000 14.000 C 10.343 14.000 9.000 15.343 9.000 17.000 L 9.000 19.000 C 9.000 19.552 8.552 20.000 8.000 20.000 L 4.000 20.000 C 3.448 20.000 3.000 19.552 3.000 19.000 L 3.000 5.000 L 7.000 5.000 L 7.000 8.000 L 10.000 8.000 L 10.000 5.000 L 14.000 5.000 L 14.000 8.000 L 17.000 8.000 L 17.000 5.000 L 21.000 5.000 L 21.000 19.000 C 21.000 19.552 20.552 20.000 20.000 20.000 L 16.000 20.000 C 15.448 20.000 15.000 19.552 15.000 19.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 3.000 11.000 L 21.000 11.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _buildingCastle!!
    }

private var _buildingCastle: ImageVector? = null
