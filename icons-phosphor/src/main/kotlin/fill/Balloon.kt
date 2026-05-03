package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = phosphorFillIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 16.000 C 79.422 16.055 40.055 55.422 40.000 104.000 C 40.000 127.430 49.400 153.420 65.130 173.500 C 77.210 188.910 91.630 199.500 107.040 204.590 L 96.650 228.850 C 95.592 231.321 95.845 234.159 97.324 236.403 C 98.804 238.647 101.312 239.999 104.000 240.000 L 152.000 240.000 C 154.688 239.999 157.196 238.647 158.676 236.403 C 160.155 234.159 160.408 231.321 159.350 228.850 L 149.000 204.590 C 164.400 199.520 178.830 188.910 190.910 173.500 C 206.600 153.420 216.000 127.430 216.000 104.000 C 215.945 55.422 176.578 16.055 128.000 16.000 ZM 177.320 103.890 C 176.884 103.961 176.442 103.998 176.000 104.000 C 172.095 103.995 168.764 101.171 168.120 97.320 C 165.090 80.269 151.741 66.920 134.690 63.890 C 131.849 63.442 129.468 61.503 128.452 58.813 C 127.437 56.122 127.943 53.094 129.779 50.880 C 131.615 48.667 134.498 47.609 137.330 48.110 C 161.087 52.325 179.685 70.923 183.900 94.680 C 184.250 96.774 183.753 98.921 182.519 100.649 C 181.285 102.376 179.414 103.542 177.320 103.890 Z"),
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
        return _balloon!!
    }

private var _balloon: ImageVector? = null
