package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.BlendingMode: ImageVector
    get() {
        if (_blendingMode != null) return _blendingMode!!
        _blendingMode = radixIcon(
            name = "BlendingMode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 1.5C10.5 4.25 12 6.5 12 9l-.006 .231c-.12 2.378-2.086 4.269-4.494 4.269C5.015 13.5 3 11.485 3 9 3 6.5 4.5 4.25 7.5 1.5ZM7.5 2.876C5.028 5.274 4 7.112 4 9c0 .283 .034 .557 .098 .82 1.865 .427 4.535-2.391 6.854-1.517C10.725 6.651 9.668 4.978 7.5 2.876Z"),
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
        return _blendingMode!!
    }

private var _blendingMode: ImageVector? = null
