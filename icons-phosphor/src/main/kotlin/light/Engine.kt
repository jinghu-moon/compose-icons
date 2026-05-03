package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Engine: ImageVector
    get() {
        if (_engine != null) return _engine!!
        _engine = phosphorLightIcon(
            name = "Engine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 106.000 L 226.490 106.000 L 190.580 70.100 C 187.963 67.468 184.402 65.991 180.690 66.000 L 138.000 66.000 L 138.000 38.000 L 164.000 38.000 C 167.314 38.000 170.000 35.314 170.000 32.000 C 170.000 28.686 167.314 26.000 164.000 26.000 L 100.000 26.000 C 96.686 26.000 94.000 28.686 94.000 32.000 C 94.000 35.314 96.686 38.000 100.000 38.000 L 126.000 38.000 L 126.000 66.000 L 64.000 66.000 C 56.268 66.000 50.000 72.268 50.000 80.000 L 50.000 134.000 L 22.000 134.000 L 22.000 108.000 C 22.000 104.686 19.314 102.000 16.000 102.000 C 12.686 102.000 10.000 104.686 10.000 108.000 L 10.000 172.000 C 10.000 175.314 12.686 178.000 16.000 178.000 C 19.314 178.000 22.000 175.314 22.000 172.000 L 22.000 146.000 L 50.000 146.000 L 50.000 168.690 C 49.991 172.402 51.468 175.963 54.100 178.580 L 93.420 217.900 C 96.037 220.532 99.598 222.009 103.310 222.000 L 180.690 222.000 C 184.402 222.009 187.963 220.532 190.580 217.900 L 226.490 182.000 L 240.000 182.000 C 247.732 182.000 254.000 175.732 254.000 168.000 L 254.000 120.000 C 254.000 112.268 247.732 106.000 240.000 106.000 ZM 242.000 168.000 C 242.000 169.105 241.105 170.000 240.000 170.000 L 224.000 170.000 C 222.409 170.001 220.884 170.634 219.760 171.760 L 182.100 209.420 C 181.725 209.792 181.218 210.000 180.690 210.000 L 103.310 210.000 C 102.782 210.000 102.275 209.792 101.900 209.420 L 62.580 170.100 C 62.208 169.725 62.000 169.218 62.000 168.690 L 62.000 80.000 C 62.000 78.895 62.895 78.000 64.000 78.000 L 180.690 78.000 C 181.218 78.000 181.725 78.208 182.100 78.580 L 219.760 116.240 C 220.884 117.366 222.409 117.999 224.000 118.000 L 240.000 118.000 C 241.105 118.000 242.000 118.895 242.000 120.000 Z"),
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
        return _engine!!
    }

private var _engine: ImageVector? = null
