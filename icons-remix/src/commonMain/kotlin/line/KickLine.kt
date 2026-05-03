package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.KickLine: ImageVector
    get() {
        if (_kickLine != null) return _kickLine!!
        _kickLine = remixIcon(
            name = "KickLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 2.000 L 11.000 2.000 L 11.000 4.000 L 13.000 4.000 L 13.000 2.000 L 21.000 2.000 L 21.000 10.000 L 19.000 10.000 L 19.000 14.000 L 21.000 14.000 L 21.000 22.000 L 13.000 22.000 L 13.000 20.000 L 11.000 20.000 L 11.000 22.000 L 3.000 22.000 L 3.000 2.000 ZM 13.000 18.000 L 15.000 18.000 L 15.000 20.000 L 19.000 20.000 L 19.000 16.000 L 17.000 16.000 L 17.000 14.000 L 15.000 14.000 L 15.000 10.000 L 17.000 10.000 L 17.000 8.000 L 19.000 8.000 L 19.000 4.000 L 15.000 4.000 L 15.000 6.000 L 13.000 6.000 L 13.000 8.000 L 9.000 8.000 L 9.000 4.000 L 5.000 4.000 L 5.000 20.000 L 9.000 20.000 L 9.000 16.000 L 13.000 16.000 L 13.000 18.000 Z"),
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
        return _kickLine!!
    }

private var _kickLine: ImageVector? = null
