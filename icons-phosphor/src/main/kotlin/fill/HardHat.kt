package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HardHat: ImageVector
    get() {
        if (_hardHat != null) return _hardHat!!
        _hardHat = phosphorFillIcon(
            name = "HardHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 152.000 L 104.000 152.000 L 104.000 40.000 C 104.000 31.163 111.163 24.000 120.000 24.000 L 136.000 24.000 C 144.837 24.000 152.000 31.163 152.000 40.000 ZM 224.000 168.000 L 32.000 168.000 C 23.163 168.000 16.000 175.163 16.000 184.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 184.000 C 240.000 175.163 232.837 168.000 224.000 168.000 ZM 224.000 148.000 L 224.000 136.000 C 223.901 100.867 204.703 68.568 173.890 51.690 C 172.650 51.025 171.151 51.061 169.944 51.784 C 168.736 52.508 167.998 53.813 168.000 55.220 L 168.000 152.000 L 220.000 152.000 C 222.209 152.000 224.000 150.209 224.000 148.000 ZM 36.000 152.000 L 88.000 152.000 L 88.000 55.220 C 88.002 53.813 87.263 52.508 86.056 51.784 C 84.849 51.061 83.350 51.025 82.110 51.690 C 51.297 68.568 32.099 100.867 32.000 136.000 L 32.000 148.000 C 32.000 150.209 33.791 152.000 36.000 152.000 Z"),
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
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
