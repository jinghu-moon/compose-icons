package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = tablerFilledIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 4c.305 0 .593 .139 .783 .378l.074 .108 3 5c.201 .335 .188 .756-.032 1.078l-.08 .103-8.53 9.533c-.32 .326-.758 .51-1.215 .51-.4 0-.785-.14-1.11-.417l-.135-.126L2.255 10.667C1.994 10.376 1.927 9.959 2.083 9.6l.06-.115L5.156 4.463l.064-.09c.046-.057 .098-.109 .155-.154l.089-.064 .088-.05 .05-.023 .06-.025 .109-.032 .112-.02L6 4h12ZM9.114 7.943C8.641 7.66 8.027 7.813 7.743 8.286l-.6 1-.06 .116c-.156 .36-.087 .779 .177 1.07l2 2.2 .09 .088c.383 .328 .95 .319 1.323-.02l.087-.09c.328-.383 .319-.95-.02-1.323L9.239 9.677l.218-.363 .055-.103C9.72 8.749 9.549 8.204 9.114 7.943Z"),
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
        return _diamond!!
    }

private var _diamond: ImageVector? = null
