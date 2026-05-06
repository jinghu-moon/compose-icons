package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowLeftCircleFill: ImageVector
    get() {
        if (_arrowLeftCircleFill != null) return _arrowLeftCircleFill!!
        _arrowLeftCircleFill = remixIcon(
            name = "ArrowLeftCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.52 0 10 4.48 10 10 0 5.52-4.48 10-10 10C6.48 22 2 17.52 2 12 2 6.48 6.48 2 12 2ZM12 11v-3L8 12l4 4v-3h4v-2h-4Z"),
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
        return _arrowLeftCircleFill!!
    }

private var _arrowLeftCircleFill: ImageVector? = null
