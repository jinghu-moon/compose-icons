package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandSoap: ImageVector
    get() {
        if (_handSoap != null) return _handSoap!!
        _handSoap = phosphorThinIcon(
            name = "HandSoap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 100.230 L 180.000 88.000 C 180.000 72.536 167.464 60.000 152.000 60.000 L 132.000 60.000 L 132.000 28.000 L 168.000 28.000 C 174.627 28.000 180.000 33.373 180.000 40.000 C 180.000 42.209 181.791 44.000 184.000 44.000 C 186.209 44.000 188.000 42.209 188.000 40.000 C 188.000 28.954 179.046 20.000 168.000 20.000 L 104.000 20.000 C 101.791 20.000 100.000 21.791 100.000 24.000 C 100.000 26.209 101.791 28.000 104.000 28.000 L 124.000 28.000 L 124.000 60.000 L 104.000 60.000 C 88.536 60.000 76.000 72.536 76.000 88.000 L 76.000 100.230 C 57.782 102.267 44.004 117.668 44.000 136.000 L 44.000 216.000 C 44.000 222.627 49.373 228.000 56.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 136.000 C 211.996 117.668 198.218 102.267 180.000 100.230 ZM 104.000 68.000 L 152.000 68.000 C 163.046 68.000 172.000 76.954 172.000 88.000 L 172.000 100.000 L 84.000 100.000 L 84.000 88.000 C 84.000 76.954 92.954 68.000 104.000 68.000 ZM 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 L 56.000 220.000 C 53.791 220.000 52.000 218.209 52.000 216.000 L 52.000 136.000 C 52.000 120.536 64.536 108.000 80.000 108.000 L 176.000 108.000 C 191.464 108.000 204.000 120.536 204.000 136.000 Z"),
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
        return _handSoap!!
    }

private var _handSoap: ImageVector? = null
