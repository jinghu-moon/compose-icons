package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileZip: ImageVector
    get() {
        if (_fileZip != null) return _fileZip!!
        _fileZip = phosphorLightIcon(
            name = "FileZip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 146.000 L 168.000 146.000 C 164.686 146.000 162.000 148.686 162.000 152.000 L 162.000 208.000 C 162.000 211.314 164.686 214.000 168.000 214.000 C 171.314 214.000 174.000 211.314 174.000 208.000 L 174.000 198.000 L 184.000 198.000 C 198.359 198.000 210.000 186.359 210.000 172.000 C 210.000 157.641 198.359 146.000 184.000 146.000 ZM 184.000 186.000 L 174.000 186.000 L 174.000 158.000 L 184.000 158.000 C 191.732 158.000 198.000 164.268 198.000 172.000 C 198.000 179.732 191.732 186.000 184.000 186.000 ZM 134.000 152.000 L 134.000 208.000 C 134.000 211.314 131.314 214.000 128.000 214.000 C 124.686 214.000 122.000 211.314 122.000 208.000 L 122.000 152.000 C 122.000 148.686 124.686 146.000 128.000 146.000 C 131.314 146.000 134.000 148.686 134.000 152.000 ZM 94.000 208.000 C 94.000 211.314 91.314 214.000 88.000 214.000 L 56.000 214.000 C 53.854 214.005 51.869 212.863 50.793 211.006 C 49.718 209.149 49.717 206.859 50.790 205.000 L 77.660 158.000 L 56.000 158.000 C 52.686 158.000 50.000 155.314 50.000 152.000 C 50.000 148.686 52.686 146.000 56.000 146.000 L 88.000 146.000 C 90.146 145.995 92.131 147.137 93.207 148.994 C 94.282 150.851 94.283 153.141 93.210 155.000 L 66.340 202.000 L 88.000 202.000 C 91.314 202.000 94.000 204.686 94.000 208.000 ZM 212.240 83.760 L 156.240 27.760 C 155.116 26.634 153.591 26.001 152.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 112.000 C 42.000 115.314 44.686 118.000 48.000 118.000 C 51.314 118.000 54.000 115.314 54.000 112.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 L 146.000 38.000 L 146.000 88.000 C 146.000 91.314 148.686 94.000 152.000 94.000 L 202.000 94.000 L 202.000 112.000 C 202.000 115.314 204.686 118.000 208.000 118.000 C 211.314 118.000 214.000 115.314 214.000 112.000 L 214.000 88.000 C 213.999 86.409 213.366 84.884 212.240 83.760 ZM 158.000 82.000 L 158.000 46.480 L 193.520 82.000 Z"),
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
        return _fileZip!!
    }

private var _fileZip: ImageVector? = null
