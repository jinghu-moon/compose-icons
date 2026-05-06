package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) return _fireSimple!!
        _fireSimple = phosphorRegularIcon(
            name = "FireSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M143.38 17.85c-2.001-1.664-4.687-2.25-7.2-1.572-2.513 .678-4.538 2.537-5.43 4.982l-22 60.41L84.59 58.26C82.949 56.668 80.705 55.855 78.425 56.025c-2.28 .17-4.378 1.308-5.765 3.125C51 87.53 40 116.08 40 144c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88C216 84.55 165.21 36 143.38 17.85ZM128 216C88.254 215.956 56.044 183.746 56 144 56 122 64.09 99.21 80.06 76.16l26.37 25.58c1.946 1.89 4.717 2.665 7.361 2.059 2.644-.606 4.801-2.51 5.729-5.059L141.79 37.67C164.21 58.08 200 97.91 200 144c-.044 39.746-32.254 71.956-72 72Z"),
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
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
