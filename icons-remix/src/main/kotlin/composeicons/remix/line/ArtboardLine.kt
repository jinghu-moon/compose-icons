package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArtboardLine: ImageVector
    get() {
        if (_artboardLine != null) return _artboardLine!!
        _artboardLine = remixIcon(
            name = "ArtboardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.586 17h-5.586v-2h18v2h-5.586l3.243 3.243-1.414 1.414L13 17.414v2.586h-2v-2.586L6.757 21.657 5.343 20.243 8.586 17ZM5 3h14c.552 0 1 .448 1 1v10h-16v-10C4 3.448 4.448 3 5 3ZM6 5v7h12v-7h-12Z"),
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
        return _artboardLine!!
    }

private var _artboardLine: ImageVector? = null
