package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Briefcase5Line: ImageVector
    get() {
        if (_briefcase5Line != null) return _briefcase5Line!!
        _briefcase5Line = remixIcon(
            name = "Briefcase5Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 5.000 L 7.000 2.000 C 7.000 1.448 7.448 1.000 8.000 1.000 L 16.000 1.000 C 16.552 1.000 17.000 1.448 17.000 2.000 L 17.000 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 6.000 C 2.000 5.448 2.448 5.000 3.000 5.000 L 7.000 5.000 ZM 16.000 15.000 L 13.000 15.000 L 13.000 16.000 L 11.000 16.000 L 11.000 15.000 L 8.000 15.000 L 8.000 19.000 L 16.000 19.000 L 16.000 15.000 ZM 8.000 7.000 L 8.000 13.000 L 11.000 13.000 L 11.000 12.000 L 13.000 12.000 L 13.000 13.000 L 16.000 13.000 L 16.000 7.000 L 8.000 7.000 ZM 6.000 13.000 L 6.000 7.000 L 4.000 7.000 L 4.000 13.000 L 6.000 13.000 ZM 18.000 13.000 L 20.000 13.000 L 20.000 7.000 L 18.000 7.000 L 18.000 13.000 ZM 6.000 15.000 L 4.000 15.000 L 4.000 19.000 L 6.000 19.000 L 6.000 15.000 ZM 18.000 15.000 L 18.000 19.000 L 20.000 19.000 L 20.000 15.000 L 18.000 15.000 ZM 9.000 3.000 L 9.000 5.000 L 15.000 5.000 L 15.000 3.000 L 9.000 3.000 Z"),
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
        return _briefcase5Line!!
    }

private var _briefcase5Line: ImageVector? = null
