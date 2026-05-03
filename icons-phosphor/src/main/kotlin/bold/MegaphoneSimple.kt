package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) return _megaphoneSimple!!
        _megaphoneSimple = phosphorBoldIcon(
            name = "MegaphoneSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.700 82.840 L 53.760 28.840 L 53.600 28.790 C 47.555 27.027 41.033 28.214 35.996 31.993 C 30.959 35.772 27.997 41.703 28.000 48.000 L 28.000 192.000 C 28.000 203.022 36.918 211.967 47.940 212.000 C 49.855 211.997 51.761 211.725 53.600 211.190 L 53.760 211.190 L 132.000 187.190 L 132.000 196.000 C 132.000 207.046 140.954 216.000 152.000 216.000 L 184.000 216.000 C 195.046 216.000 204.000 207.046 204.000 196.000 L 204.000 165.060 L 229.700 157.170 C 238.163 154.619 243.967 146.839 244.000 138.000 L 244.000 102.000 C 243.963 93.165 238.160 85.389 229.700 82.840 ZM 52.000 186.580 L 52.000 53.430 L 132.000 78.000 L 132.000 162.000 ZM 180.000 192.000 L 156.000 192.000 L 156.000 179.780 L 180.000 172.420 ZM 220.000 135.050 L 156.000 154.680 L 156.000 85.330 L 220.000 105.000 Z"),
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
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null
