package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) return _playCircle!!
        _playCircle = phosphorBoldIcon(
            name = "PlayCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 128.000 C 176.001 131.939 174.069 135.628 170.830 137.870 L 118.830 173.870 C 115.160 176.411 110.383 176.704 106.429 174.632 C 102.475 172.559 99.999 168.464 100.000 164.000 L 100.000 92.000 C 99.999 87.536 102.475 83.441 106.429 81.368 C 110.383 79.296 115.160 79.589 118.830 82.130 L 170.830 118.130 C 174.069 120.372 176.001 124.061 176.000 128.000 ZM 236.000 128.000 C 236.000 187.647 187.647 236.000 128.000 236.000 C 68.353 236.000 20.000 187.647 20.000 128.000 C 20.000 68.353 68.353 20.000 128.000 20.000 C 187.619 20.066 235.934 68.381 236.000 128.000 ZM 212.000 128.000 C 212.000 81.608 174.392 44.000 128.000 44.000 C 81.608 44.000 44.000 81.608 44.000 128.000 C 44.000 174.392 81.608 212.000 128.000 212.000 C 174.371 211.950 211.950 174.371 212.000 128.000 Z"),
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
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
