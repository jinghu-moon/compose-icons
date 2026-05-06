package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HealthBookLine: ImageVector
    get() {
        if (_healthBookLine != null) return _healthBookLine!!
        _healthBookLine = remixIcon(
            name = "HealthBookLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 2c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-14C5.448 22 5 21.552 5 21v-2h-2v-2h2v-2h-2v-2h2v-2h-2v-2h2v-2h-2v-2h2v-2C5 2.448 5.448 2 6 2h14ZM19 4h-12v16h12v-16ZM14 8v3h3v2h-3.001L14 16h-2l-.001-3h-2.999v-2h3v-3h2Z"),
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
        return _healthBookLine!!
    }

private var _healthBookLine: ImageVector? = null
