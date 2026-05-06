package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RulerLine: ImageVector
    get() {
        if (_rulerLine != null) return _rulerLine!!
        _rulerLine = remixIcon(
            name = "RulerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.343 14.728 3.515 17.556l3.536 3.535L20.485 7.657 16.95 4.121 14.828 6.243l1.414 1.414L14.828 9.071 13.414 7.657 11.293 9.778l2.121 2.121-1.414 1.414L9.879 11.193 7.757 13.314l1.414 1.414L7.757 16.142 6.343 14.728ZM17.657 2l4.95 4.95c.39 .391 .39 1.024 0 1.414L7.757 23.213c-.391 .39-1.024 .39-1.414 0L1.393 18.264c-.391-.391-.391-1.024 0-1.414L16.243 2c.39-.391 1.024-.391 1.414 0Z"),
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
        return _rulerLine!!
    }

private var _rulerLine: ImageVector? = null
