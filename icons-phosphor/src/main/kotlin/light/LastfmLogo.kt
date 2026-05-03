package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LastfmLogo: ImageVector
    get() {
        if (_lastfmLogo != null) return _lastfmLogo!!
        _lastfmLogo = phosphorLightIcon(
            name = "LastfmLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 246.000 160.000 C 246.000 180.987 228.987 198.000 208.000 198.000 L 190.570 198.000 C 169.604 197.951 150.545 185.817 141.630 166.840 L 111.490 102.240 C 104.563 87.476 89.738 78.035 73.430 78.000 L 64.000 78.000 C 40.804 78.000 22.000 96.804 22.000 120.000 L 22.000 144.000 C 22.000 167.196 40.804 186.000 64.000 186.000 L 72.000 186.000 C 85.522 186.003 97.761 177.993 103.170 165.600 C 104.495 162.562 108.032 161.175 111.070 162.500 C 114.108 163.825 115.495 167.362 114.170 170.400 C 106.852 187.167 90.294 198.004 72.000 198.000 L 64.000 198.000 C 34.190 197.967 10.033 173.810 10.000 144.000 L 10.000 120.000 C 10.033 90.190 34.190 66.033 64.000 66.000 L 73.430 66.000 C 94.396 66.049 113.455 78.183 122.370 97.160 L 152.510 161.760 C 159.437 176.524 174.262 185.965 190.570 186.000 L 208.000 186.000 C 222.359 186.000 234.000 174.359 234.000 160.000 C 234.000 145.641 222.359 134.000 208.000 134.000 L 188.000 134.000 C 169.222 134.000 154.000 118.778 154.000 100.000 C 154.000 81.222 169.222 66.000 188.000 66.000 L 208.000 66.000 C 224.569 66.000 238.000 79.431 238.000 96.000 C 238.000 99.314 235.314 102.000 232.000 102.000 C 228.686 102.000 226.000 99.314 226.000 96.000 C 226.000 86.059 217.941 78.000 208.000 78.000 L 188.000 78.000 C 175.850 78.000 166.000 87.850 166.000 100.000 C 166.000 112.150 175.850 122.000 188.000 122.000 L 208.000 122.000 C 228.987 122.000 246.000 139.013 246.000 160.000 Z"),
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
        return _lastfmLogo!!
    }

private var _lastfmLogo: ImageVector? = null
