package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlayListAddLine: ImageVector
    get() {
        if (_playListAddLine != null) return _playListAddLine!!
        _playListAddLine = remixIcon(
            name = "PlayListAddLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 18.000 L 12.000 18.000 L 12.000 20.000 L 2.000 20.000 L 2.000 18.000 ZM 2.000 11.000 L 22.000 11.000 L 22.000 13.000 L 2.000 13.000 L 2.000 11.000 ZM 2.000 4.000 L 22.000 4.000 L 22.000 6.000 L 2.000 6.000 L 2.000 4.000 ZM 18.000 18.000 L 18.000 15.000 L 20.000 15.000 L 20.000 18.000 L 23.000 18.000 L 23.000 20.000 L 20.000 20.000 L 20.000 23.000 L 18.000 23.000 L 18.000 20.000 L 15.000 20.000 L 15.000 18.000 L 18.000 18.000 Z"),
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
        return _playListAddLine!!
    }

private var _playListAddLine: ImageVector? = null
