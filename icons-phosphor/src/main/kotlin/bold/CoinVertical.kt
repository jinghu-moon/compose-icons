package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) return _coinVertical!!
        _coinVertical = phosphorBoldIcon(
            name = "CoinVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 20.000 L 104.000 20.000 C 65.870 20.000 36.000 67.440 36.000 128.000 C 36.000 188.560 65.870 236.000 104.000 236.000 L 152.000 236.000 C 190.130 236.000 220.000 188.560 220.000 128.000 C 220.000 67.440 190.130 20.000 152.000 20.000 ZM 189.210 172.000 L 166.310 172.000 C 169.135 161.536 170.907 150.816 171.600 140.000 L 195.530 140.000 C 194.742 150.885 192.619 161.632 189.210 172.000 ZM 171.600 116.000 C 170.907 105.184 169.135 94.464 166.310 84.000 L 189.210 84.000 C 192.619 94.368 194.742 105.115 195.530 116.000 ZM 177.230 60.000 L 157.230 60.000 C 154.418 54.358 151.069 49.000 147.230 44.000 L 152.000 44.000 C 157.370 44.000 167.250 46.250 177.230 60.000 ZM 74.770 189.840 C 65.240 173.510 60.000 151.550 60.000 128.000 C 60.000 104.450 65.240 82.490 74.770 66.160 C 86.000 46.880 97.910 44.000 104.000 44.000 C 110.090 44.000 122.000 46.880 133.230 66.160 C 142.760 82.490 148.000 104.450 148.000 128.000 C 148.000 151.550 142.760 173.510 133.230 189.840 C 122.000 209.120 110.090 212.000 104.000 212.000 C 97.910 212.000 86.000 209.120 74.770 189.840 ZM 152.000 212.000 L 147.210 212.000 C 151.049 207.000 154.398 201.642 157.210 196.000 L 177.210 196.000 C 167.250 209.750 157.370 212.000 152.000 212.000 Z"),
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
        return _coinVertical!!
    }

private var _coinVertical: ImageVector? = null
