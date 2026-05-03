package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Envelope: ImageVector
    get() {
        if (_envelope != null) return _envelope!!
        _envelope = phosphorDuotoneIcon(
            name = "Envelope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 56.000 L 128.000 144.000 L 32.000 56.000 Z"),
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
                pathData = parseSvgPathData("M 224.000 48.000 L 32.000 48.000 C 27.582 48.000 24.000 51.582 24.000 56.000 L 24.000 192.000 C 24.000 200.837 31.163 208.000 40.000 208.000 L 216.000 208.000 C 224.837 208.000 232.000 200.837 232.000 192.000 L 232.000 56.000 C 232.000 51.582 228.418 48.000 224.000 48.000 ZM 128.000 133.150 L 52.570 64.000 L 203.430 64.000 ZM 98.710 128.000 L 40.000 181.810 L 40.000 74.190 ZM 110.550 138.850 L 122.550 149.900 C 125.610 152.709 130.310 152.709 133.370 149.900 L 145.370 138.850 L 203.370 192.000 L 52.570 192.000 ZM 157.290 128.000 L 216.000 74.180 L 216.000 181.820 Z"),
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
        return _envelope!!
    }

private var _envelope: ImageVector? = null
