package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FirebaseLine: ImageVector
    get() {
        if (_firebaseLine != null) return _firebaseLine!!
        _firebaseLine = remixIcon(
            name = "FirebaseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.223 8.707 6.911 13.041 8 6.326 9.223 8.707ZM10.368 6.559 7.695 1.353C7.474 .924 6.834 1.025 6.757 1.501L4 18.5l1.748 1.093 5.192 3.245c.649 .405 1.472 .405 2.12 0L20 18.5 18.142 5.961c-.06-.402-.549-.569-.842-.287L14.566 8.311 12.441 4.327c-.188-.353-.694-.353-.882 0L10.368 6.559ZM13.069 9.755 8.667 14 12 7.75l1.069 2.005ZM7.232 18.162 16.591 9.137l1.239 8.361L12 21.142 7.232 18.162Z"),
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
        return _firebaseLine!!
    }

private var _firebaseLine: ImageVector? = null
