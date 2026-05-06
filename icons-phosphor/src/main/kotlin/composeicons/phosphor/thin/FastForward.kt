package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = phosphorThinIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246.52 118 158.33 61.87c-3.687-2.335-8.351-2.485-12.18-.39-3.814 2.045-6.181 6.033-6.15 10.36v44.59L54.33 61.87C50.643 59.535 45.979 59.385 42.15 61.48 38.336 63.525 35.969 67.513 36 71.84v112.32c-.031 4.327 2.336 8.315 6.15 10.36 3.829 2.095 8.493 1.945 12.18-.39L140 139.57v44.59c-.031 4.327 2.336 8.315 6.15 10.36 3.829 2.095 8.493 1.945 12.18-.39L246.52 138c3.412-2.167 5.479-5.928 5.479-9.97 0-4.042-2.067-7.803-5.479-9.97ZM138.22 131.19 50 187.38c-1.208 .774-2.744 .824-4 .13-1.239-.656-2.01-1.948-2-3.35v-112.32c-.01-1.402 .761-2.694 2-3.35 .585-.324 1.242-.496 1.91-.5 .756 .001 1.495 .22 2.13 .63l88.18 56.16c1.109 .695 1.782 1.911 1.782 3.22 0 1.309-.673 2.525-1.782 3.22ZM242.22 131.19 154 187.38c-1.208 .774-2.744 .824-4 .13-1.239-.656-2.01-1.948-2-3.35v-112.32c-.01-1.402 .761-2.694 2-3.35 .585-.324 1.242-.496 1.91-.5 .756 .001 1.495 .22 2.13 .63l88.18 56.16c1.109 .695 1.782 1.911 1.782 3.22 0 1.309-.673 2.525-1.782 3.22Z"),
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
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
