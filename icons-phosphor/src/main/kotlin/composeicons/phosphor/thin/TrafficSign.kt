package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) return _trafficSign!!
        _trafficSign = phosphorThinIcon(
            name = "TrafficSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.32 119.12 136.88 15.68C134.526 13.323 131.331 11.998 128 11.998c-3.331 0-6.526 1.324-8.88 3.682L15.68 119.12c-2.357 2.354-3.682 5.549-3.682 8.88 0 3.331 1.324 6.526 3.682 8.88L119.12 240.32h0c2.354 2.357 5.549 3.682 8.88 3.682 3.331 0 6.526-1.324 8.88-3.682L240.32 136.88c2.357-2.354 3.682-5.549 3.682-8.88 0-3.331-1.324-6.526-3.682-8.88ZM234.66 131.22 131.22 234.67c-1.78 1.775-4.66 1.775-6.44 0h0L21.33 131.22c-.855-.854-1.335-2.012-1.335-3.22 0-1.208 .48-2.366 1.335-3.22L124.78 21.33c1.78-1.775 4.66-1.775 6.44 0L234.67 124.78c.855 .854 1.335 2.012 1.335 3.22 0 1.208-.48 2.367-1.335 3.22ZM170.83 117.22c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-24 24c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L158.34 124h-46.34c-11.046 0-20 8.954-20 20v8c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-8c0-15.464 12.536-28 28-28h46.34L141.17 98.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0Z"),
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
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
