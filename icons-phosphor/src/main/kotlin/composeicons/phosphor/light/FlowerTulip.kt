package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) return _flowerTulip!!
        _flowerTulip = phosphorLightIcon(
            name = "FlowerTulip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 50c-12.496-.008-24.843 2.723-36.17 8C157.16 32.1 131.83 19.21 130.68 18.63c-1.687-.842-3.673-.842-5.36 0C124.18 19.21 98.84 32.1 84.17 58 72.843 52.723 60.496 49.992 48 50c-3.314 0-6 2.686-6 6v40c.06 45.141 34.972 82.572 80 85.77v40.52L82.68 202.63c-2.966-1.48-6.57-.276-8.05 2.69-1.48 2.966-.276 6.57 2.69 8.05l48 24c1.687 .842 3.673 .842 5.36 0l48-24c2.966-1.48 4.17-5.084 2.69-8.05-1.48-2.966-5.084-4.17-8.05-2.69L134 222.29v-40.52C179.028 178.572 213.94 141.141 214 96v-40c0-3.314-2.686-6-6-6ZM128 30.88c6.46 3.84 23.07 15 33.33 32.94C146.267 73.592 134.619 87.809 128 104.5 121.381 87.809 109.733 73.592 94.67 63.82 104.93 45.83 121.54 34.71 128 30.88ZM54 96v-33.76c38.392 3.176 67.949 35.237 68 73.76v33.76C83.605 166.589 54.046 134.525 54 96ZM202 96c-.046 38.525-29.605 70.589-68 73.76v-33.76c.051-38.523 29.608-70.584 68-73.76Z"),
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
