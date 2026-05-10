package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MeteorFill: ImageVector
    get() {
        if (_meteorFill != null) return _meteorFill!!
        _meteorFill = remixIcon(
            name = "MeteorFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 1v12c0 4.971-4.029 9-9 9C7.029 22 3 17.971 3 13 3 9.721 4.754 6.851 7.375 5.278L14 1.453v2.77L21 1ZM12 8C9.239 8 7 10.239 7 13c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C17 10.239 14.761 8 12 8Z"),
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
        return _meteorFill!!
    }

private var _meteorFill: ImageVector? = null
