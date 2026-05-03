package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Suitcase2Fill: ImageVector
    get() {
        if (_suitcase2Fill != null) return _suitcase2Fill!!
        _suitcase2Fill = remixIcon(
            name = "Suitcase2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 23.000 L 16.000 23.000 L 16.000 22.000 L 8.000 22.000 L 8.000 23.000 L 6.000 23.000 L 6.000 22.000 L 5.000 22.000 C 3.895 22.000 3.000 21.105 3.000 20.000 L 3.000 7.000 C 3.000 5.895 3.895 5.000 5.000 5.000 L 8.000 5.000 L 8.000 3.000 C 8.000 2.448 8.448 2.000 9.000 2.000 L 15.000 2.000 C 15.552 2.000 16.000 2.448 16.000 3.000 L 16.000 5.000 L 19.000 5.000 C 20.105 5.000 21.000 5.895 21.000 7.000 L 21.000 20.000 C 21.000 21.105 20.105 22.000 19.000 22.000 L 18.000 22.000 L 18.000 23.000 ZM 10.000 9.000 L 8.000 9.000 L 8.000 18.000 L 10.000 18.000 L 10.000 9.000 ZM 16.000 9.000 L 14.000 9.000 L 14.000 18.000 L 16.000 18.000 L 16.000 9.000 ZM 14.000 4.000 L 10.000 4.000 L 10.000 5.000 L 14.000 5.000 L 14.000 4.000 Z"),
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
        return _suitcase2Fill!!
    }

private var _suitcase2Fill: ImageVector? = null
