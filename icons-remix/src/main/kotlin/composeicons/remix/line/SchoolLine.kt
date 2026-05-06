package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SchoolLine: ImageVector
    get() {
        if (_schoolLine != null) return _schoolLine!!
        _schoolLine = remixIcon(
            name = "SchoolLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 .586l6 6v2.414h4v10h1v2h-22v-2h1v-10h4v-2.414L12 .586ZM18 19h2v-8h-2v8ZM6 11h-2v8h2v-8ZM8 7.414v11.586h3v-7h2v7h3v-11.586L12 3.414 8 7.414Z"),
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
        return _schoolLine!!
    }

private var _schoolLine: ImageVector? = null
