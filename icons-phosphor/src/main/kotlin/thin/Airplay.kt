package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Airplay: ImageVector
    get() {
        if (_airplay != null) return _airplay!!
        _airplay = phosphorThinIcon(
            name = "Airplay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 131.000 157.400 C 130.240 156.515 129.132 156.006 127.965 156.006 C 126.798 156.006 125.690 156.515 124.930 157.400 L 76.930 213.400 C 75.920 214.581 75.685 216.240 76.328 217.655 C 76.971 219.070 78.376 219.985 79.930 220.000 L 175.930 220.000 C 177.484 219.985 178.889 219.070 179.532 217.655 C 180.175 216.240 179.940 214.581 178.930 213.400 ZM 88.700 212.000 L 128.000 166.150 L 167.300 212.000 ZM 228.000 64.000 L 228.000 176.000 C 228.000 187.046 219.046 196.000 208.000 196.000 L 200.000 196.000 C 197.791 196.000 196.000 194.209 196.000 192.000 C 196.000 189.791 197.791 188.000 200.000 188.000 L 208.000 188.000 C 214.627 188.000 220.000 182.627 220.000 176.000 L 220.000 64.000 C 220.000 57.373 214.627 52.000 208.000 52.000 L 48.000 52.000 C 41.373 52.000 36.000 57.373 36.000 64.000 L 36.000 176.000 C 36.000 182.627 41.373 188.000 48.000 188.000 L 56.000 188.000 C 58.209 188.000 60.000 189.791 60.000 192.000 C 60.000 194.209 58.209 196.000 56.000 196.000 L 48.000 196.000 C 36.954 196.000 28.000 187.046 28.000 176.000 L 28.000 64.000 C 28.000 52.954 36.954 44.000 48.000 44.000 L 208.000 44.000 C 219.046 44.000 228.000 52.954 228.000 64.000 Z"),
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
        return _airplay!!
    }

private var _airplay: ImageVector? = null
