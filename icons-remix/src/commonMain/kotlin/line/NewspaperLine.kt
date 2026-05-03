package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NewspaperLine: ImageVector
    get() {
        if (_newspaperLine != null) return _newspaperLine!!
        _newspaperLine = remixIcon(
            name = "NewspaperLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 20.000 L 16.000 4.000 L 4.000 4.000 L 4.000 19.000 C 4.000 19.552 4.448 20.000 5.000 20.000 L 16.000 20.000 ZM 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 3.000 C 2.000 2.448 2.448 2.000 3.000 2.000 L 17.000 2.000 C 17.552 2.000 18.000 2.448 18.000 3.000 L 18.000 10.000 L 22.000 10.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 ZM 18.000 12.000 L 18.000 19.000 C 18.000 19.552 18.448 20.000 19.000 20.000 C 19.552 20.000 20.000 19.552 20.000 19.000 L 20.000 12.000 L 18.000 12.000 ZM 6.000 6.000 L 12.000 6.000 L 12.000 12.000 L 6.000 12.000 L 6.000 6.000 ZM 8.000 8.000 L 8.000 10.000 L 10.000 10.000 L 10.000 8.000 L 8.000 8.000 ZM 6.000 13.000 L 14.000 13.000 L 14.000 15.000 L 6.000 15.000 L 6.000 13.000 ZM 6.000 16.000 L 14.000 16.000 L 14.000 18.000 L 6.000 18.000 L 6.000 16.000 Z"),
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
        return _newspaperLine!!
    }

private var _newspaperLine: ImageVector? = null
