package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineUpLeft: ImageVector
    get() {
        if (_arrowLineUpLeft != null) return _arrowLineUpLeft!!
        _arrowLineUpLeft = phosphorThinIcon(
            name = "ArrowLineUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 208.000 C 228.000 210.209 226.209 212.000 224.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 C 44.000 205.791 45.791 204.000 48.000 204.000 L 224.000 204.000 C 226.209 204.000 228.000 205.791 228.000 208.000 ZM 72.000 148.000 C 74.209 148.000 76.000 146.209 76.000 144.000 L 76.000 57.660 L 181.170 162.830 C 182.733 164.393 185.267 164.393 186.830 162.830 C 188.393 161.267 188.393 158.733 186.830 157.170 L 81.660 52.000 L 168.000 52.000 C 170.209 52.000 172.000 50.209 172.000 48.000 C 172.000 45.791 170.209 44.000 168.000 44.000 L 72.000 44.000 C 69.791 44.000 68.000 45.791 68.000 48.000 L 68.000 144.000 C 68.000 146.209 69.791 148.000 72.000 148.000 Z"),
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
        return _arrowLineUpLeft!!
    }

private var _arrowLineUpLeft: ImageVector? = null
