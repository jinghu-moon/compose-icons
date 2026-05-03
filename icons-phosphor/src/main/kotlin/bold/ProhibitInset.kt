package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ProhibitInset: ImageVector
    get() {
        if (_prohibitInset != null) return _prohibitInset!!
        _prohibitInset = phosphorBoldIcon(
            name = "ProhibitInset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.490 151.510 C 173.184 156.204 173.184 163.816 168.490 168.510 C 163.796 173.204 156.184 173.204 151.490 168.510 L 87.490 104.510 C 82.796 99.816 82.796 92.204 87.490 87.510 C 92.184 82.816 99.796 82.816 104.490 87.510 ZM 236.000 128.000 C 236.000 187.647 187.647 236.000 128.000 236.000 C 68.353 236.000 20.000 187.647 20.000 128.000 C 20.000 68.353 68.353 20.000 128.000 20.000 C 187.619 20.066 235.934 68.381 236.000 128.000 ZM 212.000 128.000 C 212.000 81.608 174.392 44.000 128.000 44.000 C 81.608 44.000 44.000 81.608 44.000 128.000 C 44.000 174.392 81.608 212.000 128.000 212.000 C 174.371 211.950 211.950 174.371 212.000 128.000 Z"),
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
        return _prohibitInset!!
    }

private var _prohibitInset: ImageVector? = null
