package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Radio: ImageVector
    get() {
        if (_radio != null) return _radio!!
        _radio = phosphorBoldIcon(
            name = "Radio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 160.000 172.000 C 179.882 172.000 196.000 155.882 196.000 136.000 C 196.000 116.118 179.882 100.000 160.000 100.000 C 140.118 100.000 124.000 116.118 124.000 136.000 C 124.000 155.882 140.118 172.000 160.000 172.000 ZM 160.000 124.000 C 166.627 124.000 172.000 129.373 172.000 136.000 C 172.000 142.627 166.627 148.000 160.000 148.000 C 153.373 148.000 148.000 142.627 148.000 136.000 C 148.000 129.373 153.373 124.000 160.000 124.000 ZM 216.000 60.000 L 113.760 60.000 L 195.450 35.500 C 201.801 33.595 205.405 26.901 203.500 20.550 C 201.595 14.199 194.901 10.595 188.550 12.500 L 28.550 60.500 C 23.473 62.024 19.997 66.699 20.000 72.000 L 20.000 192.000 C 20.000 203.046 28.954 212.000 40.000 212.000 L 216.000 212.000 C 227.046 212.000 236.000 203.046 236.000 192.000 L 236.000 80.000 C 236.000 68.954 227.046 60.000 216.000 60.000 ZM 212.000 188.000 L 44.000 188.000 L 44.000 84.000 L 212.000 84.000 ZM 60.000 116.000 C 60.000 109.373 65.373 104.000 72.000 104.000 L 96.000 104.000 C 102.627 104.000 108.000 109.373 108.000 116.000 C 108.000 122.627 102.627 128.000 96.000 128.000 L 72.000 128.000 C 65.373 128.000 60.000 122.627 60.000 116.000 ZM 60.000 156.000 C 60.000 149.373 65.373 144.000 72.000 144.000 L 96.000 144.000 C 102.627 144.000 108.000 149.373 108.000 156.000 C 108.000 162.627 102.627 168.000 96.000 168.000 L 72.000 168.000 C 65.373 168.000 60.000 162.627 60.000 156.000 Z"),
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
        return _radio!!
    }

private var _radio: ImageVector? = null
