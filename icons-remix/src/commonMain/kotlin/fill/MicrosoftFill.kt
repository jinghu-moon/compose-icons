package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MicrosoftFill: ImageVector
    get() {
        if (_microsoftFill != null) return _microsoftFill!!
        _microsoftFill = remixIcon(
            name = "MicrosoftFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.501 3.000 L 11.501 11.500 L 3.001 11.500 L 3.001 3.000 L 11.501 3.000 ZM 11.501 21.000 L 3.001 21.000 L 3.001 12.500 L 11.501 12.500 L 11.501 21.000 ZM 12.501 3.000 L 21.001 3.000 L 21.001 11.500 L 12.501 11.500 L 12.501 3.000 ZM 21.001 12.500 L 21.001 21.000 L 12.501 21.000 L 12.501 12.500 L 21.001 12.500 Z"),
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
        return _microsoftFill!!
    }

private var _microsoftFill: ImageVector? = null
