package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Warning: ImageVector
    get() {
        if (_warning != null) return _warning!!
        _warning = phosphorBoldIcon(
            name = "Warning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.260 186.100 L 152.810 34.230 L 152.810 34.230 C 147.656 25.415 138.211 19.997 128.000 19.997 C 117.789 19.997 108.344 25.415 103.190 34.230 L 15.740 186.100 C 10.736 194.659 10.736 205.251 15.740 213.810 C 20.840 222.674 30.324 228.098 40.550 228.000 L 215.450 228.000 C 225.669 228.091 235.143 222.668 240.240 213.810 C 245.250 205.255 245.258 194.662 240.260 186.100 ZM 219.460 201.800 C 218.631 203.212 217.096 204.056 215.460 204.000 L 40.550 204.000 C 38.914 204.056 37.379 203.212 36.550 201.800 C 35.847 200.656 35.847 199.214 36.550 198.070 L 124.000 46.200 C 124.880 44.846 126.385 44.029 128.000 44.029 C 129.615 44.029 131.120 44.846 132.000 46.200 L 219.440 198.070 C 220.150 199.210 220.157 200.652 219.460 201.800 ZM 116.000 136.000 L 116.000 104.000 C 116.000 97.373 121.373 92.000 128.000 92.000 C 134.627 92.000 140.000 97.373 140.000 104.000 L 140.000 136.000 C 140.000 142.627 134.627 148.000 128.000 148.000 C 121.373 148.000 116.000 142.627 116.000 136.000 ZM 144.000 176.000 C 144.000 184.837 136.837 192.000 128.000 192.000 C 119.163 192.000 112.000 184.837 112.000 176.000 C 112.000 167.163 119.163 160.000 128.000 160.000 C 136.837 160.000 144.000 167.163 144.000 176.000 Z"),
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
        return _warning!!
    }

private var _warning: ImageVector? = null
