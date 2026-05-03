package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsIn: ImageVector
    get() {
        if (_arrowsIn != null) return _arrowsIn!!
        _arrowsIn = phosphorBoldIcon(
            name = "ArrowsIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 140.000 104.000 L 140.000 64.000 C 140.000 57.373 145.373 52.000 152.000 52.000 C 158.627 52.000 164.000 57.373 164.000 64.000 L 164.000 75.000 L 199.510 39.480 C 204.204 34.786 211.816 34.786 216.510 39.480 C 221.204 44.174 221.204 51.786 216.510 56.480 L 181.000 92.000 L 192.000 92.000 C 198.627 92.000 204.000 97.373 204.000 104.000 C 204.000 110.627 198.627 116.000 192.000 116.000 L 152.000 116.000 C 145.373 116.000 140.000 110.627 140.000 104.000 ZM 104.000 140.000 L 64.000 140.000 C 57.373 140.000 52.000 145.373 52.000 152.000 C 52.000 158.627 57.373 164.000 64.000 164.000 L 75.000 164.000 L 39.510 199.510 C 34.816 204.204 34.816 211.816 39.510 216.510 C 44.204 221.204 51.816 221.204 56.510 216.510 L 92.000 181.000 L 92.000 192.000 C 92.000 198.627 97.373 204.000 104.000 204.000 C 110.627 204.000 116.000 198.627 116.000 192.000 L 116.000 152.000 C 116.000 145.373 110.627 140.000 104.000 140.000 ZM 181.000 164.000 L 192.000 164.000 C 198.627 164.000 204.000 158.627 204.000 152.000 C 204.000 145.373 198.627 140.000 192.000 140.000 L 152.000 140.000 C 145.373 140.000 140.000 145.373 140.000 152.000 L 140.000 192.000 C 140.000 198.627 145.373 204.000 152.000 204.000 C 158.627 204.000 164.000 198.627 164.000 192.000 L 164.000 181.000 L 199.510 216.520 C 204.204 221.214 211.816 221.214 216.510 216.520 C 221.204 211.826 221.204 204.214 216.510 199.520 ZM 104.000 52.000 C 97.373 52.000 92.000 57.373 92.000 64.000 L 92.000 75.000 L 56.490 39.510 C 51.796 34.816 44.184 34.816 39.490 39.510 C 34.796 44.204 34.796 51.816 39.490 56.510 L 75.000 92.000 L 64.000 92.000 C 57.373 92.000 52.000 97.373 52.000 104.000 C 52.000 110.627 57.373 116.000 64.000 116.000 L 104.000 116.000 C 110.627 116.000 116.000 110.627 116.000 104.000 L 116.000 64.000 C 116.000 57.373 110.627 52.000 104.000 52.000 Z"),
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
        return _arrowsIn!!
    }

private var _arrowsIn: ImageVector? = null
