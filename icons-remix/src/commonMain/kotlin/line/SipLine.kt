package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SipLine: ImageVector
    get() {
        if (_sipLine != null) return _sipLine!!
        _sipLine = remixIcon(
            name = "SipLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.457 18.954 L 15.021 10.390 L 13.607 8.976 L 5.043 17.540 L 6.457 18.954 ZM 12.192 7.562 L 10.778 6.148 L 12.192 4.733 L 13.960 6.501 L 16.789 3.673 C 17.179 3.282 17.812 3.282 18.203 3.673 L 20.324 5.794 C 20.715 6.185 20.715 6.818 20.324 7.208 L 17.496 10.037 L 19.264 11.804 L 17.849 13.219 L 16.435 11.804 L 7.243 20.997 L 3.000 20.997 L 3.000 16.754 L 12.192 7.562 Z"),
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
        return _sipLine!!
    }

private var _sipLine: ImageVector? = null
