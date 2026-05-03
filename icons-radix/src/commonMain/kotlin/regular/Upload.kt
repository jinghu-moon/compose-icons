package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Upload: ImageVector
    get() {
        if (_upload != null) return _upload!!
        _upload = radixIcon(
            name = "Upload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.500 10.000 C 12.776 10.000 13.000 10.224 13.000 10.500 L 13.000 12.000 C 13.000 13.104 12.106 14.000 11.001 14.000 L 3.996 14.000 C 2.890 14.000 2.000 13.103 2.000 12.000 L 2.000 10.500 C 2.000 10.224 2.224 10.000 2.500 10.000 C 2.776 10.000 3.000 10.224 3.000 10.500 L 3.000 12.000 C 3.000 12.554 3.446 13.000 3.996 13.000 L 11.001 13.000 C 11.553 13.000 12.000 12.553 12.000 12.000 L 12.000 10.500 C 12.000 10.224 12.224 10.000 12.500 10.000 ZM 7.182 1.182 C 7.357 1.006 7.643 1.006 7.818 1.182 L 10.818 4.182 C 10.994 4.358 10.994 4.643 10.818 4.819 C 10.643 4.994 10.357 4.994 10.182 4.819 L 7.950 2.586 L 7.950 9.500 C 7.950 9.749 7.748 9.949 7.500 9.949 C 7.252 9.949 7.050 9.749 7.050 9.500 L 7.050 2.586 L 4.818 4.819 C 4.643 4.994 4.357 4.994 4.182 4.819 C 4.006 4.643 4.006 4.358 4.182 4.182 L 7.182 1.182 Z"),
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
        return _upload!!
    }

private var _upload: ImageVector? = null
