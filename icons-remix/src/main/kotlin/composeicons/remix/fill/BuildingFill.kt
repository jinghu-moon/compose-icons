package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BuildingFill: ImageVector
    get() {
        if (_buildingFill != null) return _buildingFill!!
        _buildingFill = remixIcon(
            name = "BuildingFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 19h2v2h-22v-2h2v-15C3 3.448 3.448 3 4 3h10c.552 0 1 .448 1 1v15h2v-10h3c.552 0 1 .448 1 1v9ZM7 11v2h4v-2h-4ZM7 7v2h4v-2h-4Z"),
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
        return _buildingFill!!
    }

private var _buildingFill: ImageVector? = null
