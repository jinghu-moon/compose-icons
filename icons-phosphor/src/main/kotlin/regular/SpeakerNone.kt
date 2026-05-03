package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpeakerNone: ImageVector
    get() {
        if (_speakerNone != null) return _speakerNone!!
        _speakerNone = phosphorRegularIcon(
            name = "SpeakerNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 155.510 24.810 C 152.765 23.473 149.499 23.814 147.090 25.690 L 77.250 80.000 L 32.000 80.000 C 23.163 80.000 16.000 87.163 16.000 96.000 L 16.000 160.000 C 16.000 168.837 23.163 176.000 32.000 176.000 L 77.250 176.000 L 147.090 230.310 C 149.501 232.184 152.769 232.523 155.513 231.181 C 158.257 229.840 159.998 227.054 160.000 224.000 L 160.000 32.000 C 160.000 28.942 158.258 26.152 155.510 24.810 ZM 32.000 96.000 L 72.000 96.000 L 72.000 160.000 L 32.000 160.000 ZM 144.000 207.640 L 88.000 164.090 L 88.000 91.910 L 144.000 48.360 Z"),
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
        return _speakerNone!!
    }

private var _speakerNone: ImageVector? = null
