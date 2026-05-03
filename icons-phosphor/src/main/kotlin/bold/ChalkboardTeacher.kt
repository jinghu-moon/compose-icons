package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChalkboardTeacher: ImageVector
    get() {
        if (_chalkboardTeacher != null) return _chalkboardTeacher!!
        _chalkboardTeacher = phosphorBoldIcon(
            name = "ChalkboardTeacher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 56.000 84.000 C 56.000 77.373 61.373 72.000 68.000 72.000 L 188.000 72.000 C 194.627 72.000 200.000 77.373 200.000 84.000 L 200.000 172.000 C 200.000 178.627 194.627 184.000 188.000 184.000 C 181.373 184.000 176.000 178.627 176.000 172.000 L 176.000 96.000 L 68.000 96.000 C 61.373 96.000 56.000 90.627 56.000 84.000 ZM 236.000 56.000 L 236.000 200.000 C 236.000 211.046 227.046 220.000 216.000 220.000 L 149.260 220.000 C 144.074 219.999 139.476 216.667 137.860 211.740 C 132.716 197.460 119.169 187.939 103.990 187.939 C 88.811 187.939 75.264 197.460 70.120 211.740 C 68.506 216.660 63.918 219.990 58.740 220.000 L 40.000 220.000 C 28.954 220.000 20.000 211.046 20.000 200.000 L 20.000 56.000 C 20.000 44.954 28.954 36.000 40.000 36.000 L 216.000 36.000 C 227.046 36.000 236.000 44.954 236.000 56.000 ZM 104.000 164.000 C 112.837 164.000 120.000 156.837 120.000 148.000 C 120.000 139.163 112.837 132.000 104.000 132.000 C 95.163 132.000 88.000 139.163 88.000 148.000 C 88.000 156.837 95.163 164.000 104.000 164.000 ZM 212.000 60.000 L 44.000 60.000 L 44.000 196.000 L 50.920 196.000 C 55.967 186.470 63.483 178.471 72.680 172.840 C 59.672 156.465 61.473 132.835 76.811 118.620 C 92.150 104.405 115.850 104.405 131.189 118.620 C 146.527 132.835 148.328 156.465 135.320 172.840 C 144.517 178.471 152.033 186.470 157.080 196.000 L 212.000 196.000 Z"),
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
        return _chalkboardTeacher!!
    }

private var _chalkboardTeacher: ImageVector? = null
