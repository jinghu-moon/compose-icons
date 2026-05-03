package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlayList2Line: ImageVector
    get() {
        if (_playList2Line != null) return _playList2Line!!
        _playList2Line = remixIcon(
            name = "PlayList2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 18.000 L 22.000 20.000 L 2.000 20.000 L 2.000 18.000 L 22.000 18.000 ZM 2.000 3.500 L 10.000 8.500 L 2.000 13.500 L 2.000 3.500 ZM 22.000 11.000 L 22.000 13.000 L 12.000 13.000 L 12.000 11.000 L 22.000 11.000 ZM 4.000 7.109 L 4.000 9.892 L 6.226 8.500 L 4.000 7.109 ZM 22.000 4.000 L 22.000 6.000 L 12.000 6.000 L 12.000 4.000 L 22.000 4.000 Z"),
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
        return _playList2Line!!
    }

private var _playList2Line: ImageVector? = null
