package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlantLine: ImageVector
    get() {
        if (_plantLine != null) return _plantLine!!
        _plantLine = remixIcon(
            name = "PlantLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.998 2c2.689 0 5.024 1.517 6.197 3.741C13.372 4.083 15.309 3 17.498 3h3.5v2.5C20.998 9.09 18.088 12 14.498 12h-1.5v1h5v7c0 1.105-.895 2-2 2h-8c-1.105 0-2-.895-2-2v-7h5v-2h-2C5.132 11 1.998 7.866 1.998 4v-2h4ZM15.998 15h-8v5h8v-5ZM18.998 5h-1.5C15.013 5 12.998 7.015 12.998 9.5v.5h1.5c2.485 0 4.5-2.015 4.5-4.5v-.5ZM5.998 4h-2c0 2.761 2.239 5 5 5h2C10.998 6.239 8.759 4 5.998 4Z"),
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
        return _plantLine!!
    }

private var _plantLine: ImageVector? = null
