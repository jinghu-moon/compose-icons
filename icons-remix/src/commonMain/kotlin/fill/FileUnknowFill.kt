package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileUnknowFill: ImageVector
    get() {
        if (_fileUnknowFill != null) return _fileUnknowFill!!
        _fileUnknowFill = remixIcon(
            name = "FileUnknowFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 2.000 L 21.000 7.000 L 21.000 21.008 C 21.000 21.556 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.545 3.000 21.008 L 3.000 2.992 C 3.000 2.444 3.445 2.000 3.993 2.000 L 16.000 2.000 ZM 11.000 15.000 L 11.000 17.000 L 13.000 17.000 L 13.000 15.000 L 11.000 15.000 ZM 13.000 13.355 C 14.446 12.925 15.500 11.585 15.500 10.000 C 15.500 8.067 13.933 6.500 12.000 6.500 C 10.302 6.500 8.886 7.709 8.567 9.313 L 10.529 9.706 C 10.666 9.018 11.272 8.500 12.000 8.500 C 12.828 8.500 13.500 9.172 13.500 10.000 C 13.500 10.828 12.828 11.500 12.000 11.500 C 11.448 11.500 11.000 11.948 11.000 12.500 L 11.000 14.000 L 13.000 14.000 L 13.000 13.355 Z"),
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
        return _fileUnknowFill!!
    }

private var _fileUnknowFill: ImageVector? = null
