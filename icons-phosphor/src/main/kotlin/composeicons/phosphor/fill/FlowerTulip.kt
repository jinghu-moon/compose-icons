package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) return _flowerTulip!!
        _flowerTulip = phosphorFillIcon(
            name = "FlowerTulip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 48c-12.175-.011-24.219 2.52-35.36 7.43C157.54 30.06 132.72 17.43 131.58 16.84c-2.253-1.128-4.907-1.128-7.16 0-1.14 .58-26 13.22-41.06 38.59C72.219 50.52 60.175 47.989 48 48c-4.418 0-8 3.582-8 8v40c.055 45.479 34.714 83.444 80 87.63v35.43L83.58 200.84c-3.954-1.977-8.763-.374-10.74 3.58-1.977 3.954-.374 8.763 3.58 10.74l48 24c2.253 1.128 4.907 1.128 7.16 0l48-24c3.954-1.977 5.557-6.786 3.58-10.74-1.977-3.954-6.786-5.557-10.74-3.58L136 219.06v-35.43C181.286 179.444 215.945 141.479 216 96v-40c0-4.418-3.582-8-8-8ZM56 96v-31.56c36.422 4.118 63.958 34.906 64 71.56v31.56C83.578 163.442 56.042 132.654 56 96ZM200 96c-.042 36.654-27.578 67.442-64 71.56v-31.56c.042-36.654 27.578-67.442 64-71.56Z"),
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
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
