package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowDownRight: ImageVector
    get() {
        if (_arrowDownRight != null) return _arrowDownRight!!
        _arrowDownRight = phosphorFillIcon(
            name = "ArrowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 88.000 L 200.000 192.000 C 200.000 196.418 196.418 200.000 192.000 200.000 L 88.000 200.000 C 84.762 200.003 81.842 198.053 80.603 195.062 C 79.364 192.071 80.049 188.628 82.340 186.340 L 128.690 140.000 L 58.340 69.660 C 55.214 66.534 55.214 61.466 58.340 58.340 C 61.466 55.214 66.534 55.214 69.660 58.340 L 140.000 128.690 L 186.340 82.340 C 188.628 80.049 192.071 79.364 195.062 80.603 C 198.053 81.842 200.003 84.762 200.000 88.000 Z"),
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
        return _arrowDownRight!!
    }

private var _arrowDownRight: ImageVector? = null
