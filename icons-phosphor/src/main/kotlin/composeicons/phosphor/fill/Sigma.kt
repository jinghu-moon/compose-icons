package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = phosphorFillIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 24h-144C47.163 24 40 31.163 40 40v176c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-176c0-8.837-7.163-16-16-16ZM184 88c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-72l38.4 51.2c2.133 2.844 2.133 6.756 0 9.6L96 184h72v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v24c0 4.418-3.582 8-8 8h-96c-3.03 0-5.8-1.712-7.155-4.422-1.355-2.71-1.063-5.954 .755-8.378L118 128 73.6 68.8c-1.818-2.424-2.111-5.667-.755-8.378C74.2 57.712 76.97 56 80 56h96c4.418 0 8 3.582 8 8Z"),
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
        return _sigma!!
    }

private var _sigma: ImageVector? = null
