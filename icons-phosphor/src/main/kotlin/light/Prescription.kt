package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Prescription: ImageVector
    get() {
        if (_prescription != null) return _prescription!!
        _prescription = phosphorLightIcon(
            name = "Prescription",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.490 188.000 L 204.240 164.240 C 206.443 161.876 206.378 158.192 204.093 155.907 C 201.808 153.622 198.124 153.557 195.760 155.760 L 172.000 179.510 L 126.420 133.940 C 153.519 132.611 174.614 109.913 173.957 82.790 C 173.300 55.666 151.132 34.016 124.000 34.000 L 72.000 34.000 C 68.686 34.000 66.000 36.686 66.000 40.000 L 66.000 192.000 C 66.000 195.314 68.686 198.000 72.000 198.000 C 75.314 198.000 78.000 195.314 78.000 192.000 L 78.000 134.000 L 109.510 134.000 L 163.510 188.000 L 139.760 211.760 C 138.155 213.256 137.494 215.508 138.037 217.634 C 138.580 219.760 140.240 221.420 142.366 221.963 C 144.492 222.506 146.744 221.845 148.240 220.240 L 172.000 196.490 L 195.760 220.240 C 198.124 222.443 201.808 222.378 204.093 220.093 C 206.378 217.808 206.443 214.124 204.240 211.760 ZM 78.000 46.000 L 124.000 46.000 C 144.987 46.000 162.000 63.013 162.000 84.000 C 162.000 104.987 144.987 122.000 124.000 122.000 L 78.000 122.000 Z"),
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
        return _prescription!!
    }

private var _prescription: ImageVector? = null
