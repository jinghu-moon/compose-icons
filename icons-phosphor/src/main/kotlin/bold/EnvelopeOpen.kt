package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) return _envelopeOpen!!
        _envelopeOpen = phosphorBoldIcon(
            name = "EnvelopeOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.660 86.000 L 134.660 22.000 C 130.628 19.310 125.372 19.310 121.340 22.000 L 25.340 86.000 C 21.998 88.229 19.994 91.983 20.000 96.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 216.000 220.000 C 227.046 220.000 236.000 211.046 236.000 200.000 L 236.000 96.000 C 236.006 91.983 234.002 88.229 230.660 86.000 ZM 89.810 152.000 L 44.000 184.310 L 44.000 119.310 ZM 114.360 164.000 L 141.640 164.000 L 187.000 196.000 L 69.050 196.000 ZM 166.190 152.000 L 212.000 119.290 L 212.000 184.290 ZM 128.000 46.420 L 202.860 96.330 L 141.610 140.000 L 114.390 140.000 L 53.140 96.330 Z"),
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
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
