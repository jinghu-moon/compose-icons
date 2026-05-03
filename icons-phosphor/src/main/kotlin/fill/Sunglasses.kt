package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = phosphorFillIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 40.000 C 195.582 40.000 192.000 43.582 192.000 48.000 C 192.000 52.418 195.582 56.000 200.000 56.000 C 208.837 56.000 216.000 63.163 216.000 72.000 L 216.000 128.000 L 40.000 128.000 L 40.000 72.000 C 40.000 63.163 47.163 56.000 56.000 56.000 C 60.418 56.000 64.000 52.418 64.000 48.000 C 64.000 43.582 60.418 40.000 56.000 40.000 C 38.327 40.000 24.000 54.327 24.000 72.000 L 24.000 164.000 C 24.000 188.301 43.699 208.000 68.000 208.000 C 92.301 208.000 112.000 188.301 112.000 164.000 L 112.000 144.000 L 144.000 144.000 L 144.000 164.000 C 144.000 188.301 163.699 208.000 188.000 208.000 C 212.301 208.000 232.000 188.301 232.000 164.000 L 232.000 72.000 C 232.000 54.327 217.673 40.000 200.000 40.000 ZM 91.220 179.220 C 88.096 182.342 83.034 182.342 79.910 179.220 L 58.340 157.660 C 55.214 154.534 55.214 149.466 58.340 146.340 C 61.466 143.214 66.534 143.214 69.660 146.340 L 91.220 167.910 C 94.342 171.034 94.342 176.096 91.220 179.220 ZM 211.220 179.220 C 208.096 182.342 203.034 182.342 199.910 179.220 L 178.340 157.660 C 175.214 154.534 175.214 149.466 178.340 146.340 C 181.466 143.214 186.534 143.214 189.660 146.340 L 211.220 167.910 C 214.342 171.034 214.342 176.096 211.220 179.220 Z"),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
