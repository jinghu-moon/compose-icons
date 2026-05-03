package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bulldozer: ImageVector
    get() {
        if (_bulldozer != null) return _bulldozer!!
        _bulldozer = phosphorRegularIcon(
            name = "Bulldozer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 200.000 L 240.000 200.000 C 235.582 200.000 232.000 196.418 232.000 192.000 L 232.000 160.000 C 232.000 155.582 235.582 152.000 240.000 152.000 L 248.000 152.000 C 252.418 152.000 256.000 148.418 256.000 144.000 C 256.000 139.582 252.418 136.000 248.000 136.000 L 240.000 136.000 C 226.745 136.000 216.000 146.745 216.000 160.000 L 216.000 168.000 L 199.200 168.000 C 195.777 151.395 182.280 138.739 165.490 136.390 L 129.440 49.850 C 126.957 43.886 121.130 40.000 114.670 40.000 L 24.000 40.000 C 15.163 40.000 8.000 47.163 8.000 56.000 L 8.000 152.000 C -1.091 164.121 -2.553 180.337 4.223 193.889 C 10.999 207.440 24.849 216.000 40.000 216.000 L 160.000 216.000 C 179.001 215.977 195.373 202.612 199.200 184.000 L 216.000 184.000 L 216.000 192.000 C 216.000 205.255 226.745 216.000 240.000 216.000 L 248.000 216.000 C 252.418 216.000 256.000 212.418 256.000 208.000 C 256.000 203.582 252.418 200.000 248.000 200.000 ZM 148.000 136.000 L 64.000 136.000 L 64.000 56.000 L 114.670 56.000 ZM 48.000 56.000 L 48.000 136.000 L 40.000 136.000 C 34.492 135.995 29.043 137.136 24.000 139.350 L 24.000 56.000 ZM 160.000 200.000 L 40.000 200.000 C 26.745 200.000 16.000 189.255 16.000 176.000 C 16.000 162.745 26.745 152.000 40.000 152.000 L 160.000 152.000 C 173.255 152.000 184.000 162.745 184.000 176.000 C 184.000 189.255 173.255 200.000 160.000 200.000 ZM 168.000 176.000 C 168.000 180.418 164.418 184.000 160.000 184.000 L 40.000 184.000 C 35.582 184.000 32.000 180.418 32.000 176.000 C 32.000 171.582 35.582 168.000 40.000 168.000 L 160.000 168.000 C 164.418 168.000 168.000 171.582 168.000 176.000 Z"),
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
        return _bulldozer!!
    }

private var _bulldozer: ImageVector? = null
