package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BellSimple: ImageVector
    get() {
        if (_bellSimple != null) return _bellSimple!!
        _bellSimple = phosphorFillIcon(
            name = "BellSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 224.000 C 168.000 228.418 164.418 232.000 160.000 232.000 L 96.000 232.000 C 91.582 232.000 88.000 228.418 88.000 224.000 C 88.000 219.582 91.582 216.000 96.000 216.000 L 160.000 216.000 C 164.418 216.000 168.000 219.582 168.000 224.000 ZM 221.810 175.940 C 216.250 166.380 208.000 139.330 208.000 104.000 C 208.000 59.817 172.183 24.000 128.000 24.000 C 83.817 24.000 48.000 59.817 48.000 104.000 C 48.000 139.340 39.740 166.380 34.190 175.940 C 31.305 180.887 31.284 186.998 34.135 191.965 C 36.986 196.932 42.273 199.996 48.000 200.000 L 208.000 200.000 C 213.725 199.992 219.009 196.927 221.858 191.961 C 224.706 186.995 224.684 180.885 221.800 175.940 Z"),
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
        return _bellSimple!!
    }

private var _bellSimple: ImageVector? = null
