package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SpeakerLow: ImageVector
    get() {
        if (_speakerLow != null) return _speakerLow!!
        _speakerLow = phosphorDuotoneIcon(
            name = "SpeakerLow",
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
                pathData = parseSvgPathData("M 155.510 24.810 C 152.765 23.473 149.499 23.814 147.090 25.690 L 77.250 80.000 L 32.000 80.000 C 23.163 80.000 16.000 87.163 16.000 96.000 L 16.000 160.000 C 16.000 168.837 23.163 176.000 32.000 176.000 L 77.250 176.000 L 147.090 230.310 C 149.501 232.184 152.769 232.523 155.513 231.181 C 158.257 229.840 159.998 227.054 160.000 224.000 L 160.000 32.000 C 160.000 28.942 158.258 26.152 155.510 24.810 ZM 32.000 96.000 L 72.000 96.000 L 72.000 160.000 L 32.000 160.000 ZM 144.000 207.640 L 88.000 164.090 L 88.000 91.910 L 144.000 48.360 ZM 208.000 128.000 C 208.007 137.745 204.450 147.156 198.000 154.460 C 195.059 157.691 190.070 157.966 186.793 155.076 C 183.515 152.187 183.163 147.202 186.000 143.880 C 193.983 134.813 193.983 121.227 186.000 112.160 C 184.056 110.024 183.414 107.006 184.321 104.264 C 185.228 101.522 187.542 99.481 190.376 98.925 C 193.211 98.369 196.124 99.384 198.000 101.580 C 204.436 108.877 207.991 118.270 208.000 128.000 Z"),
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
        return _speakerLow!!
    }

private var _speakerLow: ImageVector? = null
