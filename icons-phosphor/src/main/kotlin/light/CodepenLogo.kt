package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) return _codepenLogo!!
        _codepenLogo = phosphorLightIcon(
            name = "CodepenLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 234.850 90.720 L 234.850 90.720 L 130.850 34.720 C 129.077 33.767 126.943 33.767 125.170 34.720 L 21.170 90.720 L 21.170 90.720 C 19.222 91.762 18.004 93.791 18.000 96.000 L 18.000 160.000 C 18.000 162.205 19.210 164.233 21.150 165.280 L 21.150 165.280 L 125.150 221.280 C 126.923 222.233 129.057 222.233 130.830 221.280 L 234.830 165.280 L 234.830 165.280 C 236.778 164.238 237.996 162.209 238.000 160.000 L 238.000 96.000 C 238.000 93.795 236.790 91.767 234.850 90.720 ZM 226.000 150.000 L 185.230 128.000 L 226.000 106.000 ZM 172.570 121.230 L 134.000 100.420 L 134.000 50.000 L 219.340 96.000 ZM 128.000 145.230 L 96.080 128.000 L 128.000 110.810 L 159.920 128.000 ZM 122.000 50.000 L 122.000 100.380 L 83.430 121.180 L 36.660 96.000 ZM 30.000 106.000 L 70.770 128.000 L 30.000 150.000 ZM 83.430 134.760 L 122.000 155.580 L 122.000 206.000 L 36.660 160.000 ZM 134.000 206.000 L 134.000 155.580 L 172.570 134.810 L 219.340 160.000 Z"),
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
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
