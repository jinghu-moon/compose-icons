package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretLineUp: ImageVector
    get() {
        if (_caretLineUp != null) return _caretLineUp!!
        _caretLineUp = phosphorDuotoneIcon(
            name = "CaretLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 192.000 L 48.000 192.000 L 128.000 112.000 Z"),
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
                pathData = parseSvgPathData("M 133.660 106.340 C 132.159 104.838 130.123 103.994 128.000 103.994 C 125.877 103.994 123.841 104.838 122.340 106.340 L 42.340 186.340 C 40.049 188.628 39.364 192.071 40.603 195.062 C 41.842 198.053 44.762 200.003 48.000 200.000 L 208.000 200.000 C 211.238 200.003 214.158 198.053 215.397 195.062 C 216.636 192.071 215.951 188.628 213.660 186.340 ZM 67.310 184.000 L 128.000 123.310 L 188.690 184.000 ZM 40.000 72.000 C 40.000 67.582 43.582 64.000 48.000 64.000 L 208.000 64.000 C 212.418 64.000 216.000 67.582 216.000 72.000 C 216.000 76.418 212.418 80.000 208.000 80.000 L 48.000 80.000 C 43.582 80.000 40.000 76.418 40.000 72.000 Z"),
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
        return _caretLineUp!!
    }

private var _caretLineUp: ImageVector? = null
