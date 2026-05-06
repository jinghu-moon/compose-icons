package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Timer: ImageVector
    get() {
        if (_timer != null) return _timer!!
        _timer = radixIcon(
            name = "Timer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 .85c3.673 0 6.649 2.978 6.649 6.65-0 3.672-2.977 6.649-6.649 6.649C3.828 14.15 .85 11.173 .85 7.5 .85 5.861 1.444 4.358 2.428 3.199l.073-.07c.183-.143 .448-.144 .632 .013 .21 .179 .236 .495 .058 .705l-.153 .187C2.293 4.991 1.85 6.194 1.85 7.5c0 3.12 2.53 5.649 5.65 5.649 3.12-0 5.649-2.529 5.649-5.649C13.15 4.549 10.886 2.127 8 1.873v1.648c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5v-2.172l.01-.101c.047-.228 .249-.399 .49-.399ZM4.25 4.25c.087-.087 .223-.098 .322-.026L8.08 6.741c.482 .345 .538 1.04 .119 1.459C7.78 8.619 7.086 8.562 6.741 8.08L4.224 4.573c-.071-.099-.06-.236 .026-.322Z"),
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
        return _timer!!
    }

private var _timer: ImageVector? = null
