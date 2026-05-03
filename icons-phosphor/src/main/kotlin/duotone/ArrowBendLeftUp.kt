package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendLeftUp: ImageVector
    get() {
        if (_arrowBendLeftUp != null) return _arrowBendLeftUp!!
        _arrowBendLeftUp = phosphorDuotoneIcon(
            name = "ArrowBendLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 152.000 80.000 L 56.000 80.000 L 104.000 32.000 Z"),
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
                pathData = parseSvgPathData("M 200.000 216.000 C 151.422 215.945 112.055 176.578 112.000 128.000 L 112.000 88.000 L 152.000 88.000 C 155.238 88.003 158.158 86.053 159.397 83.062 C 160.636 80.071 159.951 76.628 157.660 74.340 L 109.660 26.340 C 108.159 24.838 106.123 23.994 104.000 23.994 C 101.877 23.994 99.841 24.838 98.340 26.340 L 50.340 74.340 C 48.049 76.628 47.364 80.071 48.603 83.062 C 49.842 86.053 52.762 88.003 56.000 88.000 L 96.000 88.000 L 96.000 128.000 C 96.061 185.412 142.588 231.939 200.000 232.000 C 204.418 232.000 208.000 228.418 208.000 224.000 C 208.000 219.582 204.418 216.000 200.000 216.000 ZM 104.000 43.310 L 132.690 72.000 L 75.310 72.000 Z"),
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
        return _arrowBendLeftUp!!
    }

private var _arrowBendLeftUp: ImageVector? = null
