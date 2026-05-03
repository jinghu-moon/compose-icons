package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) return _bezierCurve!!
        _bezierCurve = phosphorDuotoneIcon(
            name = "BezierCurve",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 152.000 80.000 C 152.000 93.255 141.255 104.000 128.000 104.000 C 114.745 104.000 104.000 93.255 104.000 80.000 C 104.000 66.745 114.745 56.000 128.000 56.000 C 141.255 56.000 152.000 66.745 152.000 80.000 ZM 40.000 152.000 C 26.745 152.000 16.000 162.745 16.000 176.000 C 16.000 189.255 26.745 200.000 40.000 200.000 C 53.255 200.000 64.000 189.255 64.000 176.000 C 64.000 162.745 53.255 152.000 40.000 152.000 ZM 216.000 152.000 C 202.745 152.000 192.000 162.745 192.000 176.000 C 192.000 189.255 202.745 200.000 216.000 200.000 C 229.255 200.000 240.000 189.255 240.000 176.000 C 240.000 162.745 229.255 152.000 216.000 152.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 221.070 144.410 C 215.130 121.307 200.858 101.216 181.000 88.000 L 240.000 88.000 C 244.418 88.000 248.000 84.418 248.000 80.000 C 248.000 75.582 244.418 72.000 240.000 72.000 L 159.000 72.000 C 155.375 57.841 142.616 47.937 128.000 47.937 C 113.384 47.937 100.625 57.841 97.000 72.000 L 16.000 72.000 C 11.582 72.000 8.000 75.582 8.000 80.000 C 8.000 84.418 11.582 88.000 16.000 88.000 L 75.000 88.000 C 55.142 101.216 40.870 121.307 34.930 144.410 C 19.039 146.946 7.503 160.887 7.987 176.972 C 8.470 193.056 20.823 206.280 36.837 207.856 C 52.851 209.433 67.545 198.872 71.156 183.191 C 74.767 167.509 66.171 151.586 51.080 146.000 C 58.041 121.998 75.742 102.584 99.000 93.440 C 104.242 104.744 115.570 111.977 128.030 111.977 C 140.490 111.977 151.818 104.744 157.060 93.440 C 180.295 102.599 197.971 122.011 204.920 146.000 C 189.822 151.567 181.206 167.480 184.797 183.166 C 188.389 198.852 203.070 209.431 219.086 207.874 C 235.103 206.317 247.472 193.108 247.974 177.024 C 248.477 160.940 236.958 146.985 221.070 144.430 ZM 56.000 176.000 C 56.000 184.837 48.837 192.000 40.000 192.000 C 31.163 192.000 24.000 184.837 24.000 176.000 C 24.000 167.163 31.163 160.000 40.000 160.000 C 48.837 160.000 56.000 167.163 56.000 176.000 ZM 128.000 96.000 C 119.163 96.000 112.000 88.837 112.000 80.000 C 112.000 71.163 119.163 64.000 128.000 64.000 C 136.837 64.000 144.000 71.163 144.000 80.000 C 144.000 88.837 136.837 96.000 128.000 96.000 ZM 216.000 192.000 C 207.163 192.000 200.000 184.837 200.000 176.000 C 200.000 167.163 207.163 160.000 216.000 160.000 C 224.837 160.000 232.000 167.163 232.000 176.000 C 232.000 184.837 224.837 192.000 216.000 192.000 Z"),
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
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
