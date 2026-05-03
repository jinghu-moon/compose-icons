package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EyeLine: ImageVector
    get() {
        if (_eyeLine != null) return _eyeLine!!
        _eyeLine = remixIcon(
            name = "EyeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 C 17.392 3.000 21.878 6.880 22.819 12.000 C 21.878 17.120 17.392 21.000 12.000 21.000 C 6.608 21.000 2.122 17.120 1.182 12.000 C 2.122 6.880 6.608 3.000 12.000 3.000 ZM 12.000 19.000 C 16.236 19.000 19.860 16.052 20.778 12.000 C 19.860 7.948 16.236 5.000 12.000 5.000 C 7.765 5.000 4.140 7.948 3.223 12.000 C 4.140 16.052 7.765 19.000 12.000 19.000 ZM 12.000 16.500 C 9.515 16.500 7.500 14.485 7.500 12.000 C 7.500 9.515 9.515 7.500 12.000 7.500 C 14.486 7.500 16.500 9.515 16.500 12.000 C 16.500 14.485 14.486 16.500 12.000 16.500 ZM 12.000 14.500 C 13.381 14.500 14.500 13.381 14.500 12.000 C 14.500 10.619 13.381 9.500 12.000 9.500 C 10.620 9.500 9.500 10.619 9.500 12.000 C 9.500 13.381 10.620 14.500 12.000 14.500 Z"),
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
        return _eyeLine!!
    }

private var _eyeLine: ImageVector? = null
