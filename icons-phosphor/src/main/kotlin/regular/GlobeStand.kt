package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) return _globeStand!!
        _globeStand = phosphorRegularIcon(
            name = "GlobeStand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 136.000 184.000 C 180.183 184.000 216.000 148.183 216.000 104.000 C 216.000 59.817 180.183 24.000 136.000 24.000 C 91.817 24.000 56.000 59.817 56.000 104.000 C 56.050 148.162 91.838 183.950 136.000 184.000 ZM 136.000 40.000 C 171.346 40.000 200.000 68.654 200.000 104.000 C 200.000 139.346 171.346 168.000 136.000 168.000 C 100.654 168.000 72.000 139.346 72.000 104.000 C 72.039 68.670 100.670 40.039 136.000 40.000 ZM 213.770 173.500 C 215.242 175.031 216.045 177.084 216.002 179.208 C 215.959 181.331 215.073 183.350 213.540 184.820 C 194.713 202.975 170.092 213.915 144.000 215.720 L 144.000 232.000 L 168.000 232.000 C 172.418 232.000 176.000 235.582 176.000 240.000 C 176.000 244.418 172.418 248.000 168.000 248.000 L 104.000 248.000 C 99.582 248.000 96.000 244.418 96.000 240.000 C 96.000 235.582 99.582 232.000 104.000 232.000 L 128.000 232.000 L 128.000 215.710 C 84.685 212.608 47.068 184.746 31.473 144.217 C 15.878 103.688 25.117 57.797 55.180 26.460 C 57.147 24.346 60.101 23.456 62.909 24.132 C 65.716 24.808 67.942 26.945 68.731 29.723 C 69.521 32.501 68.752 35.488 66.720 37.540 C 30.442 75.224 31.010 135.015 67.997 172.003 C 104.985 208.990 164.776 209.558 202.460 173.280 C 205.644 170.218 210.707 170.317 213.770 173.500 Z"),
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
