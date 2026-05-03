package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Headlights: ImageVector
    get() {
        if (_headlights != null) return _headlights!!
        _headlights = phosphorThinIcon(
            name = "Headlights",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 164.000 80.000 C 164.000 77.791 165.791 76.000 168.000 76.000 L 240.000 76.000 C 242.209 76.000 244.000 77.791 244.000 80.000 C 244.000 82.209 242.209 84.000 240.000 84.000 L 168.000 84.000 C 165.791 84.000 164.000 82.209 164.000 80.000 ZM 240.000 172.000 L 168.000 172.000 C 165.791 172.000 164.000 173.791 164.000 176.000 C 164.000 178.209 165.791 180.000 168.000 180.000 L 240.000 180.000 C 242.209 180.000 244.000 178.209 244.000 176.000 C 244.000 173.791 242.209 172.000 240.000 172.000 ZM 240.000 108.000 L 168.000 108.000 C 165.791 108.000 164.000 109.791 164.000 112.000 C 164.000 114.209 165.791 116.000 168.000 116.000 L 240.000 116.000 C 242.209 116.000 244.000 114.209 244.000 112.000 C 244.000 109.791 242.209 108.000 240.000 108.000 ZM 240.000 140.000 L 168.000 140.000 C 165.791 140.000 164.000 141.791 164.000 144.000 C 164.000 146.209 165.791 148.000 168.000 148.000 L 240.000 148.000 C 242.209 148.000 244.000 146.209 244.000 144.000 C 244.000 141.791 242.209 140.000 240.000 140.000 ZM 140.000 64.000 L 140.000 192.000 C 140.000 198.627 134.627 204.000 128.000 204.000 L 88.000 204.000 C 67.743 204.001 48.323 195.914 34.054 181.535 C 19.784 167.157 11.845 147.677 12.000 127.420 C 12.310 85.830 46.810 52.000 88.900 52.000 L 128.000 52.000 C 134.627 52.000 140.000 57.373 140.000 64.000 ZM 132.000 64.000 C 132.000 61.791 130.209 60.000 128.000 60.000 L 88.900 60.000 C 51.190 60.000 20.280 90.270 20.000 127.480 C 19.861 145.605 26.964 163.035 39.732 175.900 C 52.499 188.765 69.875 196.001 88.000 196.000 L 128.000 196.000 C 130.209 196.000 132.000 194.209 132.000 192.000 Z"),
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
        return _headlights!!
    }

private var _headlights: ImageVector? = null
