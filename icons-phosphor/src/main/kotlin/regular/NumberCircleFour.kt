package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberCircleFour: ImageVector
    get() {
        if (_numberCircleFour != null) return _numberCircleFour!!
        _numberCircleFour = phosphorRegularIcon(
            name = "NumberCircleFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 160.000 144.000 L 152.000 144.000 L 152.000 80.000 C 151.997 76.585 149.826 73.549 146.596 72.441 C 143.366 71.332 139.789 72.397 137.690 75.090 L 81.690 147.090 C 79.816 149.501 79.477 152.769 80.819 155.513 C 82.160 158.257 84.946 159.998 88.000 160.000 L 136.000 160.000 L 136.000 176.000 C 136.000 180.418 139.582 184.000 144.000 184.000 C 148.418 184.000 152.000 180.418 152.000 176.000 L 152.000 160.000 L 160.000 160.000 C 164.418 160.000 168.000 156.418 168.000 152.000 C 168.000 147.582 164.418 144.000 160.000 144.000 ZM 136.000 144.000 L 104.360 144.000 L 136.000 103.320 Z"),
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
        return _numberCircleFour!!
    }

private var _numberCircleFour: ImageVector? = null
