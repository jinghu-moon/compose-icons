package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileForbidLine: ImageVector
    get() {
        if (_fileForbidLine != null) return _fileForbidLine!!
        _fileForbidLine = remixIcon(
            name = "FileForbidLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.29 20c.215 .722 .543 1.396 .965 2h-8.261C3.445 22 3 21.545 3 21.008v-18.016C3 2.444 3.447 2 3.999 2h12.001l5 5v4.674c-.622-.295-1.294-.502-2-.603v-3.071h-4v-4h-10v16h6.29ZM18 23c-2.761 0-5-2.239-5-5 0-2.761 2.239-5 5-5 2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5ZM16.707 20.708c.392 .187 .83 .292 1.293 .292 1.657 0 3-1.343 3-3 0-.463-.105-.902-.292-1.293l-4.001 4.001ZM15.292 19.293l4.001-4.001C18.902 15.105 18.463 15 18 15c-1.657 0-3 1.343-3 3 0 .463 .105 .902 .292 1.293Z"),
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
        return _fileForbidLine!!
    }

private var _fileForbidLine: ImageVector? = null
