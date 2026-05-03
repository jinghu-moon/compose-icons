package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SpamFill: ImageVector
    get() {
        if (_spamFill != null) return _spamFill!!
        _spamFill = remixIcon(
            name = "SpamFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.500 2.500 L 23.000 12.000 L 17.500 21.500 L 6.500 21.500 L 1.000 12.000 L 6.500 2.500 L 17.500 2.500 ZM 11.000 15.000 L 11.000 17.000 L 13.000 17.000 L 13.000 15.000 L 11.000 15.000 ZM 11.000 7.000 L 11.000 13.000 L 13.000 13.000 L 13.000 7.000 L 11.000 7.000 Z"),
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
        return _spamFill!!
    }

private var _spamFill: ImageVector? = null
