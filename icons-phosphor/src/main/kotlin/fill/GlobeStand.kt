package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) return _globeStand!!
        _globeStand = phosphorFillIcon(
            name = "GlobeStand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 56.000 104.000 C 56.000 59.817 91.817 24.000 136.000 24.000 C 180.183 24.000 216.000 59.817 216.000 104.000 C 216.000 148.183 180.183 184.000 136.000 184.000 C 91.838 183.950 56.050 148.162 56.000 104.000 ZM 202.460 173.280 C 164.776 209.558 104.985 208.990 67.997 172.003 C 31.010 135.015 30.442 75.224 66.720 37.540 C 68.752 35.488 69.521 32.501 68.731 29.723 C 67.942 26.945 65.716 24.808 62.909 24.132 C 60.101 23.456 57.147 24.346 55.180 26.460 C 25.117 57.797 15.878 103.688 31.473 144.217 C 47.068 184.746 84.685 212.608 128.000 215.710 L 128.000 232.000 L 104.000 232.000 C 99.582 232.000 96.000 235.582 96.000 240.000 C 96.000 244.418 99.582 248.000 104.000 248.000 L 168.000 248.000 C 172.418 248.000 176.000 244.418 176.000 240.000 C 176.000 235.582 172.418 232.000 168.000 232.000 L 144.000 232.000 L 144.000 215.720 C 170.092 213.918 194.715 202.977 213.540 184.820 C 215.654 182.853 216.544 179.899 215.868 177.091 C 215.192 174.284 213.055 172.058 210.277 171.269 C 207.499 170.479 204.512 171.248 202.460 173.280 Z"),
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
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
