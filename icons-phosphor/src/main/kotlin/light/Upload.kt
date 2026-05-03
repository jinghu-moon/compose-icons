package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Upload: ImageVector
    get() {
        if (_upload != null) return _upload!!
        _upload = phosphorLightIcon(
            name = "Upload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.000 136.000 L 238.000 200.000 C 238.000 207.732 231.732 214.000 224.000 214.000 L 32.000 214.000 C 24.268 214.000 18.000 207.732 18.000 200.000 L 18.000 136.000 C 18.000 128.268 24.268 122.000 32.000 122.000 L 80.000 122.000 C 83.314 122.000 86.000 124.686 86.000 128.000 C 86.000 131.314 83.314 134.000 80.000 134.000 L 32.000 134.000 C 30.895 134.000 30.000 134.895 30.000 136.000 L 30.000 200.000 C 30.000 201.105 30.895 202.000 32.000 202.000 L 224.000 202.000 C 225.105 202.000 226.000 201.105 226.000 200.000 L 226.000 136.000 C 226.000 134.895 225.105 134.000 224.000 134.000 L 176.000 134.000 C 172.686 134.000 170.000 131.314 170.000 128.000 C 170.000 124.686 172.686 122.000 176.000 122.000 L 224.000 122.000 C 231.732 122.000 238.000 128.268 238.000 136.000 ZM 84.240 76.240 L 122.000 38.490 L 122.000 128.000 C 122.000 131.314 124.686 134.000 128.000 134.000 C 131.314 134.000 134.000 131.314 134.000 128.000 L 134.000 38.490 L 171.760 76.240 C 174.124 78.443 177.808 78.378 180.093 76.093 C 182.378 73.808 182.443 70.124 180.240 67.760 L 132.240 19.760 C 129.897 17.420 126.103 17.420 123.760 19.760 L 75.760 67.760 C 73.557 70.124 73.622 73.808 75.907 76.093 C 78.192 78.378 81.876 78.443 84.240 76.240 ZM 198.000 168.000 C 198.000 162.477 193.523 158.000 188.000 158.000 C 182.477 158.000 178.000 162.477 178.000 168.000 C 178.000 173.523 182.477 178.000 188.000 178.000 C 193.523 178.000 198.000 173.523 198.000 168.000 Z"),
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
        return _upload!!
    }

private var _upload: ImageVector? = null
