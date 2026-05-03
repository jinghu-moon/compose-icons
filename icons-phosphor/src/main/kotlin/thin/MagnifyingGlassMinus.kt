package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MagnifyingGlassMinus: ImageVector
    get() {
        if (_magnifyingGlassMinus != null) return _magnifyingGlassMinus!!
        _magnifyingGlassMinus = phosphorThinIcon(
            name = "MagnifyingGlassMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 148.000 112.000 C 148.000 114.209 146.209 116.000 144.000 116.000 L 80.000 116.000 C 77.791 116.000 76.000 114.209 76.000 112.000 C 76.000 109.791 77.791 108.000 80.000 108.000 L 144.000 108.000 C 146.209 108.000 148.000 109.791 148.000 112.000 ZM 226.830 226.830 C 226.080 227.581 225.062 228.003 224.000 228.003 C 222.938 228.003 221.920 227.581 221.170 226.830 L 168.470 174.130 C 134.678 204.848 82.547 202.986 51.033 169.935 C 19.520 136.884 20.140 84.724 52.432 52.432 C 84.724 20.140 136.884 19.520 169.935 51.033 C 202.986 82.547 204.848 134.678 174.130 168.470 L 226.830 221.170 C 227.581 221.920 228.003 222.938 228.003 224.000 C 228.003 225.062 227.581 226.080 226.830 226.830 ZM 112.000 188.000 C 153.974 188.000 188.000 153.974 188.000 112.000 C 188.000 70.026 153.974 36.000 112.000 36.000 C 70.026 36.000 36.000 70.026 36.000 112.000 C 36.044 153.955 70.045 187.956 112.000 188.000 Z"),
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
        return _magnifyingGlassMinus!!
    }

private var _magnifyingGlassMinus: ImageVector? = null
