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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 210.000 L 230.000 210.000 L 230.000 94.000 L 232.000 94.000 C 235.314 94.000 238.000 91.314 238.000 88.000 C 238.000 84.686 235.314 82.000 232.000 82.000 L 182.000 82.000 L 182.000 46.000 L 184.000 46.000 C 187.314 46.000 190.000 43.314 190.000 40.000 C 190.000 36.686 187.314 34.000 184.000 34.000 L 40.000 34.000 C 36.686 34.000 34.000 36.686 34.000 40.000 C 34.000 43.314 36.686 46.000 40.000 46.000 L 42.000 46.000 L 42.000 210.000 L 24.000 210.000 C 20.686 210.000 18.000 212.686 18.000 216.000 C 18.000 219.314 20.686 222.000 24.000 222.000 L 248.000 222.000 C 251.314 222.000 254.000 219.314 254.000 216.000 C 254.000 212.686 251.314 210.000 248.000 210.000 ZM 218.000 94.000 L 218.000 210.000 L 182.000 210.000 L 182.000 94.000 ZM 54.000 46.000 L 170.000 46.000 L 170.000 210.000 L 142.000 210.000 L 142.000 160.000 C 142.000 156.686 139.314 154.000 136.000 154.000 L 88.000 154.000 C 84.686 154.000 82.000 156.686 82.000 160.000 L 82.000 210.000 L 54.000 210.000 ZM 130.000 210.000 L 94.000 210.000 L 94.000 166.000 L 130.000 166.000 ZM 74.000 80.000 C 74.000 76.686 76.686 74.000 80.000 74.000 L 96.000 74.000 C 99.314 74.000 102.000 76.686 102.000 80.000 C 102.000 83.314 99.314 86.000 96.000 86.000 L 80.000 86.000 C 76.686 86.000 74.000 83.314 74.000 80.000 ZM 122.000 80.000 C 122.000 76.686 124.686 74.000 128.000 74.000 L 144.000 74.000 C 147.314 74.000 150.000 76.686 150.000 80.000 C 150.000 83.314 147.314 86.000 144.000 86.000 L 128.000 86.000 C 124.686 86.000 122.000 83.314 122.000 80.000 ZM 80.000 126.000 C 76.686 126.000 74.000 123.314 74.000 120.000 C 74.000 116.686 76.686 114.000 80.000 114.000 L 96.000 114.000 C 99.314 114.000 102.000 116.686 102.000 120.000 C 102.000 123.314 99.314 126.000 96.000 126.000 ZM 122.000 120.000 C 122.000 116.686 124.686 114.000 128.000 114.000 L 144.000 114.000 C 147.314 114.000 150.000 116.686 150.000 120.000 C 150.000 123.314 147.314 126.000 144.000 126.000 L 128.000 126.000 C 124.686 126.000 122.000 123.314 122.000 120.000 Z"),
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
