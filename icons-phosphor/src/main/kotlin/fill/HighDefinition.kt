package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HighDefinition: ImageVector
    get() {
        if (_highDefinition != null) return _highDefinition!!
        _highDefinition = phosphorFillIcon(
            name = "HighDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.000 128.000 C 196.000 145.673 181.673 160.000 164.000 160.000 L 152.000 160.000 L 152.000 96.000 L 164.000 96.000 C 181.673 96.000 196.000 110.327 196.000 128.000 ZM 232.000 56.000 L 232.000 200.000 C 232.000 208.837 224.837 216.000 216.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 ZM 120.000 88.000 C 120.000 83.582 116.418 80.000 112.000 80.000 C 107.582 80.000 104.000 83.582 104.000 88.000 L 104.000 120.000 L 64.000 120.000 L 64.000 88.000 C 64.000 83.582 60.418 80.000 56.000 80.000 C 51.582 80.000 48.000 83.582 48.000 88.000 L 48.000 168.000 C 48.000 172.418 51.582 176.000 56.000 176.000 C 60.418 176.000 64.000 172.418 64.000 168.000 L 64.000 136.000 L 104.000 136.000 L 104.000 168.000 C 104.000 172.418 107.582 176.000 112.000 176.000 C 116.418 176.000 120.000 172.418 120.000 168.000 ZM 212.000 128.000 C 211.972 101.502 190.498 80.028 164.000 80.000 L 144.000 80.000 C 139.582 80.000 136.000 83.582 136.000 88.000 L 136.000 168.000 C 136.000 172.418 139.582 176.000 144.000 176.000 L 164.000 176.000 C 190.498 175.972 211.972 154.498 212.000 128.000 Z"),
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
        return _highDefinition!!
    }

private var _highDefinition: ImageVector? = null
