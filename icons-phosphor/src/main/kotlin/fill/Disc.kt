package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = phosphorFillIcon(
            name = "Disc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 188.300 43.310 C 188.092 43.132 187.875 42.965 187.650 42.810 C 187.420 42.650 187.180 42.500 186.940 42.360 C 140.591 8.857 75.877 19.132 42.186 65.345 C 8.495 111.557 18.507 176.312 64.583 210.191 C 110.658 244.070 175.453 234.320 209.518 188.383 C 243.584 142.446 234.098 77.612 188.300 43.360 ZM 128.000 152.000 C 114.745 152.000 104.000 141.255 104.000 128.000 C 104.000 114.745 114.745 104.000 128.000 104.000 C 141.255 104.000 152.000 114.745 152.000 128.000 C 152.000 141.255 141.255 152.000 128.000 152.000 ZM 216.000 128.000 C 216.000 130.470 215.890 132.920 215.690 135.340 L 168.000 126.920 C 167.731 117.058 163.811 107.647 157.000 100.510 L 184.780 60.840 C 204.581 77.527 216.006 102.105 216.000 128.000 Z"),
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
        return _disc!!
    }

private var _disc: ImageVector? = null
