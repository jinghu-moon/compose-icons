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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 7.000 L 16.000 2.000 L 3.999 2.000 C 3.447 2.000 3.000 2.444 3.000 2.992 L 3.000 21.008 C 3.000 21.545 3.445 22.000 3.993 22.000 L 12.341 22.000 C 12.120 21.374 12.000 20.701 12.000 20.000 C 12.000 16.686 14.686 14.000 18.000 14.000 C 19.093 14.000 20.117 14.292 21.000 14.803 L 21.000 7.000 ZM 14.465 19.465 L 18.000 23.000 L 22.950 18.051 L 21.536 16.636 L 18.000 20.172 L 15.879 18.051 L 14.465 19.465 Z"),
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
        return _fileCheckFill!!
    }

private var _fileCheckFill: ImageVector? = null
