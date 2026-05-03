package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Building4Line: ImageVector
    get() {
        if (_building4Line != null) return _building4Line!!
        _building4Line = remixIcon(
            name = "Building4Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 20.000 L 23.000 20.000 L 23.000 22.000 L 1.000 22.000 L 1.000 20.000 L 3.000 20.000 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 20.000 ZM 19.000 20.000 L 19.000 4.000 L 5.000 4.000 L 5.000 20.000 L 19.000 20.000 ZM 8.000 11.000 L 11.000 11.000 L 11.000 13.000 L 8.000 13.000 L 8.000 11.000 ZM 8.000 7.000 L 11.000 7.000 L 11.000 9.000 L 8.000 9.000 L 8.000 7.000 ZM 8.000 15.000 L 11.000 15.000 L 11.000 17.000 L 8.000 17.000 L 8.000 15.000 ZM 13.000 15.000 L 16.000 15.000 L 16.000 17.000 L 13.000 17.000 L 13.000 15.000 ZM 13.000 11.000 L 16.000 11.000 L 16.000 13.000 L 13.000 13.000 L 13.000 11.000 ZM 13.000 7.000 L 16.000 7.000 L 16.000 9.000 L 13.000 9.000 L 13.000 7.000 Z"),
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
        return _building4Line!!
    }

private var _building4Line: ImageVector? = null
