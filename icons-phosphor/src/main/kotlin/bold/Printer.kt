package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Printer: ImageVector
    get() {
        if (_printer != null) return _printer!!
        _printer = phosphorBoldIcon(
            name = "Printer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 214.670 68.000 L 204.000 68.000 L 204.000 40.000 C 204.000 33.373 198.627 28.000 192.000 28.000 L 64.000 28.000 C 57.373 28.000 52.000 33.373 52.000 40.000 L 52.000 68.000 L 41.330 68.000 C 25.160 68.000 12.000 80.560 12.000 96.000 L 12.000 176.000 C 12.000 182.627 17.373 188.000 24.000 188.000 L 52.000 188.000 L 52.000 216.000 C 52.000 222.627 57.373 228.000 64.000 228.000 L 192.000 228.000 C 198.627 228.000 204.000 222.627 204.000 216.000 L 204.000 188.000 L 232.000 188.000 C 238.627 188.000 244.000 182.627 244.000 176.000 L 244.000 96.000 C 244.000 80.560 230.840 68.000 214.670 68.000 ZM 76.000 52.000 L 180.000 52.000 L 180.000 68.000 L 76.000 68.000 ZM 180.000 204.000 L 76.000 204.000 L 76.000 172.000 L 180.000 172.000 ZM 220.000 164.000 L 204.000 164.000 L 204.000 160.000 C 204.000 153.373 198.627 148.000 192.000 148.000 L 64.000 148.000 C 57.373 148.000 52.000 153.373 52.000 160.000 L 52.000 164.000 L 36.000 164.000 L 36.000 96.000 C 36.000 93.830 38.440 92.000 41.330 92.000 L 214.670 92.000 C 217.560 92.000 220.000 93.830 220.000 96.000 ZM 204.000 120.000 C 204.000 128.837 196.837 136.000 188.000 136.000 C 179.163 136.000 172.000 128.837 172.000 120.000 C 172.000 111.163 179.163 104.000 188.000 104.000 C 196.837 104.000 204.000 111.163 204.000 120.000 Z"),
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
        return _printer!!
    }

private var _printer: ImageVector? = null
