package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Robot3Line: ImageVector
    get() {
        if (_robot3Line != null) return _robot3Line!!
        _robot3Line = remixIcon(
            name = "Robot3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 1.000 L 11.000 2.000 L 7.000 2.000 C 5.343 2.000 4.000 3.343 4.000 5.000 L 4.000 8.000 C 4.000 10.761 6.239 13.000 9.000 13.000 L 15.000 13.000 C 17.761 13.000 20.000 10.761 20.000 8.000 L 20.000 5.000 C 20.000 3.343 18.657 2.000 17.000 2.000 L 13.000 2.000 L 13.000 1.000 L 11.000 1.000 ZM 6.000 5.000 C 6.000 4.448 6.448 4.000 7.000 4.000 L 17.000 4.000 C 17.552 4.000 18.000 4.448 18.000 5.000 L 18.000 8.000 C 18.000 9.657 16.657 11.000 15.000 11.000 L 9.000 11.000 C 7.343 11.000 6.000 9.657 6.000 8.000 L 6.000 5.000 ZM 9.500 9.000 C 10.328 9.000 11.000 8.328 11.000 7.500 C 11.000 6.672 10.328 6.000 9.500 6.000 C 8.672 6.000 8.000 6.672 8.000 7.500 C 8.000 8.328 8.672 9.000 9.500 9.000 ZM 14.500 9.000 C 15.328 9.000 16.000 8.328 16.000 7.500 C 16.000 6.672 15.328 6.000 14.500 6.000 C 13.672 6.000 13.000 6.672 13.000 7.500 C 13.000 8.328 13.672 9.000 14.500 9.000 ZM 6.000 22.000 C 6.000 18.686 8.686 16.000 12.000 16.000 C 15.314 16.000 18.000 18.686 18.000 22.000 L 20.000 22.000 C 20.000 17.582 16.418 14.000 12.000 14.000 C 7.582 14.000 4.000 17.582 4.000 22.000 L 6.000 22.000 Z"),
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
        return _robot3Line!!
    }

private var _robot3Line: ImageVector? = null
