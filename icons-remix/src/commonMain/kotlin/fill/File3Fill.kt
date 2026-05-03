package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.File3Fill: ImageVector
    get() {
        if (_file3Fill != null) return _file3Fill!!
        _file3Fill = remixIcon(
            name = "File3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 9.000 L 21.000 20.993 C 21.000 21.551 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.556 3.000 21.008 L 3.000 2.992 C 3.000 2.455 3.447 2.000 3.998 2.000 L 14.000 2.000 L 14.000 8.000 C 14.000 8.552 14.448 9.000 15.000 9.000 L 21.000 9.000 ZM 21.000 7.000 L 16.000 7.000 L 16.000 2.003 L 21.000 7.000 Z"),
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
        return _file3Fill!!
    }

private var _file3Fill: ImageVector? = null
