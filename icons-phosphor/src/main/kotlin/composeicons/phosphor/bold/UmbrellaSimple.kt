package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) return _umbrellaSimple!!
        _umbrellaSimple = phosphorBoldIcon(
            name = "UmbrellaSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.93 126.3C240.08 82.058 211.397 43.859 169.985 27.822 128.573 11.784 81.644 20.701 49 50.81 27.617 70.429 14.408 97.381 12 126.3c-.477 5.592 1.417 11.127 5.221 15.254 3.804 4.127 9.166 6.466 14.779 6.446h84v52c0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-52h84c5.612 .02 10.975-2.319 14.779-6.446 3.804-4.127 5.698-9.662 5.221-15.254ZM36.44 124C41.08 89.864 64.315 61.14 96.728 49.469c32.413-11.671 68.626-4.351 93.962 18.991 15.849 14.547 26.07 34.21 28.87 55.54Z"),
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
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
