package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GenderlessLine: ImageVector
    get() {
        if (_genderlessLine != null) return _genderlessLine!!
        _genderlessLine = remixIcon(
            name = "GenderlessLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 7.066 C 16.669 7.555 19.500 10.697 19.500 14.500 C 19.500 18.642 16.142 22.000 12.000 22.000 C 7.858 22.000 4.500 18.642 4.500 14.500 C 4.500 10.697 7.331 7.555 11.000 7.066 L 11.000 1.000 L 13.000 1.000 L 13.000 7.066 ZM 12.000 20.000 C 15.038 20.000 17.500 17.538 17.500 14.500 C 17.500 11.462 15.038 9.000 12.000 9.000 C 8.962 9.000 6.500 11.462 6.500 14.500 C 6.500 17.538 8.962 20.000 12.000 20.000 Z"),
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
        return _genderlessLine!!
    }

private var _genderlessLine: ImageVector? = null
