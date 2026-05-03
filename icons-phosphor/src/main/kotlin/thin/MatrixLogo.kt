package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MatrixLogo: ImageVector
    get() {
        if (_matrixLogo != null) return _matrixLogo!!
        _matrixLogo = phosphorThinIcon(
            name = "MatrixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 44.000 44.000 L 44.000 212.000 L 64.000 212.000 C 66.209 212.000 68.000 213.791 68.000 216.000 C 68.000 218.209 66.209 220.000 64.000 220.000 L 40.000 220.000 C 37.791 220.000 36.000 218.209 36.000 216.000 L 36.000 40.000 C 36.000 37.791 37.791 36.000 40.000 36.000 L 64.000 36.000 C 66.209 36.000 68.000 37.791 68.000 40.000 C 68.000 42.209 66.209 44.000 64.000 44.000 ZM 216.000 36.000 L 192.000 36.000 C 189.791 36.000 188.000 37.791 188.000 40.000 C 188.000 42.209 189.791 44.000 192.000 44.000 L 212.000 44.000 L 212.000 212.000 L 192.000 212.000 C 189.791 212.000 188.000 213.791 188.000 216.000 C 188.000 218.209 189.791 220.000 192.000 220.000 L 216.000 220.000 C 218.209 220.000 220.000 218.209 220.000 216.000 L 220.000 40.000 C 220.000 37.791 218.209 36.000 216.000 36.000 ZM 152.000 92.000 C 142.167 92.005 133.057 97.167 128.000 105.600 C 123.534 98.170 115.879 93.227 107.269 92.216 C 98.659 91.204 90.067 94.238 84.000 100.430 L 84.000 96.000 C 84.000 93.791 82.209 92.000 80.000 92.000 C 77.791 92.000 76.000 93.791 76.000 96.000 L 76.000 160.000 C 76.000 162.209 77.791 164.000 80.000 164.000 C 82.209 164.000 84.000 162.209 84.000 160.000 L 84.000 120.000 C 84.000 108.954 92.954 100.000 104.000 100.000 C 115.046 100.000 124.000 108.954 124.000 120.000 L 124.000 160.000 C 124.000 162.209 125.791 164.000 128.000 164.000 C 130.209 164.000 132.000 162.209 132.000 160.000 L 132.000 120.000 C 132.000 108.954 140.954 100.000 152.000 100.000 C 163.046 100.000 172.000 108.954 172.000 120.000 L 172.000 160.000 C 172.000 162.209 173.791 164.000 176.000 164.000 C 178.209 164.000 180.000 162.209 180.000 160.000 L 180.000 120.000 C 180.000 104.536 167.464 92.000 152.000 92.000 Z"),
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
