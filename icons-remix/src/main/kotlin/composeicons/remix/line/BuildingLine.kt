package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BuildingLine: ImageVector
    get() {
        if (_buildingLine != null) return _buildingLine!!
        _buildingLine = remixIcon(
            name = "BuildingLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 19h2v2h-22v-2h2v-15C3 3.448 3.448 3 4 3h10c.552 0 1 .448 1 1v15h4v-8h-2v-2h3c.552 0 1 .448 1 1v9ZM5 5v14h8v-14h-8ZM7 11h4v2h-4v-2ZM7 7h4v2h-4v-2Z"),
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
        return _buildingLine!!
    }

private var _buildingLine: ImageVector? = null
