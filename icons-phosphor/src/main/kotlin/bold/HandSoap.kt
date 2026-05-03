package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandSoap: ImageVector
    get() {
        if (_handSoap != null) return _handSoap!!
        _handSoap = phosphorBoldIcon(
            name = "HandSoap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.000 97.680 L 188.000 92.000 C 188.000 72.118 171.882 56.000 152.000 56.000 L 140.000 56.000 L 140.000 36.000 L 168.000 36.000 C 170.209 36.000 172.000 37.791 172.000 40.000 C 172.000 46.627 177.373 52.000 184.000 52.000 C 190.627 52.000 196.000 46.627 196.000 40.000 C 196.000 24.536 183.464 12.000 168.000 12.000 L 104.000 12.000 C 97.373 12.000 92.000 17.373 92.000 24.000 C 92.000 30.627 97.373 36.000 104.000 36.000 L 116.000 36.000 L 116.000 56.000 L 104.000 56.000 C 84.118 56.000 68.000 72.118 68.000 92.000 L 68.000 97.680 C 49.083 103.063 36.026 120.332 36.000 140.000 L 36.000 216.000 C 36.000 227.046 44.954 236.000 56.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 140.000 C 219.974 120.332 206.917 103.063 188.000 97.680 ZM 104.000 80.000 L 152.000 80.000 C 158.627 80.000 164.000 85.373 164.000 92.000 L 164.000 96.000 L 92.000 96.000 L 92.000 92.000 C 92.000 85.373 97.373 80.000 104.000 80.000 ZM 196.000 212.000 L 60.000 212.000 L 60.000 140.000 C 60.000 128.954 68.954 120.000 80.000 120.000 L 176.000 120.000 C 187.046 120.000 196.000 128.954 196.000 140.000 Z"),
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
        return _handSoap!!
    }

private var _handSoap: ImageVector? = null
