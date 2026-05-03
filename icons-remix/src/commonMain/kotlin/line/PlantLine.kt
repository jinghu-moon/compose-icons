package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlantLine: ImageVector
    get() {
        if (_plantLine != null) return _plantLine!!
        _plantLine = remixIcon(
            name = "PlantLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.998 2.000 C 8.687 2.000 11.022 3.517 12.195 5.741 C 13.372 4.083 15.309 3.000 17.498 3.000 L 20.998 3.000 L 20.998 5.500 C 20.998 9.090 18.088 12.000 14.498 12.000 L 12.998 12.000 L 12.998 13.000 L 17.998 13.000 L 17.998 20.000 C 17.998 21.105 17.103 22.000 15.998 22.000 L 7.998 22.000 C 6.893 22.000 5.998 21.105 5.998 20.000 L 5.998 13.000 L 10.998 13.000 L 10.998 11.000 L 8.998 11.000 C 5.132 11.000 1.998 7.866 1.998 4.000 L 1.998 2.000 L 5.998 2.000 ZM 15.998 15.000 L 7.998 15.000 L 7.998 20.000 L 15.998 20.000 L 15.998 15.000 ZM 18.998 5.000 L 17.498 5.000 C 15.013 5.000 12.998 7.015 12.998 9.500 L 12.998 10.000 L 14.498 10.000 C 16.983 10.000 18.998 7.985 18.998 5.500 L 18.998 5.000 ZM 5.998 4.000 L 3.998 4.000 C 3.998 6.761 6.237 9.000 8.998 9.000 L 10.998 9.000 C 10.998 6.239 8.759 4.000 5.998 4.000 Z"),
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
        return _plantLine!!
    }

private var _plantLine: ImageVector? = null
