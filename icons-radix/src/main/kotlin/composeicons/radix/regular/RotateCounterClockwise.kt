package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.RotateCounterClockwise: ImageVector
    get() {
        if (_rotateCounterClockwise != null) return _rotateCounterClockwise!!
        _rotateCounterClockwise = radixIcon(
            name = "RotateCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.653 4.008C10.41 4.085 11 4.724 11 5.5v7l-.008 .153c-.072 .706-.633 1.267-1.339 1.339l-.153 .008h-7l-.153-.008C1.641 13.921 1.08 13.36 1.008 12.654L1 12.5v-7C1 4.724 1.59 4.085 2.347 4.008l.153-.008h7l.153 .008ZM2.5 5C2.224 5 2 5.224 2 5.5v7c0 .276 .224 .5 .5 .5h7c.276 0 .5-.224 .5-.5v-7c0-.276-.224-.5-.5-.5h-7ZM7.597 .064C7.761-.064 8 .053 8 .261v.739l.38 .004c1.868 .044 3.286 .428 4.237 1.379C13.632 3.398 14 4.944 14 7c0 .276-.224 .5-.5 .5C13.224 7.5 13 7.276 13 7 13 5.019 12.636 3.816 11.91 3.09 11.23 2.41 10.13 2.047 8.362 2.004L8 2v.739c-0 .208-.239 .325-.403 .197L6.004 1.698c-.129-.1-.129-.294 0-.395L7.597 .064Z"),
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
        return _rotateCounterClockwise!!
    }

private var _rotateCounterClockwise: ImageVector? = null
