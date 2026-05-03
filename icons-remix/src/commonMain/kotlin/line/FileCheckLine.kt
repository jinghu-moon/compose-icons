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
                pathData = parseSvgPathData("M 12.000 20.000 L 12.000 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.545 3.000 21.008 L 3.000 2.992 C 3.000 2.444 3.447 2.000 3.999 2.000 L 16.000 2.000 L 21.000 7.000 L 21.000 14.000 L 19.000 14.000 L 19.000 8.000 L 15.000 8.000 L 15.000 4.000 L 5.000 4.000 L 5.000 20.000 L 12.000 20.000 ZM 14.465 19.465 L 18.000 23.000 L 22.950 18.051 L 21.536 16.636 L 18.000 20.172 L 15.879 18.051 L 14.465 19.465 Z"),
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
