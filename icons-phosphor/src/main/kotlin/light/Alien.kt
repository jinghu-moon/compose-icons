package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = phosphorLightIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 18.000 C 76.110 18.061 34.061 60.110 34.000 112.000 C 34.000 135.600 46.410 166.200 67.210 193.830 C 83.270 215.180 107.680 238.000 128.000 238.000 C 148.320 238.000 172.730 215.180 188.790 193.830 C 209.590 166.200 222.000 135.600 222.000 112.000 C 221.939 60.110 179.890 18.061 128.000 18.000 ZM 179.210 186.620 C 161.480 210.170 140.910 226.000 128.000 226.000 C 115.090 226.000 94.520 210.170 76.790 186.620 C 57.800 161.370 46.000 132.780 46.000 112.000 C 46.000 66.713 82.713 30.000 128.000 30.000 C 173.287 30.000 210.000 66.713 210.000 112.000 C 210.000 132.780 198.200 161.370 179.210 186.620 ZM 118.000 136.000 C 118.000 115.013 100.987 98.000 80.000 98.000 C 72.268 98.000 66.000 104.268 66.000 112.000 C 66.000 132.987 83.013 150.000 104.000 150.000 C 111.732 150.000 118.000 143.732 118.000 136.000 ZM 104.000 138.000 C 89.641 138.000 78.000 126.359 78.000 112.000 C 78.000 110.895 78.895 110.000 80.000 110.000 C 94.359 110.000 106.000 121.641 106.000 136.000 C 106.000 137.105 105.105 138.000 104.000 138.000 ZM 176.000 98.000 C 155.013 98.000 138.000 115.013 138.000 136.000 C 138.000 143.732 144.268 150.000 152.000 150.000 C 172.987 150.000 190.000 132.987 190.000 112.000 C 190.000 104.268 183.732 98.000 176.000 98.000 ZM 152.000 138.000 C 150.895 138.000 150.000 137.105 150.000 136.000 C 150.000 121.641 161.641 110.000 176.000 110.000 C 177.105 110.000 178.000 110.895 178.000 112.000 C 178.000 126.359 166.359 138.000 152.000 138.000 ZM 150.000 184.000 C 150.000 187.314 147.314 190.000 144.000 190.000 L 112.000 190.000 C 108.686 190.000 106.000 187.314 106.000 184.000 C 106.000 180.686 108.686 178.000 112.000 178.000 L 144.000 178.000 C 147.314 178.000 150.000 180.686 150.000 184.000 Z"),
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
        return _alien!!
    }

private var _alien: ImageVector? = null
