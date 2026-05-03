package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bandaids: ImageVector
    get() {
        if (_bandaids != null) return _bandaids!!
        _bandaids = phosphorThinIcon(
            name = "Bandaids",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 178.910 128.000 L 209.460 97.460 C 223.521 83.399 223.521 60.601 209.460 46.540 C 195.399 32.479 172.601 32.479 158.540 46.540 L 128.000 77.090 L 97.460 46.540 C 83.399 32.479 60.601 32.479 46.540 46.540 C 32.479 60.601 32.479 83.399 46.540 97.460 L 77.090 128.000 L 46.540 158.540 C 32.479 172.601 32.479 195.399 46.540 209.460 C 60.601 223.521 83.399 223.521 97.460 209.460 L 128.000 178.910 L 158.540 209.460 C 172.601 223.521 195.399 223.521 209.460 209.460 C 223.521 195.399 223.521 172.601 209.460 158.540 ZM 164.200 52.200 C 175.135 41.265 192.865 41.265 203.800 52.200 C 214.735 63.135 214.735 80.865 203.800 91.800 L 173.250 122.340 L 133.660 82.750 ZM 167.600 128.000 L 128.000 167.600 L 88.400 128.000 L 128.000 88.400 ZM 52.200 91.800 C 41.265 80.865 41.265 63.135 52.200 52.200 C 63.135 41.265 80.865 41.265 91.800 52.200 L 122.340 82.750 L 82.750 122.340 ZM 91.800 203.800 C 80.865 214.735 63.135 214.735 52.200 203.800 C 41.265 192.865 41.265 175.135 52.200 164.200 L 82.750 133.660 L 122.340 173.250 ZM 203.800 203.800 C 198.549 209.052 191.427 212.002 184.000 212.002 C 176.573 212.002 169.451 209.052 164.200 203.800 L 133.660 173.250 L 173.250 133.660 L 203.800 164.200 C 209.052 169.451 212.002 176.573 212.002 184.000 C 212.002 191.427 209.052 198.549 203.800 203.800 ZM 120.000 128.000 C 120.000 123.582 123.582 120.000 128.000 120.000 C 132.418 120.000 136.000 123.582 136.000 128.000 C 136.000 132.418 132.418 136.000 128.000 136.000 C 123.582 136.000 120.000 132.418 120.000 128.000 Z"),
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
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
