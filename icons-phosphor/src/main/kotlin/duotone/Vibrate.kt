package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Vibrate: ImageVector
    get() {
        if (_vibrate != null) return _vibrate!!
        _vibrate = phosphorDuotoneIcon(
            name = "Vibrate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 176.000 56.000 L 176.000 200.000 C 176.000 208.837 168.837 216.000 160.000 216.000 L 96.000 216.000 C 87.163 216.000 80.000 208.837 80.000 200.000 L 80.000 56.000 C 80.000 47.163 87.163 40.000 96.000 40.000 L 160.000 40.000 C 168.837 40.000 176.000 47.163 176.000 56.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 160.000 32.000 L 96.000 32.000 C 82.745 32.000 72.000 42.745 72.000 56.000 L 72.000 200.000 C 72.000 213.255 82.745 224.000 96.000 224.000 L 160.000 224.000 C 173.255 224.000 184.000 213.255 184.000 200.000 L 184.000 56.000 C 184.000 42.745 173.255 32.000 160.000 32.000 ZM 168.000 200.000 C 168.000 204.418 164.418 208.000 160.000 208.000 L 96.000 208.000 C 91.582 208.000 88.000 204.418 88.000 200.000 L 88.000 56.000 C 88.000 51.582 91.582 48.000 96.000 48.000 L 160.000 48.000 C 164.418 48.000 168.000 51.582 168.000 56.000 ZM 216.000 88.000 L 216.000 168.000 C 216.000 172.418 212.418 176.000 208.000 176.000 C 203.582 176.000 200.000 172.418 200.000 168.000 L 200.000 88.000 C 200.000 83.582 203.582 80.000 208.000 80.000 C 212.418 80.000 216.000 83.582 216.000 88.000 ZM 248.000 104.000 L 248.000 152.000 C 248.000 156.418 244.418 160.000 240.000 160.000 C 235.582 160.000 232.000 156.418 232.000 152.000 L 232.000 104.000 C 232.000 99.582 235.582 96.000 240.000 96.000 C 244.418 96.000 248.000 99.582 248.000 104.000 ZM 56.000 88.000 L 56.000 168.000 C 56.000 172.418 52.418 176.000 48.000 176.000 C 43.582 176.000 40.000 172.418 40.000 168.000 L 40.000 88.000 C 40.000 83.582 43.582 80.000 48.000 80.000 C 52.418 80.000 56.000 83.582 56.000 88.000 ZM 24.000 104.000 L 24.000 152.000 C 24.000 156.418 20.418 160.000 16.000 160.000 C 11.582 160.000 8.000 156.418 8.000 152.000 L 8.000 104.000 C 8.000 99.582 11.582 96.000 16.000 96.000 C 20.418 96.000 24.000 99.582 24.000 104.000 Z"),
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
