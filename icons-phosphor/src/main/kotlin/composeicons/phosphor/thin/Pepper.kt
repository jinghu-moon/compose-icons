package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pepper: ImageVector
    get() {
        if (_pepper != null) return _pepper!!
        _pepper = phosphorThinIcon(
            name = "Pepper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M163.79 44.14C161.792 25.872 146.377 12.029 128 12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 13.981 .003 25.818 10.32 27.73 24.17C124.352 46.443 100.043 72.54 100 104c0 48.75-26.71 81.34-79.4 96.87-5.378 1.554-8.967 6.621-8.649 12.21 .318 5.589 4.459 10.216 9.979 11.15 14.784 2.543 29.759 3.805 44.76 3.77 11.649 .025 23.286-.743 34.83-2.3 33.23-4.59 60.2-15.41 80.19-32.18C207.12 172.21 220 142.09 220 104 219.955 72.356 195.369 46.173 163.79 44.14ZM160 52c23.483 .033 44.04 15.777 50.19 38.44L192 99.54 161.79 84.43c-1.127-.564-2.453-.564-3.58 0L128 99.54 109.81 90.44C115.96 67.777 136.517 52.033 160 52ZM176.57 187.39c-25.47 21.37-80.88 41.77-153.24 29-1.866-.282-3.282-1.831-3.395-3.715-.113-1.884 1.106-3.591 2.925-4.095C78.56 192.14 108 156 108 104c.002-1.8 .096-3.599 .28-5.39l17.93 9c1.127 .564 2.453 .564 3.58 0L160 92.48l30.21 15.11c1.127 .564 2.453 .564 3.58 0l17.93-9c.185 1.797 .278 3.603 .28 5.41 0 35.62-11.92 63.67-35.43 83.39Z"),
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
        return _pepper!!
    }

private var _pepper: ImageVector? = null
