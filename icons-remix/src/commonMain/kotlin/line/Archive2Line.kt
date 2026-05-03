package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Archive2Line: ImageVector
    get() {
        if (_archive2Line != null) return _archive2Line!!
        _archive2Line = remixIcon(
            name = "Archive2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 20.000 L 22.000 7.000 L 20.000 3.000 L 4.000 3.000 L 2.000 7.004 L 2.000 20.000 C 2.000 20.552 2.448 21.000 3.000 21.000 L 21.000 21.000 C 21.552 21.000 22.000 20.552 22.000 20.000 ZM 4.000 9.000 L 20.000 9.000 L 20.000 19.000 L 4.000 19.000 L 4.000 9.000 ZM 5.236 5.000 L 18.764 5.000 L 19.764 7.000 L 4.237 7.000 L 5.236 5.000 ZM 15.000 11.000 L 9.000 11.000 L 9.000 13.000 L 15.000 13.000 L 15.000 11.000 Z"),
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
        return _archive2Line!!
    }

private var _archive2Line: ImageVector? = null
