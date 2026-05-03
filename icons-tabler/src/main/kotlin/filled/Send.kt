package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Send: ImageVector
    get() {
        if (_send != null) return _send!!
        _send = tablerFilledIcon(
            name = "Send",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.864 3.549 L 15.410 21.417 C 15.157 21.968 14.606 22.321 14.000 22.320 C 13.406 22.322 12.863 21.982 12.606 21.446 L 9.726 15.687 ZM 20.450 2.135 L 8.311 14.273 L 2.583 11.409 C 2.033 11.156 1.680 10.606 1.680 10.000 C 1.680 9.394 2.033 8.843 2.661 8.560 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _send!!
    }

private var _send: ImageVector? = null
