package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) return _flowArrow!!
        _flowArrow = phosphorBoldIcon(
            name = "FlowArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248.49 71.51l-32-32c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L211 68h-3c-52 0-64.8 30.71-75.08 55.38-8.82 21.17-15.45 37.05-42.75 40.09C83.918 142.427 63.112 129.212 41.407 132.498 19.703 135.783 3.74 154.563 3.995 176.514c.255 21.95 16.65 40.355 38.425 43.134 21.775 2.78 42.268-10.916 48.029-32.098 43.34-3.87 55.07-32 64.63-54.93C164.9 109 172 92 208 92h3l-11.52 11.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l32-32c2.261-2.25 3.533-5.308 3.534-8.498 .002-3.19-1.266-6.249-3.524-8.502ZM48 196C36.954 196 28 187.046 28 176c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
