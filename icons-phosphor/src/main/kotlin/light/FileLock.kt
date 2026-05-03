package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileLock: ImageVector
    get() {
        if (_fileLock != null) return _fileLock!!
        _fileLock = phosphorLightIcon(
            name = "FileLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 178.000 L 110.000 178.000 L 110.000 172.000 C 110.000 157.641 98.359 146.000 84.000 146.000 C 69.641 146.000 58.000 157.641 58.000 172.000 L 58.000 178.000 L 48.000 178.000 C 44.686 178.000 42.000 180.686 42.000 184.000 L 42.000 224.000 C 42.000 227.314 44.686 230.000 48.000 230.000 L 120.000 230.000 C 123.314 230.000 126.000 227.314 126.000 224.000 L 126.000 184.000 C 126.000 180.686 123.314 178.000 120.000 178.000 ZM 70.000 172.000 C 70.000 164.268 76.268 158.000 84.000 158.000 C 91.732 158.000 98.000 164.268 98.000 172.000 L 98.000 178.000 L 70.000 178.000 ZM 114.000 218.000 L 54.000 218.000 L 54.000 190.000 L 114.000 190.000 ZM 212.240 83.760 L 156.240 27.760 C 155.116 26.634 153.591 26.001 152.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 128.000 C 42.000 131.314 44.686 134.000 48.000 134.000 C 51.314 134.000 54.000 131.314 54.000 128.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 L 146.000 38.000 L 146.000 88.000 C 146.000 91.314 148.686 94.000 152.000 94.000 L 202.000 94.000 L 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 L 160.000 218.000 C 156.686 218.000 154.000 220.686 154.000 224.000 C 154.000 227.314 156.686 230.000 160.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 88.000 C 213.999 86.409 213.366 84.884 212.240 83.760 ZM 158.000 46.480 L 193.520 82.000 L 158.000 82.000 Z"),
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
        return _fileLock!!
    }

private var _fileLock: ImageVector? = null
