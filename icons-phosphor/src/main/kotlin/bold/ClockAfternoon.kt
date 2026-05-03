package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClockAfternoon: ImageVector
    get() {
        if (_clockAfternoon != null) return _clockAfternoon!!
        _clockAfternoon = phosphorBoldIcon(
            name = "ClockAfternoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 196.000 128.000 C 196.000 134.627 190.627 140.000 184.000 140.000 L 157.000 140.000 L 176.520 159.510 C 181.214 164.204 181.214 171.816 176.520 176.510 C 171.826 181.204 164.214 181.204 159.520 176.510 L 119.520 136.510 C 116.071 133.081 115.033 127.909 116.891 123.415 C 118.749 118.920 123.137 115.992 128.000 116.000 L 184.000 116.000 C 190.627 116.000 196.000 121.373 196.000 128.000 Z"),
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
        return _clockAfternoon!!
    }

private var _clockAfternoon: ImageVector? = null
