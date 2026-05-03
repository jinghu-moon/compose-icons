package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileArchive: ImageVector
    get() {
        if (_fileArchive != null) return _fileArchive!!
        _fileArchive = phosphorLightIcon(
            name = "FileArchive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.240 83.760 L 156.240 27.760 C 155.116 26.634 153.591 26.001 152.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 216.000 C 42.000 223.732 48.268 230.000 56.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 88.000 C 213.999 86.409 213.366 84.884 212.240 83.760 ZM 158.000 46.480 L 193.520 82.000 L 158.000 82.000 ZM 200.000 218.000 L 110.000 218.000 L 110.000 198.000 L 120.000 198.000 C 123.314 198.000 126.000 195.314 126.000 192.000 C 126.000 188.686 123.314 186.000 120.000 186.000 L 110.000 186.000 L 110.000 166.000 L 120.000 166.000 C 123.314 166.000 126.000 163.314 126.000 160.000 C 126.000 156.686 123.314 154.000 120.000 154.000 L 110.000 154.000 L 110.000 134.000 L 120.000 134.000 C 123.314 134.000 126.000 131.314 126.000 128.000 C 126.000 124.686 123.314 122.000 120.000 122.000 L 110.000 122.000 L 110.000 112.000 C 110.000 108.686 107.314 106.000 104.000 106.000 C 100.686 106.000 98.000 108.686 98.000 112.000 L 98.000 122.000 L 88.000 122.000 C 84.686 122.000 82.000 124.686 82.000 128.000 C 82.000 131.314 84.686 134.000 88.000 134.000 L 98.000 134.000 L 98.000 154.000 L 88.000 154.000 C 84.686 154.000 82.000 156.686 82.000 160.000 C 82.000 163.314 84.686 166.000 88.000 166.000 L 98.000 166.000 L 98.000 186.000 L 88.000 186.000 C 84.686 186.000 82.000 188.686 82.000 192.000 C 82.000 195.314 84.686 198.000 88.000 198.000 L 98.000 198.000 L 98.000 218.000 L 56.000 218.000 C 54.895 218.000 54.000 217.105 54.000 216.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 L 146.000 38.000 L 146.000 88.000 C 146.000 91.314 148.686 94.000 152.000 94.000 L 202.000 94.000 L 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 Z"),
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
        return _fileArchive!!
    }

private var _fileArchive: ImageVector? = null
