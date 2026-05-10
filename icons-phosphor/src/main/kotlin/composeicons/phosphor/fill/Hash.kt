package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hash: ImageVector
    get() {
        if (_hash != null) return _hash!!
        _hash = phosphorFillIcon(
            name = "Hash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116.25 112h31.5l-8 32h-31.5ZM224 48v160c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM208 104c0-4.418-3.582-8-8-8h-31.75l7.51-30.06c.986-4.252-1.618-8.509-5.853-9.568-4.234-1.059-8.536 1.472-9.667 5.688L151.75 96h-31.5l7.51-30.06c.986-4.252-1.618-8.509-5.853-9.568-4.234-1.059-8.536 1.472-9.667 5.688L103.75 96h-39.75c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h35.75l-8 32h-35.75c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h31.75l-7.51 30.06c-1.071 4.286 1.535 8.628 5.82 9.7 .654 .163 1.326 .243 2 .24 3.667-.005 6.861-2.503 7.75-6.06L104.25 160h31.5l-7.51 30.06c-1.071 4.286 1.535 8.628 5.82 9.7 .635 .158 1.286 .238 1.94 .24 3.667-.005 6.861-2.503 7.75-6.06L152.25 160h39.75c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-35.75l8-32h35.75c4.418 0 8-3.582 8-8Z"),
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
        return _hash!!
    }

private var _hash: ImageVector? = null
