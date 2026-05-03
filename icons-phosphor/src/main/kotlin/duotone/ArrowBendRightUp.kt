package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendRightUp: ImageVector
    get() {
        if (_arrowBendRightUp != null) return _arrowBendRightUp!!
        _arrowBendRightUp = phosphorDuotoneIcon(
            name = "ArrowBendRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 80.000 L 104.000 80.000 L 152.000 32.000 Z"),
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
                pathData = parseSvgPathData("M 205.660 74.340 L 157.660 26.340 C 156.159 24.838 154.123 23.994 152.000 23.994 C 149.877 23.994 147.841 24.838 146.340 26.340 L 98.340 74.340 C 96.049 76.628 95.364 80.071 96.603 83.062 C 97.842 86.053 100.762 88.003 104.000 88.000 L 144.000 88.000 L 144.000 128.000 C 143.945 176.578 104.578 215.945 56.000 216.000 C 51.582 216.000 48.000 219.582 48.000 224.000 C 48.000 228.418 51.582 232.000 56.000 232.000 C 113.412 231.939 159.939 185.412 160.000 128.000 L 160.000 88.000 L 200.000 88.000 C 203.238 88.003 206.158 86.053 207.397 83.062 C 208.636 80.071 207.951 76.628 205.660 74.340 ZM 123.310 72.000 L 152.000 43.310 L 180.690 72.000 Z"),
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
        return _arrowBendRightUp!!
    }

private var _arrowBendRightUp: ImageVector? = null
