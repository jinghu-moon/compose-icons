package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BuildingOffice: ImageVector
    get() {
        if (_buildingOffice != null) return _buildingOffice!!
        _buildingOffice = phosphorFillIcon(
            name = "BuildingOffice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 208.000 L 232.000 208.000 L 232.000 96.000 C 236.418 96.000 240.000 92.418 240.000 88.000 C 240.000 83.582 236.418 80.000 232.000 80.000 L 184.000 80.000 L 184.000 48.000 C 188.418 48.000 192.000 44.418 192.000 40.000 C 192.000 35.582 188.418 32.000 184.000 32.000 L 40.000 32.000 C 35.582 32.000 32.000 35.582 32.000 40.000 C 32.000 44.418 35.582 48.000 40.000 48.000 L 40.000 208.000 L 24.000 208.000 C 19.582 208.000 16.000 211.582 16.000 216.000 C 16.000 220.418 19.582 224.000 24.000 224.000 L 248.000 224.000 C 252.418 224.000 256.000 220.418 256.000 216.000 C 256.000 211.582 252.418 208.000 248.000 208.000 ZM 80.000 72.000 L 96.000 72.000 C 100.418 72.000 104.000 75.582 104.000 80.000 C 104.000 84.418 100.418 88.000 96.000 88.000 L 80.000 88.000 C 75.582 88.000 72.000 84.418 72.000 80.000 C 72.000 75.582 75.582 72.000 80.000 72.000 ZM 72.000 120.000 C 72.000 115.582 75.582 112.000 80.000 112.000 L 96.000 112.000 C 100.418 112.000 104.000 115.582 104.000 120.000 C 104.000 124.418 100.418 128.000 96.000 128.000 L 80.000 128.000 C 75.582 128.000 72.000 124.418 72.000 120.000 ZM 136.000 208.000 L 88.000 208.000 L 88.000 160.000 L 136.000 160.000 ZM 144.000 128.000 L 128.000 128.000 C 123.582 128.000 120.000 124.418 120.000 120.000 C 120.000 115.582 123.582 112.000 128.000 112.000 L 144.000 112.000 C 148.418 112.000 152.000 115.582 152.000 120.000 C 152.000 124.418 148.418 128.000 144.000 128.000 ZM 144.000 88.000 L 128.000 88.000 C 123.582 88.000 120.000 84.418 120.000 80.000 C 120.000 75.582 123.582 72.000 128.000 72.000 L 144.000 72.000 C 148.418 72.000 152.000 75.582 152.000 80.000 C 152.000 84.418 148.418 88.000 144.000 88.000 ZM 216.000 208.000 L 184.000 208.000 L 184.000 96.000 L 216.000 96.000 Z"),
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
