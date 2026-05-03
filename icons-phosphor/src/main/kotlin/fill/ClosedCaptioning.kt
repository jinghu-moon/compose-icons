package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) return _closedCaptioning!!
        _closedCaptioning = phosphorFillIcon(
            name = "ClosedCaptioning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 64.000 C 240.000 55.163 232.837 48.000 224.000 48.000 ZM 116.000 162.640 C 99.189 172.347 77.835 168.582 65.357 153.712 C 52.879 138.842 52.879 117.158 65.357 102.288 C 77.835 87.418 99.189 83.653 116.000 93.360 C 118.556 94.748 120.157 97.413 120.182 100.322 C 120.207 103.230 118.652 105.923 116.120 107.354 C 113.588 108.786 110.479 108.730 108.000 107.210 C 97.913 101.392 85.105 103.655 77.622 112.576 C 70.138 121.497 70.138 134.503 77.622 143.424 C 85.105 152.345 97.913 154.608 108.000 148.790 C 111.811 146.721 116.576 148.064 118.745 151.819 C 120.914 155.574 119.696 160.373 116.000 162.640 ZM 196.000 162.640 C 179.189 172.347 157.835 168.582 145.357 153.712 C 132.879 138.842 132.879 117.158 145.357 102.288 C 157.835 87.418 179.189 83.653 196.000 93.360 C 198.556 94.748 200.157 97.413 200.182 100.322 C 200.207 103.230 198.652 105.923 196.120 107.354 C 193.588 108.786 190.479 108.730 188.000 107.210 C 177.913 101.392 165.105 103.655 157.622 112.576 C 150.138 121.497 150.138 134.503 157.622 143.424 C 165.105 152.345 177.913 154.608 188.000 148.790 C 191.811 146.721 196.576 148.064 198.745 151.819 C 200.914 155.574 199.696 160.373 196.000 162.640 Z"),
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
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
