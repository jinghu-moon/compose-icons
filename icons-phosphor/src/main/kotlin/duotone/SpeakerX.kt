package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SpeakerX: ImageVector
    get() {
        if (_speakerX != null) return _speakerX!!
        _speakerX = phosphorDuotoneIcon(
            name = "SpeakerX",
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
                pathData = parseSvgPathData("M 155.510 24.810 C 152.765 23.473 149.499 23.814 147.090 25.690 L 77.250 80.000 L 32.000 80.000 C 23.163 80.000 16.000 87.163 16.000 96.000 L 16.000 160.000 C 16.000 168.837 23.163 176.000 32.000 176.000 L 77.250 176.000 L 147.090 230.310 C 149.501 232.184 152.769 232.523 155.513 231.181 C 158.257 229.840 159.998 227.054 160.000 224.000 L 160.000 32.000 C 160.000 28.942 158.258 26.152 155.510 24.810 ZM 32.000 96.000 L 72.000 96.000 L 72.000 160.000 L 32.000 160.000 ZM 144.000 207.640 L 88.000 164.070 L 88.000 91.940 L 144.000 48.360 ZM 245.660 146.340 C 248.786 149.466 248.786 154.534 245.660 157.660 C 242.534 160.786 237.466 160.786 234.340 157.660 L 216.000 139.310 L 197.660 157.660 C 194.534 160.786 189.466 160.786 186.340 157.660 C 183.214 154.534 183.214 149.466 186.340 146.340 L 204.690 128.000 L 186.340 109.660 C 183.214 106.534 183.214 101.466 186.340 98.340 C 189.466 95.214 194.534 95.214 197.660 98.340 L 216.000 116.690 L 234.340 98.340 C 237.466 95.214 242.534 95.214 245.660 98.340 C 248.786 101.466 248.786 106.534 245.660 109.660 L 227.310 128.000 Z"),
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
        return _speakerX!!
    }

private var _speakerX: ImageVector? = null
