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
                pathData = parseSvgPathData("M13 7.066c3.669 .489 6.5 3.631 6.5 7.434C19.5 18.642 16.142 22 12 22 7.858 22 4.5 18.642 4.5 14.5 4.5 10.697 7.331 7.555 11 7.066v-6.066h2v6.066ZM12 20c3.038 0 5.5-2.462 5.5-5.5C17.5 11.462 15.038 9 12 9 8.962 9 6.5 11.462 6.5 14.5 6.5 17.538 8.962 20 12 20Z"),
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
