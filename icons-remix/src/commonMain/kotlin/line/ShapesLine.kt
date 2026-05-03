package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShapesLine: ImageVector
    get() {
        if (_shapesLine != null) return _shapesLine!!
        _shapesLine = remixIcon(
            name = "ShapesLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 1.000 L 6.000 11.000 L 18.000 11.000 L 12.000 1.000 ZM 12.000 4.887 L 14.468 9.000 L 9.532 9.000 L 12.000 4.887 ZM 6.750 20.000 C 5.231 20.000 4.000 18.769 4.000 17.250 C 4.000 15.731 5.231 14.500 6.750 14.500 C 8.269 14.500 9.500 15.731 9.500 17.250 C 9.500 18.769 8.269 20.000 6.750 20.000 ZM 6.750 22.000 C 9.373 22.000 11.500 19.873 11.500 17.250 C 11.500 14.627 9.373 12.500 6.750 12.500 C 4.127 12.500 2.000 14.627 2.000 17.250 C 2.000 19.873 4.127 22.000 6.750 22.000 ZM 15.000 15.500 L 15.000 19.500 L 19.000 19.500 L 19.000 15.500 L 15.000 15.500 ZM 13.000 21.500 L 13.000 13.500 L 21.000 13.500 L 21.000 21.500 L 13.000 21.500 Z"),
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
        return _shapesLine!!
    }

private var _shapesLine: ImageVector? = null
