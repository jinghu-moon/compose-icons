package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.VinylRecord: ImageVector
    get() {
        if (_vinylRecord != null) return _vinylRecord!!
        _vinylRecord = phosphorFillIcon(
            name = "VinylRecord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 72.000 128.000 C 72.000 132.418 68.418 136.000 64.000 136.000 C 59.582 136.000 56.000 132.418 56.000 128.000 C 56.044 88.254 88.254 56.044 128.000 56.000 C 132.418 56.000 136.000 59.582 136.000 64.000 C 136.000 68.418 132.418 72.000 128.000 72.000 C 97.086 72.033 72.033 97.086 72.000 128.000 ZM 104.000 128.000 C 104.000 114.745 114.745 104.000 128.000 104.000 C 141.255 104.000 152.000 114.745 152.000 128.000 C 152.000 141.255 141.255 152.000 128.000 152.000 C 114.745 152.000 104.000 141.255 104.000 128.000 ZM 128.000 200.000 C 123.582 200.000 120.000 196.418 120.000 192.000 C 120.000 187.582 123.582 184.000 128.000 184.000 C 158.914 183.967 183.967 158.914 184.000 128.000 C 184.000 123.582 187.582 120.000 192.000 120.000 C 196.418 120.000 200.000 123.582 200.000 128.000 C 199.956 167.746 167.746 199.956 128.000 200.000 Z"),
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
        return _vinylRecord!!
    }

private var _vinylRecord: ImageVector? = null
