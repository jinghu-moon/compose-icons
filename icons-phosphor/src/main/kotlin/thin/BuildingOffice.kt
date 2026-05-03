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
                pathData = parseSvgPathData("M 248.000 212.000 L 228.000 212.000 L 228.000 92.000 L 232.000 92.000 C 234.209 92.000 236.000 90.209 236.000 88.000 C 236.000 85.791 234.209 84.000 232.000 84.000 L 180.000 84.000 L 180.000 44.000 L 184.000 44.000 C 186.209 44.000 188.000 42.209 188.000 40.000 C 188.000 37.791 186.209 36.000 184.000 36.000 L 40.000 36.000 C 37.791 36.000 36.000 37.791 36.000 40.000 C 36.000 42.209 37.791 44.000 40.000 44.000 L 44.000 44.000 L 44.000 212.000 L 24.000 212.000 C 21.791 212.000 20.000 213.791 20.000 216.000 C 20.000 218.209 21.791 220.000 24.000 220.000 L 248.000 220.000 C 250.209 220.000 252.000 218.209 252.000 216.000 C 252.000 213.791 250.209 212.000 248.000 212.000 ZM 220.000 92.000 L 220.000 212.000 L 180.000 212.000 L 180.000 92.000 ZM 52.000 44.000 L 172.000 44.000 L 172.000 212.000 L 140.000 212.000 L 140.000 160.000 C 140.000 157.791 138.209 156.000 136.000 156.000 L 88.000 156.000 C 85.791 156.000 84.000 157.791 84.000 160.000 L 84.000 212.000 L 52.000 212.000 ZM 132.000 212.000 L 92.000 212.000 L 92.000 164.000 L 132.000 164.000 ZM 76.000 80.000 C 76.000 77.791 77.791 76.000 80.000 76.000 L 96.000 76.000 C 98.209 76.000 100.000 77.791 100.000 80.000 C 100.000 82.209 98.209 84.000 96.000 84.000 L 80.000 84.000 C 77.791 84.000 76.000 82.209 76.000 80.000 ZM 124.000 80.000 C 124.000 77.791 125.791 76.000 128.000 76.000 L 144.000 76.000 C 146.209 76.000 148.000 77.791 148.000 80.000 C 148.000 82.209 146.209 84.000 144.000 84.000 L 128.000 84.000 C 125.791 84.000 124.000 82.209 124.000 80.000 ZM 80.000 124.000 C 77.791 124.000 76.000 122.209 76.000 120.000 C 76.000 117.791 77.791 116.000 80.000 116.000 L 96.000 116.000 C 98.209 116.000 100.000 117.791 100.000 120.000 C 100.000 122.209 98.209 124.000 96.000 124.000 ZM 124.000 120.000 C 124.000 117.791 125.791 116.000 128.000 116.000 L 144.000 116.000 C 146.209 116.000 148.000 117.791 148.000 120.000 C 148.000 122.209 146.209 124.000 144.000 124.000 L 128.000 124.000 C 125.791 124.000 124.000 122.209 124.000 120.000 Z"),
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
