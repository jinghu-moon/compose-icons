package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaintBrushHousehold: ImageVector
    get() {
        if (_paintBrushHousehold != null) return _paintBrushHousehold!!
        _paintBrushHousehold = phosphorBoldIcon(
            name = "PaintBrushHousehold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233.47 22.53C219.411 8.472 196.619 8.472 182.56 22.53l-.39 .4L129.61 80.61l-5.8-5.79c-5.251-5.252-12.373-8.202-19.8-8.202-7.427 0-14.549 2.95-19.8 8.202L7.52 151.51c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l80 80c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l76.7-76.7c5.252-5.251 8.202-12.373 8.202-19.8 0-7.427-2.95-14.549-8.202-19.8l-5.8-5.8L233.1 73.85l.4-.39c6.753-6.756 10.544-15.919 10.538-25.471-.006-9.552-3.807-18.711-10.568-25.459ZM96 223l-9-9 17.51-17.52c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L70 197 59 186 76.52 168.48c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L42 169l-9-9L72 121l63 63ZM216.66 56.31l-66.73 60.81c-2.425 2.209-3.84 5.315-3.915 8.594-.076 3.28 1.195 6.447 3.515 8.766l14.68 14.68c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83L152 167 89 104 101.2 91.8c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l14.68 14.68c2.319 2.321 5.486 3.591 8.766 3.515 3.28-.076 6.385-1.49 8.594-3.915L199.71 39.35c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17Z"),
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
        return _paintBrushHousehold!!
    }

private var _paintBrushHousehold: ImageVector? = null
