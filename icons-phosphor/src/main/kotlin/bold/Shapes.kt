package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = phosphorBoldIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 71.490 60.550 C 69.974 55.464 65.297 51.978 59.990 51.978 C 54.683 51.978 50.006 55.464 48.490 60.550 L 12.490 180.550 C 11.398 184.186 12.092 188.125 14.360 191.169 C 16.628 194.214 20.203 196.005 24.000 196.000 L 96.000 196.000 C 99.793 195.999 103.362 194.205 105.626 191.161 C 107.889 188.117 108.580 184.183 107.490 180.550 ZM 40.130 172.000 L 60.000 105.760 L 79.870 172.000 ZM 212.000 74.000 C 212.000 44.177 187.823 20.000 158.000 20.000 C 128.177 20.000 104.000 44.177 104.000 74.000 C 104.000 103.823 128.177 128.000 158.000 128.000 C 187.810 127.967 211.967 103.810 212.000 74.000 ZM 128.000 74.000 C 128.000 57.431 141.431 44.000 158.000 44.000 C 174.569 44.000 188.000 57.431 188.000 74.000 C 188.000 90.569 174.569 104.000 158.000 104.000 C 141.431 104.000 128.000 90.569 128.000 74.000 ZM 224.000 144.000 L 136.000 144.000 C 129.373 144.000 124.000 149.373 124.000 156.000 L 124.000 208.000 C 124.000 214.627 129.373 220.000 136.000 220.000 L 224.000 220.000 C 230.627 220.000 236.000 214.627 236.000 208.000 L 236.000 156.000 C 236.000 149.373 230.627 144.000 224.000 144.000 ZM 212.000 196.000 L 148.000 196.000 L 148.000 168.000 L 212.000 168.000 Z"),
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
        return _shapes!!
    }

private var _shapes: ImageVector? = null
