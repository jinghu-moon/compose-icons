package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = phosphorThinIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.85 61.48c-3.829-2.095-8.493-1.945-12.18 .39L124 116.43v-44.59c.031-4.327-2.336-8.315-6.15-10.36-3.829-2.095-8.493-1.945-12.18 .39L17.48 118c-3.412 2.167-5.48 5.928-5.48 9.97 0 4.042 2.067 7.803 5.48 9.97l88.19 56.16c3.687 2.335 8.351 2.485 12.18 .39 3.804-2.04 6.17-6.014 6.15-10.33v-44.59l85.67 54.56c3.687 2.335 8.351 2.485 12.18 .39 3.814-2.045 6.181-6.033 6.15-10.36v-112.32c.031-4.327-2.336-8.315-6.15-10.36ZM116 184.16c.01 1.402-.761 2.694-2 3.35-1.256 .694-2.792 .644-4-.13L21.78 131.22c-1.109-.695-1.782-1.911-1.782-3.22 0-1.309 .673-2.525 1.782-3.22L110 68.62c.635-.41 1.374-.629 2.13-.63 .668 .004 1.325 .176 1.91 .5 1.239 .656 2.01 1.948 2 3.35ZM220 184.16c.01 1.402-.761 2.694-2 3.35-1.256 .694-2.792 .644-4-.13L125.82 131.22c-1.109-.695-1.782-1.911-1.782-3.22 0-1.309 .673-2.525 1.782-3.22L214 68.62c.635-.41 1.374-.629 2.13-.63 .668 .004 1.325 .176 1.91 .5 1.239 .656 2.01 1.948 2 3.35Z"),
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
        return _rewind!!
    }

private var _rewind: ImageVector? = null
