package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MeteorFill: ImageVector
    get() {
        if (_meteorFill != null) return _meteorFill!!
        _meteorFill = remixIcon(
            name = "MeteorFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 1.000 L 21.000 13.000 C 21.000 17.971 16.971 22.000 12.000 22.000 C 7.029 22.000 3.000 17.971 3.000 13.000 C 3.000 9.721 4.754 6.851 7.375 5.278 L 14.000 1.453 L 14.000 4.223 L 21.000 1.000 ZM 12.000 8.000 C 9.239 8.000 7.000 10.239 7.000 13.000 C 7.000 15.761 9.239 18.000 12.000 18.000 C 14.761 18.000 17.000 15.761 17.000 13.000 C 17.000 10.239 14.761 8.000 12.000 8.000 Z"),
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
        return _meteorFill!!
    }

private var _meteorFill: ImageVector? = null
