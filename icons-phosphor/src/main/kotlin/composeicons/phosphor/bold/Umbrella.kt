package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Umbrella: ImageVector
    get() {
        if (_umbrella != null) return _umbrella!!
        _umbrella = phosphorBoldIcon(
            name = "Umbrella",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.93 126.3C240.08 82.058 211.397 43.859 169.985 27.822 128.573 11.784 81.644 20.701 49 50.81 27.617 70.429 14.408 97.381 12 126.3c-.477 5.592 1.417 11.127 5.221 15.254 3.804 4.127 9.166 6.466 14.779 6.446h84v52c0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-52h84c5.612 .02 10.975-2.319 14.779-6.446 3.804-4.127 5.698-9.662 5.221-15.254ZM100.41 124C103.08 84.67 118.49 60.49 128 49.13c9.52 11.39 24.92 35.56 27.59 74.87ZM65.31 68.46C74.992 59.52 86.481 52.764 99 48.65 88.8 65.25 78.39 90.08 76.36 124h-39.92C39.24 102.67 49.461 83.007 65.31 68.46ZM179.64 124c-2-33.92-12.44-58.75-22.65-75.35 33.577 11.045 57.883 40.315 62.57 75.35Z"),
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
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
