package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Artboard2Fill: ImageVector
    get() {
        if (_artboard2Fill != null) return _artboard2Fill!!
        _artboard2Fill = remixIcon(
            name = "Artboard2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 6.000 L 18.000 6.000 L 18.000 18.000 L 6.000 18.000 L 6.000 6.000 ZM 6.000 2.000 L 8.000 2.000 L 8.000 5.000 L 6.000 5.000 L 6.000 2.000 ZM 6.000 19.000 L 8.000 19.000 L 8.000 22.000 L 6.000 22.000 L 6.000 19.000 ZM 2.000 6.000 L 5.000 6.000 L 5.000 8.000 L 2.000 8.000 L 2.000 6.000 ZM 2.000 16.000 L 5.000 16.000 L 5.000 18.000 L 2.000 18.000 L 2.000 16.000 ZM 19.000 6.000 L 22.000 6.000 L 22.000 8.000 L 19.000 8.000 L 19.000 6.000 ZM 19.000 16.000 L 22.000 16.000 L 22.000 18.000 L 19.000 18.000 L 19.000 16.000 ZM 16.000 2.000 L 18.000 2.000 L 18.000 5.000 L 16.000 5.000 L 16.000 2.000 ZM 16.000 19.000 L 18.000 19.000 L 18.000 22.000 L 16.000 22.000 L 16.000 19.000 Z"),
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
        return _artboard2Fill!!
    }

private var _artboard2Fill: ImageVector? = null
