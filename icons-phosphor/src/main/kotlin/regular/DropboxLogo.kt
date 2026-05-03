package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DropboxLogo: ImageVector
    get() {
        if (_dropboxLogo != null) return _dropboxLogo!!
        _dropboxLogo = phosphorRegularIcon(
            name = "DropboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.550 149.420 L 194.050 120.000 L 236.550 90.580 C 238.710 89.086 240.000 86.627 240.000 84.000 C 240.000 81.373 238.710 78.914 236.550 77.420 L 184.550 41.420 C 181.812 39.527 178.188 39.527 175.450 41.420 L 128.000 74.270 L 80.550 41.420 C 77.812 39.527 74.188 39.527 71.450 41.420 L 19.450 77.420 C 17.290 78.914 16.000 81.373 16.000 84.000 C 16.000 86.627 17.290 89.086 19.450 90.580 L 62.000 120.000 L 19.500 149.420 C 17.340 150.914 16.050 153.373 16.050 156.000 C 16.050 158.627 17.340 161.086 19.500 162.580 L 71.500 198.580 C 74.238 200.473 77.862 200.473 80.600 198.580 L 128.000 165.730 L 175.450 198.580 C 178.188 200.473 181.812 200.473 184.550 198.580 L 236.550 162.580 C 238.710 161.086 240.000 158.627 240.000 156.000 C 240.000 153.373 238.710 150.914 236.550 149.420 ZM 128.000 146.270 L 90.050 120.000 L 128.050 93.730 L 166.000 120.000 ZM 180.000 57.730 L 218.000 84.000 L 180.000 110.270 L 142.050 84.000 ZM 76.000 57.730 L 114.000 84.000 L 76.000 110.270 L 38.050 84.000 ZM 76.000 182.270 L 38.050 156.000 L 76.050 129.730 L 114.000 156.000 ZM 180.000 182.270 L 142.050 156.000 L 180.000 129.730 L 218.000 156.000 ZM 158.470 206.910 C 160.989 210.536 160.094 215.518 156.470 218.040 L 132.580 234.580 C 129.842 236.473 126.218 236.473 123.480 234.580 L 99.560 218.000 C 95.947 215.479 95.052 210.512 97.557 206.889 C 100.063 203.265 105.026 202.349 108.660 204.840 L 128.000 218.270 L 147.340 204.880 C 150.974 202.367 155.957 203.276 158.470 206.910 Z"),
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
        return _dropboxLogo!!
    }

private var _dropboxLogo: ImageVector? = null
