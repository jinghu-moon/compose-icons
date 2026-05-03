package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UploadSimple: ImageVector
    get() {
        if (_uploadSimple != null) return _uploadSimple!!
        _uploadSimple = phosphorLightIcon(
            name = "UploadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 144.000 L 222.000 208.000 C 222.000 211.314 219.314 214.000 216.000 214.000 L 40.000 214.000 C 36.686 214.000 34.000 211.314 34.000 208.000 L 34.000 144.000 C 34.000 140.686 36.686 138.000 40.000 138.000 C 43.314 138.000 46.000 140.686 46.000 144.000 L 46.000 202.000 L 210.000 202.000 L 210.000 144.000 C 210.000 140.686 212.686 138.000 216.000 138.000 C 219.314 138.000 222.000 140.686 222.000 144.000 ZM 92.240 76.240 L 122.000 46.490 L 122.000 144.000 C 122.000 147.314 124.686 150.000 128.000 150.000 C 131.314 150.000 134.000 147.314 134.000 144.000 L 134.000 46.490 L 163.760 76.240 C 166.124 78.443 169.808 78.378 172.093 76.093 C 174.378 73.808 174.443 70.124 172.240 67.760 L 132.240 27.760 C 129.897 25.420 126.103 25.420 123.760 27.760 L 83.760 67.760 C 81.557 70.124 81.622 73.808 83.907 76.093 C 86.192 78.378 89.876 78.443 92.240 76.240 Z"),
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
        return _uploadSimple!!
    }

private var _uploadSimple: ImageVector? = null
