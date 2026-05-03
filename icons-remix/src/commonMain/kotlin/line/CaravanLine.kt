package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CaravanLine: ImageVector
    get() {
        if (_caravanLine != null) return _caravanLine!!
        _caravanLine = remixIcon(
            name = "CaravanLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.172 3.000 C 14.702 3.000 15.211 3.211 15.586 3.586 L 20.414 8.414 C 20.789 8.789 21.000 9.298 21.000 9.828 L 21.000 17.000 L 23.000 17.000 L 23.000 19.000 L 14.874 19.001 C 14.429 20.726 12.864 22.000 11.000 22.000 C 9.136 22.000 7.571 20.726 7.126 19.001 L 3.000 19.000 C 2.448 19.000 2.000 18.552 2.000 18.000 L 2.000 5.000 C 2.000 3.895 2.895 3.000 4.000 3.000 L 14.172 3.000 ZM 11.000 16.000 C 9.895 16.000 9.000 16.895 9.000 18.000 C 9.000 19.105 9.895 20.000 11.000 20.000 C 12.105 20.000 13.000 19.105 13.000 18.000 C 13.000 16.895 12.105 16.000 11.000 16.000 ZM 14.172 5.000 L 4.000 5.000 L 4.000 17.000 L 7.126 17.000 C 7.570 15.275 9.136 14.000 11.000 14.000 C 12.864 14.000 14.430 15.275 14.874 17.000 L 19.000 17.000 L 19.000 9.828 L 14.172 5.000 ZM 14.000 7.000 L 14.000 13.000 L 6.000 13.000 L 6.000 7.000 L 14.000 7.000 ZM 12.000 9.000 L 8.000 9.000 L 8.000 11.000 L 12.000 11.000 L 12.000 9.000 Z"),
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
        return _caravanLine!!
    }

private var _caravanLine: ImageVector? = null
