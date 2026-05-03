package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerNone: ImageVector
    get() {
        if (_speakerNone != null) return _speakerNone!!
        _speakerNone = phosphorFillIcon(
            name = "SpeakerNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 64.000 84.000 L 64.000 172.000 C 64.000 174.209 62.209 176.000 60.000 176.000 L 32.000 176.000 C 23.163 176.000 16.000 168.837 16.000 160.000 L 16.000 96.000 C 16.000 87.163 23.163 80.000 32.000 80.000 L 60.000 80.000 C 62.209 80.000 64.000 81.791 64.000 84.000 ZM 157.150 25.850 C 154.265 23.463 150.110 23.396 147.150 25.690 L 81.580 76.690 C 80.594 77.439 80.011 78.602 80.000 79.840 L 80.000 176.160 C 80.004 177.393 80.576 178.555 81.550 179.310 L 147.120 230.310 C 149.719 232.331 153.291 232.553 156.120 230.870 C 158.595 229.330 160.080 226.604 160.030 223.690 L 160.030 32.250 C 160.060 29.790 158.994 27.444 157.120 25.850 Z"),
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
        return _speakerNone!!
    }

private var _speakerNone: ImageVector? = null
