package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MonitorArrowUp: ImageVector
    get() {
        if (_monitorArrowUp != null) return _monitorArrowUp!!
        _monitorArrowUp = phosphorThinIcon(
            name = "MonitorArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 44.000 L 48.000 44.000 C 36.954 44.000 28.000 52.954 28.000 64.000 L 28.000 176.000 C 28.000 187.046 36.954 196.000 48.000 196.000 L 208.000 196.000 C 219.046 196.000 228.000 187.046 228.000 176.000 L 228.000 64.000 C 228.000 52.954 219.046 44.000 208.000 44.000 ZM 220.000 176.000 C 220.000 182.627 214.627 188.000 208.000 188.000 L 48.000 188.000 C 41.373 188.000 36.000 182.627 36.000 176.000 L 36.000 64.000 C 36.000 57.373 41.373 52.000 48.000 52.000 L 208.000 52.000 C 214.627 52.000 220.000 57.373 220.000 64.000 ZM 164.000 224.000 C 164.000 226.209 162.209 228.000 160.000 228.000 L 96.000 228.000 C 93.791 228.000 92.000 226.209 92.000 224.000 C 92.000 221.791 93.791 220.000 96.000 220.000 L 160.000 220.000 C 162.209 220.000 164.000 221.791 164.000 224.000 ZM 154.830 109.170 C 156.393 110.733 156.393 113.267 154.830 114.830 C 153.267 116.393 150.733 116.393 149.170 114.830 L 132.000 97.660 L 132.000 152.000 C 132.000 154.209 130.209 156.000 128.000 156.000 C 125.791 156.000 124.000 154.209 124.000 152.000 L 124.000 97.660 L 106.830 114.830 C 105.267 116.393 102.733 116.393 101.170 114.830 C 99.607 113.267 99.607 110.733 101.170 109.170 L 125.170 85.170 C 125.920 84.419 126.938 83.997 128.000 83.997 C 129.062 83.997 130.080 84.419 130.830 85.170 Z"),
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
        return _monitorArrowUp!!
    }

private var _monitorArrowUp: ImageVector? = null
