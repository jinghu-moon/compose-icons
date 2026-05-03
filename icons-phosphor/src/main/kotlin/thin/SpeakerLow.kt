package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerLow: ImageVector
    get() {
        if (_speakerLow != null) return _speakerLow!!
        _speakerLow = phosphorThinIcon(
            name = "SpeakerLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 153.760 28.410 C 152.387 27.734 150.749 27.901 149.540 28.840 L 78.630 84.000 L 32.000 84.000 C 25.373 84.000 20.000 89.373 20.000 96.000 L 20.000 160.000 C 20.000 166.627 25.373 172.000 32.000 172.000 L 78.630 172.000 L 149.540 227.160 C 150.246 227.701 151.110 227.996 152.000 228.000 C 152.611 228.002 153.213 227.862 153.760 227.590 C 155.130 226.919 155.999 225.526 156.000 224.000 L 156.000 32.000 C 155.999 30.474 155.130 29.081 153.760 28.410 ZM 28.000 160.000 L 28.000 96.000 C 28.000 93.791 29.791 92.000 32.000 92.000 L 76.000 92.000 L 76.000 164.000 L 32.000 164.000 C 29.791 164.000 28.000 162.209 28.000 160.000 ZM 148.000 215.820 L 84.000 166.000 L 84.000 90.000 L 148.000 40.220 ZM 204.000 128.000 C 204.002 136.771 200.802 145.242 195.000 151.820 C 193.536 153.477 191.007 153.634 189.350 152.170 C 187.693 150.706 187.536 148.177 189.000 146.520 C 198.310 135.943 198.310 120.097 189.000 109.520 C 187.657 107.852 187.865 105.423 189.473 104.008 C 191.080 102.593 193.517 102.696 195.000 104.240 C 200.788 110.803 203.987 119.249 204.000 128.000 Z"),
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
        return _speakerLow!!
    }

private var _speakerLow: ImageVector? = null
