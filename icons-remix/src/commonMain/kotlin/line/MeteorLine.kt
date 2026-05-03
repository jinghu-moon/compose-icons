package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MeteorLine: ImageVector
    get() {
        if (_meteorLine != null) return _meteorLine!!
        _meteorLine = remixIcon(
            name = "MeteorLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 1.000 L 21.000 13.000 C 21.000 17.971 16.971 22.000 12.000 22.000 C 7.029 22.000 3.000 17.971 3.000 13.000 C 3.000 9.721 4.754 6.851 7.375 5.278 L 14.000 1.453 L 14.000 4.223 L 21.000 1.000 ZM 19.000 4.122 L 12.000 7.346 L 12.000 4.916 L 8.597 6.881 C 6.472 8.066 5.101 10.267 5.005 12.726 L 5.000 13.000 C 5.000 16.866 8.134 20.000 12.000 20.000 C 15.785 20.000 18.869 16.995 18.996 13.241 L 19.000 13.000 L 19.000 4.122 ZM 12.000 8.000 C 14.761 8.000 17.000 10.239 17.000 13.000 C 17.000 15.761 14.761 18.000 12.000 18.000 C 9.239 18.000 7.000 15.761 7.000 13.000 C 7.000 10.239 9.239 8.000 12.000 8.000 ZM 12.000 10.000 C 10.343 10.000 9.000 11.343 9.000 13.000 C 9.000 14.657 10.343 16.000 12.000 16.000 C 13.657 16.000 15.000 14.657 15.000 13.000 C 15.000 11.343 13.657 10.000 12.000 10.000 Z"),
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
        return _meteorLine!!
    }

private var _meteorLine: ImageVector? = null
