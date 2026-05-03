package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowCircleUpLeft: ImageVector
    get() {
        if (_arrowCircleUpLeft != null) return _arrowCircleUpLeft!!
        _arrowCircleUpLeft = phosphorFillIcon(
            name = "ArrowCircleUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 165.660 165.660 C 164.159 167.162 162.123 168.006 160.000 168.006 C 157.877 168.006 155.841 167.162 154.340 165.660 L 104.000 115.310 L 104.000 144.000 C 104.000 148.418 100.418 152.000 96.000 152.000 C 91.582 152.000 88.000 148.418 88.000 144.000 L 88.000 96.000 C 88.000 91.582 91.582 88.000 96.000 88.000 L 144.000 88.000 C 148.418 88.000 152.000 91.582 152.000 96.000 C 152.000 100.418 148.418 104.000 144.000 104.000 L 115.310 104.000 L 165.660 154.340 C 167.162 155.841 168.006 157.877 168.006 160.000 C 168.006 162.123 167.162 164.159 165.660 165.660 Z"),
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
        return _arrowCircleUpLeft!!
    }

private var _arrowCircleUpLeft: ImageVector? = null
