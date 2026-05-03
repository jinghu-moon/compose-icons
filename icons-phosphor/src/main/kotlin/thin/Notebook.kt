package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Notebook: ImageVector
    get() {
        if (_notebook != null) return _notebook!!
        _notebook = phosphorThinIcon(
            name = "Notebook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 112.000 C 180.000 114.209 178.209 116.000 176.000 116.000 L 112.000 116.000 C 109.791 116.000 108.000 114.209 108.000 112.000 C 108.000 109.791 109.791 108.000 112.000 108.000 L 176.000 108.000 C 178.209 108.000 180.000 109.791 180.000 112.000 ZM 176.000 140.000 L 112.000 140.000 C 109.791 140.000 108.000 141.791 108.000 144.000 C 108.000 146.209 109.791 148.000 112.000 148.000 L 176.000 148.000 C 178.209 148.000 180.000 146.209 180.000 144.000 C 180.000 141.791 178.209 140.000 176.000 140.000 ZM 220.000 48.000 L 220.000 208.000 C 220.000 214.627 214.627 220.000 208.000 220.000 L 48.000 220.000 C 41.373 220.000 36.000 214.627 36.000 208.000 L 36.000 48.000 C 36.000 41.373 41.373 36.000 48.000 36.000 L 208.000 36.000 C 214.627 36.000 220.000 41.373 220.000 48.000 ZM 48.000 212.000 L 76.000 212.000 L 76.000 44.000 L 48.000 44.000 C 45.791 44.000 44.000 45.791 44.000 48.000 L 44.000 208.000 C 44.000 210.209 45.791 212.000 48.000 212.000 ZM 212.000 48.000 C 212.000 45.791 210.209 44.000 208.000 44.000 L 84.000 44.000 L 84.000 212.000 L 208.000 212.000 C 210.209 212.000 212.000 210.209 212.000 208.000 Z"),
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
        return _notebook!!
    }

private var _notebook: ImageVector? = null
