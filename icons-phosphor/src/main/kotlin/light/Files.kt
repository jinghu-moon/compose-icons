package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = phosphorLightIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.240 67.760 L 172.240 27.760 C 171.116 26.634 169.591 26.001 168.000 26.000 L 88.000 26.000 C 80.268 26.000 74.000 32.268 74.000 40.000 L 74.000 58.000 L 56.000 58.000 C 48.268 58.000 42.000 64.268 42.000 72.000 L 42.000 216.000 C 42.000 223.732 48.268 230.000 56.000 230.000 L 168.000 230.000 C 175.732 230.000 182.000 223.732 182.000 216.000 L 182.000 198.000 L 200.000 198.000 C 207.732 198.000 214.000 191.732 214.000 184.000 L 214.000 72.000 C 213.999 70.409 213.366 68.884 212.240 67.760 ZM 170.000 216.000 C 170.000 217.105 169.105 218.000 168.000 218.000 L 56.000 218.000 C 54.895 218.000 54.000 217.105 54.000 216.000 L 54.000 72.000 C 54.000 70.895 54.895 70.000 56.000 70.000 L 133.510 70.000 L 170.000 106.490 ZM 202.000 184.000 C 202.000 185.105 201.105 186.000 200.000 186.000 L 182.000 186.000 L 182.000 104.000 C 181.999 102.409 181.366 100.884 180.240 99.760 L 140.240 59.760 C 139.116 58.634 137.591 58.001 136.000 58.000 L 86.000 58.000 L 86.000 40.000 C 86.000 38.895 86.895 38.000 88.000 38.000 L 165.510 38.000 L 202.000 74.490 ZM 142.000 152.000 C 142.000 155.314 139.314 158.000 136.000 158.000 L 88.000 158.000 C 84.686 158.000 82.000 155.314 82.000 152.000 C 82.000 148.686 84.686 146.000 88.000 146.000 L 136.000 146.000 C 139.314 146.000 142.000 148.686 142.000 152.000 ZM 142.000 184.000 C 142.000 187.314 139.314 190.000 136.000 190.000 L 88.000 190.000 C 84.686 190.000 82.000 187.314 82.000 184.000 C 82.000 180.686 84.686 178.000 88.000 178.000 L 136.000 178.000 C 139.314 178.000 142.000 180.686 142.000 184.000 Z"),
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
        return _files!!
    }

private var _files: ImageVector? = null
