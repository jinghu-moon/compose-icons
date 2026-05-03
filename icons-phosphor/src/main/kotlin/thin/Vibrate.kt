package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Vibrate: ImageVector
    get() {
        if (_vibrate != null) return _vibrate!!
        _vibrate = phosphorThinIcon(
            name = "Vibrate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 36.000 L 96.000 36.000 C 84.954 36.000 76.000 44.954 76.000 56.000 L 76.000 200.000 C 76.000 211.046 84.954 220.000 96.000 220.000 L 160.000 220.000 C 171.046 220.000 180.000 211.046 180.000 200.000 L 180.000 56.000 C 180.000 44.954 171.046 36.000 160.000 36.000 ZM 172.000 200.000 C 172.000 206.627 166.627 212.000 160.000 212.000 L 96.000 212.000 C 89.373 212.000 84.000 206.627 84.000 200.000 L 84.000 56.000 C 84.000 49.373 89.373 44.000 96.000 44.000 L 160.000 44.000 C 166.627 44.000 172.000 49.373 172.000 56.000 ZM 212.000 88.000 L 212.000 168.000 C 212.000 170.209 210.209 172.000 208.000 172.000 C 205.791 172.000 204.000 170.209 204.000 168.000 L 204.000 88.000 C 204.000 85.791 205.791 84.000 208.000 84.000 C 210.209 84.000 212.000 85.791 212.000 88.000 ZM 244.000 104.000 L 244.000 152.000 C 244.000 154.209 242.209 156.000 240.000 156.000 C 237.791 156.000 236.000 154.209 236.000 152.000 L 236.000 104.000 C 236.000 101.791 237.791 100.000 240.000 100.000 C 242.209 100.000 244.000 101.791 244.000 104.000 ZM 52.000 88.000 L 52.000 168.000 C 52.000 170.209 50.209 172.000 48.000 172.000 C 45.791 172.000 44.000 170.209 44.000 168.000 L 44.000 88.000 C 44.000 85.791 45.791 84.000 48.000 84.000 C 50.209 84.000 52.000 85.791 52.000 88.000 ZM 20.000 104.000 L 20.000 152.000 C 20.000 154.209 18.209 156.000 16.000 156.000 C 13.791 156.000 12.000 154.209 12.000 152.000 L 12.000 104.000 C 12.000 101.791 13.791 100.000 16.000 100.000 C 18.209 100.000 20.000 101.791 20.000 104.000 Z"),
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
        return _vibrate!!
    }

private var _vibrate: ImageVector? = null
