package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) return _cellSignalX!!
        _cellSignalX = phosphorLightIcon(
            name = "CellSignalX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.240 195.760 C 213.845 197.256 214.506 199.508 213.963 201.634 C 213.420 203.760 211.760 205.420 209.634 205.963 C 207.508 206.506 205.256 205.845 203.760 204.240 L 184.000 184.480 L 164.240 204.240 C 161.876 206.443 158.192 206.378 155.907 204.093 C 153.622 201.808 153.557 198.124 155.760 195.760 L 175.520 176.000 L 155.760 156.240 C 153.557 153.876 153.622 150.192 155.907 147.907 C 158.192 145.622 161.876 145.557 164.240 147.760 L 184.000 167.520 L 203.760 147.760 C 206.124 145.557 209.808 145.622 212.093 147.907 C 214.378 150.192 214.443 153.876 212.240 156.240 L 192.480 176.000 ZM 160.000 118.000 C 163.314 118.000 166.000 115.314 166.000 112.000 L 166.000 72.000 C 166.000 68.686 163.314 66.000 160.000 66.000 C 156.686 66.000 154.000 68.686 154.000 72.000 L 154.000 112.000 C 154.000 115.314 156.686 118.000 160.000 118.000 ZM 200.000 118.000 C 203.314 118.000 206.000 115.314 206.000 112.000 L 206.000 32.000 C 206.000 28.686 203.314 26.000 200.000 26.000 C 196.686 26.000 194.000 28.686 194.000 32.000 L 194.000 112.000 C 194.000 115.314 196.686 118.000 200.000 118.000 ZM 120.000 106.000 C 116.686 106.000 114.000 108.686 114.000 112.000 L 114.000 200.000 C 114.000 203.314 116.686 206.000 120.000 206.000 C 123.314 206.000 126.000 203.314 126.000 200.000 L 126.000 112.000 C 126.000 108.686 123.314 106.000 120.000 106.000 ZM 80.000 146.000 C 76.686 146.000 74.000 148.686 74.000 152.000 L 74.000 200.000 C 74.000 203.314 76.686 206.000 80.000 206.000 C 83.314 206.000 86.000 203.314 86.000 200.000 L 86.000 152.000 C 86.000 148.686 83.314 146.000 80.000 146.000 ZM 40.000 186.000 C 36.686 186.000 34.000 188.686 34.000 192.000 L 34.000 200.000 C 34.000 203.314 36.686 206.000 40.000 206.000 C 43.314 206.000 46.000 203.314 46.000 200.000 L 46.000 192.000 C 46.000 188.686 43.314 186.000 40.000 186.000 Z"),
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
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
