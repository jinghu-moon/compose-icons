package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Mosque: ImageVector
    get() {
        if (_mosque != null) return _mosque!!
        _mosque = phosphorFillIcon(
            name = "Mosque",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 128.000 C 221.274 127.999 218.568 128.466 216.000 129.380 L 216.000 128.000 C 216.000 86.220 184.930 65.540 162.240 50.440 C 148.160 41.060 136.000 33.000 136.000 24.000 C 136.000 19.582 132.418 16.000 128.000 16.000 C 123.582 16.000 120.000 19.582 120.000 24.000 C 120.000 33.000 107.840 41.060 93.760 50.440 C 71.070 65.540 40.000 86.220 40.000 128.000 L 40.000 129.380 C 32.656 126.783 24.508 127.913 18.147 132.409 C 11.785 136.906 8.002 144.210 8.000 152.000 L 8.000 208.000 C 8.000 212.418 11.582 216.000 16.000 216.000 L 72.000 216.000 C 76.418 216.000 80.000 212.418 80.000 208.000 L 80.000 176.000 C 80.000 167.163 87.163 160.000 96.000 160.000 C 104.837 160.000 112.000 167.163 112.000 176.000 L 112.000 208.000 C 112.000 212.418 115.582 216.000 120.000 216.000 L 136.000 216.000 C 140.418 216.000 144.000 212.418 144.000 208.000 L 144.000 176.000 C 144.000 167.163 151.163 160.000 160.000 160.000 C 168.837 160.000 176.000 167.163 176.000 176.000 L 176.000 208.000 C 176.000 212.418 179.582 216.000 184.000 216.000 L 240.000 216.000 C 244.418 216.000 248.000 212.418 248.000 208.000 L 248.000 152.000 C 248.000 138.745 237.255 128.000 224.000 128.000 ZM 40.000 200.000 L 24.000 200.000 L 24.000 152.000 C 24.000 147.582 27.582 144.000 32.000 144.000 C 36.418 144.000 40.000 147.582 40.000 152.000 ZM 232.000 200.000 L 216.000 200.000 L 216.000 152.000 C 216.000 147.582 219.582 144.000 224.000 144.000 C 228.418 144.000 232.000 147.582 232.000 152.000 Z"),
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
        return _mosque!!
    }

private var _mosque: ImageVector? = null
