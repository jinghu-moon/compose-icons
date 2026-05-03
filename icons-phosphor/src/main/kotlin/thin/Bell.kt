package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bell: ImageVector
    get() {
        if (_bell != null) return _bell!!
        _bell = phosphorThinIcon(
            name = "Bell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 218.350 178.000 C 212.580 168.000 204.000 140.130 204.000 104.000 C 204.000 62.026 169.974 28.000 128.000 28.000 C 86.026 28.000 52.000 62.026 52.000 104.000 C 52.000 140.130 43.410 168.000 37.640 177.950 C 35.474 181.661 35.457 186.247 37.596 189.974 C 39.735 193.700 43.703 195.999 48.000 196.000 L 92.230 196.000 C 94.296 214.193 109.690 227.937 128.000 227.937 C 146.310 227.937 161.704 214.193 163.770 196.000 L 208.000 196.000 C 212.280 195.985 216.227 193.692 218.361 189.982 C 220.494 186.272 220.490 181.706 218.350 178.000 ZM 128.000 220.000 C 114.082 219.999 102.278 209.775 100.290 196.000 L 155.710 196.000 C 153.722 209.775 141.918 219.999 128.000 220.000 ZM 211.450 186.000 C 210.754 187.244 209.436 188.010 208.010 188.000 L 48.000 188.000 C 46.574 188.010 45.256 187.244 44.560 186.000 C 43.845 184.762 43.845 183.238 44.560 182.000 C 52.000 169.170 60.000 139.320 60.000 104.000 C 60.000 66.445 90.445 36.000 128.000 36.000 C 165.555 36.000 196.000 66.445 196.000 104.000 C 196.000 139.310 204.000 169.170 211.440 182.000 C 212.158 183.236 212.161 184.761 211.450 186.000 Z"),
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
        return _bell!!
    }

private var _bell: ImageVector? = null
