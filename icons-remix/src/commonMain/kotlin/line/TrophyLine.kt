package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TrophyLine: ImageVector
    get() {
        if (_trophyLine != null) return _trophyLine!!
        _trophyLine = remixIcon(
            name = "TrophyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.005 16.941 L 13.005 19.003 L 18.005 19.003 L 18.005 21.003 L 6.005 21.003 L 6.005 19.003 L 11.005 19.003 L 11.005 16.941 C 7.059 16.449 4.005 13.082 4.005 9.003 L 4.005 3.003 L 20.005 3.003 L 20.005 9.003 C 20.005 13.082 16.951 16.449 13.005 16.941 ZM 6.005 5.003 L 6.005 9.003 C 6.005 12.316 8.691 15.003 12.005 15.003 C 15.319 15.003 18.005 12.316 18.005 9.003 L 18.005 5.003 L 6.005 5.003 ZM 1.005 5.003 L 3.005 5.003 L 3.005 9.003 L 1.005 9.003 L 1.005 5.003 ZM 21.005 5.003 L 23.005 5.003 L 23.005 9.003 L 21.005 9.003 L 21.005 5.003 Z"),
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
        return _trophyLine!!
    }

private var _trophyLine: ImageVector? = null
