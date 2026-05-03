package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WarningDiamond: ImageVector
    get() {
        if (_warningDiamond != null) return _warningDiamond!!
        _warningDiamond = phosphorThinIcon(
            name = "WarningDiamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 124.000 136.000 L 124.000 80.000 C 124.000 77.791 125.791 76.000 128.000 76.000 C 130.209 76.000 132.000 77.791 132.000 80.000 L 132.000 136.000 C 132.000 138.209 130.209 140.000 128.000 140.000 C 125.791 140.000 124.000 138.209 124.000 136.000 ZM 128.000 164.000 C 123.582 164.000 120.000 167.582 120.000 172.000 C 120.000 176.418 123.582 180.000 128.000 180.000 C 132.418 180.000 136.000 176.418 136.000 172.000 C 136.000 167.582 132.418 164.000 128.000 164.000 ZM 236.000 128.000 C 236.009 131.171 234.749 134.214 232.500 136.450 L 136.450 232.510 C 131.772 237.149 124.228 237.149 119.550 232.510 L 119.550 232.510 L 23.550 136.450 C 18.911 131.772 18.911 124.228 23.550 119.550 L 119.600 23.490 C 124.278 18.851 131.822 18.851 136.500 23.490 L 232.550 119.550 C 234.780 121.794 236.022 124.836 236.000 128.000 ZM 228.000 128.000 C 228.004 126.952 227.586 125.946 226.840 125.210 L 130.790 29.150 C 129.237 27.638 126.763 27.638 125.210 29.150 L 29.210 125.210 C 28.469 125.949 28.052 126.953 28.052 128.000 C 28.052 129.047 28.469 130.051 29.210 130.790 L 125.260 226.850 C 126.813 228.362 129.287 228.362 130.840 226.850 L 226.890 130.790 C 227.618 130.045 228.017 129.041 228.000 128.000 Z"),
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
        return _warningDiamond!!
    }

private var _warningDiamond: ImageVector? = null
