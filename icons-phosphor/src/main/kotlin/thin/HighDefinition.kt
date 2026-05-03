package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HighDefinition: ImageVector
    get() {
        if (_highDefinition != null) return _highDefinition!!
        _highDefinition = phosphorThinIcon(
            name = "HighDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 76.000 L 152.000 76.000 C 149.791 76.000 148.000 77.791 148.000 80.000 L 148.000 176.000 C 148.000 178.209 149.791 180.000 152.000 180.000 L 176.000 180.000 C 204.719 180.000 228.000 156.719 228.000 128.000 C 228.000 99.281 204.719 76.000 176.000 76.000 ZM 176.000 172.000 L 156.000 172.000 L 156.000 84.000 L 176.000 84.000 C 200.301 84.000 220.000 103.699 220.000 128.000 C 220.000 152.301 200.301 172.000 176.000 172.000 ZM 116.000 176.000 L 116.000 132.000 L 52.000 132.000 L 52.000 176.000 C 52.000 178.209 50.209 180.000 48.000 180.000 C 45.791 180.000 44.000 178.209 44.000 176.000 L 44.000 80.000 C 44.000 77.791 45.791 76.000 48.000 76.000 C 50.209 76.000 52.000 77.791 52.000 80.000 L 52.000 124.000 L 116.000 124.000 L 116.000 80.000 C 116.000 77.791 117.791 76.000 120.000 76.000 C 122.209 76.000 124.000 77.791 124.000 80.000 L 124.000 176.000 C 124.000 178.209 122.209 180.000 120.000 180.000 C 117.791 180.000 116.000 178.209 116.000 176.000 ZM 28.000 48.000 C 28.000 45.791 29.791 44.000 32.000 44.000 L 224.000 44.000 C 226.209 44.000 228.000 45.791 228.000 48.000 C 228.000 50.209 226.209 52.000 224.000 52.000 L 32.000 52.000 C 29.791 52.000 28.000 50.209 28.000 48.000 ZM 228.000 208.000 C 228.000 210.209 226.209 212.000 224.000 212.000 L 32.000 212.000 C 29.791 212.000 28.000 210.209 28.000 208.000 C 28.000 205.791 29.791 204.000 32.000 204.000 L 224.000 204.000 C 226.209 204.000 228.000 205.791 228.000 208.000 Z"),
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
