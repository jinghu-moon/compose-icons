package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowCircleDownRight: ImageVector
    get() {
        if (_arrowCircleDownRight != null) return _arrowCircleDownRight!!
        _arrowCircleDownRight = phosphorFillIcon(
            name = "ArrowCircleDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 168.000 160.000 C 168.000 164.418 164.418 168.000 160.000 168.000 L 112.000 168.000 C 107.582 168.000 104.000 164.418 104.000 160.000 C 104.000 155.582 107.582 152.000 112.000 152.000 L 140.690 152.000 L 90.340 101.660 C 87.214 98.534 87.214 93.466 90.340 90.340 C 93.466 87.214 98.534 87.214 101.660 90.340 L 152.000 140.690 L 152.000 112.000 C 152.000 107.582 155.582 104.000 160.000 104.000 C 164.418 104.000 168.000 107.582 168.000 112.000 Z"),
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
        return _arrowCircleDownRight!!
    }

private var _arrowCircleDownRight: ImageVector? = null
