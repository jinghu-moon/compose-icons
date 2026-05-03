package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaperclipHorizontal: ImageVector
    get() {
        if (_paperclipHorizontal != null) return _paperclipHorizontal!!
        _paperclipHorizontal = phosphorThinIcon(
            name = "PaperclipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 128.000 C 243.967 156.705 220.705 179.967 192.000 180.000 L 48.000 180.000 C 28.118 180.000 12.000 163.882 12.000 144.000 C 12.000 124.118 28.118 108.000 48.000 108.000 L 192.000 108.000 C 203.046 108.000 212.000 116.954 212.000 128.000 C 212.000 139.046 203.046 148.000 192.000 148.000 L 80.000 148.000 C 77.791 148.000 76.000 146.209 76.000 144.000 C 76.000 141.791 77.791 140.000 80.000 140.000 L 192.000 140.000 C 198.627 140.000 204.000 134.627 204.000 128.000 C 204.000 121.373 198.627 116.000 192.000 116.000 L 48.000 116.000 C 32.536 116.000 20.000 128.536 20.000 144.000 C 20.000 159.464 32.536 172.000 48.000 172.000 L 192.000 172.000 C 216.301 172.000 236.000 152.301 236.000 128.000 C 236.000 103.699 216.301 84.000 192.000 84.000 L 80.000 84.000 C 77.791 84.000 76.000 82.209 76.000 80.000 C 76.000 77.791 77.791 76.000 80.000 76.000 L 192.000 76.000 C 220.705 76.033 243.967 99.295 244.000 128.000 Z"),
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
        return _paperclipHorizontal!!
    }

private var _paperclipHorizontal: ImageVector? = null
