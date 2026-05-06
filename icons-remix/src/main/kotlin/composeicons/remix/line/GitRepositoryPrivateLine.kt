package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GitRepositoryPrivateLine: ImageVector
    get() {
        if (_gitRepositoryPrivateLine != null) return _gitRepositoryPrivateLine!!
        _gitRepositoryPrivateLine = remixIcon(
            name = "GitRepositoryPrivateLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 10v10h13v-10h-13ZM18 8h2c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-12C3 8.448 3.448 8 4 8h2v-1C6 3.686 8.686 1 12 1c3.314 0 6 2.686 6 6v1ZM16 8v-1C16 4.791 14.209 3 12 3 9.791 3 8 4.791 8 7v1h8ZM7 11h2v2h-2v-2ZM7 14h2v2h-2v-2ZM7 17h2v2h-2v-2Z"),
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
        return _gitRepositoryPrivateLine!!
    }

private var _gitRepositoryPrivateLine: ImageVector? = null
