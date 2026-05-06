package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CheckDoubleLine: ImageVector
    get() {
        if (_checkDoubleLine != null) return _checkDoubleLine!!
        _checkDoubleLine = remixIcon(
            name = "CheckDoubleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.602 13.76l1.412 1.412L21.479 6.706l1.414 1.414-9.88 9.88L6.65 11.636 8.064 10.222l2.125 2.125 1.413 1.413-0 0ZM11.604 10.932 16.556 5.979l1.41 1.41-4.953 4.953L11.604 10.932ZM8.777 16.587 7.364 18 1 11.636 2.414 10.222l1.413 1.413-.001 .001 4.951 4.951Z"),
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
        return _checkDoubleLine!!
    }

private var _checkDoubleLine: ImageVector? = null
