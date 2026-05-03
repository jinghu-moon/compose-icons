package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MacbookLine: ImageVector
    get() {
        if (_macbookLine != null) return _macbookLine!!
        _macbookLine = remixIcon(
            name = "MacbookLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 5.000 L 4.000 16.000 L 20.000 16.000 L 20.000 5.000 L 4.000 5.000 ZM 2.000 4.007 C 2.000 3.451 2.455 3.000 2.992 3.000 L 21.008 3.000 C 21.556 3.000 22.000 3.449 22.000 4.007 L 22.000 18.000 L 2.000 18.000 L 2.000 4.007 ZM 1.000 19.000 L 23.000 19.000 L 23.000 21.000 L 1.000 21.000 L 1.000 19.000 Z"),
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
        return _macbookLine!!
    }

private var _macbookLine: ImageVector? = null
