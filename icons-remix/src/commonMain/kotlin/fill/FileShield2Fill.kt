package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileShield2Fill: ImageVector
    get() {
        if (_fileShield2Fill != null) return _fileShield2Fill!!
        _fileShield2Fill = remixIcon(
            name = "FileShield2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 10.000 L 11.000 10.000 L 11.000 17.382 C 11.000 18.945 11.778 20.405 13.074 21.274 L 14.157 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.556 3.000 21.008 L 3.000 2.992 C 3.000 2.455 3.447 2.000 3.998 2.000 L 15.997 2.000 L 21.000 7.000 L 21.000 10.000 ZM 13.000 12.000 L 21.000 12.000 L 21.000 17.382 C 21.000 18.279 20.554 19.116 19.812 19.613 L 17.000 21.498 L 14.188 19.613 C 13.446 19.116 13.000 18.279 13.000 17.382 L 13.000 12.000 Z"),
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
        return _fileShield2Fill!!
    }

private var _fileShield2Fill: ImageVector? = null
