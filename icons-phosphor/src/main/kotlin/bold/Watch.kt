package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Watch: ImageVector
    get() {
        if (_watch != null) return _watch!!
        _watch = phosphorBoldIcon(
            name = "Watch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 128.000 C 207.999 104.661 197.787 82.490 180.050 67.320 L 173.000 28.430 C 171.274 18.916 162.989 11.999 153.320 12.000 L 102.680 12.000 C 93.011 11.999 84.726 18.916 83.000 28.430 L 76.000 67.320 C 58.261 82.489 48.048 104.660 48.048 128.000 C 48.048 151.340 58.261 173.511 76.000 188.680 L 83.000 227.570 C 84.726 237.084 93.011 244.001 102.680 244.000 L 153.320 244.000 C 162.989 244.001 171.274 237.084 173.000 227.570 L 180.050 188.680 C 197.787 173.510 207.999 151.339 208.000 128.000 ZM 106.000 36.000 L 150.000 36.000 L 152.900 52.000 C 136.738 46.694 119.302 46.694 103.140 52.000 ZM 150.000 220.000 L 106.000 220.000 L 103.100 204.000 C 119.262 209.306 136.698 209.306 152.860 204.000 ZM 128.000 184.000 C 97.072 184.000 72.000 158.928 72.000 128.000 C 72.000 97.072 97.072 72.000 128.000 72.000 C 158.928 72.000 184.000 97.072 184.000 128.000 C 183.967 158.914 158.914 183.967 128.000 184.000 ZM 168.000 128.000 C 168.000 134.627 162.627 140.000 156.000 140.000 L 128.000 140.000 C 121.373 140.000 116.000 134.627 116.000 128.000 L 116.000 100.000 C 116.000 93.373 121.373 88.000 128.000 88.000 C 134.627 88.000 140.000 93.373 140.000 100.000 L 140.000 116.000 L 156.000 116.000 C 162.627 116.000 168.000 121.373 168.000 128.000 Z"),
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
        return _watch!!
    }

private var _watch: ImageVector? = null
