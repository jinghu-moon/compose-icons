package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BellSimple: ImageVector
    get() {
        if (_bellSimple != null) return _bellSimple!!
        _bellSimple = phosphorThinIcon(
            name = "BellSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 164.000 224.000 C 164.000 226.209 162.209 228.000 160.000 228.000 L 96.000 228.000 C 93.791 228.000 92.000 226.209 92.000 224.000 C 92.000 221.791 93.791 220.000 96.000 220.000 L 160.000 220.000 C 162.209 220.000 164.000 221.791 164.000 224.000 ZM 218.380 190.000 C 216.263 193.733 212.292 196.029 208.000 196.000 L 48.000 196.000 C 43.720 195.985 39.773 193.692 37.639 189.982 C 35.506 186.272 35.510 181.706 37.650 178.000 C 43.420 168.000 52.000 140.130 52.000 104.000 C 52.000 62.026 86.026 28.000 128.000 28.000 C 169.974 28.000 204.000 62.026 204.000 104.000 C 204.000 140.130 212.590 168.000 218.360 177.950 C 220.546 181.667 220.554 186.275 218.380 190.000 ZM 211.430 182.000 C 204.000 169.170 196.000 139.310 196.000 104.000 C 196.000 66.445 165.555 36.000 128.000 36.000 C 90.445 36.000 60.000 66.445 60.000 104.000 C 60.000 139.320 52.000 169.170 44.560 182.000 C 43.845 183.238 43.845 184.762 44.560 186.000 C 45.256 187.244 46.574 188.010 48.000 188.000 L 208.000 188.000 C 209.426 188.010 210.744 187.244 211.440 186.000 C 212.151 184.761 212.148 183.236 211.430 182.000 Z"),
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
