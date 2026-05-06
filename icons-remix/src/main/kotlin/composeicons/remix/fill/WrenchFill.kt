package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WrenchFill: ImageVector
    get() {
        if (_wrenchFill != null) return _wrenchFill!!
        _wrenchFill = remixIcon(
            name = "WrenchFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.249 6.872c.241-.241 .588-.343 .92-.27 .333 .073 .606 .31 .724 .629 .924 2.485 .389 5.393-1.611 7.394-1.975 1.975-4.835 2.521-7.301 1.644L7.969 20.282c-1.172 1.172-3.071 1.172-4.243 0-1.172-1.172-1.172-3.071 0-4.243L7.739 12.026C6.862 9.561 7.408 6.701 9.383 4.725 11.38 2.729 14.281 2.192 16.763 3.109c.32 .118 .558 .391 .63 .724 .073 .333-.029 .68-.27 .92L14.768 7.11c-.585 .586-.585 1.536 0 2.121 .586 .586 1.535 .586 2.121 0L19.249 6.872Z"),
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
        return _wrenchFill!!
    }

private var _wrenchFill: ImageVector? = null
