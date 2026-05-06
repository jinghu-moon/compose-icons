package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SparklingLine: ImageVector
    get() {
        if (_sparklingLine != null) return _sparklingLine!!
        _sparklingLine = remixIcon(
            name = "SparklingLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 4.438c1.346 0 2.438-1.091 2.438-2.438h1.125c0 1.346 1.091 2.438 2.438 2.438v1.125C18.654 5.562 17.562 6.654 17.562 8h-1.125C16.438 6.654 15.346 5.562 14 5.562v-1.125ZM1 11C4.314 11 7 8.314 7 5h2c0 3.314 2.686 6 6 6v2c-3.314 0-6 2.686-6 6h-2C7 15.686 4.314 13 1 13v-2ZM4.876 12c1.311 .728 2.396 1.813 3.124 3.124C8.728 13.813 9.813 12.728 11.124 12 9.813 11.272 8.728 10.187 8 8.876 7.272 10.187 6.187 11.272 4.876 12ZM17.25 14c0 1.795-1.455 3.25-3.25 3.25v1.5c1.795 0 3.25 1.455 3.25 3.25h1.5c0-1.795 1.455-3.25 3.25-3.25v-1.5c-1.795 0-3.25-1.455-3.25-3.25h-1.5Z"),
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
        return _sparklingLine!!
    }

private var _sparklingLine: ImageVector? = null
