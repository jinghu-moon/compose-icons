package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronUp: ImageVector
    get() {
        if (_circleChevronUp != null) return _circleChevronUp!!
        _circleChevronUp = tablerFilledIcon(
            name = "CircleChevronUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34M12.707 9.293c-.391-.39-1.023-.39-1.414 0l-3 3c-.39 .391-.39 1.023 0 1.414l.094 .083c.398 .309 .964 .273 1.32-.083L12 11.415l2.293 2.292c.392 .379 1.016 .374 1.402-.012 .386-.386 .391-1.009 .012-1.402Z"),
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
        return _circleChevronUp!!
    }

private var _circleChevronUp: ImageVector? = null
