package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LinkedinFill: ImageVector
    get() {
        if (_linkedinFill != null) return _linkedinFill!!
        _linkedinFill = remixIcon(
            name = "LinkedinFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.94 5C6.94 5.814 6.446 6.547 5.691 6.853 4.937 7.158 4.072 6.976 3.505 6.392 2.938 5.807 2.782 4.937 3.111 4.192 3.439 3.447 4.187 2.976 5 3c1.081 .032 1.94 .918 1.94 2ZM7 8.48h-4v12.52h4v-12.52ZM13.321 8.48h-3.98v12.52h3.94v-6.57c0-3.66 4.77-4 4.77 0v6.57h3.95v-7.93c0-6.17-7.06-5.94-8.72-2.91l.04-1.68Z"),
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
        return _linkedinFill!!
    }

private var _linkedinFill: ImageVector? = null
