package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DevToLogo: ImageVector
    get() {
        if (_devToLogo != null) return _devToLogo!!
        _devToLogo = phosphorThinIcon(
            name = "DevToLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 60.000 L 24.000 60.000 C 17.373 60.000 12.000 65.373 12.000 72.000 L 12.000 184.000 C 12.000 190.627 17.373 196.000 24.000 196.000 L 232.000 196.000 C 238.627 196.000 244.000 190.627 244.000 184.000 L 244.000 72.000 C 244.000 65.373 238.627 60.000 232.000 60.000 ZM 236.000 184.000 C 236.000 186.209 234.209 188.000 232.000 188.000 L 24.000 188.000 C 21.791 188.000 20.000 186.209 20.000 184.000 L 20.000 72.000 C 20.000 69.791 21.791 68.000 24.000 68.000 L 232.000 68.000 C 234.209 68.000 236.000 69.791 236.000 72.000 ZM 124.000 100.000 L 124.000 124.000 L 136.000 124.000 C 138.209 124.000 140.000 125.791 140.000 128.000 C 140.000 130.209 138.209 132.000 136.000 132.000 L 124.000 132.000 L 124.000 156.000 L 144.000 156.000 C 146.209 156.000 148.000 157.791 148.000 160.000 C 148.000 162.209 146.209 164.000 144.000 164.000 L 120.000 164.000 C 117.791 164.000 116.000 162.209 116.000 160.000 L 116.000 96.000 C 116.000 93.791 117.791 92.000 120.000 92.000 L 144.000 92.000 C 146.209 92.000 148.000 93.791 148.000 96.000 C 148.000 98.209 146.209 100.000 144.000 100.000 ZM 211.850 97.080 L 193.850 161.080 C 193.364 162.804 191.791 163.995 190.000 163.995 C 188.209 163.995 186.636 162.804 186.150 161.080 L 168.150 97.080 C 167.720 95.691 168.079 94.178 169.086 93.129 C 170.093 92.080 171.590 91.660 172.996 92.032 C 174.401 92.404 175.494 93.510 175.850 94.920 L 190.000 145.230 L 204.150 94.920 C 204.790 92.849 206.964 91.665 209.052 92.250 C 211.139 92.836 212.380 94.978 211.850 97.080 ZM 64.000 92.000 L 56.000 92.000 C 53.791 92.000 52.000 93.791 52.000 96.000 L 52.000 160.000 C 52.000 162.209 53.791 164.000 56.000 164.000 L 64.000 164.000 C 79.464 164.000 92.000 151.464 92.000 136.000 L 92.000 120.000 C 92.000 104.536 79.464 92.000 64.000 92.000 ZM 84.000 136.000 C 84.000 147.046 75.046 156.000 64.000 156.000 L 60.000 156.000 L 60.000 100.000 L 64.000 100.000 C 75.046 100.000 84.000 108.954 84.000 120.000 Z"),
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
        return _devToLogo!!
    }

private var _devToLogo: ImageVector? = null
