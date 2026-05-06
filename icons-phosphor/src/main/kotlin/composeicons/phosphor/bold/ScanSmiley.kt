package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ScanSmiley: ImageVector
    get() {
        if (_scanSmiley != null) return _scanSmiley!!
        _scanSmiley = phosphorBoldIcon(
            name = "ScanSmiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 40v28c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-16h-16c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h28c6.627 0 12 5.373 12 12ZM216 176c-6.627 0-12 5.373-12 12v16h-16c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h28c6.627 0 12-5.373 12-12v-28c0-6.627-5.373-12-12-12ZM68 204h-16v-16c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v28c0 6.627 5.373 12 12 12h28c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM40 80c6.627 0 12-5.373 12-12v-16h16c6.627 0 12-5.373 12-12C80 33.373 74.627 28 68 28h-28C33.373 28 28 33.373 28 40v28c0 6.627 5.373 12 12 12ZM128 208C83.817 208 48 172.183 48 128 48 83.817 83.817 48 128 48c44.183 0 80 35.817 80 80-.05 44.162-35.838 79.95-80 80ZM184 128C184 97.072 158.928 72 128 72 97.072 72 72 97.072 72 128c0 30.928 25.072 56 56 56 30.914-.033 55.967-25.086 56-56ZM104 104c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM152 104c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16Z"),
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
        return _scanSmiley!!
    }

private var _scanSmiley: ImageVector? = null
