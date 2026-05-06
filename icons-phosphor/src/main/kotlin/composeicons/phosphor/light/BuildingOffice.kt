package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BuildingOffice: ImageVector
    get() {
        if (_buildingOffice != null) return _buildingOffice!!
        _buildingOffice = phosphorLightIcon(
            name = "BuildingOffice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 210h-18v-116h2c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-50v-36h2c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-144c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h2v164h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h224c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM218 94v116h-36v-116ZM54 46h116v164h-28v-50c0-3.314-2.686-6-6-6h-48c-3.314 0-6 2.686-6 6v50h-28ZM130 210h-36v-44h36ZM74 80c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6ZM122 80c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6ZM80 126c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6ZM122 120c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6Z"),
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
