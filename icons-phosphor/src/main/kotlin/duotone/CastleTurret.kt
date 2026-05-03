package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) return _castleTurret!!
        _castleTurret = phosphorDuotoneIcon(
            name = "CastleTurret",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 48.000 L 208.000 92.690 C 207.999 94.809 207.157 96.841 205.660 98.340 L 192.000 112.000 L 192.000 224.000 L 152.000 224.000 L 152.000 168.000 C 152.000 154.745 141.255 144.000 128.000 144.000 C 114.745 144.000 104.000 154.745 104.000 168.000 L 104.000 224.000 L 64.000 224.000 L 64.000 112.000 L 50.340 98.340 C 48.843 96.841 48.001 94.809 48.000 92.690 L 48.000 48.000 C 48.000 43.582 51.582 40.000 56.000 40.000 L 80.000 40.000 L 80.000 72.000 L 112.000 72.000 L 112.000 40.000 L 144.000 40.000 L 144.000 72.000 L 176.000 72.000 L 176.000 40.000 L 200.000 40.000 C 204.418 40.000 208.000 43.582 208.000 48.000 Z"),
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
        pathData = parseSvgPathData("M 216.000 216.000 L 200.000 216.000 L 200.000 115.310 L 211.310 104.000 C 214.324 101.010 216.014 96.936 216.000 92.690 L 216.000 48.000 C 216.000 39.163 208.837 32.000 200.000 32.000 L 176.000 32.000 C 171.582 32.000 168.000 35.582 168.000 40.000 L 168.000 64.000 L 152.000 64.000 L 152.000 40.000 C 152.000 35.582 148.418 32.000 144.000 32.000 L 112.000 32.000 C 107.582 32.000 104.000 35.582 104.000 40.000 L 104.000 64.000 L 88.000 64.000 L 88.000 40.000 C 88.000 35.582 84.418 32.000 80.000 32.000 L 56.000 32.000 C 47.163 32.000 40.000 39.163 40.000 48.000 L 40.000 92.690 C 39.986 96.936 41.676 101.010 44.690 104.000 L 56.000 115.310 L 56.000 216.000 L 40.000 216.000 C 35.582 216.000 32.000 219.582 32.000 224.000 C 32.000 228.418 35.582 232.000 40.000 232.000 L 216.000 232.000 C 220.418 232.000 224.000 228.418 224.000 224.000 C 224.000 219.582 220.418 216.000 216.000 216.000 ZM 69.660 106.340 L 56.000 92.690 L 56.000 48.000 L 72.000 48.000 L 72.000 72.000 C 72.000 76.418 75.582 80.000 80.000 80.000 L 112.000 80.000 C 116.418 80.000 120.000 76.418 120.000 72.000 L 120.000 48.000 L 136.000 48.000 L 136.000 72.000 C 136.000 76.418 139.582 80.000 144.000 80.000 L 176.000 80.000 C 180.418 80.000 184.000 76.418 184.000 72.000 L 184.000 48.000 L 200.000 48.000 L 200.000 92.690 L 186.340 106.340 C 184.840 107.842 183.998 109.878 184.000 112.000 L 184.000 216.000 L 160.000 216.000 L 160.000 168.000 C 160.000 150.327 145.673 136.000 128.000 136.000 C 110.327 136.000 96.000 150.327 96.000 168.000 L 96.000 216.000 L 72.000 216.000 L 72.000 112.000 C 72.002 109.878 71.160 107.842 69.660 106.340 ZM 144.000 216.000 L 112.000 216.000 L 112.000 168.000 C 112.000 159.163 119.163 152.000 128.000 152.000 C 136.837 152.000 144.000 159.163 144.000 168.000 Z"),
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
        return _castleTurret!!
    }

private var _castleTurret: ImageVector? = null
