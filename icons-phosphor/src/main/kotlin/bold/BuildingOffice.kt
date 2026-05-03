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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 204.000 L 232.000 204.000 L 232.000 99.300 C 237.489 97.338 240.775 91.715 239.789 85.970 C 238.802 80.224 233.829 76.019 228.000 76.000 L 188.000 76.000 L 188.000 51.300 C 193.489 49.338 196.775 43.715 195.789 37.970 C 194.802 32.224 189.829 28.019 184.000 28.000 L 40.000 28.000 C 34.171 28.019 29.198 32.224 28.211 37.970 C 27.225 43.715 30.511 49.338 36.000 51.300 L 36.000 204.000 L 24.000 204.000 C 17.373 204.000 12.000 209.373 12.000 216.000 C 12.000 222.627 17.373 228.000 24.000 228.000 L 244.000 228.000 C 250.627 228.000 256.000 222.627 256.000 216.000 C 256.000 209.373 250.627 204.000 244.000 204.000 ZM 208.000 100.000 L 208.000 204.000 L 188.000 204.000 L 188.000 100.000 ZM 60.000 52.000 L 164.000 52.000 L 164.000 204.000 L 148.000 204.000 L 148.000 160.000 C 148.000 153.373 142.627 148.000 136.000 148.000 L 88.000 148.000 C 81.373 148.000 76.000 153.373 76.000 160.000 L 76.000 204.000 L 60.000 204.000 ZM 124.000 204.000 L 100.000 204.000 L 100.000 172.000 L 124.000 172.000 ZM 72.000 80.000 C 72.000 73.373 77.373 68.000 84.000 68.000 L 92.000 68.000 C 98.627 68.000 104.000 73.373 104.000 80.000 C 104.000 86.627 98.627 92.000 92.000 92.000 L 84.000 92.000 C 77.373 92.000 72.000 86.627 72.000 80.000 ZM 120.000 80.000 C 120.000 73.373 125.373 68.000 132.000 68.000 L 140.000 68.000 C 146.627 68.000 152.000 73.373 152.000 80.000 C 152.000 86.627 146.627 92.000 140.000 92.000 L 132.000 92.000 C 125.373 92.000 120.000 86.627 120.000 80.000 ZM 72.000 120.000 C 72.000 113.373 77.373 108.000 84.000 108.000 L 92.000 108.000 C 98.627 108.000 104.000 113.373 104.000 120.000 C 104.000 126.627 98.627 132.000 92.000 132.000 L 84.000 132.000 C 77.373 132.000 72.000 126.627 72.000 120.000 ZM 120.000 120.000 C 120.000 113.373 125.373 108.000 132.000 108.000 L 140.000 108.000 C 146.627 108.000 152.000 113.373 152.000 120.000 C 152.000 126.627 146.627 132.000 140.000 132.000 L 132.000 132.000 C 125.373 132.000 120.000 126.627 120.000 120.000 Z"),
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
        return _buildingOffice!!
    }

private var _buildingOffice: ImageVector? = null
