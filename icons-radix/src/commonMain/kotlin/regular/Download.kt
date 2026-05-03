package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = radixIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.500 10.000 C 12.776 10.000 13.000 10.224 13.000 10.500 L 13.000 12.000 C 13.000 13.104 12.106 14.000 11.001 14.000 L 3.996 14.000 C 2.890 14.000 2.000 13.103 2.000 12.000 L 2.000 10.500 C 2.000 10.224 2.224 10.000 2.500 10.000 C 2.776 10.000 3.000 10.224 3.000 10.500 L 3.000 12.000 C 3.000 12.554 3.446 13.000 3.996 13.000 L 11.001 13.000 C 11.553 13.000 12.000 12.553 12.000 12.000 L 12.000 10.500 C 12.000 10.224 12.224 10.000 12.500 10.000 ZM 7.500 1.050 C 7.749 1.050 7.950 1.252 7.950 1.500 L 7.950 8.413 L 10.182 6.182 C 10.357 6.006 10.643 6.006 10.818 6.182 C 10.994 6.358 10.994 6.643 10.818 6.819 L 7.818 9.819 C 7.643 9.994 7.357 9.994 7.182 9.819 L 4.182 6.819 C 4.006 6.643 4.006 6.358 4.182 6.182 C 4.357 6.006 4.643 6.006 4.818 6.182 L 7.050 8.413 L 7.050 1.500 C 7.050 1.252 7.251 1.050 7.500 1.050 Z"),
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
        return _download!!
    }

private var _download: ImageVector? = null
