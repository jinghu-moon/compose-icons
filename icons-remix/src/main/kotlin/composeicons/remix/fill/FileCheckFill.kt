package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileCheckFill: ImageVector
    get() {
        if (_fileCheckFill != null) return _fileCheckFill!!
        _fileCheckFill = remixIcon(
            name = "FileCheckFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 7 16 2h-12.001C3.447 2 3 2.444 3 2.992v18.016c0 .537 .445 .992 .993 .992h8.348C12.12 21.374 12 20.701 12 20c0-3.314 2.686-6 6-6 1.093 0 2.117 .292 3 .803L21 7ZM14.465 19.465l3.535 3.535 4.95-4.95L21.536 16.636l-3.536 3.536L15.879 18.051l-1.414 1.414Z"),
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
        return _fileCheckFill!!
    }

private var _fileCheckFill: ImageVector? = null
