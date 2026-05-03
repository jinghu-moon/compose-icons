package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Stamp: ImageVector
    get() {
        if (_stamp != null) return _stamp!!
        _stamp = phosphorDuotoneIcon(
            name = "Stamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 159.460 53.000 L 141.680 136.000 L 114.320 136.000 L 96.540 53.000 C 95.032 45.919 96.801 38.535 101.354 32.906 C 105.908 27.276 112.760 24.004 120.000 24.000 L 136.000 24.000 C 143.240 24.004 150.092 27.276 154.646 32.906 C 159.199 38.535 160.968 45.919 159.460 53.000 Z"),
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
        pathData = parseSvgPathData("M 224.000 224.000 C 224.000 228.418 220.418 232.000 216.000 232.000 L 40.000 232.000 C 35.582 232.000 32.000 228.418 32.000 224.000 C 32.000 219.582 35.582 216.000 40.000 216.000 L 216.000 216.000 C 220.418 216.000 224.000 219.582 224.000 224.000 ZM 224.000 144.000 L 224.000 184.000 C 224.000 192.837 216.837 200.000 208.000 200.000 L 48.000 200.000 C 39.163 200.000 32.000 192.837 32.000 184.000 L 32.000 144.000 C 32.000 135.163 39.163 128.000 48.000 128.000 L 104.430 128.000 L 88.720 54.710 C 86.694 45.262 89.046 35.404 95.119 27.888 C 101.192 20.372 110.337 16.003 120.000 16.000 L 136.000 16.000 C 145.665 16.000 154.812 20.367 160.888 27.884 C 166.964 35.400 169.317 45.260 167.290 54.710 L 151.570 128.000 L 208.000 128.000 C 216.837 128.000 224.000 135.163 224.000 144.000 ZM 120.790 128.000 L 135.210 128.000 L 151.640 51.350 C 152.651 46.627 151.475 41.699 148.438 37.942 C 145.402 34.185 140.830 32.002 136.000 32.000 L 120.000 32.000 C 115.168 31.999 110.594 34.181 107.555 37.938 C 104.516 41.696 103.338 46.625 104.350 51.350 ZM 208.000 184.000 L 208.000 144.000 L 48.000 144.000 L 48.000 184.000 L 208.000 184.000 Z"),
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
        return _stamp!!
    }

private var _stamp: ImageVector? = null
