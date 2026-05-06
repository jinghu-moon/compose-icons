package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BuildingApartment: ImageVector
    get() {
        if (_buildingApartment != null) return _buildingApartment!!
        _buildingApartment = phosphorBoldIcon(
            name = "BuildingApartment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 204h-4v-128c0-6.627-5.373-12-12-12h-36v-24c0-6.627-5.373-12-12-12h-96C73.373 28 68 33.373 68 40v60h-36c-6.627 0-12 5.373-12 12v92h-4C9.373 204 4 209.373 4 216c0 6.627 5.373 12 12 12h224c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM44 124h36c6.627 0 12-5.373 12-12v-60h72v24c0 6.627 5.373 12 12 12h36v116h-64v-28c0-2.209-1.791-4-4-4h-32c-2.209 0-4 1.791-4 4v28h-64ZM108 76c0-6.627 5.373-12 12-12h16c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-16c-6.627 0-12-5.373-12-12ZM108 112c0-6.627 5.373-12 12-12h16c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-16c-6.627 0-12-5.373-12-12ZM160 112c0-6.627 5.373-12 12-12h16c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-16c-6.627 0-12-5.373-12-12ZM96 148c0 6.627-5.373 12-12 12h-16c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h16c6.627 0 12 5.373 12 12ZM108 148c0-6.627 5.373-12 12-12h16c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-16c-6.627 0-12-5.373-12-12ZM160 148c0-6.627 5.373-12 12-12h16c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-16c-6.627 0-12-5.373-12-12Z"),
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
        return _buildingApartment!!
    }

private var _buildingApartment: ImageVector? = null
