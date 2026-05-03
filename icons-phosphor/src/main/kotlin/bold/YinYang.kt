package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.YinYang: ImageVector
    get() {
        if (_yinYang != null) return _yinYang!!
        _yinYang = phosphorBoldIcon(
            name = "YinYang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 44.000 128.000 C 44.050 81.629 81.629 44.050 128.000 44.000 C 147.882 44.000 164.000 60.118 164.000 80.000 C 164.000 99.882 147.882 116.000 128.000 116.000 C 110.000 115.999 92.951 124.080 81.555 138.012 C 70.159 151.945 65.620 170.258 69.190 187.900 C 53.072 172.139 43.990 150.544 44.000 128.000 ZM 128.000 212.000 C 108.118 212.000 92.000 195.882 92.000 176.000 C 92.000 156.118 108.118 140.000 128.000 140.000 C 146.000 140.001 163.049 131.920 174.445 117.988 C 185.841 104.055 190.380 85.742 186.810 68.100 C 211.182 91.977 218.676 128.232 205.769 159.816 C 192.861 191.399 162.120 212.027 128.000 212.000 ZM 144.000 176.000 C 144.000 184.837 136.837 192.000 128.000 192.000 C 119.163 192.000 112.000 184.837 112.000 176.000 C 112.000 167.163 119.163 160.000 128.000 160.000 C 136.837 160.000 144.000 167.163 144.000 176.000 ZM 112.000 80.000 C 112.000 71.163 119.163 64.000 128.000 64.000 C 136.837 64.000 144.000 71.163 144.000 80.000 C 144.000 88.837 136.837 96.000 128.000 96.000 C 119.163 96.000 112.000 88.837 112.000 80.000 Z"),
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
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
