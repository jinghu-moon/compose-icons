package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Gavel: ImageVector
    get() {
        if (_gavel != null) return _gavel!!
        _gavel = phosphorRegularIcon(
            name = "Gavel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.32 116.69l-16-16c-5.609-5.602-14.473-6.253-20.84-1.53L156.84 49.52c4.726-6.364 4.079-15.229-1.52-20.84l-16-16C136.319 9.679 132.249 7.992 128.005 7.992c-4.244 0-8.314 1.686-11.315 4.688l-64 64c-3.001 3.001-4.688 7.071-4.688 11.315 0 4.244 1.686 8.314 4.688 11.315l16 16c5.61 5.593 14.468 6.24 20.83 1.52L96.69 124 31.31 189.38c-9.024 9.869-8.683 25.092 .773 34.547 9.456 9.456 24.678 9.796 34.547 .773L132 159.32l7.17 7.16c-4.726 6.364-4.079 15.229 1.52 20.84l16 16c3.001 3.001 7.071 4.688 11.315 4.688 4.244 0 8.314-1.686 11.315-4.688l64-64c3.001-3.001 4.688-7.071 4.688-11.315 0-4.244-1.686-8.314-4.688-11.315ZM80 104 64 88 128 24l16 16ZM55.32 213.38c-3.51 3.49-9.18 3.49-12.69 0-3.483-3.509-3.483-9.171 0-12.68L108 135.32 120.69 148ZM101 105.66 145.66 61 195 110.34 150.35 155ZM168 192 152 176l4-4h0l56-56h0l4-4 16 16Z"),
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
        return _gavel!!
    }

private var _gavel: ImageVector? = null
