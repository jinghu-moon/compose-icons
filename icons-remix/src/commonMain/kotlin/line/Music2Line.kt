package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Music2Line: ImageVector
    get() {
        if (_music2Line != null) return _music2Line!!
        _music2Line = remixIcon(
            name = "Music2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 3.000 L 20.000 17.000 C 20.000 19.209 18.209 21.000 16.000 21.000 C 13.791 21.000 12.000 19.209 12.000 17.000 C 12.000 14.791 13.791 13.000 16.000 13.000 C 16.729 13.000 17.412 13.195 18.000 13.535 L 18.000 5.000 L 9.000 5.000 L 9.000 17.000 C 9.000 19.209 7.209 21.000 5.000 21.000 C 2.791 21.000 1.000 19.209 1.000 17.000 C 1.000 14.791 2.791 13.000 5.000 13.000 C 5.729 13.000 6.412 13.195 7.000 13.535 L 7.000 3.000 L 20.000 3.000 ZM 5.000 19.000 C 6.105 19.000 7.000 18.105 7.000 17.000 C 7.000 15.895 6.105 15.000 5.000 15.000 C 3.895 15.000 3.000 15.895 3.000 17.000 C 3.000 18.105 3.895 19.000 5.000 19.000 ZM 16.000 19.000 C 17.105 19.000 18.000 18.105 18.000 17.000 C 18.000 15.895 17.105 15.000 16.000 15.000 C 14.895 15.000 14.000 15.895 14.000 17.000 C 14.000 18.105 14.895 19.000 16.000 19.000 Z"),
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
        return _music2Line!!
    }

private var _music2Line: ImageVector? = null
