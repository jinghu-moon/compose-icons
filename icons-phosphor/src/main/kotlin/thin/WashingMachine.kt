package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WashingMachine: ImageVector
    get() {
        if (_washingMachine != null) return _washingMachine!!
        _washingMachine = phosphorThinIcon(
            name = "WashingMachine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 128.000 68.000 C 94.863 68.000 68.000 94.863 68.000 128.000 C 68.000 161.137 94.863 188.000 128.000 188.000 C 161.137 188.000 188.000 161.137 188.000 128.000 C 187.961 94.879 161.121 68.039 128.000 68.000 ZM 128.000 180.000 C 99.281 180.000 76.000 156.719 76.000 128.000 C 76.000 99.281 99.281 76.000 128.000 76.000 C 156.719 76.000 180.000 99.281 180.000 128.000 C 179.967 156.705 156.705 179.967 128.000 180.000 ZM 196.000 68.000 C 196.000 72.418 192.418 76.000 188.000 76.000 C 183.582 76.000 180.000 72.418 180.000 68.000 C 180.000 63.582 183.582 60.000 188.000 60.000 C 192.418 60.000 196.000 63.582 196.000 68.000 ZM 122.830 114.830 L 106.830 130.830 C 105.267 132.393 102.733 132.393 101.170 130.830 C 99.607 129.267 99.607 126.733 101.170 125.170 L 117.170 109.170 C 118.733 107.607 121.267 107.607 122.830 109.170 C 124.393 110.733 124.393 113.267 122.830 114.830 ZM 154.830 117.170 C 155.581 117.920 156.003 118.938 156.003 120.000 C 156.003 121.062 155.581 122.080 154.830 122.830 L 122.830 154.830 C 121.267 156.393 118.733 156.393 117.170 154.830 C 115.607 153.267 115.607 150.733 117.170 149.170 L 149.170 117.170 C 149.920 116.419 150.938 115.997 152.000 115.997 C 153.062 115.997 154.080 116.419 154.830 117.170 Z"),
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
        return _washingMachine!!
    }

private var _washingMachine: ImageVector? = null
