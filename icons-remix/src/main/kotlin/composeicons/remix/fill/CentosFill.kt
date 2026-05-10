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
                pathData = parseSvgPathData("M12 13.061l4.47 4.47L12 22 7.53 17.53 12 13.061ZM4 16.121l3.879 3.879L4 20 4 16.121ZM20 16.121 20 20l-3.879-0 3.879-3.879ZM17.53 7.53 22 12l-4.469 4.47L13.061 12 17.53 7.53ZM6.47 7.53 10.939 12 6.469 16.469 2 12 6.47 7.53ZM12 2l4.469 4.469L12 10.939 7.53 6.47 12 2ZM7.879 4 4 7.879 4 4 7.879 4ZM20 4l-0 3.879L16.121 4 20 4Z"),
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
