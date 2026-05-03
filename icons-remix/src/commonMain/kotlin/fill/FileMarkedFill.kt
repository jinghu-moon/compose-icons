package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileMarkedFill: ImageVector
    get() {
        if (_fileMarkedFill != null) return _fileMarkedFill!!
        _fileMarkedFill = remixIcon(
            name = "FileMarkedFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 2.992 L 21.000 21.008 C 21.000 21.545 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.556 3.000 21.008 L 3.000 2.992 C 3.000 2.455 3.445 2.000 3.993 2.000 L 20.007 2.000 C 20.555 2.000 21.000 2.444 21.000 2.992 ZM 7.000 4.000 L 7.000 13.000 L 10.500 11.000 L 14.000 13.000 L 14.000 4.000 L 7.000 4.000 Z"),
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
        return _fileMarkedFill!!
    }

private var _fileMarkedFill: ImageVector? = null
