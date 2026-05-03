package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Suitcase3Line: ImageVector
    get() {
        if (_suitcase3Line != null) return _suitcase3Line!!
        _suitcase3Line = remixIcon(
            name = "Suitcase3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 1.000 C 15.552 1.000 16.000 1.448 16.000 2.000 L 16.000 7.000 L 17.000 7.000 L 17.000 6.000 L 19.000 6.000 L 19.000 7.000 L 20.000 7.000 C 20.552 7.000 21.000 7.448 21.000 8.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 19.000 21.000 L 19.000 22.000 L 17.000 22.000 L 17.000 21.000 L 7.000 21.000 L 7.000 22.000 L 5.000 22.000 L 5.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 8.000 C 3.000 7.448 3.448 7.000 4.000 7.000 L 5.000 7.000 L 5.000 6.000 L 7.000 6.000 L 7.000 7.000 L 8.000 7.000 L 8.000 2.000 C 8.000 1.448 8.448 1.000 9.000 1.000 L 15.000 1.000 ZM 19.000 9.000 L 5.000 9.000 L 5.000 19.000 L 19.000 19.000 L 19.000 9.000 ZM 9.000 10.000 L 9.000 18.000 L 7.000 18.000 L 7.000 10.000 L 9.000 10.000 ZM 13.000 10.000 L 13.000 18.000 L 11.000 18.000 L 11.000 10.000 L 13.000 10.000 ZM 17.000 10.000 L 17.000 18.000 L 15.000 18.000 L 15.000 10.000 L 17.000 10.000 ZM 14.000 3.000 L 10.000 3.000 L 10.000 7.000 L 14.000 7.000 L 14.000 3.000 Z"),
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
        return _suitcase3Line!!
    }

private var _suitcase3Line: ImageVector? = null
