package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowElbowLeft: ImageVector
    get() {
        if (_arrowElbowLeft != null) return _arrowElbowLeft!!
        _arrowElbowLeft = phosphorDuotoneIcon(
            name = "ArrowElbowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 96.000 80.000 L 24.000 152.000 L 24.000 80.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 237.660 90.340 C 236.159 88.838 234.123 87.994 232.000 87.994 C 229.877 87.994 227.841 88.838 226.340 90.340 L 136.000 180.690 L 71.310 116.000 L 101.660 85.660 C 103.951 83.372 104.636 79.929 103.397 76.938 C 102.158 73.947 99.238 71.997 96.000 72.000 L 24.000 72.000 C 19.582 72.000 16.000 75.582 16.000 80.000 L 16.000 152.000 C 15.997 155.238 17.947 158.158 20.938 159.397 C 23.929 160.636 27.372 159.951 29.660 157.660 L 60.000 127.310 L 130.340 197.660 C 131.841 199.162 133.877 200.006 136.000 200.006 C 138.123 200.006 140.159 199.162 141.660 197.660 L 237.660 101.660 C 239.162 100.159 240.006 98.123 240.006 96.000 C 240.006 93.877 239.162 91.841 237.660 90.340 ZM 32.000 132.690 L 32.000 88.000 L 76.690 88.000 Z"),
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
        return _arrowElbowLeft!!
    }

private var _arrowElbowLeft: ImageVector? = null
