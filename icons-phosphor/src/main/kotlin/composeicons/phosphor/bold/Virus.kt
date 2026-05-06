package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Virus: ImageVector
    get() {
        if (_virus != null) return _virus!!
        _virus = phosphorBoldIcon(
            name = "Virus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M108 128C96.954 128 88 119.046 88 108 88 96.954 96.954 88 108 88c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM168 108c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20ZM128 148c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20ZM252 128c0 6.627-5.373 12-12 12h-12.72c-2.186 18.141-9.32 35.331-20.62 49.69l9.83 9.82c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0l-9.82-9.83C175.315 217.97 158.132 225.096 140 227.28v12.72c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12.72C97.859 225.094 80.669 217.96 66.31 206.66l-9.82 9.83c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l9.83-9.82C38.03 175.315 30.904 158.132 28.72 140h-12.72C9.373 140 4 134.627 4 128c0-6.627 5.373-12 12-12h12.72C30.906 97.859 38.04 80.669 49.34 66.31L39.51 56.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l9.82 9.83C80.685 38.03 97.868 30.904 116 28.72v-12.72C116 9.373 121.373 4 128 4c6.627 0 12 5.373 12 12v12.72c18.141 2.186 35.331 9.32 49.69 20.62l9.82-9.83c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-9.83 9.82c11.29 14.355 18.416 31.538 20.6 49.67h12.72c6.627 0 12 5.373 12 12ZM204 128C204 86.026 169.974 52 128 52 86.026 52 52 86.026 52 128c0 41.974 34.026 76 76 76 41.955-.044 75.956-34.045 76-76Z"),
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
        return _virus!!
    }

private var _virus: ImageVector? = null
