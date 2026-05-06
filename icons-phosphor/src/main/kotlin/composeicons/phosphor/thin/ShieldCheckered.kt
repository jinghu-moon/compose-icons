package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = phosphorThinIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 44h-160C41.373 44 36 49.373 36 56v56c0 51.16 24.73 82.12 45.47 99.1 22.4 18.32 44.55 24.5 45.48 24.76 .688 .187 1.412 .187 2.1 0 .93-.26 23.08-6.44 45.48-24.76C195.27 194.1 220 163.16 220 112v-56c0-6.627-5.373-12-12-12ZM212 56v56q0 6.12-.49 12h-79.51v-72h76c2.209 0 4 1.791 4 4ZM44 56c0-2.209 1.791-4 4-4h76v72h-79.51Q44 118.12 44 112ZM45.38 132h78.62v94.44C110.339 221.281 97.604 213.943 86.29 204.71 63.27 185.78 49.56 161.38 45.38 132ZM169.71 204.71c-11.311 9.237-24.047 16.576-37.71 21.73v-94.44h78.62c-4.18 29.38-17.89 53.78-40.91 72.71Z"),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
