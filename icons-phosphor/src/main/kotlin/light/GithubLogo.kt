package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GithubLogo: ImageVector
    get() {
        if (_githubLogo != null) return _githubLogo!!
        _githubLogo = phosphorLightIcon(
            name = "GithubLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 206.130 75.920 C 211.236 60.291 209.443 43.227 201.200 29.000 C 200.128 27.142 198.145 25.999 196.000 26.000 C 177.381 25.959 159.884 34.894 149.000 50.000 L 123.000 50.000 C 112.116 34.894 94.619 25.959 76.000 26.000 C 73.855 25.999 71.872 27.142 70.800 29.000 C 62.557 43.227 60.764 60.291 65.870 75.920 C 60.808 84.418 58.092 94.108 58.000 104.000 L 58.000 112.000 C 58.036 140.429 80.085 163.972 108.450 165.870 C 101.738 172.913 97.995 182.271 98.000 192.000 L 98.000 202.000 L 72.000 202.000 C 57.641 202.000 46.000 190.359 46.000 176.000 C 46.000 155.013 28.987 138.000 8.000 138.000 C 4.686 138.000 2.000 140.686 2.000 144.000 C 2.000 147.314 4.686 150.000 8.000 150.000 C 22.359 150.000 34.000 161.641 34.000 176.000 C 34.000 196.987 51.013 214.000 72.000 214.000 L 98.000 214.000 L 98.000 232.000 C 98.000 235.314 100.686 238.000 104.000 238.000 C 107.314 238.000 110.000 235.314 110.000 232.000 L 110.000 192.000 C 110.000 177.641 121.641 166.000 136.000 166.000 C 150.359 166.000 162.000 177.641 162.000 192.000 L 162.000 232.000 C 162.000 235.314 164.686 238.000 168.000 238.000 C 171.314 238.000 174.000 235.314 174.000 232.000 L 174.000 192.000 C 174.005 182.271 170.262 172.913 163.550 165.870 C 191.915 163.972 213.964 140.429 214.000 112.000 L 214.000 104.000 C 213.908 94.108 211.192 84.418 206.130 75.920 ZM 202.000 112.000 C 202.000 135.196 183.196 154.000 160.000 154.000 L 112.000 154.000 C 88.804 154.000 70.000 135.196 70.000 112.000 L 70.000 104.000 C 70.105 95.566 72.639 87.340 77.300 80.310 C 78.545 78.658 78.851 76.481 78.110 74.550 C 73.534 62.734 74.051 49.551 79.540 38.130 C 93.953 39.217 107.009 47.037 114.770 59.230 C 115.873 60.957 117.781 62.001 119.830 62.000 L 152.170 62.000 C 154.217 62.003 156.125 60.963 157.230 59.240 C 164.987 47.041 178.045 39.216 192.460 38.130 C 197.949 49.551 198.466 62.734 193.890 74.550 C 193.151 76.472 193.449 78.639 194.680 80.290 C 199.356 87.322 201.898 95.556 202.000 104.000 Z"),
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
        return _githubLogo!!
    }

private var _githubLogo: ImageVector? = null
