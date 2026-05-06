package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Needle: ImageVector
    get() {
        if (_needle != null) return _needle!!
        _needle = phosphorBoldIcon(
            name = "Needle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M215.11 40.89c-17.182-17.179-45.038-17.179-62.22 0l-24 24c-1.759 1.749-2.927 4.004-3.34 6.45C118.4 113 55.31 183.7 31.55 207.48h0c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0h0c23.75-23.73 94.49-86.88 136.18-94 2.443-.42 4.697-1.587 6.45-3.34l24-24c17.179-17.182 17.179-45.038 0-62.22ZM198.11 86.14l-21.42 21.43c-14.85 3.31-32.4 11.41-52.47 24.18 12.77-20.07 20.87-37.62 24.18-52.47L169.83 57.86c5.021-5.199 12.458-7.284 19.45-5.454 6.993 1.83 12.453 7.291 14.284 14.284 1.83 6.993-.255 14.429-5.454 19.45Z"),
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
        return _needle!!
    }

private var _needle: ImageVector? = null
