package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) return _paperPlaneRight!!
        _paperPlaneRight = phosphorBoldIcon(
            name = "PaperPlaneRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 233.860 110.480 L 65.800 14.580 C 58.545 10.516 49.532 11.365 43.164 16.713 C 36.796 22.061 34.401 30.792 37.150 38.640 L 67.330 128.000 L 37.150 217.360 C 34.997 223.477 35.944 230.258 39.689 235.552 C 43.435 240.846 49.515 243.995 56.000 244.000 C 59.437 243.993 62.814 243.105 65.810 241.420 L 65.900 241.360 L 233.900 145.290 C 240.171 141.740 244.048 135.091 244.048 127.885 C 244.048 120.679 240.171 114.030 233.900 110.480 ZM 63.190 215.260 L 88.610 140.000 L 144.000 140.000 C 150.627 140.000 156.000 134.627 156.000 128.000 C 156.000 121.373 150.627 116.000 144.000 116.000 L 88.610 116.000 L 63.180 40.720 L 215.940 127.890 Z"),
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
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
