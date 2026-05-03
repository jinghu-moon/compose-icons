package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Resize: ImageVector
    get() {
        if (_resize != null) return _resize!!
        _resize = phosphorThinIcon(
            name = "Resize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 136.000 116.000 L 48.000 116.000 C 45.791 116.000 44.000 117.791 44.000 120.000 L 44.000 208.000 C 44.000 210.209 45.791 212.000 48.000 212.000 L 136.000 212.000 C 138.209 212.000 140.000 210.209 140.000 208.000 L 140.000 120.000 C 140.000 117.791 138.209 116.000 136.000 116.000 ZM 132.000 204.000 L 52.000 204.000 L 52.000 124.000 L 132.000 124.000 ZM 212.000 184.000 L 212.000 200.000 C 212.000 206.627 206.627 212.000 200.000 212.000 L 176.000 212.000 C 173.791 212.000 172.000 210.209 172.000 208.000 C 172.000 205.791 173.791 204.000 176.000 204.000 L 200.000 204.000 C 202.209 204.000 204.000 202.209 204.000 200.000 L 204.000 184.000 C 204.000 181.791 205.791 180.000 208.000 180.000 C 210.209 180.000 212.000 181.791 212.000 184.000 ZM 212.000 112.000 L 212.000 144.000 C 212.000 146.209 210.209 148.000 208.000 148.000 C 205.791 148.000 204.000 146.209 204.000 144.000 L 204.000 112.000 C 204.000 109.791 205.791 108.000 208.000 108.000 C 210.209 108.000 212.000 109.791 212.000 112.000 ZM 212.000 56.000 L 212.000 72.000 C 212.000 74.209 210.209 76.000 208.000 76.000 C 205.791 76.000 204.000 74.209 204.000 72.000 L 204.000 56.000 C 204.000 53.791 202.209 52.000 200.000 52.000 L 184.000 52.000 C 181.791 52.000 180.000 50.209 180.000 48.000 C 180.000 45.791 181.791 44.000 184.000 44.000 L 200.000 44.000 C 206.627 44.000 212.000 49.373 212.000 56.000 ZM 148.000 48.000 C 148.000 50.209 146.209 52.000 144.000 52.000 L 112.000 52.000 C 109.791 52.000 108.000 50.209 108.000 48.000 C 108.000 45.791 109.791 44.000 112.000 44.000 L 144.000 44.000 C 146.209 44.000 148.000 45.791 148.000 48.000 ZM 44.000 80.000 L 44.000 56.000 C 44.000 49.373 49.373 44.000 56.000 44.000 L 72.000 44.000 C 74.209 44.000 76.000 45.791 76.000 48.000 C 76.000 50.209 74.209 52.000 72.000 52.000 L 56.000 52.000 C 53.791 52.000 52.000 53.791 52.000 56.000 L 52.000 80.000 C 52.000 82.209 50.209 84.000 48.000 84.000 C 45.791 84.000 44.000 82.209 44.000 80.000 Z"),
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
        return _resize!!
    }

private var _resize: ImageVector? = null
