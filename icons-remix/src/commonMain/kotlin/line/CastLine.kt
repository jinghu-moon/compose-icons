package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CastLine: ImageVector
    get() {
        if (_castLine != null) return _castLine!!
        _castLine = remixIcon(
            name = "CastLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 15.000 21.000 C 15.000 20.320 14.948 19.652 14.847 19.000 L 20.000 19.000 L 20.000 5.000 L 4.000 5.000 L 4.000 8.153 C 3.348 8.052 2.680 8.000 2.000 8.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 ZM 13.000 21.000 L 11.000 21.000 C 11.000 16.029 6.971 12.000 2.000 12.000 L 2.000 10.000 C 8.075 10.000 13.000 14.925 13.000 21.000 ZM 9.000 21.000 L 7.000 21.000 C 7.000 18.239 4.761 16.000 2.000 16.000 L 2.000 14.000 C 5.866 14.000 9.000 17.134 9.000 21.000 ZM 5.000 21.000 L 2.000 21.000 L 2.000 18.000 C 3.657 18.000 5.000 19.343 5.000 21.000 Z"),
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
        return _castLine!!
    }

private var _castLine: ImageVector? = null
