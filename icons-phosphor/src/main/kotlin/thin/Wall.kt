package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Wall: ImageVector
    get() {
        if (_wall != null) return _wall!!
        _wall = phosphorThinIcon(
            name = "Wall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 52.000 L 32.000 52.000 C 29.791 52.000 28.000 53.791 28.000 56.000 L 28.000 200.000 C 28.000 202.209 29.791 204.000 32.000 204.000 L 224.000 204.000 C 226.209 204.000 228.000 202.209 228.000 200.000 L 228.000 56.000 C 228.000 53.791 226.209 52.000 224.000 52.000 ZM 84.000 148.000 L 84.000 108.000 L 172.000 108.000 L 172.000 148.000 ZM 36.000 148.000 L 36.000 108.000 L 76.000 108.000 L 76.000 148.000 ZM 180.000 108.000 L 220.000 108.000 L 220.000 148.000 L 180.000 148.000 ZM 220.000 100.000 L 132.000 100.000 L 132.000 60.000 L 220.000 60.000 ZM 124.000 60.000 L 124.000 100.000 L 36.000 100.000 L 36.000 60.000 ZM 36.000 156.000 L 124.000 156.000 L 124.000 196.000 L 36.000 196.000 ZM 132.000 196.000 L 132.000 156.000 L 220.000 156.000 L 220.000 196.000 Z"),
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
        return _wall!!
    }

private var _wall: ImageVector? = null
