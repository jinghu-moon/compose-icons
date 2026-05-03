package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GraphicsCard: ImageVector
    get() {
        if (_graphicsCard != null) return _graphicsCard!!
        _graphicsCard = phosphorRegularIcon(
            name = "GraphicsCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 48.000 L 16.000 48.000 C 11.582 48.000 8.000 51.582 8.000 56.000 L 8.000 208.000 C 8.000 212.418 11.582 216.000 16.000 216.000 C 20.418 216.000 24.000 212.418 24.000 208.000 L 24.000 192.000 L 40.000 192.000 L 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 C 52.418 216.000 56.000 212.418 56.000 208.000 L 56.000 192.000 L 72.000 192.000 L 72.000 208.000 C 72.000 212.418 75.582 216.000 80.000 216.000 C 84.418 216.000 88.000 212.418 88.000 208.000 L 88.000 192.000 L 104.000 192.000 L 104.000 208.000 C 104.000 212.418 107.582 216.000 112.000 216.000 C 116.418 216.000 120.000 212.418 120.000 208.000 L 120.000 192.000 L 232.000 192.000 C 240.837 192.000 248.000 184.837 248.000 176.000 L 248.000 64.000 C 248.000 55.163 240.837 48.000 232.000 48.000 ZM 232.000 176.000 L 24.000 176.000 L 24.000 64.000 L 232.000 64.000 ZM 176.000 160.000 C 198.091 160.000 216.000 142.091 216.000 120.000 C 216.000 97.909 198.091 80.000 176.000 80.000 C 153.909 80.000 136.000 97.909 136.000 120.000 C 136.000 142.091 153.909 160.000 176.000 160.000 ZM 152.000 120.000 C 151.994 116.420 152.797 112.885 154.350 109.660 L 186.350 141.660 C 183.121 143.211 179.582 144.011 176.000 144.000 C 162.745 144.000 152.000 133.255 152.000 120.000 ZM 200.000 120.000 C 200.006 123.580 199.203 127.115 197.650 130.340 L 165.650 98.340 C 168.879 96.789 172.418 95.989 176.000 96.000 C 189.255 96.000 200.000 106.745 200.000 120.000 ZM 80.000 160.000 C 102.091 160.000 120.000 142.091 120.000 120.000 C 120.000 97.909 102.091 80.000 80.000 80.000 C 57.909 80.000 40.000 97.909 40.000 120.000 C 40.000 142.091 57.909 160.000 80.000 160.000 ZM 56.000 120.000 C 55.994 116.420 56.797 112.885 58.350 109.660 L 90.350 141.660 C 87.121 143.211 83.582 144.011 80.000 144.000 C 66.745 144.000 56.000 133.255 56.000 120.000 ZM 104.000 120.000 C 104.006 123.580 103.203 127.115 101.650 130.340 L 69.650 98.340 C 72.879 96.789 76.418 95.989 80.000 96.000 C 93.255 96.000 104.000 106.745 104.000 120.000 Z"),
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
        return _graphicsCard!!
    }

private var _graphicsCard: ImageVector? = null
