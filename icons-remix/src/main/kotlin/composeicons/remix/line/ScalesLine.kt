package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ScalesLine: ImageVector
    get() {
        if (_scalesLine != null) return _scalesLine!!
        _scalesLine = remixIcon(
            name = "ScalesLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.998 2v1h7v2h-7v14h4v2h-10v-2h4v-14h-7v-2h7v-1h2ZM4.998 6.343 7.826 9.172c.724 .724 1.172 1.724 1.172 2.828 0 2.209-1.791 4-4 4C2.789 16 .998 14.209 .998 12c0-1.105 .448-2.105 1.172-2.828L4.998 6.343ZM18.998 6.343l2.829 2.828c.724 .724 1.171 1.724 1.171 2.828 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-1.105 .448-2.105 1.172-2.828L18.998 6.343ZM4.998 9.172 3.584 10.586c-.374 .374-.586 .875-.586 1.414 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-.539-.212-1.04-.586-1.414L4.998 9.172ZM18.998 9.172l-1.414 1.414c-.374 .374-.586 .875-.586 1.414 0 1.105 .896 2 2 2 1.105 0 2-.895 2-2 0-.539-.212-1.04-.586-1.414L18.998 9.172Z"),
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
        return _scalesLine!!
    }

private var _scalesLine: ImageVector? = null
