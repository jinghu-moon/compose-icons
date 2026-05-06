package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandsPraying: ImageVector
    get() {
        if (_handsPraying != null) return _handsPraying!!
        _handsPraying = phosphorDuotoneIcon(
            name = "HandsPraying",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.66 197 197 229.66c-3.124 3.122-8.186 3.122-11.31 0L167.34 211.31l44-44 18.35 18.35c1.504 1.505 2.347 3.548 2.341 5.676-.006 2.128-.859 4.166-2.371 5.664ZM26.34 185.66c-3.122 3.124-3.122 8.186 0 11.31L59 229.66c3.124 3.122 8.186 3.122 11.31 0L88.66 211.31l-44-44Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M235.32 180 199.08 143.75 162.62 23.46C160.516 16.504 155.077 11.057 148.124 8.942 141.171 6.828 133.621 8.324 128 12.93 122.379 8.324 114.829 6.828 107.876 8.942c-6.953 2.115-12.391 7.561-14.496 14.518L56.92 143.76 20.68 180c-6.243 6.248-6.243 16.372 0 22.62l32.69 32.69c3.001 3.001 7.071 4.688 11.315 4.688 4.244 0 8.314-1.686 11.315-4.688L124.28 187c1.338-1.342 2.581-2.775 3.72-4.29 1.139 1.515 2.382 2.948 3.72 4.29L180 235.32c3.001 3.001 7.071 4.688 11.315 4.688 4.244 0 8.314-1.686 11.315-4.688l32.69-32.69c3.001-3.001 4.688-7.071 4.688-11.315 0-4.244-1.686-8.314-4.688-11.315ZM64.68 224 32 191.32 44.69 178.63l32.69 32.69ZM120 158.75c.032 6.374-2.489 12.496-7 17L88.68 200 56 167.32 69.65 153.66c.932-.932 1.619-2.079 2-3.34l37-122.22c.777-2.814 3.53-4.608 6.418-4.18 2.888 .427 5.004 2.942 4.932 5.86ZM143 175.75c-4.511-4.504-7.032-10.626-7-17v-129c.001-2.864 2.098-5.295 4.931-5.716 2.833-.421 5.546 1.296 6.379 4.036l37 122.22c.381 1.261 1.068 2.408 2 3.34l14.49 14.49-33.4 32ZM191.32 224 178.76 211.43l33.39-32L224 191.32Z"),
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
        return _handsPraying!!
    }

private var _handsPraying: ImageVector? = null
