package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) return _arrowDownLeft!!
        _arrowDownLeft = phosphorDuotoneIcon(
            name = "ArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 168.000 192.000 L 64.000 192.000 L 64.000 88.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 197.660 58.340 C 196.159 56.838 194.123 55.994 192.000 55.994 C 189.877 55.994 187.841 56.838 186.340 58.340 L 116.000 128.690 L 69.660 82.340 C 67.372 80.049 63.929 79.364 60.938 80.603 C 57.947 81.842 55.997 84.762 56.000 88.000 L 56.000 192.000 C 56.000 196.418 59.582 200.000 64.000 200.000 L 168.000 200.000 C 171.238 200.003 174.158 198.053 175.397 195.062 C 176.636 192.071 175.951 188.628 173.660 186.340 L 127.310 140.000 L 197.660 69.660 C 199.162 68.159 200.006 66.123 200.006 64.000 C 200.006 61.877 199.162 59.841 197.660 58.340 ZM 72.000 184.000 L 72.000 107.310 L 110.340 145.650 L 110.340 145.650 L 148.690 184.000 Z"),
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
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
