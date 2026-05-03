package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Music2Fill: ImageVector
    get() {
        if (_music2Fill != null) return _music2Fill!!
        _music2Fill = remixIcon(
            name = "Music2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 3.000 L 20.000 17.000 C 20.000 19.209 18.209 21.000 16.000 21.000 C 13.791 21.000 12.000 19.209 12.000 17.000 C 12.000 14.791 13.791 13.000 16.000 13.000 C 16.729 13.000 17.412 13.195 18.000 13.535 L 18.000 6.000 L 9.000 6.000 L 9.000 17.000 C 9.000 19.209 7.209 21.000 5.000 21.000 C 2.791 21.000 1.000 19.209 1.000 17.000 C 1.000 14.791 2.791 13.000 5.000 13.000 C 5.729 13.000 6.412 13.195 7.000 13.535 L 7.000 3.000 L 20.000 3.000 Z"),
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
        return _music2Fill!!
    }

private var _music2Fill: ImageVector? = null
