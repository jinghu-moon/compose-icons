package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) return _playCircle!!
        _playCircle = phosphorFillIcon(
            name = "PlayCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 168.550 134.580 L 116.550 170.580 C 114.103 172.272 110.920 172.466 108.285 171.085 C 105.651 169.704 104.000 166.975 104.000 164.000 L 104.000 92.000 C 104.000 89.025 105.651 86.296 108.285 84.915 C 110.920 83.534 114.103 83.728 116.550 85.420 L 168.550 121.420 C 170.710 122.914 172.000 125.373 172.000 128.000 C 172.000 130.627 170.710 133.086 168.550 134.580 Z"),
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
