package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PatreonLine: ImageVector
    get() {
        if (_patreonLine != null) return _patreonLine!!
        _patreonLine = remixIcon(
            name = "PatreonLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.001 17C10.859 17 7.501 13.642 7.501 9.5 7.501 5.358 10.859 2 15.001 2c4.142 0 7.5 3.358 7.5 7.5 0 4.142-3.358 7.5-7.5 7.5ZM15.001 15c3.037 0 5.5-2.462 5.5-5.5C20.501 6.462 18.038 4 15.001 4 11.963 4 9.501 6.462 9.501 9.5c0 3.038 2.462 5.5 5.5 5.5ZM2.001 2h5v20h-5v-20ZM4.001 4v16h1v-16h-1Z"),
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
        return _patreonLine!!
    }

private var _patreonLine: ImageVector? = null
