package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Home9Line: ImageVector
    get() {
        if (_home9Line != null) return _home9Line!!
        _home9Line = remixIcon(
            name = "Home9Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.581 2.686 C 12.233 2.438 11.766 2.438 11.419 2.686 L 1.919 9.472 L 3.081 11.099 L 12.000 4.729 L 20.919 11.099 L 22.081 9.472 L 12.581 2.686 ZM 19.581 12.686 L 12.581 7.686 C 12.233 7.438 11.766 7.438 11.419 7.686 L 4.419 12.686 C 4.156 12.874 4.000 13.177 4.000 13.500 L 4.000 20.000 C 4.000 20.552 4.448 21.000 5.000 21.000 L 19.000 21.000 C 19.552 21.000 20.000 20.552 20.000 20.000 L 20.000 13.500 C 20.000 13.177 19.844 12.874 19.581 12.686 ZM 6.000 19.000 L 6.000 14.015 L 12.000 9.729 L 18.000 14.015 L 18.000 19.000 L 6.000 19.000 Z"),
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
        return _home9Line!!
    }

private var _home9Line: ImageVector? = null
