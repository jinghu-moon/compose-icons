package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cigarette: ImageVector
    get() {
        if (_cigarette != null) return _cigarette!!
        _cigarette = phosphorLightIcon(
            name = "Cigarette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 130.000 L 32.000 130.000 C 24.268 130.000 18.000 136.268 18.000 144.000 L 18.000 176.000 C 18.000 183.732 24.268 190.000 32.000 190.000 L 224.000 190.000 C 231.732 190.000 238.000 183.732 238.000 176.000 L 238.000 144.000 C 238.000 136.268 231.732 130.000 224.000 130.000 ZM 30.000 176.000 L 30.000 144.000 C 30.000 142.895 30.895 142.000 32.000 142.000 L 82.000 142.000 L 82.000 178.000 L 32.000 178.000 C 30.895 178.000 30.000 177.105 30.000 176.000 ZM 226.000 176.000 C 226.000 177.105 225.105 178.000 224.000 178.000 L 94.000 178.000 L 94.000 142.000 L 224.000 142.000 C 225.105 142.000 226.000 142.895 226.000 144.000 ZM 202.770 61.060 C 210.580 47.180 210.680 39.150 209.390 34.860 C 208.826 32.615 207.418 30.674 205.460 29.440 C 202.907 28.252 201.523 25.449 202.134 22.699 C 202.744 19.950 205.184 17.996 208.000 18.000 C 208.841 17.996 209.673 18.174 210.440 18.520 C 215.369 21.044 219.061 25.462 220.670 30.760 C 223.850 40.340 221.350 52.510 213.230 66.940 C 205.420 80.820 205.320 88.850 206.610 93.140 C 207.161 95.372 208.550 97.306 210.490 98.540 C 213.060 99.711 214.465 102.515 213.866 105.274 C 213.266 108.033 210.824 110.001 208.000 110.000 C 207.159 110.004 206.327 109.826 205.560 109.480 C 200.631 106.956 196.939 102.538 195.330 97.240 C 192.150 87.660 194.650 75.490 202.770 61.060 ZM 162.770 61.060 C 170.580 47.180 170.680 39.150 169.390 34.860 C 168.826 32.615 167.418 30.674 165.460 29.440 C 162.907 28.252 161.523 25.449 162.134 22.699 C 162.744 19.950 165.184 17.996 168.000 18.000 C 168.841 17.996 169.673 18.174 170.440 18.520 C 175.369 21.044 179.061 25.462 180.670 30.760 C 183.850 40.340 181.350 52.510 173.230 66.940 C 165.420 80.820 165.320 88.850 166.610 93.140 C 167.161 95.372 168.550 97.306 170.490 98.540 C 173.060 99.711 174.465 102.515 173.866 105.274 C 173.266 108.033 170.824 110.001 168.000 110.000 C 167.159 110.004 166.327 109.826 165.560 109.480 C 160.631 106.956 156.939 102.538 155.330 97.240 C 152.150 87.660 154.650 75.490 162.770 61.060 Z"),
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
        return _cigarette!!
    }

private var _cigarette: ImageVector? = null
