package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Dresser: ImageVector
    get() {
        if (_dresser != null) return _dresser!!
        _dresser = phosphorFillIcon(
            name = "Dresser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 80.000 C 40.000 82.209 41.791 84.000 44.000 84.000 L 212.000 84.000 C 214.209 84.000 216.000 82.209 216.000 80.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 136.000 64.000 L 120.000 64.000 C 115.582 64.000 112.000 60.418 112.000 56.000 C 112.000 51.582 115.582 48.000 120.000 48.000 L 136.000 48.000 C 140.418 48.000 144.000 51.582 144.000 56.000 C 144.000 60.418 140.418 64.000 136.000 64.000 ZM 212.000 100.000 L 44.000 100.000 C 41.791 100.000 40.000 101.791 40.000 104.000 L 40.000 152.000 C 40.000 154.209 41.791 156.000 44.000 156.000 L 212.000 156.000 C 214.209 156.000 216.000 154.209 216.000 152.000 L 216.000 104.000 C 216.000 101.791 214.209 100.000 212.000 100.000 ZM 136.000 136.000 L 120.270 136.000 C 115.989 136.053 112.391 132.795 112.020 128.530 C 111.873 126.318 112.651 124.144 114.167 122.527 C 115.684 120.910 117.803 119.995 120.020 120.000 L 135.750 120.000 C 140.031 119.947 143.629 123.205 144.000 127.470 C 144.147 129.682 143.369 131.856 141.853 133.473 C 140.336 135.090 138.217 136.005 136.000 136.000 ZM 212.000 172.000 L 44.000 172.000 C 41.791 172.000 40.000 173.791 40.000 176.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 176.000 C 216.000 173.791 214.209 172.000 212.000 172.000 ZM 136.000 208.000 L 120.000 208.000 C 115.582 208.000 112.000 204.418 112.000 200.000 C 112.000 195.582 115.582 192.000 120.000 192.000 L 136.000 192.000 C 140.418 192.000 144.000 195.582 144.000 200.000 C 144.000 204.418 140.418 208.000 136.000 208.000 Z"),
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
        return _dresser!!
    }

private var _dresser: ImageVector? = null
