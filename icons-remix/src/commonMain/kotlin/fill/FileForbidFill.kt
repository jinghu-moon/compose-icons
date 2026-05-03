package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileForbidFill: ImageVector
    get() {
        if (_fileForbidFill != null) return _fileForbidFill!!
        _fileForbidFill = remixIcon(
            name = "FileForbidFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 11.674 C 20.091 11.242 19.074 11.000 18.000 11.000 C 14.134 11.000 11.000 14.134 11.000 18.000 C 11.000 19.487 11.464 20.866 12.255 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.545 3.000 21.008 L 3.000 2.992 C 3.000 2.444 3.445 2.000 3.993 2.000 L 16.000 2.000 L 21.000 7.000 L 21.000 11.674 ZM 18.000 23.000 C 15.239 23.000 13.000 20.761 13.000 18.000 C 13.000 15.239 15.239 13.000 18.000 13.000 C 20.761 13.000 23.000 15.239 23.000 18.000 C 23.000 20.761 20.761 23.000 18.000 23.000 ZM 16.707 20.708 C 17.098 20.895 17.537 21.000 18.000 21.000 C 19.657 21.000 21.000 19.657 21.000 18.000 C 21.000 17.537 20.895 17.098 20.708 16.707 L 16.707 20.708 ZM 15.292 19.293 L 19.293 15.292 C 18.902 15.105 18.463 15.000 18.000 15.000 C 16.343 15.000 15.000 16.343 15.000 18.000 C 15.000 18.463 15.105 18.902 15.292 19.293 Z"),
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
        return _fileForbidFill!!
    }

private var _fileForbidFill: ImageVector? = null
