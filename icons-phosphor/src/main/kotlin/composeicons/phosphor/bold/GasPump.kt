package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GasPump: ImageVector
    get() {
        if (_gasPump != null) return _gasPump!!
        _gasPump = phosphorBoldIcon(
            name = "GasPump",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M247.8 66.83 228.49 47.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17l19.34 19.29c.75 .751 1.171 1.769 1.17 2.83v79.37c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-38c0-15.464-12.536-28-28-28h-12v-44C180 40.536 167.464 28 152 28h-80C56.536 28 44 40.536 44 56v148h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12v-80h12c2.209 0 4 1.791 4 4v38c0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30v-79.37c.022-7.43-2.931-14.56-8.2-19.8ZM68 204v-148c0-2.209 1.791-4 4-4h80c2.209 0 4 1.791 4 4v148ZM140 112c0 6.627-5.373 12-12 12h-32c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h32c6.627 0 12 5.373 12 12Z"),
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
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
