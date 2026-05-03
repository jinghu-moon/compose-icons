package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = phosphorThinIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 77.213 20.055 36.055 61.213 36.000 112.000 C 36.000 135.190 48.260 165.330 68.800 192.630 C 84.580 213.600 108.410 236.000 128.000 236.000 C 147.590 236.000 171.420 213.600 187.200 192.630 C 207.740 165.330 220.000 135.190 220.000 112.000 C 219.945 61.213 178.787 20.055 128.000 20.000 ZM 180.800 187.820 C 162.440 212.230 141.710 228.000 128.000 228.000 C 114.290 228.000 93.560 212.230 75.200 187.820 C 56.000 162.240 44.000 133.190 44.000 112.000 C 44.000 65.608 81.608 28.000 128.000 28.000 C 174.392 28.000 212.000 65.608 212.000 112.000 C 212.000 133.190 200.050 162.240 180.800 187.820 ZM 116.000 136.000 C 116.000 116.118 99.882 100.000 80.000 100.000 C 73.373 100.000 68.000 105.373 68.000 112.000 C 68.000 131.882 84.118 148.000 104.000 148.000 C 110.627 148.000 116.000 142.627 116.000 136.000 ZM 104.000 140.000 C 88.536 140.000 76.000 127.464 76.000 112.000 C 76.000 109.791 77.791 108.000 80.000 108.000 C 95.464 108.000 108.000 120.536 108.000 136.000 C 108.000 138.209 106.209 140.000 104.000 140.000 ZM 176.000 100.000 C 156.118 100.000 140.000 116.118 140.000 136.000 C 140.000 142.627 145.373 148.000 152.000 148.000 C 171.882 148.000 188.000 131.882 188.000 112.000 C 188.000 105.373 182.627 100.000 176.000 100.000 ZM 152.000 140.000 C 149.791 140.000 148.000 138.209 148.000 136.000 C 148.000 120.536 160.536 108.000 176.000 108.000 C 178.209 108.000 180.000 109.791 180.000 112.000 C 180.000 127.464 167.464 140.000 152.000 140.000 ZM 148.000 184.000 C 148.000 186.209 146.209 188.000 144.000 188.000 L 112.000 188.000 C 109.791 188.000 108.000 186.209 108.000 184.000 C 108.000 181.791 109.791 180.000 112.000 180.000 L 144.000 180.000 C 146.209 180.000 148.000 181.791 148.000 184.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _alien!!
    }

private var _alien: ImageVector? = null
