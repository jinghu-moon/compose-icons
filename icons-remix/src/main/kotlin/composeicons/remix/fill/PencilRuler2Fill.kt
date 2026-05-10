package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PencilRuler2Fill: ImageVector
    get() {
        if (_pencilRuler2Fill != null) return _pencilRuler2Fill!!
        _pencilRuler2Fill = remixIcon(
            name = "PencilRuler2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.636 12.707l1.828 1.828L8.879 13.121 7.05 11.293 8.465 9.879l1.828 1.828 1.414-1.414L9.879 8.464 11.293 7.05l1.828 1.828L14.536 7.464 12.707 5.636 15.536 2.808c.391-.391 1.024-.391 1.414 0l4.243 4.243c.391 .391 .391 1.024 0 1.414L8.465 21.192c-.391 .39-1.024 .39-1.414 0L2.808 16.95c-.391-.391-.391-1.024 0-1.414L5.636 12.707ZM14.121 18.364l4.243-4.243 2.636 2.636v4.243h-4.242L14.121 18.364ZM5.636 9.878 2.808 7.05c-.391-.391-.391-1.024 0-1.414L5.636 2.807c.391-.391 1.024-.391 1.414 0L9.879 5.635 5.636 9.878Z"),
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
        return _pencilRuler2Fill!!
    }

private var _pencilRuler2Fill: ImageVector? = null
