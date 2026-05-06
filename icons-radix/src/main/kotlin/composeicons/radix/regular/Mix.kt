package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Mix: ImageVector
    get() {
        if (_mix != null) return _mix!!
        _mix = radixIcon(
            name = "Mix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.6 8.824c0-.5 .503-.828 .95-.654l.089 .042 3.934 2.176 .085 .055c.368 .277 .368 .839 0 1.116l-.085 .055L2.639 13.789c-.466 .258-1.038-.08-1.039-.612v-4.353ZM13 8.3c.386 0 .7 .314 .7 .7v4c-0 .386-.314 .7-.7 .7h-4c-.387 0-.7-.314-.7-.7v-4c0-.387 .314-.7 .7-.7h4ZM2.5 12.836 5.82 11 2.5 9.163v3.673ZM9.2 12.8h3.6v-3.6h-3.6v3.6ZM4 1.249c1.519 0 2.751 1.232 2.751 2.751C6.751 5.519 5.519 6.751 4 6.751 2.481 6.751 1.249 5.519 1.249 4 1.249 2.481 2.481 1.249 4 1.249ZM12.807 1.557c.176-.176 .461-.176 .637 0 .176 .176 .176 .461 0 .637L11.637 4l1.807 1.807 .058 .07c.115 .175 .096 .413-.058 .566-.154 .154-.392 .173-.566 .058l-.07-.058L11 4.637 9.194 6.443c-.176 .176-.461 .176-.637 0-.176-.176-.176-.461 0-.637L10.363 4 8.557 2.193 8.499 2.123c-.116-.175-.096-.413 .058-.566 .154-.154 .392-.173 .566-.058l.07 .058 1.807 1.807L12.807 1.557ZM4 2.15C2.978 2.15 2.15 2.978 2.15 4c0 1.022 .828 1.851 1.851 1.851C5.022 5.851 5.851 5.022 5.851 4 5.851 2.978 5.022 2.15 4 2.15Z"),
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
        return _mix!!
    }

private var _mix: ImageVector? = null
