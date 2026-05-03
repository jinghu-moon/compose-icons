package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = phosphorDuotoneIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 40.000 L 200.000 200.000 C 200.000 208.837 192.837 216.000 184.000 216.000 L 56.000 216.000 L 56.000 56.000 C 56.000 47.163 63.163 40.000 72.000 40.000 Z"),
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
                pathData = parseSvgPathData("M 208.000 40.000 C 208.000 44.418 204.418 48.000 200.000 48.000 L 170.710 48.000 C 159.107 47.997 149.164 56.294 147.090 67.710 L 137.590 120.000 L 184.000 120.000 C 188.418 120.000 192.000 123.582 192.000 128.000 C 192.000 132.418 188.418 136.000 184.000 136.000 L 134.680 136.000 L 124.680 191.160 C 121.218 210.191 104.633 224.017 85.290 224.000 L 56.000 224.000 C 51.582 224.000 48.000 220.418 48.000 216.000 C 48.000 211.582 51.582 208.000 56.000 208.000 L 85.290 208.000 C 96.893 208.003 106.836 199.706 108.910 188.290 L 118.410 136.000 L 72.000 136.000 C 67.582 136.000 64.000 132.418 64.000 128.000 C 64.000 123.582 67.582 120.000 72.000 120.000 L 121.320 120.000 L 131.320 64.840 C 134.782 45.809 151.367 31.983 170.710 32.000 L 200.000 32.000 C 204.418 32.000 208.000 35.582 208.000 40.000 Z"),
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
        return _function!!
    }

private var _function: ImageVector? = null
