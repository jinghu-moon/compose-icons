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
                pathData = parseSvgPathData("M 15.001 17.000 C 10.859 17.000 7.501 13.642 7.501 9.500 C 7.501 5.358 10.859 2.000 15.001 2.000 C 19.143 2.000 22.501 5.358 22.501 9.500 C 22.501 13.642 19.143 17.000 15.001 17.000 ZM 15.001 15.000 C 18.038 15.000 20.501 12.538 20.501 9.500 C 20.501 6.462 18.038 4.000 15.001 4.000 C 11.963 4.000 9.501 6.462 9.501 9.500 C 9.501 12.538 11.963 15.000 15.001 15.000 ZM 2.001 2.000 L 7.001 2.000 L 7.001 22.000 L 2.001 22.000 L 2.001 2.000 ZM 4.001 4.000 L 4.001 20.000 L 5.001 20.000 L 5.001 4.000 L 4.001 4.000 Z"),
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
