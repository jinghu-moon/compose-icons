package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.EnvelopeSimple: ImageVector
    get() {
        if (_envelopeSimple != null) return _envelopeSimple!!
        _envelopeSimple = phosphorDuotoneIcon(
            name = "EnvelopeSimple",
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
                pathData = parseSvgPathData("M 224.000 48.000 L 32.000 48.000 C 27.582 48.000 24.000 51.582 24.000 56.000 L 24.000 192.000 C 24.000 200.837 31.163 208.000 40.000 208.000 L 216.000 208.000 C 224.837 208.000 232.000 200.837 232.000 192.000 L 232.000 56.000 C 232.000 51.582 228.418 48.000 224.000 48.000 ZM 203.430 64.000 L 128.000 133.150 L 52.570 64.000 ZM 216.000 192.000 L 40.000 192.000 L 40.000 74.190 L 122.590 149.900 C 125.650 152.709 130.350 152.709 133.410 149.900 L 216.000 74.190 L 216.000 192.000 Z"),
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
        return _envelopeSimple!!
    }

private var _envelopeSimple: ImageVector? = null
