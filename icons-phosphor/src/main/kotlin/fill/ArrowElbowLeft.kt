package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowElbowLeft: ImageVector
    get() {
        if (_arrowElbowLeft != null) return _arrowElbowLeft!!
        _arrowElbowLeft = phosphorFillIcon(
            name = "ArrowElbowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.660 101.660 L 141.660 197.660 C 140.159 199.162 138.123 200.006 136.000 200.006 C 133.877 200.006 131.841 199.162 130.340 197.660 L 60.000 127.310 L 29.660 157.660 C 27.372 159.951 23.929 160.636 20.938 159.397 C 17.947 158.158 15.997 155.238 16.000 152.000 L 16.000 80.000 C 16.000 75.582 19.582 72.000 24.000 72.000 L 96.000 72.000 C 99.238 71.997 102.158 73.947 103.397 76.938 C 104.636 79.929 103.951 83.372 101.660 85.660 L 71.310 116.000 L 136.000 180.690 L 226.340 90.340 C 229.466 87.214 234.534 87.214 237.660 90.340 C 240.786 93.466 240.786 98.534 237.660 101.660 Z"),
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
        return _arrowElbowLeft!!
    }

private var _arrowElbowLeft: ImageVector? = null
