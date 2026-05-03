package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SpeakerHigh: ImageVector
    get() {
        if (_speakerHigh != null) return _speakerHigh!!
        _speakerHigh = phosphorDuotoneIcon(
            name = "SpeakerHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 80.000 88.000 L 80.000 168.000 L 32.000 168.000 C 27.582 168.000 24.000 164.418 24.000 160.000 L 24.000 96.000 C 24.000 91.582 27.582 88.000 32.000 88.000 Z"),
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
                pathData = parseSvgPathData("M 155.510 24.810 C 152.765 23.473 149.499 23.814 147.090 25.690 L 77.250 80.000 L 32.000 80.000 C 23.163 80.000 16.000 87.163 16.000 96.000 L 16.000 160.000 C 16.000 168.837 23.163 176.000 32.000 176.000 L 77.250 176.000 L 147.090 230.310 C 149.501 232.184 152.769 232.523 155.513 231.181 C 158.257 229.840 159.998 227.054 160.000 224.000 L 160.000 32.000 C 160.000 28.942 158.258 26.152 155.510 24.810 ZM 32.000 96.000 L 72.000 96.000 L 72.000 160.000 L 32.000 160.000 ZM 144.000 207.640 L 88.000 164.090 L 88.000 91.910 L 144.000 48.360 ZM 198.000 101.560 C 211.313 116.673 211.313 139.327 198.000 154.440 C 195.059 157.671 190.070 157.946 186.793 155.056 C 183.515 152.167 183.163 147.182 186.000 143.860 C 193.983 134.793 193.983 121.207 186.000 112.140 C 183.163 108.818 183.515 103.833 186.793 100.944 C 190.070 98.054 195.059 98.329 198.000 101.560 ZM 248.000 128.000 C 248.011 147.682 240.758 166.676 227.630 181.340 C 224.665 184.548 219.674 184.785 216.419 181.871 C 213.164 178.957 212.848 173.971 215.710 170.670 C 237.438 146.376 237.438 109.634 215.710 85.340 C 213.750 83.219 213.085 80.205 213.971 77.456 C 214.857 74.707 217.156 72.649 219.986 72.072 C 222.816 71.494 225.738 72.487 227.630 74.670 C 240.761 89.328 248.016 108.320 248.000 128.000 Z"),
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
        return _speakerHigh!!
    }

private var _speakerHigh: ImageVector? = null
