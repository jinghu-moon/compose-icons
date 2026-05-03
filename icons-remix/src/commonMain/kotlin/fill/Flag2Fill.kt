package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Flag2Fill: ImageVector
    get() {
        if (_flag2Fill != null) return _flag2Fill!!
        _flag2Fill = remixIcon(
            name = "Flag2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 3.000 L 21.138 3.000 C 21.415 3.000 21.639 3.224 21.639 3.500 C 21.639 3.587 21.616 3.673 21.573 3.748 L 18.000 10.000 L 21.573 16.252 C 21.709 16.492 21.626 16.797 21.386 16.934 C 21.311 16.977 21.225 17.000 21.138 17.000 L 4.000 17.000 L 4.000 22.000 L 2.000 22.000 L 2.000 3.000 Z"),
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
        return _flag2Fill!!
    }

private var _flag2Fill: ImageVector? = null
