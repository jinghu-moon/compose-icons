package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LockStarLine: ImageVector
    get() {
        if (_lockStarLine != null) return _lockStarLine!!
        _lockStarLine = remixIcon(
            name = "LockStarLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 7C6 3.686 8.686 1 12 1c3.314 0 6 2.686 6 6v1h1.5C20.328 8 21 8.672 21 9.5v3.5h-2v-3h-14v10h8v2h-8.5C3.672 22 3 21.328 3 20.5v-11C3 8.672 3.672 8 4.5 8h1.5v-1ZM16 7C16 4.791 14.209 3 12 3 9.791 3 8 4.791 8 7v1h8v-1ZM20.64 20.195l.505 2.945L18.5 21.75l-2.645 1.391 .505-2.945L14.22 18.109l2.957-.43L18.5 15l1.323 2.68 2.957 .43-2.14 2.086Z"),
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
        return _lockStarLine!!
    }

private var _lockStarLine: ImageVector? = null
