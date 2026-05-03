package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MusicFill: ImageVector
    get() {
        if (_musicFill != null) return _musicFill!!
        _musicFill = remixIcon(
            name = "MusicFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 13.535 L 12.000 3.000 L 20.000 3.000 L 20.000 6.000 L 14.000 6.000 L 14.000 17.000 C 14.000 19.209 12.209 21.000 10.000 21.000 C 7.791 21.000 6.000 19.209 6.000 17.000 C 6.000 14.791 7.791 13.000 10.000 13.000 C 10.729 13.000 11.412 13.195 12.000 13.535 Z"),
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
        return _musicFill!!
    }

private var _musicFill: ImageVector? = null
