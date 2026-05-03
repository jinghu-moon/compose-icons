package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerSimpleX: ImageVector
    get() {
        if (_speakerSimpleX != null) return _speakerSimpleX!!
        _speakerSimpleX = phosphorFillIcon(
            name = "SpeakerSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 163.520 24.810 C 160.773 23.468 157.501 23.810 155.090 25.690 L 85.250 80.000 L 40.000 80.000 C 31.163 80.000 24.000 87.163 24.000 96.000 L 24.000 160.000 C 24.000 168.837 31.163 176.000 40.000 176.000 L 85.250 176.000 L 155.090 230.310 C 156.491 231.408 158.220 232.003 160.000 232.000 C 164.418 232.000 168.000 228.418 168.000 224.000 L 168.000 32.000 C 168.002 28.944 166.264 26.154 163.520 24.810 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 235.310 128.000 L 253.660 109.660 C 256.786 106.534 256.786 101.466 253.660 98.340 C 250.534 95.214 245.466 95.214 242.340 98.340 L 224.000 116.690 L 205.660 98.340 C 202.534 95.214 197.466 95.214 194.340 98.340 C 191.214 101.466 191.214 106.534 194.340 109.660 L 212.690 128.000 L 194.340 146.340 C 191.214 149.466 191.214 154.534 194.340 157.660 C 197.466 160.786 202.534 160.786 205.660 157.660 L 224.000 139.310 L 242.340 157.660 C 245.466 160.786 250.534 160.786 253.660 157.660 C 256.786 154.534 256.786 149.466 253.660 146.340 Z"),
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
        return _speakerSimpleX!!
    }

private var _speakerSimpleX: ImageVector? = null
