package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Briefcase: ImageVector
    get() {
        if (_briefcase != null) return _briefcase!!
        _briefcase = phosphorBoldIcon(
            name = "Briefcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 100.000 100.000 C 100.000 93.373 105.373 88.000 112.000 88.000 L 144.000 88.000 C 150.627 88.000 156.000 93.373 156.000 100.000 C 156.000 106.627 150.627 112.000 144.000 112.000 L 112.000 112.000 C 105.373 112.000 100.000 106.627 100.000 100.000 ZM 236.000 68.000 L 236.000 196.000 C 236.000 207.046 227.046 216.000 216.000 216.000 L 40.000 216.000 C 28.954 216.000 20.000 207.046 20.000 196.000 L 20.000 68.000 C 20.000 56.954 28.954 48.000 40.000 48.000 L 76.000 48.000 L 76.000 40.000 C 76.000 24.536 88.536 12.000 104.000 12.000 L 152.000 12.000 C 167.464 12.000 180.000 24.536 180.000 40.000 L 180.000 48.000 L 216.000 48.000 C 227.046 48.000 236.000 56.954 236.000 68.000 ZM 100.000 48.000 L 156.000 48.000 L 156.000 40.000 C 156.000 37.791 154.209 36.000 152.000 36.000 L 104.000 36.000 C 101.791 36.000 100.000 37.791 100.000 40.000 ZM 44.000 72.000 L 44.000 107.230 C 69.895 120.878 98.728 128.007 128.000 128.000 C 157.273 128.007 186.106 120.874 212.000 107.220 L 212.000 72.000 ZM 212.000 192.000 L 212.000 133.940 C 185.597 145.847 156.964 152.003 128.000 152.000 C 99.036 152.005 70.402 145.849 44.000 133.940 L 44.000 192.000 Z"),
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
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
