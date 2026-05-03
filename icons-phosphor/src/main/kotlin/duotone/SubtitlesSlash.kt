package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SubtitlesSlash: ImageVector
    get() {
        if (_subtitlesSlash != null) return _subtitlesSlash!!
        _subtitlesSlash = phosphorDuotoneIcon(
            name = "SubtitlesSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 232.000 64.000 L 232.000 192.000 C 232.000 196.418 228.418 200.000 224.000 200.000 L 32.000 200.000 C 27.582 200.000 24.000 196.418 24.000 192.000 L 24.000 64.000 C 24.000 59.582 27.582 56.000 32.000 56.000 L 224.000 56.000 C 228.418 56.000 232.000 59.582 232.000 64.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 48.000 136.000 C 48.000 131.582 51.582 128.000 56.000 128.000 L 72.000 128.000 C 76.418 128.000 80.000 131.582 80.000 136.000 C 80.000 140.418 76.418 144.000 72.000 144.000 L 56.000 144.000 C 51.582 144.000 48.000 140.418 48.000 136.000 ZM 213.920 210.620 C 215.883 212.729 216.561 215.730 215.694 218.478 C 214.827 221.225 212.550 223.294 209.733 223.895 C 206.915 224.496 203.992 223.535 202.080 221.380 L 189.920 208.000 L 32.000 208.000 C 23.163 208.000 16.000 200.837 16.000 192.000 L 16.000 64.000 C 16.000 55.163 23.163 48.000 32.000 48.000 L 44.460 48.000 L 42.080 45.380 C 40.117 43.271 39.439 40.270 40.306 37.522 C 41.173 34.775 43.450 32.706 46.267 32.105 C 49.085 31.504 52.008 32.465 53.920 34.620 ZM 175.370 192.000 L 160.820 176.000 L 56.000 176.000 C 51.582 176.000 48.000 172.418 48.000 168.000 C 48.000 163.582 51.582 160.000 56.000 160.000 L 146.280 160.000 L 131.730 144.000 L 104.000 144.000 C 99.582 144.000 96.000 140.418 96.000 136.000 C 96.000 131.582 99.582 128.000 104.000 128.000 L 117.190 128.000 L 59.000 64.000 L 32.000 64.000 L 32.000 192.000 ZM 200.000 144.000 C 204.418 144.000 208.000 140.418 208.000 136.000 C 208.000 131.582 204.418 128.000 200.000 128.000 L 178.520 128.000 C 174.102 128.000 170.520 131.582 170.520 136.000 C 170.520 140.418 174.102 144.000 178.520 144.000 ZM 224.000 48.000 L 105.790 48.000 C 101.372 48.000 97.790 51.582 97.790 56.000 C 97.790 60.418 101.372 64.000 105.790 64.000 L 224.000 64.000 L 224.000 194.830 C 224.000 199.248 227.582 202.830 232.000 202.830 C 236.418 202.830 240.000 199.248 240.000 194.830 L 240.000 64.000 C 240.000 55.163 232.837 48.000 224.000 48.000 Z"),
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
        return _subtitlesSlash!!
    }

private var _subtitlesSlash: ImageVector? = null
