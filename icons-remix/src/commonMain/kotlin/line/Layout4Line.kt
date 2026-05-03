package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Layout4Line: ImageVector
    get() {
        if (_layout4Line != null) return _layout4Line!!
        _layout4Line = remixIcon(
            name = "Layout4Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 20.000 3.000 ZM 11.000 13.000 L 5.000 13.000 L 5.000 19.000 L 11.000 19.000 L 11.000 13.000 ZM 13.000 19.000 L 19.000 19.000 L 19.000 5.000 L 13.000 5.000 L 13.000 19.000 ZM 11.000 5.000 L 5.000 5.000 L 5.000 11.000 L 11.000 11.000 L 11.000 5.000 Z"),
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
        return _layout4Line!!
    }

private var _layout4Line: ImageVector? = null
