package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.File3Line: ImageVector
    get() {
        if (_file3Line != null) return _file3Line!!
        _file3Line = remixIcon(
            name = "File3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 8.000 L 21.000 20.993 C 21.000 21.550 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.556 3.000 21.008 L 3.000 2.992 C 3.000 2.455 3.449 2.000 4.002 2.000 L 14.997 2.000 L 21.000 8.000 ZM 19.000 9.000 L 14.000 9.000 L 14.000 4.000 L 5.000 4.000 L 5.000 20.000 L 19.000 20.000 L 19.000 9.000 Z"),
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
        return _file3Line!!
    }

private var _file3Line: ImageVector? = null
