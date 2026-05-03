package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FriendicaLine: ImageVector
    get() {
        if (_friendicaLine != null) return _friendicaLine!!
        _friendicaLine = remixIcon(
            name = "FriendicaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 4.000 L 16.000 9.000 L 10.000 9.000 L 10.000 11.000 L 16.000 11.000 L 16.000 17.000 L 10.000 17.000 L 10.000 20.000 L 18.000 20.000 C 19.105 20.000 20.000 19.105 20.000 18.000 L 20.000 6.000 C 20.000 4.895 19.105 4.000 18.000 4.000 L 16.000 4.000 ZM 14.000 4.000 L 6.000 4.000 C 4.895 4.000 4.000 4.895 4.000 6.000 L 4.000 18.000 C 4.000 19.105 4.895 20.000 6.000 20.000 L 8.000 20.000 L 8.000 15.000 L 14.000 15.000 L 14.000 13.000 L 8.000 13.000 L 8.000 7.000 L 14.000 7.000 L 14.000 4.000 ZM 2.000 6.000 C 2.000 3.791 3.791 2.000 6.000 2.000 L 18.000 2.000 C 20.209 2.000 22.000 3.791 22.000 6.000 L 22.000 18.000 C 22.000 20.209 20.209 22.000 18.000 22.000 L 6.000 22.000 C 3.791 22.000 2.000 20.209 2.000 18.000 L 2.000 6.000 Z"),
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
        return _friendicaLine!!
    }

private var _friendicaLine: ImageVector? = null
