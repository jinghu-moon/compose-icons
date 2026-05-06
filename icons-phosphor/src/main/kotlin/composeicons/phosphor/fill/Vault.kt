package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Vault: ImageVector
    get() {
        if (_vault != null) return _vault!!
        _vault = phosphorFillIcon(
            name = "Vault",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v136c0 8.837 7.163 16 16 16h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h112v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16c8.837 0 16-7.163 16-16v-136c0-8.837-7.163-16-16-16ZM208 136h-28.91c-4.072 17.866-20.915 29.823-39.125 27.774C121.755 161.725 107.99 146.325 107.99 128c0-18.325 13.765-33.725 31.975-35.774 18.21-2.049 35.053 9.908 39.125 27.774h28.91c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM164 128c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20Z"),
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
        return _vault!!
    }

private var _vault: ImageVector? = null
