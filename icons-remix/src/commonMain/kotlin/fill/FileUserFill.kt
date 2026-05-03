package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileUserFill: ImageVector
    get() {
        if (_fileUserFill != null) return _fileUserFill!!
        _fileUserFill = remixIcon(
            name = "FileUserFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 2.000 L 21.000 7.000 L 21.000 21.008 C 21.000 21.556 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.545 3.000 21.008 L 3.000 2.992 C 3.000 2.444 3.445 2.000 3.993 2.000 L 16.000 2.000 ZM 12.000 11.500 C 13.381 11.500 14.500 10.381 14.500 9.000 C 14.500 7.619 13.381 6.500 12.000 6.500 C 10.619 6.500 9.500 7.619 9.500 9.000 C 9.500 10.381 10.619 11.500 12.000 11.500 ZM 7.527 17.000 L 16.472 17.000 C 16.224 14.750 14.316 13.000 12.000 13.000 C 9.684 13.000 7.776 14.750 7.527 17.000 Z"),
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
        return _fileUserFill!!
    }

private var _fileUserFill: ImageVector? = null
