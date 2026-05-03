package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowDownRight: ImageVector
    get() {
        if (_arrowDownRight != null) return _arrowDownRight!!
        _arrowDownRight = phosphorRegularIcon(
            name = "ArrowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 88.000 L 200.000 192.000 C 200.000 196.418 196.418 200.000 192.000 200.000 L 88.000 200.000 C 83.582 200.000 80.000 196.418 80.000 192.000 C 80.000 187.582 83.582 184.000 88.000 184.000 L 172.690 184.000 L 58.340 69.660 C 55.214 66.534 55.214 61.466 58.340 58.340 C 61.466 55.214 66.534 55.214 69.660 58.340 L 184.000 172.690 L 184.000 88.000 C 184.000 83.582 187.582 80.000 192.000 80.000 C 196.418 80.000 200.000 83.582 200.000 88.000 Z"),
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
        return _arrowDownRight!!
    }

private var _arrowDownRight: ImageVector? = null
