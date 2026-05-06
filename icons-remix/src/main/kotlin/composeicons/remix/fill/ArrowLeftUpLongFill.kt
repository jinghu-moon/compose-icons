package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowLeftUpLongFill: ImageVector
    get() {
        if (_arrowLeftUpLongFill != null) return _arrowLeftUpLongFill!!
        _arrowLeftUpLongFill = remixIcon(
            name = "ArrowLeftUpLongFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.364 19.778l1.414-1.414L10.172 8.757 14 4.929h-9.071L4.929 14 8.757 10.172l9.607 9.607Z"),
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
        return _arrowLeftUpLongFill!!
    }

private var _arrowLeftUpLongFill: ImageVector? = null
