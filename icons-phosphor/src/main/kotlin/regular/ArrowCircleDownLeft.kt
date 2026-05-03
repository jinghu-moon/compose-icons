package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowCircleDownLeft: ImageVector
    get() {
        if (_arrowCircleDownLeft != null) return _arrowCircleDownLeft!!
        _arrowCircleDownLeft = phosphorRegularIcon(
            name = "ArrowCircleDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 165.660 90.340 C 167.162 91.841 168.006 93.877 168.006 96.000 C 168.006 98.123 167.162 100.159 165.660 101.660 L 115.310 152.000 L 144.000 152.000 C 148.418 152.000 152.000 155.582 152.000 160.000 C 152.000 164.418 148.418 168.000 144.000 168.000 L 96.000 168.000 C 91.582 168.000 88.000 164.418 88.000 160.000 L 88.000 112.000 C 88.000 107.582 91.582 104.000 96.000 104.000 C 100.418 104.000 104.000 107.582 104.000 112.000 L 104.000 140.690 L 154.340 90.340 C 155.841 88.838 157.877 87.994 160.000 87.994 C 162.123 87.994 164.159 88.838 165.660 90.340 Z"),
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
        return _arrowCircleDownLeft!!
    }

private var _arrowCircleDownLeft: ImageVector? = null
