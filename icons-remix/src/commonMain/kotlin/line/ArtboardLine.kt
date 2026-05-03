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
                pathData = parseSvgPathData("M 8.586 17.000 L 3.000 17.000 L 3.000 15.000 L 21.000 15.000 L 21.000 17.000 L 15.414 17.000 L 18.657 20.243 L 17.243 21.657 L 13.000 17.414 L 13.000 20.000 L 11.000 20.000 L 11.000 17.414 L 6.757 21.657 L 5.343 20.243 L 8.586 17.000 ZM 5.000 3.000 L 19.000 3.000 C 19.552 3.000 20.000 3.448 20.000 4.000 L 20.000 14.000 L 4.000 14.000 L 4.000 4.000 C 4.000 3.448 4.448 3.000 5.000 3.000 ZM 6.000 5.000 L 6.000 12.000 L 18.000 12.000 L 18.000 5.000 L 6.000 5.000 Z"),
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
