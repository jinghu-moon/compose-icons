package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Upload2Line: ImageVector
    get() {
        if (_upload2Line != null) return _upload2Line!!
        _upload2Line = remixIcon(
            name = "Upload2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 19.000 L 20.000 19.000 L 20.000 12.000 L 22.000 12.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 12.000 L 4.000 12.000 L 4.000 19.000 ZM 13.000 9.000 L 13.000 16.000 L 11.000 16.000 L 11.000 9.000 L 6.000 9.000 L 12.000 3.000 L 18.000 9.000 L 13.000 9.000 Z"),
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
        return _upload2Line!!
    }

private var _upload2Line: ImageVector? = null
