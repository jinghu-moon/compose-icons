package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberEight: ImageVector
    get() {
        if (_numberEight != null) return _numberEight!!
        _numberEight = phosphorFillIcon(
            name = "NumberEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 108.000 92.000 C 108.000 80.954 116.954 72.000 128.000 72.000 C 139.046 72.000 148.000 80.954 148.000 92.000 C 148.000 103.046 139.046 112.000 128.000 112.000 C 116.954 112.000 108.000 103.046 108.000 92.000 ZM 128.000 128.000 C 112.536 128.000 100.000 140.536 100.000 156.000 C 100.000 171.464 112.536 184.000 128.000 184.000 C 143.464 184.000 156.000 171.464 156.000 156.000 C 156.000 140.536 143.464 128.000 128.000 128.000 ZM 216.000 40.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 56.000 232.000 C 47.163 232.000 40.000 224.837 40.000 216.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 200.000 24.000 C 208.837 24.000 216.000 31.163 216.000 40.000 ZM 172.000 156.000 C 171.991 141.028 164.369 127.088 151.770 119.000 C 163.022 109.107 166.971 93.280 161.685 79.261 C 156.398 65.243 142.982 55.963 128.000 55.963 C 113.018 55.963 99.601 65.243 94.315 79.261 C 89.029 93.280 92.978 109.107 104.230 119.000 C 86.477 130.397 79.312 152.789 87.150 172.375 C 94.988 191.961 115.624 203.227 136.338 199.230 C 157.051 195.232 172.013 177.096 172.000 156.000 Z"),
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
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
