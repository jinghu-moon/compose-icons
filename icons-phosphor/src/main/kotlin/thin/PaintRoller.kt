package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) return _paintRoller!!
        _paintRoller = phosphorThinIcon(
            name = "PaintRoller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 92.000 L 212.000 92.000 L 212.000 64.000 C 212.000 57.373 206.627 52.000 200.000 52.000 L 48.000 52.000 C 41.373 52.000 36.000 57.373 36.000 64.000 L 36.000 92.000 L 16.000 92.000 C 13.791 92.000 12.000 93.791 12.000 96.000 C 12.000 98.209 13.791 100.000 16.000 100.000 L 36.000 100.000 L 36.000 128.000 C 36.000 134.627 41.373 140.000 48.000 140.000 L 200.000 140.000 C 206.627 140.000 212.000 134.627 212.000 128.000 L 212.000 100.000 L 232.000 100.000 C 234.209 100.000 236.000 101.791 236.000 104.000 L 236.000 154.000 C 235.997 155.783 234.815 157.350 233.100 157.840 L 132.700 186.500 C 127.563 187.969 124.017 192.657 124.000 198.000 L 124.000 232.000 C 124.000 234.209 125.791 236.000 128.000 236.000 C 130.209 236.000 132.000 234.209 132.000 232.000 L 132.000 198.000 C 132.003 196.217 133.185 194.650 134.900 194.160 L 235.300 165.500 C 240.437 164.031 243.983 159.343 244.000 154.000 L 244.000 104.000 C 244.000 97.373 238.627 92.000 232.000 92.000 ZM 204.000 128.000 C 204.000 130.209 202.209 132.000 200.000 132.000 L 48.000 132.000 C 45.791 132.000 44.000 130.209 44.000 128.000 L 44.000 64.000 C 44.000 61.791 45.791 60.000 48.000 60.000 L 200.000 60.000 C 202.209 60.000 204.000 61.791 204.000 64.000 Z"),
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
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
