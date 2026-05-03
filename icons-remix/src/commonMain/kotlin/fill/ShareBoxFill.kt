package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShareBoxFill: ImageVector
    get() {
        if (_shareBoxFill != null) return _shareBoxFill!!
        _shareBoxFill = remixIcon(
            name = "ShareBoxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 3.000 L 10.000 5.000 L 5.000 5.000 L 5.000 19.000 L 19.000 19.000 L 19.000 14.000 L 21.000 14.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 10.000 3.000 ZM 17.707 7.707 L 12.000 13.414 L 10.586 12.000 L 16.293 6.293 L 13.000 3.000 L 21.000 3.000 L 21.000 11.000 L 17.707 7.707 Z"),
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
        return _shareBoxFill!!
    }

private var _shareBoxFill: ImageVector? = null
