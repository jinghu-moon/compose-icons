package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SchoolFill: ImageVector
    get() {
        if (_schoolFill != null) return _schoolFill!!
        _schoolFill = remixIcon(
            name = "SchoolFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M23 19h-1v-10h-4v-2.414L12 .586 6 6.586v2.414h-4v10h-1v2h22v-2ZM6 19h-2v-8h2v8ZM18 11h2v8h-2v-8ZM11 12h2v7h-2v-7Z"),
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
        return _schoolFill!!
    }

private var _schoolFill: ImageVector? = null
