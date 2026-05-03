package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Airplay: ImageVector
    get() {
        if (_airplay != null) return _airplay!!
        _airplay = phosphorBoldIcon(
            name = "Airplay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 137.110 152.190 C 134.830 149.531 131.503 148.001 128.000 148.001 C 124.497 148.001 121.170 149.531 118.890 152.190 L 70.890 208.190 C 67.840 211.748 67.140 216.756 69.098 221.014 C 71.056 225.271 75.314 228.000 80.000 228.000 L 176.000 228.000 C 180.686 228.000 184.944 225.271 186.902 221.014 C 188.860 216.756 188.160 211.748 185.110 208.190 ZM 106.110 204.000 L 128.000 178.440 L 149.910 204.000 ZM 236.000 64.000 L 236.000 176.000 C 236.000 191.464 223.464 204.000 208.000 204.000 L 204.000 204.000 C 197.373 204.000 192.000 198.627 192.000 192.000 C 192.000 185.373 197.373 180.000 204.000 180.000 L 208.000 180.000 C 210.209 180.000 212.000 178.209 212.000 176.000 L 212.000 64.000 C 212.000 61.791 210.209 60.000 208.000 60.000 L 48.000 60.000 C 45.791 60.000 44.000 61.791 44.000 64.000 L 44.000 176.000 C 44.000 178.209 45.791 180.000 48.000 180.000 L 52.000 180.000 C 58.627 180.000 64.000 185.373 64.000 192.000 C 64.000 198.627 58.627 204.000 52.000 204.000 L 48.000 204.000 C 32.536 204.000 20.000 191.464 20.000 176.000 L 20.000 64.000 C 20.000 48.536 32.536 36.000 48.000 36.000 L 208.000 36.000 C 223.464 36.000 236.000 48.536 236.000 64.000 Z"),
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
        return _airplay!!
    }

private var _airplay: ImageVector? = null
