package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) return _waveTriangle!!
        _waveTriangle = phosphorFillIcon(
            name = "WaveTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 206.150 133.120 L 166.150 181.120 C 164.629 182.946 162.376 184.001 160.000 184.000 L 159.570 184.000 C 157.050 183.866 154.740 182.550 153.340 180.450 L 95.340 93.360 L 62.150 133.120 C 59.322 136.517 54.277 136.978 50.880 134.150 C 47.483 131.322 47.022 126.277 49.850 122.880 L 89.850 74.880 C 91.465 72.937 93.903 71.872 96.426 72.006 C 98.948 72.140 101.260 73.457 102.660 75.560 L 160.710 162.650 L 193.850 122.880 C 196.678 119.483 201.723 119.022 205.120 121.850 C 208.517 124.678 208.978 129.723 206.150 133.120 Z"),
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
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
