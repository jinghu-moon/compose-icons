package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) return _shieldStar!!
        _shieldStar = phosphorFillIcon(
            name = "ShieldStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 40h-160C39.163 40 32 47.163 32 56v56c0 52.72 25.52 84.67 46.93 102.19 23.06 18.86 46 25.27 47 25.53 1.375 .374 2.825 .374 4.2 0 1-.26 23.91-6.67 47-25.53C198.48 196.67 224 164.72 224 112v-56c0-8.837-7.163-16-16-16ZM171 127.43l-30.31 12.12 17.71 23.65c2.651 3.535 1.935 8.549-1.6 11.2-3.535 2.651-8.549 1.935-11.2-1.6L128 149.33l-17.6 23.47c-2.651 3.535-7.665 4.251-11.2 1.6-3.535-2.651-4.251-7.665-1.6-11.2l17.74-23.65L85 127.43C80.897 125.773 78.913 121.103 80.57 117c1.657-4.103 6.327-6.087 10.43-4.43l29 11.61v-28.18c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v28.18l29-11.61c4.103-1.657 8.773 .327 10.43 4.43 1.657 4.103-.327 8.773-4.43 10.43Z"),
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
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
