package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileCloseFill: ImageVector
    get() {
        if (_fileCloseFill != null) return _fileCloseFill!!
        _fileCloseFill = remixIcon(
            name = "FileCloseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 13c1.093 0 2.117 .292 3 .803L21 7 16 2h-12.001C3.447 2 3 2.444 3 2.992v18.016c0 .537 .445 .992 .993 .992h8.809C12.292 21.118 12 20.093 12 19c0-3.314 2.686-6 6-6ZM21.536 21.121 19.414 19l2.121-2.121L20.121 15.464l-2.121 2.121L15.879 15.464l-1.414 1.414 2.121 2.121-2.121 2.121 1.414 1.414 2.121-2.121 2.121 2.121 1.414-1.414Z"),
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
        return _fileCloseFill!!
    }

private var _fileCloseFill: ImageVector? = null
