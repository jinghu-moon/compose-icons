package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.XCircle: ImageVector
    get() {
        if (_xCircle != null) return _xCircle!!
        _xCircle = phosphorBoldIcon(
            name = "XCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.490 104.490 L 145.000 128.000 L 168.520 151.510 C 173.214 156.204 173.214 163.816 168.520 168.510 C 163.826 173.204 156.214 173.204 151.520 168.510 L 128.000 145.000 L 104.490 168.520 C 99.796 173.214 92.184 173.214 87.490 168.520 C 82.796 163.826 82.796 156.214 87.490 151.520 L 111.000 128.000 L 87.510 104.490 C 82.816 99.796 82.816 92.184 87.510 87.490 C 92.204 82.796 99.816 82.796 104.510 87.490 L 128.000 111.000 L 151.510 87.480 C 156.204 82.786 163.816 82.786 168.510 87.480 C 173.204 92.174 173.204 99.786 168.510 104.480 ZM 236.000 128.000 C 236.000 187.647 187.647 236.000 128.000 236.000 C 68.353 236.000 20.000 187.647 20.000 128.000 C 20.000 68.353 68.353 20.000 128.000 20.000 C 187.619 20.066 235.934 68.381 236.000 128.000 ZM 212.000 128.000 C 212.000 81.608 174.392 44.000 128.000 44.000 C 81.608 44.000 44.000 81.608 44.000 128.000 C 44.000 174.392 81.608 212.000 128.000 212.000 C 174.371 211.950 211.950 174.371 212.000 128.000 Z"),
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
        return _xCircle!!
    }

private var _xCircle: ImageVector? = null
