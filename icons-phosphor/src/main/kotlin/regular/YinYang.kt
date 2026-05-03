package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.YinYang: ImageVector
    get() {
        if (_yinYang != null) return _yinYang!!
        _yinYang = phosphorRegularIcon(
            name = "YinYang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 40.000 128.000 C 40.055 79.422 79.422 40.055 128.000 40.000 C 150.091 40.000 168.000 57.909 168.000 80.000 C 168.000 102.091 150.091 120.000 128.000 120.000 C 108.796 119.995 90.929 129.832 80.661 146.061 C 70.394 162.290 69.160 182.649 77.390 200.000 C 53.947 183.519 39.997 156.656 40.000 128.000 ZM 128.000 216.000 C 105.909 216.000 88.000 198.091 88.000 176.000 C 88.000 153.909 105.909 136.000 128.000 136.000 C 147.190 135.997 165.042 126.167 175.306 109.952 C 185.571 93.738 186.817 73.397 178.610 56.050 C 209.968 78.132 223.413 117.981 211.843 154.547 C 200.273 191.113 166.353 215.975 128.000 216.000 ZM 140.000 176.000 C 140.000 182.627 134.627 188.000 128.000 188.000 C 121.373 188.000 116.000 182.627 116.000 176.000 C 116.000 169.373 121.373 164.000 128.000 164.000 C 134.627 164.000 140.000 169.373 140.000 176.000 ZM 116.000 80.000 C 116.000 73.373 121.373 68.000 128.000 68.000 C 134.627 68.000 140.000 73.373 140.000 80.000 C 140.000 86.627 134.627 92.000 128.000 92.000 C 121.373 92.000 116.000 86.627 116.000 80.000 Z"),
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
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
