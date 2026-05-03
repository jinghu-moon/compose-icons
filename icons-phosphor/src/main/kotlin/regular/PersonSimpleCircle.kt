package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PersonSimpleCircle: ImageVector
    get() {
        if (_personSimpleCircle != null) return _personSimpleCircle!!
        _personSimpleCircle = phosphorRegularIcon(
            name = "PersonSimpleCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 112.000 80.000 C 112.000 71.163 119.163 64.000 128.000 64.000 C 136.837 64.000 144.000 71.163 144.000 80.000 C 144.000 88.837 136.837 96.000 128.000 96.000 C 119.163 96.000 112.000 88.837 112.000 80.000 ZM 184.000 112.000 C 184.000 116.418 180.418 120.000 176.000 120.000 L 136.000 120.000 L 136.000 133.580 L 166.660 179.580 C 169.112 183.258 168.118 188.228 164.440 190.680 C 160.762 193.132 155.792 192.138 153.340 188.460 L 128.000 150.460 L 102.660 188.460 C 100.208 192.138 95.238 193.132 91.560 190.680 C 87.882 188.228 86.888 183.258 89.340 179.580 L 120.000 133.580 L 120.000 120.000 L 80.000 120.000 C 75.582 120.000 72.000 116.418 72.000 112.000 C 72.000 107.582 75.582 104.000 80.000 104.000 L 176.000 104.000 C 180.418 104.000 184.000 107.582 184.000 112.000 Z"),
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
        return _personSimpleCircle!!
    }

private var _personSimpleCircle: ImageVector? = null
