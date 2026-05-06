package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = phosphorBoldIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.05 201.94 191.65 115.82 216.88 88.07c4.361-4.916 3.957-12.425-.906-16.844-4.863-4.42-12.376-4.106-16.854 .704L183.24 89.39 168.14 41.94C165.52 33.625 157.799 27.977 149.08 28h-42.17C98.191 27.977 90.47 33.625 87.85 41.94L36.94 201.94c-1.933 6.08-.85 12.717 2.917 17.867 3.766 5.15 9.763 8.193 16.143 8.193h144c6.38 0 12.377-3.044 16.143-8.193 3.766-5.15 4.85-11.787 2.917-17.867ZM179.25 156h-24.13L173 136.34ZM109.83 52h36.33l18.42 57.91L122.69 156h-45.95ZM61.47 204l7.63-24h117.79l7.63 24Z"),
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
        return _metronome!!
    }

private var _metronome: ImageVector? = null
