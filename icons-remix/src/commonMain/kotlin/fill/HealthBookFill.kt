package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HealthBookFill: ImageVector
    get() {
        if (_healthBookFill != null) return _healthBookFill!!
        _healthBookFill = remixIcon(
            name = "HealthBookFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 6.000 22.000 C 5.448 22.000 5.000 21.552 5.000 21.000 L 5.000 19.000 L 3.000 19.000 L 3.000 17.000 L 5.000 17.000 L 5.000 15.000 L 3.000 15.000 L 3.000 13.000 L 5.000 13.000 L 5.000 11.000 L 3.000 11.000 L 3.000 9.000 L 5.000 9.000 L 5.000 7.000 L 3.000 7.000 L 3.000 5.000 L 5.000 5.000 L 5.000 3.000 C 5.000 2.448 5.448 2.000 6.000 2.000 L 20.000 2.000 ZM 14.000 8.000 L 12.000 8.000 L 12.000 11.000 L 9.000 11.000 L 9.000 13.000 L 11.999 13.000 L 12.000 16.000 L 14.000 16.000 L 13.999 13.000 L 17.000 13.000 L 17.000 11.000 L 14.000 11.000 L 14.000 8.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _healthBookFill!!
    }

private var _healthBookFill: ImageVector? = null
