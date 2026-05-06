package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Prohibited2Line: ImageVector
    get() {
        if (_prohibited2Line != null) return _prohibited2Line!!
        _prohibited2Line = remixIcon(
            name = "Prohibited2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.906 5.68 5.68 16.906C4.626 15.551 4 13.849 4 12 4 7.582 7.582 4 12 4c1.849 0 3.551 .626 4.906 1.68ZM7.094 18.32 18.32 7.094C19.374 8.449 20 10.151 20 12c0 4.418-3.582 8-8 8C10.151 20 8.449 19.374 7.094 18.32ZM12 2C6.477 2 2 6.477 2 12c0 5.522 4.478 10 10 10 5.523 0 10-4.477 10-10C22 6.478 17.522 2 12 2Z"),
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
        return _prohibited2Line!!
    }

private var _prohibited2Line: ImageVector? = null
