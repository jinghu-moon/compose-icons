package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GitlabFill: ImageVector
    get() {
        if (_gitlabFill != null) return _gitlabFill!!
        _gitlabFill = remixIcon(
            name = "GitlabFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.663 9.987l-.028-.072L18.916 2.821c-.055-.139-.153-.257-.279-.338-.127-.08-.276-.119-.427-.111-.15 .008-.295 .062-.413 .156-.117 .094-.201 .222-.241 .367L15.719 8.52h-7.437L6.443 2.895C6.404 2.75 6.319 2.622 6.202 2.528 6.085 2.434 5.941 2.379 5.791 2.371c-.15-.008-.299 .031-.426 .112-.127 .08-.225 .198-.28 .338L2.362 9.925l-.028 .071c-.391 1.023-.439 2.145-.137 3.198 .302 1.053 .937 1.979 1.811 2.64l.01 .007 .024 .019 4.147 3.104 2.05 1.553 1.246 .944c.146 .111 .325 .17 .508 .17 .183 0 .362-.06 .508-.17l1.246-.944 2.051-1.553 4.171-3.123 .011-.008c.877-.66 1.515-1.587 1.818-2.641 .303-1.054 .255-2.179-.136-3.204Z"),
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
        return _gitlabFill!!
    }

private var _gitlabFill: ImageVector? = null
