package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileEditLine: ImageVector
    get() {
        if (_fileEditLine != null) return _fileEditLine!!
        _fileEditLine = remixIcon(
            name = "FileEditLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 6.757 L 19.000 8.757 L 19.000 4.000 L 10.000 4.000 L 10.000 9.000 L 5.000 9.000 L 5.000 20.000 L 19.000 20.000 L 19.000 17.243 L 21.000 15.243 L 21.000 21.008 C 21.000 21.556 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.550 3.000 20.993 L 3.000 8.000 L 9.003 2.000 L 19.998 2.000 C 20.551 2.000 21.000 2.455 21.000 2.992 L 21.000 6.757 ZM 21.778 8.808 L 23.192 10.222 L 15.414 18.000 L 13.998 17.998 L 14.000 16.586 L 21.778 8.808 Z"),
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
        return _fileEditLine!!
    }

private var _fileEditLine: ImageVector? = null
