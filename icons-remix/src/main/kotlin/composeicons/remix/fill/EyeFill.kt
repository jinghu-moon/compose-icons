package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EyeFill: ImageVector
    get() {
        if (_eyeFill != null) return _eyeFill!!
        _eyeFill = remixIcon(
            name = "EyeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.182 12C2.122 6.88 6.608 3 12 3c5.392 0 9.878 3.88 10.819 9-.94 5.12-5.426 9-10.819 9C6.608 21 2.122 17.12 1.182 12ZM12 17c2.761 0 5-2.239 5-5 0-2.761-2.239-5-5-5C9.239 7 7 9.239 7 12c0 2.761 2.239 5 5 5ZM12 15C10.343 15 9 13.657 9 12c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3Z"),
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
        return _eyeFill!!
    }

private var _eyeFill: ImageVector? = null
