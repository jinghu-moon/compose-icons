package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NotSupersetOf: ImageVector
    get() {
        if (_notSupersetOf != null) return _notSupersetOf!!
        _notSupersetOf = phosphorDuotoneIcon(
            name = "NotSupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 104.000 C 208.000 134.928 182.928 160.000 152.000 160.000 L 56.000 160.000 L 56.000 48.000 L 152.000 48.000 C 182.928 48.000 208.000 73.072 208.000 104.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 208.000 192.000 L 80.630 192.000 L 102.450 168.000 L 152.000 168.000 C 177.263 167.983 200.152 153.106 210.426 130.026 C 220.699 106.947 216.435 79.983 199.540 61.200 L 213.920 45.380 C 216.827 42.103 216.558 37.097 213.316 34.151 C 210.074 31.204 205.065 31.413 202.080 34.620 L 187.430 50.730 C 176.944 43.723 164.612 39.988 152.000 40.000 L 56.000 40.000 C 51.582 40.000 48.000 43.582 48.000 48.000 C 48.000 52.418 51.582 56.000 56.000 56.000 L 152.000 56.000 C 160.630 55.992 169.101 58.325 176.510 62.750 L 95.370 152.000 L 56.000 152.000 C 51.582 152.000 48.000 155.582 48.000 160.000 C 48.000 164.418 51.582 168.000 56.000 168.000 L 80.820 168.000 L 42.080 210.620 C 40.117 212.729 39.439 215.730 40.306 218.478 C 41.173 221.225 43.450 223.294 46.267 223.895 C 49.085 224.496 52.008 223.535 53.920 221.380 L 66.080 208.000 L 208.000 208.000 C 212.418 208.000 216.000 204.418 216.000 200.000 C 216.000 195.582 212.418 192.000 208.000 192.000 ZM 188.710 73.120 C 200.710 87.401 203.351 107.341 195.480 124.253 C 187.609 141.165 170.654 151.985 152.000 152.000 L 117.000 152.000 Z"),
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
        return _notSupersetOf!!
    }

private var _notSupersetOf: ImageVector? = null
