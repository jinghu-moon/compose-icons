package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Airplay: ImageVector
    get() {
        if (_airplay != null) return _airplay!!
        _airplay = phosphorDuotoneIcon(
            name = "Airplay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 64.000 L 224.000 176.000 C 224.000 184.837 216.837 192.000 208.000 192.000 L 155.430 192.000 L 128.000 160.000 L 100.570 192.000 L 48.000 192.000 C 39.163 192.000 32.000 184.837 32.000 176.000 L 32.000 64.000 C 32.000 55.163 39.163 48.000 48.000 48.000 L 208.000 48.000 C 216.837 48.000 224.000 55.163 224.000 64.000 Z"),
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
                pathData = parseSvgPathData("M 134.080 154.790 C 132.560 153.016 130.341 151.995 128.005 151.995 C 125.669 151.995 123.450 153.016 121.930 154.790 L 73.930 210.790 C 71.895 213.161 71.427 216.501 72.732 219.340 C 74.036 222.180 76.875 224.000 80.000 224.000 L 176.000 224.000 C 179.125 224.000 181.964 222.180 183.268 219.340 C 184.573 216.501 184.105 213.161 182.070 210.790 ZM 97.390 208.000 L 128.000 172.290 L 158.610 208.000 ZM 232.000 64.000 L 232.000 176.000 C 232.000 189.255 221.255 200.000 208.000 200.000 L 200.000 200.000 C 195.582 200.000 192.000 196.418 192.000 192.000 C 192.000 187.582 195.582 184.000 200.000 184.000 L 208.000 184.000 C 212.418 184.000 216.000 180.418 216.000 176.000 L 216.000 64.000 C 216.000 59.582 212.418 56.000 208.000 56.000 L 48.000 56.000 C 43.582 56.000 40.000 59.582 40.000 64.000 L 40.000 176.000 C 40.000 180.418 43.582 184.000 48.000 184.000 L 56.000 184.000 C 60.418 184.000 64.000 187.582 64.000 192.000 C 64.000 196.418 60.418 200.000 56.000 200.000 L 48.000 200.000 C 34.745 200.000 24.000 189.255 24.000 176.000 L 24.000 64.000 C 24.000 50.745 34.745 40.000 48.000 40.000 L 208.000 40.000 C 221.255 40.000 232.000 50.745 232.000 64.000 Z"),
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
        return _airplay!!
    }

private var _airplay: ImageVector? = null
