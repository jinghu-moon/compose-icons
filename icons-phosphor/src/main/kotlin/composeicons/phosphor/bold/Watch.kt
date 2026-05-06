package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Watch: ImageVector
    get() {
        if (_watch != null) return _watch!!
        _watch = phosphorBoldIcon(
            name = "Watch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 128C207.999 104.661 197.787 82.49 180.05 67.32L173 28.43C171.274 18.916 162.989 11.999 153.32 12h-50.64C93.011 11.999 84.726 18.916 83 28.43L76 67.32C58.261 82.489 48.048 104.66 48.048 128c0 23.34 10.213 45.511 27.952 60.68l7 38.89c1.726 9.514 10.011 16.431 19.68 16.43h50.64c9.669 .001 17.954-6.916 19.68-16.43l7.05-38.89C197.787 173.51 207.999 151.339 208 128ZM106 36h44l2.9 16c-16.162-5.306-33.598-5.306-49.76 0ZM150 220h-44l-2.9-16c16.162 5.306 33.598 5.306 49.76 0ZM128 184C97.072 184 72 158.928 72 128 72 97.072 97.072 72 128 72c30.928 0 56 25.072 56 56-.033 30.914-25.086 55.967-56 56ZM168 128c0 6.627-5.373 12-12 12h-28c-6.627 0-12-5.373-12-12v-28c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v16h16c6.627 0 12 5.373 12 12Z"),
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
        return _watch!!
    }

private var _watch: ImageVector? = null
