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
                pathData = parseSvgPathData("M2 4C2 3.448 2.448 3 3 3h7.414l2 2h8.586c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.45 21 2 20.55 2 20v-16ZM10.586 6 9.586 5h-5.586v2h5.586L10.586 6ZM4 9v10h16v-12h-7.586l-2 2h-6.414Z"),
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
