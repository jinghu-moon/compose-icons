package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) return _paperPlane!!
        _paperPlane = phosphorBoldIcon(
            name = "PaperPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 241.420 198.200 L 241.360 198.110 L 145.300 30.170 C 141.752 23.894 135.100 20.013 127.890 20.013 C 120.680 20.013 114.028 23.894 110.480 30.170 L 14.580 198.200 C 10.516 205.455 11.365 214.468 16.713 220.836 C 22.061 227.204 30.792 229.599 38.640 226.850 L 128.000 196.670 L 217.360 226.850 C 219.508 227.612 221.771 228.001 224.050 228.000 C 231.143 227.977 237.693 224.200 241.265 218.072 C 244.836 211.944 244.895 204.383 241.420 198.200 ZM 140.000 175.390 L 140.000 120.000 C 140.000 113.373 134.627 108.000 128.000 108.000 C 121.373 108.000 116.000 113.373 116.000 120.000 L 116.000 175.390 L 40.720 200.820 L 127.890 48.060 L 215.260 200.810 Z"),
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
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
