package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileCheckLine: ImageVector
    get() {
        if (_fileCheckLine != null) return _fileCheckLine!!
        _fileCheckLine = remixIcon(
            name = "FileCheckLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 20v2h-8.007C3.445 22 3 21.545 3 21.008v-18.016C3 2.444 3.447 2 3.999 2h12.001l5 5v7h-2v-6h-4v-4h-10v16h7ZM14.465 19.465l3.535 3.535 4.95-4.95L21.536 16.636l-3.536 3.536L15.879 18.051l-1.414 1.414Z"),
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
        return _fileCheckLine!!
    }

private var _fileCheckLine: ImageVector? = null
