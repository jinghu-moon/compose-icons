package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowLeftRightFill: ImageVector
    get() {
        if (_arrowLeftRightFill != null) return _arrowLeftRightFill!!
        _arrowLeftRightFill = remixIcon(
            name = "ArrowLeftRightFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 16.000 L 16.000 12.000 L 21.000 17.000 L 16.000 22.000 L 16.000 18.000 L 4.000 18.000 L 4.000 16.000 L 16.000 16.000 ZM 8.000 2.000 L 8.000 5.999 L 20.000 6.000 L 20.000 8.000 L 8.000 8.000 L 8.000 12.000 L 3.000 7.000 L 8.000 2.000 Z"),
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
        return _arrowLeftRightFill!!
    }

private var _arrowLeftRightFill: ImageVector? = null
