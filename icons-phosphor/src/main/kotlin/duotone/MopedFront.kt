package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MopedFront: ImageVector
    get() {
        if (_mopedFront != null) return _mopedFront!!
        _mopedFront = phosphorDuotoneIcon(
            name = "MopedFront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 152.000 168.000 L 152.000 216.000 C 152.000 229.255 141.255 240.000 128.000 240.000 C 114.745 240.000 104.000 229.255 104.000 216.000 L 104.000 168.000 C 104.000 154.745 114.745 144.000 128.000 144.000 C 141.255 144.000 152.000 154.745 152.000 168.000 ZM 128.000 80.000 C 145.673 80.000 160.000 65.673 160.000 48.000 C 160.000 30.327 145.673 16.000 128.000 16.000 C 110.327 16.000 96.000 30.327 96.000 48.000 C 96.000 65.673 110.327 80.000 128.000 80.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 208.000 40.000 L 167.200 40.000 C 163.414 21.357 147.023 7.960 128.000 7.960 C 108.977 7.960 92.586 21.357 88.800 40.000 L 48.000 40.000 C 43.582 40.000 40.000 43.582 40.000 48.000 C 40.000 52.418 43.582 56.000 48.000 56.000 L 88.800 56.000 C 90.534 64.438 94.946 72.091 101.380 77.820 C 78.627 88.249 64.028 110.971 64.000 136.000 L 64.000 200.000 C 64.000 208.837 71.163 216.000 80.000 216.000 L 96.000 216.000 C 96.000 233.673 110.327 248.000 128.000 248.000 C 145.673 248.000 160.000 233.673 160.000 216.000 L 176.000 216.000 C 184.837 216.000 192.000 208.837 192.000 200.000 L 192.000 136.000 C 191.972 110.971 177.373 88.249 154.620 77.820 C 161.054 72.091 165.466 64.438 167.200 56.000 L 208.000 56.000 C 212.418 56.000 216.000 52.418 216.000 48.000 C 216.000 43.582 212.418 40.000 208.000 40.000 ZM 144.000 216.000 C 144.000 224.837 136.837 232.000 128.000 232.000 C 119.163 232.000 112.000 224.837 112.000 216.000 L 112.000 168.000 C 112.000 159.163 119.163 152.000 128.000 152.000 C 136.837 152.000 144.000 159.163 144.000 168.000 ZM 176.000 136.000 L 176.000 200.000 L 160.000 200.000 L 160.000 168.000 C 160.000 150.327 145.673 136.000 128.000 136.000 C 110.327 136.000 96.000 150.327 96.000 168.000 L 96.000 200.000 L 80.000 200.000 L 80.000 136.000 C 80.000 109.490 101.490 88.000 128.000 88.000 C 154.510 88.000 176.000 109.490 176.000 136.000 ZM 104.000 48.000 C 104.000 34.745 114.745 24.000 128.000 24.000 C 141.255 24.000 152.000 34.745 152.000 48.000 C 152.000 61.255 141.255 72.000 128.000 72.000 C 114.745 72.000 104.000 61.255 104.000 48.000 Z"),
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
        return _mopedFront!!
    }

private var _mopedFront: ImageVector? = null
