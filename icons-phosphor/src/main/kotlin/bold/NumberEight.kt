package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberEight: ImageVector
    get() {
        if (_numberEight != null) return _numberEight!!
        _numberEight = phosphorBoldIcon(
            name = "NumberEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 162.440 118.910 C 178.635 104.594 184.285 81.752 176.631 61.537 C 168.977 41.322 149.615 27.950 128.000 27.950 C 106.385 27.950 87.023 41.322 79.369 61.537 C 71.715 81.752 77.365 104.594 93.560 118.910 C 72.122 133.938 62.902 161.131 70.782 186.098 C 78.661 211.066 101.819 228.041 128.000 228.041 C 154.181 228.041 177.339 211.066 185.218 186.098 C 193.098 161.131 183.878 133.938 162.440 118.910 ZM 100.000 80.000 C 100.000 64.536 112.536 52.000 128.000 52.000 C 143.464 52.000 156.000 64.536 156.000 80.000 C 156.000 95.464 143.464 108.000 128.000 108.000 C 112.536 108.000 100.000 95.464 100.000 80.000 ZM 128.000 204.000 C 108.118 204.000 92.000 187.882 92.000 168.000 C 92.000 148.118 108.118 132.000 128.000 132.000 C 147.882 132.000 164.000 148.118 164.000 168.000 C 164.000 187.882 147.882 204.000 128.000 204.000 Z"),
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
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
