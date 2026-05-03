package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FilePy: ImageVector
    get() {
        if (_filePy != null) return _filePy!!
        _filePy = phosphorLightIcon(
            name = "FilePy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.240 83.760 L 156.240 27.760 C 155.116 26.634 153.591 26.001 152.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 112.000 C 42.000 115.314 44.686 118.000 48.000 118.000 C 51.314 118.000 54.000 115.314 54.000 112.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 L 146.000 38.000 L 146.000 88.000 C 146.000 91.314 148.686 94.000 152.000 94.000 L 202.000 94.000 L 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 L 168.000 218.000 C 164.686 218.000 162.000 220.686 162.000 224.000 C 162.000 227.314 164.686 230.000 168.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 88.000 C 213.999 86.409 213.366 84.884 212.240 83.760 ZM 158.000 46.480 L 193.520 82.000 L 158.000 82.000 ZM 64.000 146.000 L 48.000 146.000 C 44.686 146.000 42.000 148.686 42.000 152.000 L 42.000 208.000 C 42.000 211.314 44.686 214.000 48.000 214.000 C 51.314 214.000 54.000 211.314 54.000 208.000 L 54.000 198.000 L 64.000 198.000 C 78.359 198.000 90.000 186.359 90.000 172.000 C 90.000 157.641 78.359 146.000 64.000 146.000 ZM 64.000 186.000 L 54.000 186.000 L 54.000 158.000 L 64.000 158.000 C 71.732 158.000 78.000 164.268 78.000 172.000 C 78.000 179.732 71.732 186.000 64.000 186.000 ZM 153.090 155.180 L 134.000 185.720 L 134.000 208.000 C 134.000 211.314 131.314 214.000 128.000 214.000 C 124.686 214.000 122.000 211.314 122.000 208.000 L 122.000 185.720 L 102.910 155.180 C 101.154 152.369 102.009 148.666 104.820 146.910 C 107.631 145.154 111.334 146.009 113.090 148.820 L 128.000 172.680 L 142.910 148.820 C 144.666 146.009 148.369 145.154 151.180 146.910 C 153.991 148.666 154.846 152.369 153.090 155.180 Z"),
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
        return _filePy!!
    }

private var _filePy: ImageVector? = null
