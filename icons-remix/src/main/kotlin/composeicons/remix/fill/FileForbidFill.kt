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
                pathData = parseSvgPathData("M21 11.674C20.091 11.242 19.074 11 18 11c-3.866 0-7 3.134-7 7 0 1.487 .464 2.866 1.255 4h-8.261C3.445 22 3 21.545 3 21.008v-18.016C3 2.444 3.445 2 3.993 2h12.007l5 5v4.674ZM18 23c-2.761 0-5-2.239-5-5 0-2.761 2.239-5 5-5 2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5ZM16.707 20.708c.392 .187 .83 .292 1.293 .292 1.657 0 3-1.343 3-3 0-.463-.105-.902-.292-1.293l-4.001 4.001ZM15.292 19.293l4.001-4.001C18.902 15.105 18.463 15 18 15c-1.657 0-3 1.343-3 3 0 .463 .105 .902 .292 1.293Z"),
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
