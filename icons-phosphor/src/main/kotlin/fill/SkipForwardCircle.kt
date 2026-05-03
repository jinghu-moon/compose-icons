package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SkipForwardCircle: ImageVector
    get() {
        if (_skipForwardCircle != null) return _skipForwardCircle!!
        _skipForwardCircle = phosphorFillIcon(
            name = "SkipForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 168.000 168.000 C 168.000 172.418 164.418 176.000 160.000 176.000 C 155.582 176.000 152.000 172.418 152.000 168.000 L 152.000 137.830 L 100.650 174.510 C 98.211 176.252 95.004 176.485 92.339 175.114 C 89.675 173.742 88.000 170.997 88.000 168.000 L 88.000 88.000 C 88.000 85.003 89.675 82.258 92.339 80.886 C 95.004 79.515 98.211 79.748 100.650 81.490 L 152.000 118.170 L 152.000 88.000 C 152.000 83.582 155.582 80.000 160.000 80.000 C 164.418 80.000 168.000 83.582 168.000 88.000 Z"),
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
        return _skipForwardCircle!!
    }

private var _skipForwardCircle: ImageVector? = null
