package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowLeftRightLine: ImageVector
    get() {
        if (_arrowLeftRightLine != null) return _arrowLeftRightLine!!
        _arrowLeftRightLine = remixIcon(
            name = "ArrowLeftRightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.05 12.05 21 17l-4.95 4.95L14.636 20.535l2.536-2.536L4 18v-2l13.172-.001L14.636 13.464l1.414-1.414ZM7.95 2.05 9.364 3.464 6.828 5.999 20 6v2L6.828 7.999l2.536 2.536L7.95 11.949 3 7 7.95 2.05Z"),
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
        return _arrowLeftRightLine!!
    }

private var _arrowLeftRightLine: ImageVector? = null
