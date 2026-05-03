package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sparkle: ImageVector
    get() {
        if (_sparkle != null) return _sparkle!!
        _sparkle = phosphorBoldIcon(
            name = "Sparkle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 199.000 125.310 L 149.120 106.920 L 130.690 57.000 C 127.803 49.171 120.344 43.971 112.000 43.971 C 103.656 43.971 96.197 49.171 93.310 57.000 L 74.920 106.920 L 25.000 125.310 C 17.171 128.197 11.971 135.656 11.971 144.000 C 11.971 152.344 17.171 159.803 25.000 162.690 L 74.880 181.080 L 93.310 231.000 C 96.197 238.829 103.656 244.029 112.000 244.029 C 120.344 244.029 127.803 238.829 130.690 231.000 L 149.080 181.120 L 199.000 162.690 C 206.829 159.803 212.029 152.344 212.029 144.000 C 212.029 135.656 206.829 128.197 199.000 125.310 ZM 135.620 160.470 C 132.323 161.685 129.725 164.283 128.510 167.580 L 112.000 212.280 L 95.530 167.580 C 94.315 164.283 91.717 161.685 88.420 160.470 L 43.720 144.000 L 88.420 127.530 C 91.717 126.315 94.315 123.717 95.530 120.420 L 112.000 75.720 L 128.470 120.420 C 129.685 123.717 132.283 126.315 135.580 127.530 L 180.280 144.000 ZM 140.000 40.000 C 140.000 33.373 145.373 28.000 152.000 28.000 L 164.000 28.000 L 164.000 16.000 C 164.000 9.373 169.373 4.000 176.000 4.000 C 182.627 4.000 188.000 9.373 188.000 16.000 L 188.000 28.000 L 200.000 28.000 C 206.627 28.000 212.000 33.373 212.000 40.000 C 212.000 46.627 206.627 52.000 200.000 52.000 L 188.000 52.000 L 188.000 64.000 C 188.000 70.627 182.627 76.000 176.000 76.000 C 169.373 76.000 164.000 70.627 164.000 64.000 L 164.000 52.000 L 152.000 52.000 C 145.373 52.000 140.000 46.627 140.000 40.000 ZM 252.000 88.000 C 252.000 94.627 246.627 100.000 240.000 100.000 L 236.000 100.000 L 236.000 104.000 C 236.000 110.627 230.627 116.000 224.000 116.000 C 217.373 116.000 212.000 110.627 212.000 104.000 L 212.000 100.000 L 208.000 100.000 C 201.373 100.000 196.000 94.627 196.000 88.000 C 196.000 81.373 201.373 76.000 208.000 76.000 L 212.000 76.000 L 212.000 72.000 C 212.000 65.373 217.373 60.000 224.000 60.000 C 230.627 60.000 236.000 65.373 236.000 72.000 L 236.000 76.000 L 240.000 76.000 C 246.627 76.000 252.000 81.373 252.000 88.000 Z"),
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
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
