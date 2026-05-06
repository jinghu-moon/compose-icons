package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BuildingOffice: ImageVector
    get() {
        if (_buildingOffice != null) return _buildingOffice!!
        _buildingOffice = phosphorBoldIcon(
            name = "BuildingOffice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 204h-12v-104.7c5.489-1.962 8.775-7.585 7.789-13.33C238.802 80.224 233.829 76.019 228 76h-40v-24.7c5.489-1.962 8.775-7.585 7.789-13.33C194.802 32.224 189.829 28.019 184 28h-144c-5.829 .019-10.802 4.224-11.789 9.97-.986 5.745 2.299 11.369 7.789 13.33v152.7h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h220c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM208 100v104h-20v-104ZM60 52h104v152h-16v-44c0-6.627-5.373-12-12-12h-48c-6.627 0-12 5.373-12 12v44h-16ZM124 204h-24v-32h24ZM72 80C72 73.373 77.373 68 84 68h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-8C77.373 92 72 86.627 72 80ZM120 80c0-6.627 5.373-12 12-12h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-8c-6.627 0-12-5.373-12-12ZM72 120c0-6.627 5.373-12 12-12h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-8c-6.627 0-12-5.373-12-12ZM120 120c0-6.627 5.373-12 12-12h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-8c-6.627 0-12-5.373-12-12Z"),
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
