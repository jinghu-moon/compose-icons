package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BuildingOffice: ImageVector
    get() {
        if (_buildingOffice != null) return _buildingOffice!!
        _buildingOffice = phosphorThinIcon(
            name = "BuildingOffice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 212h-20v-120h4c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-52v-40h4c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-144c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h4v168h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h224c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM220 92v120h-40v-120ZM52 44h120v168h-32v-52c0-2.209-1.791-4-4-4h-48c-2.209 0-4 1.791-4 4v52h-32ZM132 212h-40v-48h40ZM76 80c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4ZM124 80c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4ZM80 124c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM124 120c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4Z"),
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
        return _buildingOffice!!
    }

private var _buildingOffice: ImageVector? = null
