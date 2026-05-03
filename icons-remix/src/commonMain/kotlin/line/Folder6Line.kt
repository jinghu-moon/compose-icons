package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Folder6Line: ImageVector
    get() {
        if (_folder6Line != null) return _folder6Line!!
        _folder6Line = remixIcon(
            name = "Folder6Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 10.414 3.000 L 12.414 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.450 21.000 2.000 20.550 2.000 20.000 L 2.000 4.000 ZM 10.586 6.000 L 9.586 5.000 L 4.000 5.000 L 4.000 7.000 L 9.586 7.000 L 10.586 6.000 ZM 4.000 9.000 L 4.000 19.000 L 20.000 19.000 L 20.000 7.000 L 12.414 7.000 L 10.414 9.000 L 4.000 9.000 Z"),
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
        return _folder6Line!!
    }

private var _folder6Line: ImageVector? = null
