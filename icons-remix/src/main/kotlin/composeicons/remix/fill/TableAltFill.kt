package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TableAltFill: ImageVector
    get() {
        if (_tableAltFill != null) return _tableAltFill!!
        _tableAltFill = remixIcon(
            name = "TableAltFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 14v-11h-4C2.448 3 2 3.448 2 4v10h5ZM15 14v-11h-6v11h6ZM22 14v-10C22 3.448 21.552 3 21 3h-4v11h5ZM21 21c.552 0 1-.448 1-1v-4h-20v4c0 .552 .448 1 1 1h18Z"),
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
        return _tableAltFill!!
    }

private var _tableAltFill: ImageVector? = null
