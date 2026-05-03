package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Crop2Line: ImageVector
    get() {
        if (_crop2Line != null) return _crop2Line!!
        _crop2Line = remixIcon(
            name = "Crop2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.414 17.000 L 15.000 17.000 L 15.000 19.000 L 6.000 19.000 C 5.448 19.000 5.000 18.552 5.000 18.000 L 5.000 7.000 L 2.000 7.000 L 2.000 5.000 L 5.000 5.000 L 5.000 2.000 L 7.000 2.000 L 7.000 15.586 L 15.586 7.000 L 9.000 7.000 L 9.000 5.000 L 17.586 5.000 L 20.142 2.444 L 21.556 3.858 L 19.000 6.414 L 19.000 17.000 L 22.000 17.000 L 22.000 19.000 L 19.000 19.000 L 19.000 22.000 L 17.000 22.000 L 17.000 8.414 L 8.414 17.000 Z"),
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
        return _crop2Line!!
    }

private var _crop2Line: ImageVector? = null
