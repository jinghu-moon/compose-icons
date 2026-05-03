package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MusicLine: ImageVector
    get() {
        if (_musicLine != null) return _musicLine!!
        _musicLine = remixIcon(
            name = "MusicLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 13.535 L 12.000 3.000 L 20.000 3.000 L 20.000 5.000 L 14.000 5.000 L 14.000 17.000 C 14.000 19.209 12.209 21.000 10.000 21.000 C 7.791 21.000 6.000 19.209 6.000 17.000 C 6.000 14.791 7.791 13.000 10.000 13.000 C 10.729 13.000 11.412 13.195 12.000 13.535 ZM 10.000 19.000 C 11.105 19.000 12.000 18.105 12.000 17.000 C 12.000 15.895 11.105 15.000 10.000 15.000 C 8.895 15.000 8.000 15.895 8.000 17.000 C 8.000 18.105 8.895 19.000 10.000 19.000 Z"),
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
        return _musicLine!!
    }

private var _musicLine: ImageVector? = null
