package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FilePaperLine: ImageVector
    get() {
        if (_filePaperLine != null) return _filePaperLine!!
        _filePaperLine = remixIcon(
            name = "FilePaperLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 17.000 L 17.000 19.000 C 17.000 19.552 17.448 20.000 18.000 20.000 C 18.552 20.000 19.000 19.552 19.000 19.000 L 19.000 4.000 L 5.000 4.000 L 5.000 15.000 L 3.000 15.000 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 19.000 C 21.000 20.657 19.657 22.000 18.000 22.000 L 4.000 22.000 C 2.343 22.000 1.000 20.657 1.000 19.000 L 1.000 17.000 L 17.000 17.000 Z"),
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
        return _filePaperLine!!
    }

private var _filePaperLine: ImageVector? = null
