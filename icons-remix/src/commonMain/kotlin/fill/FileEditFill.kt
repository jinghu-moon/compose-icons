package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileEditFill: ImageVector
    get() {
        if (_fileEditFill != null) return _fileEditFill!!
        _fileEditFill = remixIcon(
            name = "FileEditFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 15.243 L 21.000 21.008 C 21.000 21.556 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.551 3.000 20.993 L 3.000 9.000 L 9.000 9.000 C 9.552 9.000 10.000 8.552 10.000 8.000 L 10.000 2.000 L 20.002 2.000 C 20.553 2.000 21.000 2.455 21.000 2.992 L 21.000 6.757 L 12.001 15.756 L 11.995 19.995 L 16.241 20.001 L 21.000 15.243 ZM 21.778 8.808 L 23.192 10.222 L 15.414 18.000 L 13.998 17.998 L 14.000 16.586 L 21.778 8.808 ZM 3.000 7.000 L 8.000 2.003 L 8.000 7.000 L 3.000 7.000 Z"),
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
        return _fileEditFill!!
    }

private var _fileEditFill: ImageVector? = null
