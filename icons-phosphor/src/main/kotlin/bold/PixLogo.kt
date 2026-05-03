package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PixLogo: ImageVector
    get() {
        if (_pixLogo != null) return _pixLogo!!
        _pixLogo = phosphorBoldIcon(
            name = "PixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.160 113.890 L 142.160 17.890 C 134.357 10.122 121.743 10.122 113.940 17.890 L 17.940 113.940 C 10.172 121.743 10.172 134.357 17.940 142.160 L 113.990 238.160 C 121.793 245.928 134.407 245.928 142.210 238.160 L 238.210 142.160 C 245.978 134.357 245.978 121.743 238.210 113.940 ZM 128.000 37.680 L 174.320 84.000 L 160.000 84.000 C 156.816 83.997 153.762 85.260 151.510 87.510 L 128.000 111.000 L 104.490 87.510 C 102.238 85.260 99.184 83.997 96.000 84.000 L 81.680 84.000 ZM 57.680 108.000 L 91.000 108.000 L 111.000 128.000 L 91.000 148.000 L 57.680 148.000 L 37.680 128.000 ZM 128.000 218.320 L 81.680 172.000 L 96.000 172.000 C 99.184 172.003 102.238 170.740 104.490 168.490 L 128.000 145.000 L 151.510 168.520 C 153.767 170.759 156.821 172.010 160.000 172.000 L 174.320 172.000 ZM 198.320 148.000 L 165.000 148.000 L 145.000 128.000 L 165.000 108.000 L 198.350 108.000 L 218.350 128.000 Z"),
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
        return _pixLogo!!
    }

private var _pixLogo: ImageVector? = null
