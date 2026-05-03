package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) return _codepenLogo!!
        _codepenLogo = phosphorFillIcon(
            name = "CodepenLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.790 89.000 L 131.790 33.000 C 129.424 31.727 126.576 31.727 124.210 33.000 L 20.210 89.000 C 17.631 90.387 16.017 93.072 16.000 96.000 L 16.000 160.000 C 16.017 162.928 17.631 165.613 20.210 167.000 L 114.100 217.600 C 115.340 218.269 116.840 218.237 118.049 217.515 C 119.259 216.793 120.000 215.489 120.000 214.080 L 120.000 156.780 L 66.550 128.000 L 32.000 146.610 L 32.000 109.390 L 66.550 128.000 L 83.430 118.910 L 40.870 96.000 L 120.000 53.390 L 120.000 99.220 L 83.430 118.910 L 128.000 142.910 L 172.570 118.910 L 189.450 128.000 L 224.000 109.390 L 224.000 146.610 L 189.450 128.000 L 136.000 156.780 L 136.000 214.080 C 136.000 215.489 136.741 216.793 137.951 217.515 C 139.160 218.237 140.660 218.269 141.900 217.600 L 235.790 167.000 C 238.369 165.613 239.983 162.928 240.000 160.000 L 240.000 96.000 C 239.983 93.072 238.369 90.387 235.790 89.000 ZM 172.570 119.000 L 136.000 99.220 L 136.000 53.390 L 215.130 96.000 Z"),
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
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
