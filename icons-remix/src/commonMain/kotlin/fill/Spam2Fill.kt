package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Spam2Fill: ImageVector
    get() {
        if (_spam2Fill != null) return _spam2Fill!!
        _spam2Fill = remixIcon(
            name = "Spam2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.936 2.501 L 21.501 8.066 L 21.501 15.936 L 15.936 21.501 L 8.066 21.501 L 2.501 15.936 L 2.501 8.066 L 8.066 2.501 L 15.936 2.501 ZM 11.000 15.000 L 11.000 17.000 L 13.000 17.000 L 13.000 15.000 L 11.000 15.000 ZM 11.000 7.000 L 11.000 13.000 L 13.000 13.000 L 13.000 7.000 L 11.000 7.000 Z"),
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
        return _spam2Fill!!
    }

private var _spam2Fill: ImageVector? = null
