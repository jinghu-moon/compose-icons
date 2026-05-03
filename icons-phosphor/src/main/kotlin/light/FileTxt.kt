package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileTxt: ImageVector
    get() {
        if (_fileTxt != null) return _fileTxt!!
        _fileTxt = phosphorLightIcon(
            name = "FileTxt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 48.000 118.000 C 51.314 118.000 54.000 115.314 54.000 112.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 L 146.000 38.000 L 146.000 88.000 C 146.000 91.314 148.686 94.000 152.000 94.000 L 202.000 94.000 L 202.000 112.000 C 202.000 115.314 204.686 118.000 208.000 118.000 C 211.314 118.000 214.000 115.314 214.000 112.000 L 214.000 88.000 C 213.999 86.409 213.366 84.884 212.240 83.760 L 156.240 27.760 C 155.116 26.634 153.591 26.001 152.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 112.000 C 42.000 115.314 44.686 118.000 48.000 118.000 ZM 158.000 46.480 L 193.520 82.000 L 158.000 82.000 ZM 152.880 155.480 L 135.370 180.000 L 152.880 204.510 C 154.813 207.205 154.195 210.957 151.500 212.890 C 148.805 214.823 145.053 214.205 143.120 211.510 L 128.000 190.320 L 112.880 211.490 C 110.947 214.185 107.195 214.803 104.500 212.870 C 101.805 210.937 101.187 207.185 103.120 204.490 L 120.630 180.000 L 103.120 155.490 C 101.187 152.795 101.805 149.043 104.500 147.110 C 107.195 145.177 110.947 145.795 112.880 148.490 L 128.000 169.680 L 143.120 148.510 C 145.053 145.815 148.805 145.197 151.500 147.130 C 154.195 149.063 154.813 152.815 152.880 155.510 ZM 90.000 152.000 C 90.000 155.314 87.314 158.000 84.000 158.000 L 70.000 158.000 L 70.000 208.000 C 70.000 211.314 67.314 214.000 64.000 214.000 C 60.686 214.000 58.000 211.314 58.000 208.000 L 58.000 158.000 L 44.000 158.000 C 40.686 158.000 38.000 155.314 38.000 152.000 C 38.000 148.686 40.686 146.000 44.000 146.000 L 84.000 146.000 C 87.314 146.000 90.000 148.686 90.000 152.000 ZM 218.000 152.000 C 218.000 155.314 215.314 158.000 212.000 158.000 L 198.000 158.000 L 198.000 208.000 C 198.000 211.314 195.314 214.000 192.000 214.000 C 188.686 214.000 186.000 211.314 186.000 208.000 L 186.000 158.000 L 172.000 158.000 C 168.686 158.000 166.000 155.314 166.000 152.000 C 166.000 148.686 168.686 146.000 172.000 146.000 L 212.000 146.000 C 215.314 146.000 218.000 148.686 218.000 152.000 Z"),
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
        return _fileTxt!!
    }

private var _fileTxt: ImageVector? = null
