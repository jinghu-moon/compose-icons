package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinkedinLogo: ImageVector
    get() {
        if (_linkedinLogo != null) return _linkedinLogo!!
        _linkedinLogo = phosphorBoldIcon(
            name = "LinkedinLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 20.000 L 40.000 20.000 C 28.954 20.000 20.000 28.954 20.000 40.000 L 20.000 216.000 C 20.000 227.046 28.954 236.000 40.000 236.000 L 216.000 236.000 C 227.046 236.000 236.000 227.046 236.000 216.000 L 236.000 40.000 C 236.000 28.954 227.046 20.000 216.000 20.000 ZM 212.000 212.000 L 44.000 212.000 L 44.000 44.000 L 212.000 44.000 ZM 112.000 176.000 L 112.000 120.000 C 112.005 114.888 115.247 110.341 120.078 108.670 C 124.910 107.000 130.269 108.573 133.430 112.590 C 145.826 106.092 160.718 106.547 172.695 113.788 C 184.672 121.029 191.994 134.004 192.000 148.000 L 192.000 176.000 C 192.000 182.627 186.627 188.000 180.000 188.000 C 173.373 188.000 168.000 182.627 168.000 176.000 L 168.000 148.000 C 168.000 139.163 160.837 132.000 152.000 132.000 C 143.163 132.000 136.000 139.163 136.000 148.000 L 136.000 176.000 C 136.000 182.627 130.627 188.000 124.000 188.000 C 117.373 188.000 112.000 182.627 112.000 176.000 ZM 96.000 120.000 L 96.000 176.000 C 96.000 182.627 90.627 188.000 84.000 188.000 C 77.373 188.000 72.000 182.627 72.000 176.000 L 72.000 120.000 C 72.000 113.373 77.373 108.000 84.000 108.000 C 90.627 108.000 96.000 113.373 96.000 120.000 ZM 68.000 80.000 C 68.000 71.163 75.163 64.000 84.000 64.000 C 92.837 64.000 100.000 71.163 100.000 80.000 C 100.000 88.837 92.837 96.000 84.000 96.000 C 75.163 96.000 68.000 88.837 68.000 80.000 Z"),
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
        return _linkedinLogo!!
    }

private var _linkedinLogo: ImageVector? = null
