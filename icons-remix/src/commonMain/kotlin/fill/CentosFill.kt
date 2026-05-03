package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CentosFill: ImageVector
    get() {
        if (_centosFill != null) return _centosFill!!
        _centosFill = remixIcon(
            name = "CentosFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 13.061 L 16.470 17.531 L 12.000 22.000 L 7.530 17.530 L 12.000 13.061 ZM 4.000 16.121 L 7.879 20.000 L 4.000 20.000 L 4.000 16.121 ZM 20.000 16.121 L 20.000 20.000 L 16.121 20.000 L 20.000 16.121 ZM 17.530 7.530 L 22.000 12.000 L 17.531 16.470 L 13.061 12.000 L 17.530 7.530 ZM 6.470 7.530 L 10.939 12.000 L 6.469 16.469 L 2.000 12.000 L 6.470 7.530 ZM 12.000 2.000 L 16.469 6.469 L 12.000 10.939 L 7.530 6.470 L 12.000 2.000 ZM 7.879 4.000 L 4.000 7.879 L 4.000 4.000 L 7.879 4.000 ZM 20.000 4.000 L 20.000 7.879 L 16.121 4.000 L 20.000 4.000 Z"),
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
        return _centosFill!!
    }

private var _centosFill: ImageVector? = null
