package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) return _lineSegment!!
        _lineSegment = phosphorFillIcon(
            name = "LineSegment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.81 83.79c-8.757 8.757-22.227 10.722-33.12 4.83L88.62 178.69c6.858 12.683 2.963 28.5-8.999 36.549-11.962 8.049-28.081 5.698-37.246-5.432-9.165-11.13-8.38-27.401 1.815-37.596h0c8.757-8.757 22.227-10.722 33.12-4.83L167.38 77.31c-6.858-12.683-2.963-28.5 8.999-36.549 11.962-8.049 28.081-5.698 37.246 5.432 9.165 11.13 8.38 27.401-1.815 37.596Z"),
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
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
