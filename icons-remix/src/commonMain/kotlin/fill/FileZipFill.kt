package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileZipFill: ImageVector
    get() {
        if (_fileZipFill != null) return _fileZipFill!!
        _fileZipFill = remixIcon(
            name = "FileZipFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 2.000 L 10.000 4.000 L 12.000 4.000 L 12.000 2.000 L 20.007 2.000 C 20.555 2.000 21.000 2.444 21.000 2.992 L 21.000 21.008 C 21.000 21.545 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.556 3.000 21.008 L 3.000 2.992 C 3.000 2.455 3.445 2.000 3.993 2.000 L 10.000 2.000 ZM 12.000 4.000 L 12.000 6.000 L 14.000 6.000 L 14.000 4.000 L 12.000 4.000 ZM 10.000 6.000 L 10.000 8.000 L 12.000 8.000 L 12.000 6.000 L 10.000 6.000 ZM 12.000 8.000 L 12.000 10.000 L 14.000 10.000 L 14.000 8.000 L 12.000 8.000 ZM 10.000 10.000 L 10.000 12.000 L 12.000 12.000 L 12.000 10.000 L 10.000 10.000 ZM 12.000 12.000 L 12.000 14.000 L 10.000 14.000 L 10.000 17.000 L 14.000 17.000 L 14.000 12.000 L 12.000 12.000 Z"),
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
        return _fileZipFill!!
    }

private var _fileZipFill: ImageVector? = null
