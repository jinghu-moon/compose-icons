package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowSquareDownRight: ImageVector
    get() {
        if (_arrowSquareDownRight != null) return _arrowSquareDownRight!!
        _arrowSquareDownRight = phosphorRegularIcon(
            name = "ArrowSquareDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 48.000 L 208.000 48.000 ZM 90.340 101.660 C 87.214 98.534 87.214 93.466 90.340 90.340 C 93.466 87.214 98.534 87.214 101.660 90.340 L 152.000 140.690 L 152.000 112.000 C 152.000 107.582 155.582 104.000 160.000 104.000 C 164.418 104.000 168.000 107.582 168.000 112.000 L 168.000 160.000 C 168.000 164.418 164.418 168.000 160.000 168.000 L 112.000 168.000 C 107.582 168.000 104.000 164.418 104.000 160.000 C 104.000 155.582 107.582 152.000 112.000 152.000 L 140.690 152.000 Z"),
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
        return _arrowSquareDownRight!!
    }

private var _arrowSquareDownRight: ImageVector? = null
