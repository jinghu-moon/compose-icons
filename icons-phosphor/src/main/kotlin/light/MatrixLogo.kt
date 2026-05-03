package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MatrixLogo: ImageVector
    get() {
        if (_matrixLogo != null) return _matrixLogo!!
        _matrixLogo = phosphorLightIcon(
            name = "MatrixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 46.000 46.000 L 46.000 210.000 L 64.000 210.000 C 67.314 210.000 70.000 212.686 70.000 216.000 C 70.000 219.314 67.314 222.000 64.000 222.000 L 40.000 222.000 C 36.686 222.000 34.000 219.314 34.000 216.000 L 34.000 40.000 C 34.000 36.686 36.686 34.000 40.000 34.000 L 64.000 34.000 C 67.314 34.000 70.000 36.686 70.000 40.000 C 70.000 43.314 67.314 46.000 64.000 46.000 ZM 216.000 34.000 L 192.000 34.000 C 188.686 34.000 186.000 36.686 186.000 40.000 C 186.000 43.314 188.686 46.000 192.000 46.000 L 210.000 46.000 L 210.000 210.000 L 192.000 210.000 C 188.686 210.000 186.000 212.686 186.000 216.000 C 186.000 219.314 188.686 222.000 192.000 222.000 L 216.000 222.000 C 219.314 222.000 222.000 219.314 222.000 216.000 L 222.000 40.000 C 222.000 36.686 219.314 34.000 216.000 34.000 ZM 152.000 90.000 C 142.557 90.000 133.666 94.446 128.000 102.000 C 118.059 88.745 99.255 86.059 86.000 96.000 L 86.000 96.000 C 86.000 92.686 83.314 90.000 80.000 90.000 C 76.686 90.000 74.000 92.686 74.000 96.000 L 74.000 160.000 C 74.000 163.314 76.686 166.000 80.000 166.000 C 83.314 166.000 86.000 163.314 86.000 160.000 L 86.000 120.000 C 86.000 110.059 94.059 102.000 104.000 102.000 C 113.941 102.000 122.000 110.059 122.000 120.000 L 122.000 160.000 C 122.000 163.314 124.686 166.000 128.000 166.000 C 131.314 166.000 134.000 163.314 134.000 160.000 L 134.000 120.000 C 134.000 110.059 142.059 102.000 152.000 102.000 C 161.941 102.000 170.000 110.059 170.000 120.000 L 170.000 160.000 C 170.000 163.314 172.686 166.000 176.000 166.000 C 179.314 166.000 182.000 163.314 182.000 160.000 L 182.000 120.000 C 182.000 103.431 168.569 90.000 152.000 90.000 Z"),
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
        return _matrixLogo!!
    }

private var _matrixLogo: ImageVector? = null
