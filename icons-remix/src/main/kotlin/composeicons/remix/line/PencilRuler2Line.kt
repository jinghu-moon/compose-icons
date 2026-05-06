package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PencilRuler2Line: ImageVector
    get() {
        if (_pencilRuler2Line != null) return _pencilRuler2Line!!
        _pencilRuler2Line = remixIcon(
            name = "PencilRuler2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.05 14.121 4.929 16.243l2.828 2.828L19.071 7.757 16.243 4.929 14.121 7.05l1.414 1.414L14.121 9.879 12.707 8.464 11.293 9.879l1.414 1.414-1.414 1.414L9.879 11.293 8.465 12.707l1.414 1.414L8.465 15.535 7.05 14.121ZM16.95 2.808l4.243 4.243c.391 .391 .391 1.024 0 1.414L8.465 21.192c-.391 .39-1.024 .39-1.414 0L2.808 16.95c-.391-.391-.391-1.024 0-1.414L15.536 2.808c.391-.391 1.024-.391 1.414 0ZM14.121 18.364l1.414-1.414 2.242 2.242h1.414v-1.414L16.95 15.535l1.414-1.414 2.636 2.636v4.243h-4.242L14.121 18.364ZM5.636 9.878 2.808 7.05c-.391-.391-.391-1.024 0-1.414L5.636 2.807c.391-.391 1.024-.391 1.414 0L9.879 5.635 8.464 7.05 6.343 4.928 4.929 6.343 7.05 8.464 5.636 9.878Z"),
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
        return _pencilRuler2Line!!
    }

private var _pencilRuler2Line: ImageVector? = null
