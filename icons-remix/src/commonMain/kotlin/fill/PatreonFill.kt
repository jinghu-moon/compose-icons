package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PatreonFill: ImageVector
    get() {
        if (_patreonFill != null) return _patreonFill!!
        _patreonFill = remixIcon(
            name = "PatreonFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.001 17.000 C 10.859 17.000 7.501 13.642 7.501 9.500 C 7.501 5.358 10.859 2.000 15.001 2.000 C 19.143 2.000 22.501 5.358 22.501 9.500 C 22.501 13.642 19.143 17.000 15.001 17.000 ZM 2.001 2.000 L 6.001 2.000 L 6.001 22.000 L 2.001 22.000 L 2.001 2.000 Z"),
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
        return _patreonFill!!
    }

private var _patreonFill: ImageVector? = null
