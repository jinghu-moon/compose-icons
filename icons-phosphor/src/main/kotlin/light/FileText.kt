package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileText: ImageVector
    get() {
        if (_fileText != null) return _fileText!!
        _fileText = phosphorLightIcon(
            name = "FileText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.240 83.760 L 156.240 27.760 C 155.116 26.634 153.591 26.001 152.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 216.000 C 42.000 223.732 48.268 230.000 56.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 88.000 C 213.999 86.409 213.366 84.884 212.240 83.760 ZM 158.000 46.480 L 193.520 82.000 L 158.000 82.000 ZM 200.000 218.000 L 56.000 218.000 C 54.895 218.000 54.000 217.105 54.000 216.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 L 146.000 38.000 L 146.000 88.000 C 146.000 91.314 148.686 94.000 152.000 94.000 L 202.000 94.000 L 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 ZM 166.000 136.000 C 166.000 139.314 163.314 142.000 160.000 142.000 L 96.000 142.000 C 92.686 142.000 90.000 139.314 90.000 136.000 C 90.000 132.686 92.686 130.000 96.000 130.000 L 160.000 130.000 C 163.314 130.000 166.000 132.686 166.000 136.000 ZM 166.000 168.000 C 166.000 171.314 163.314 174.000 160.000 174.000 L 96.000 174.000 C 92.686 174.000 90.000 171.314 90.000 168.000 C 90.000 164.686 92.686 162.000 96.000 162.000 L 160.000 162.000 C 163.314 162.000 166.000 164.686 166.000 168.000 Z"),
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
        return _fileText!!
    }

private var _fileText: ImageVector? = null
