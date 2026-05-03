package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ProjectorLine: ImageVector
    get() {
        if (_projectorLine != null) return _projectorLine!!
        _projectorLine = remixIcon(
            name = "ProjectorLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 ZM 11.126 12.000 L 4.000 12.000 L 4.000 19.000 L 20.000 19.000 L 20.000 12.000 L 18.874 12.000 C 18.430 13.725 16.864 15.000 15.000 15.000 C 13.136 15.000 11.570 13.725 11.126 12.000 ZM 11.126 10.000 C 11.570 8.275 13.136 7.000 15.000 7.000 C 16.864 7.000 18.430 8.275 18.874 10.000 L 20.000 10.000 L 20.000 5.000 L 4.000 5.000 L 4.000 10.000 L 11.126 10.000 ZM 15.000 13.000 C 16.105 13.000 17.000 12.105 17.000 11.000 C 17.000 9.895 16.105 9.000 15.000 9.000 C 13.895 9.000 13.000 9.895 13.000 11.000 C 13.000 12.105 13.895 13.000 15.000 13.000 ZM 6.000 15.000 L 8.000 15.000 L 8.000 17.000 L 6.000 17.000 L 6.000 15.000 Z"),
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
        return _projectorLine!!
    }

private var _projectorLine: ImageVector? = null
