package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Crosshair: ImageVector
    get() {
        if (_crosshair != null) return _crosshair!!
        _crosshair = phosphorBoldIcon(
            name = "Crosshair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 116.000 L 227.280 116.000 C 221.683 70.315 185.685 34.317 140.000 28.720 L 140.000 24.000 C 140.000 17.373 134.627 12.000 128.000 12.000 C 121.373 12.000 116.000 17.373 116.000 24.000 L 116.000 28.720 C 70.315 34.317 34.317 70.315 28.720 116.000 L 24.000 116.000 C 17.373 116.000 12.000 121.373 12.000 128.000 C 12.000 134.627 17.373 140.000 24.000 140.000 L 28.720 140.000 C 34.317 185.685 70.315 221.683 116.000 227.280 L 116.000 232.000 C 116.000 238.627 121.373 244.000 128.000 244.000 C 134.627 244.000 140.000 238.627 140.000 232.000 L 140.000 227.280 C 185.685 221.683 221.683 185.685 227.280 140.000 L 232.000 140.000 C 238.627 140.000 244.000 134.627 244.000 128.000 C 244.000 121.373 238.627 116.000 232.000 116.000 ZM 140.000 203.000 L 140.000 200.000 C 140.000 193.373 134.627 188.000 128.000 188.000 C 121.373 188.000 116.000 193.373 116.000 200.000 L 116.000 203.000 C 83.624 197.758 58.242 172.376 53.000 140.000 L 56.000 140.000 C 62.627 140.000 68.000 134.627 68.000 128.000 C 68.000 121.373 62.627 116.000 56.000 116.000 L 53.000 116.000 C 58.242 83.624 83.624 58.242 116.000 53.000 L 116.000 56.000 C 116.000 62.627 121.373 68.000 128.000 68.000 C 134.627 68.000 140.000 62.627 140.000 56.000 L 140.000 53.000 C 172.376 58.242 197.758 83.624 203.000 116.000 L 200.000 116.000 C 193.373 116.000 188.000 121.373 188.000 128.000 C 188.000 134.627 193.373 140.000 200.000 140.000 L 203.000 140.000 C 197.758 172.376 172.376 197.758 140.000 203.000 ZM 128.000 84.000 C 103.699 84.000 84.000 103.699 84.000 128.000 C 84.000 152.301 103.699 172.000 128.000 172.000 C 152.301 172.000 172.000 152.301 172.000 128.000 C 171.972 103.711 152.289 84.028 128.000 84.000 ZM 128.000 148.000 C 116.954 148.000 108.000 139.046 108.000 128.000 C 108.000 116.954 116.954 108.000 128.000 108.000 C 139.046 108.000 148.000 116.954 148.000 128.000 C 148.000 139.046 139.046 148.000 128.000 148.000 Z"),
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
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null
