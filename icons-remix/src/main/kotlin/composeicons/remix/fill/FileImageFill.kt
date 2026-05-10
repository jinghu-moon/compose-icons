package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileImageFill: ImageVector
    get() {
        if (_fileImageFill != null) return _fileImageFill!!
        _fileImageFill = remixIcon(
            name = "FileImageFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 7 16 2h-12.007C3.445 2 3 2.444 3 2.992v18.016c0 .537 .445 .992 .993 .992h16.013c.549 0 .993-.444 .993-.992v-14.008ZM11 9.5C11 10.328 10.328 11 9.5 11 8.672 11 8 10.328 8 9.5 8 8.672 8.672 8 9.5 8 10.328 8 11 8.672 11 9.5ZM17.5 17h-9.5l5.5-7 4 7Z"),
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
        return _fileImageFill!!
    }

private var _fileImageFill: ImageVector? = null
