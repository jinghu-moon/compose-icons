package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.XSquare: ImageVector
    get() {
        if (_xSquare != null) return _xSquare!!
        _xSquare = phosphorBoldIcon(
            name = "XSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 87.510 151.510 L 111.000 128.000 L 87.510 104.490 C 82.816 99.796 82.816 92.184 87.510 87.490 C 92.204 82.796 99.816 82.796 104.510 87.490 L 128.000 111.000 L 151.510 87.480 C 156.204 82.786 163.816 82.786 168.510 87.480 C 173.204 92.174 173.204 99.786 168.510 104.480 L 145.000 128.000 L 168.520 151.510 C 173.214 156.204 173.214 163.816 168.520 168.510 C 163.826 173.204 156.214 173.204 151.520 168.510 L 128.000 145.000 L 104.490 168.520 C 99.796 173.214 92.184 173.214 87.490 168.520 C 82.796 163.826 82.796 156.214 87.490 151.520 Z"),
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
        return _xSquare!!
    }

private var _xSquare: ImageVector? = null
