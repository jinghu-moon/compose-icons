package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerNone: ImageVector
    get() {
        if (_speakerNone != null) return _speakerNone!!
        _speakerNone = phosphorThinIcon(
            name = "SpeakerNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 153.760 28.410 C 152.387 27.734 150.749 27.901 149.540 28.840 L 78.630 84.000 L 32.000 84.000 C 25.373 84.000 20.000 89.373 20.000 96.000 L 20.000 160.000 C 20.000 166.627 25.373 172.000 32.000 172.000 L 78.630 172.000 L 149.540 227.160 C 150.246 227.701 151.110 227.996 152.000 228.000 C 152.611 228.002 153.213 227.862 153.760 227.590 C 155.130 226.919 155.999 225.526 156.000 224.000 L 156.000 32.000 C 155.999 30.474 155.130 29.081 153.760 28.410 ZM 28.000 160.000 L 28.000 96.000 C 28.000 93.791 29.791 92.000 32.000 92.000 L 76.000 92.000 L 76.000 164.000 L 32.000 164.000 C 29.791 164.000 28.000 162.209 28.000 160.000 ZM 148.000 215.820 L 84.000 166.000 L 84.000 90.000 L 148.000 40.220 Z"),
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
