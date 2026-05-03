package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.InstagramLogo: ImageVector
    get() {
        if (_instagramLogo != null) return _instagramLogo!!
        _instagramLogo = phosphorBoldIcon(
            name = "InstagramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 80.000 C 101.490 80.000 80.000 101.490 80.000 128.000 C 80.000 154.510 101.490 176.000 128.000 176.000 C 154.510 176.000 176.000 154.510 176.000 128.000 C 175.972 101.502 154.498 80.028 128.000 80.000 ZM 128.000 152.000 C 114.745 152.000 104.000 141.255 104.000 128.000 C 104.000 114.745 114.745 104.000 128.000 104.000 C 141.255 104.000 152.000 114.745 152.000 128.000 C 152.000 141.255 141.255 152.000 128.000 152.000 ZM 176.000 20.000 L 80.000 20.000 C 46.879 20.039 20.039 46.879 20.000 80.000 L 20.000 176.000 C 20.039 209.121 46.879 235.961 80.000 236.000 L 176.000 236.000 C 209.121 235.961 235.961 209.121 236.000 176.000 L 236.000 80.000 C 235.961 46.879 209.121 20.039 176.000 20.000 ZM 212.000 176.000 C 212.000 195.882 195.882 212.000 176.000 212.000 L 80.000 212.000 C 60.118 212.000 44.000 195.882 44.000 176.000 L 44.000 80.000 C 44.000 60.118 60.118 44.000 80.000 44.000 L 176.000 44.000 C 195.882 44.000 212.000 60.118 212.000 80.000 ZM 196.000 76.000 C 196.000 84.837 188.837 92.000 180.000 92.000 C 171.163 92.000 164.000 84.837 164.000 76.000 C 164.000 67.163 171.163 60.000 180.000 60.000 C 188.837 60.000 196.000 67.163 196.000 76.000 Z"),
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
        return _instagramLogo!!
    }

private var _instagramLogo: ImageVector? = null
