package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileDamageFill: ImageVector
    get() {
        if (_fileDamageFill != null) return _fileDamageFill!!
        _fileDamageFill = remixIcon(
            name = "FileDamageFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 14.000 L 7.000 16.500 L 10.000 13.000 L 13.000 17.000 L 15.000 14.500 L 18.000 15.000 L 15.000 12.000 L 13.000 14.500 L 10.000 9.500 L 6.500 13.250 L 3.000 10.000 L 3.000 2.992 C 3.000 2.455 3.447 2.000 3.998 2.000 L 14.000 2.000 L 14.000 8.000 C 14.000 8.552 14.448 9.000 15.000 9.000 L 21.000 9.000 L 21.000 20.993 C 21.000 21.551 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.556 3.000 21.008 L 3.000 14.000 ZM 21.000 7.000 L 16.000 7.000 L 16.000 2.003 L 21.000 7.000 Z"),
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
        return _fileDamageFill!!
    }

private var _fileDamageFill: ImageVector? = null
