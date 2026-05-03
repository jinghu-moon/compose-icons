package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SdCardMiniFill: ImageVector
    get() {
        if (_sdCardMiniFill != null) return _sdCardMiniFill!!
        _sdCardMiniFill = remixIcon(
            name = "SdCardMiniFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 2.000 L 19.000 2.000 C 19.552 2.000 20.000 2.448 20.000 3.000 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 12.420 C 4.000 12.155 4.105 11.901 4.292 11.714 L 5.854 10.146 C 5.948 10.053 6.000 9.926 6.000 9.793 L 6.000 3.000 C 6.000 2.448 6.448 2.000 7.000 2.000 ZM 15.000 4.000 L 15.000 8.000 L 17.000 8.000 L 17.000 4.000 L 15.000 4.000 ZM 12.000 4.000 L 12.000 8.000 L 14.000 8.000 L 14.000 4.000 L 12.000 4.000 ZM 9.000 4.000 L 9.000 8.000 L 11.000 8.000 L 11.000 4.000 L 9.000 4.000 Z"),
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
        return _sdCardMiniFill!!
    }

private var _sdCardMiniFill: ImageVector? = null
