package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Church: ImageVector
    get() {
        if (_church != null) return _church!!
        _church = phosphorBoldIcon(
            name = "Church",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.170 141.710 L 196.000 121.210 L 196.000 104.000 C 196.010 99.703 193.721 95.729 190.000 93.580 L 140.000 65.000 L 140.000 52.000 L 152.000 52.000 C 158.627 52.000 164.000 46.627 164.000 40.000 C 164.000 33.373 158.627 28.000 152.000 28.000 L 140.000 28.000 L 140.000 16.000 C 140.000 9.373 134.627 4.000 128.000 4.000 C 121.373 4.000 116.000 9.373 116.000 16.000 L 116.000 28.000 L 104.000 28.000 C 97.373 28.000 92.000 33.373 92.000 40.000 C 92.000 46.627 97.373 52.000 104.000 52.000 L 116.000 52.000 L 116.000 65.000 L 66.050 93.580 C 62.309 95.716 60.000 99.693 60.000 104.000 L 60.000 121.210 L 25.830 141.710 C 22.214 143.878 20.001 147.784 20.000 152.000 L 20.000 216.000 C 20.000 222.627 25.373 228.000 32.000 228.000 L 108.000 228.000 C 114.627 228.000 120.000 222.627 120.000 216.000 L 120.000 172.000 C 120.000 167.582 123.582 164.000 128.000 164.000 C 132.418 164.000 136.000 167.582 136.000 172.000 L 136.000 216.000 C 136.000 222.627 141.373 228.000 148.000 228.000 L 224.000 228.000 C 230.627 228.000 236.000 222.627 236.000 216.000 L 236.000 152.000 C 235.999 147.784 233.786 143.878 230.170 141.710 ZM 44.000 158.790 L 60.000 149.190 L 60.000 204.000 L 44.000 204.000 ZM 128.000 140.000 C 110.327 140.000 96.000 154.327 96.000 172.000 L 96.000 204.000 L 84.000 204.000 L 84.000 111.000 L 128.000 85.860 L 172.000 111.000 L 172.000 204.000 L 160.000 204.000 L 160.000 172.000 C 160.000 154.327 145.673 140.000 128.000 140.000 ZM 212.000 204.000 L 196.000 204.000 L 196.000 149.190 L 212.000 158.790 Z"),
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
        return _church!!
    }

private var _church: ImageVector? = null
