package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserSquare: ImageVector
    get() {
        if (_userSquare != null) return _userSquare!!
        _userSquare = phosphorLightIcon(
            name = "UserSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 94.000 120.000 C 94.000 101.222 109.222 86.000 128.000 86.000 C 146.778 86.000 162.000 101.222 162.000 120.000 C 162.000 138.778 146.778 154.000 128.000 154.000 C 109.222 154.000 94.000 138.778 94.000 120.000 ZM 65.770 210.000 C 69.862 198.490 77.049 188.331 86.540 180.640 C 110.730 161.110 145.270 161.110 169.460 180.640 C 178.951 188.331 186.138 198.490 190.230 210.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 202.830 210.000 C 195.727 185.777 177.320 166.501 153.450 158.290 C 170.348 147.067 177.899 126.100 172.038 106.680 C 166.176 87.260 148.285 73.972 128.000 73.972 C 107.715 73.972 89.824 87.260 83.962 106.680 C 78.101 126.100 85.652 147.067 102.550 158.290 C 78.680 166.501 60.273 185.777 53.170 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 Z"),
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
        return _userSquare!!
    }

private var _userSquare: ImageVector? = null
