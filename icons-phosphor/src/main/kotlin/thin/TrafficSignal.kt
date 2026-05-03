package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrafficSignal: ImageVector
    get() {
        if (_trafficSignal != null) return _trafficSignal!!
        _trafficSignal = phosphorThinIcon(
            name = "TrafficSignal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 60.000 C 112.536 60.000 100.000 72.536 100.000 88.000 C 100.000 103.464 112.536 116.000 128.000 116.000 C 143.464 116.000 156.000 103.464 156.000 88.000 C 156.000 72.536 143.464 60.000 128.000 60.000 ZM 128.000 108.000 C 116.954 108.000 108.000 99.046 108.000 88.000 C 108.000 76.954 116.954 68.000 128.000 68.000 C 139.046 68.000 148.000 76.954 148.000 88.000 C 148.000 99.046 139.046 108.000 128.000 108.000 ZM 128.000 140.000 C 112.536 140.000 100.000 152.536 100.000 168.000 C 100.000 183.464 112.536 196.000 128.000 196.000 C 143.464 196.000 156.000 183.464 156.000 168.000 C 156.000 152.536 143.464 140.000 128.000 140.000 ZM 128.000 188.000 C 116.954 188.000 108.000 179.046 108.000 168.000 C 108.000 156.954 116.954 148.000 128.000 148.000 C 139.046 148.000 148.000 156.954 148.000 168.000 C 148.000 179.046 139.046 188.000 128.000 188.000 ZM 216.000 148.000 L 196.000 148.000 L 196.000 76.000 L 216.000 76.000 C 218.209 76.000 220.000 74.209 220.000 72.000 C 220.000 69.791 218.209 68.000 216.000 68.000 L 196.000 68.000 L 196.000 40.000 C 196.000 33.373 190.627 28.000 184.000 28.000 L 72.000 28.000 C 65.373 28.000 60.000 33.373 60.000 40.000 L 60.000 68.000 L 40.000 68.000 C 37.791 68.000 36.000 69.791 36.000 72.000 C 36.000 74.209 37.791 76.000 40.000 76.000 L 60.000 76.000 L 60.000 148.000 L 40.000 148.000 C 37.791 148.000 36.000 149.791 36.000 152.000 C 36.000 154.209 37.791 156.000 40.000 156.000 L 60.000 156.000 L 60.000 216.000 C 60.000 222.627 65.373 228.000 72.000 228.000 L 184.000 228.000 C 190.627 228.000 196.000 222.627 196.000 216.000 L 196.000 156.000 L 216.000 156.000 C 218.209 156.000 220.000 154.209 220.000 152.000 C 220.000 149.791 218.209 148.000 216.000 148.000 ZM 188.000 216.000 C 188.000 218.209 186.209 220.000 184.000 220.000 L 72.000 220.000 C 69.791 220.000 68.000 218.209 68.000 216.000 L 68.000 40.000 C 68.000 37.791 69.791 36.000 72.000 36.000 L 184.000 36.000 C 186.209 36.000 188.000 37.791 188.000 40.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _trafficSignal!!
    }

private var _trafficSignal: ImageVector? = null
