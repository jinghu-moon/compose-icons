package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Toolbox: ImageVector
    get() {
        if (_toolbox != null) return _toolbox!!
        _toolbox = phosphorBoldIcon(
            name = "Toolbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 64.000 L 180.000 64.000 L 180.000 56.000 C 180.000 40.536 167.464 28.000 152.000 28.000 L 104.000 28.000 C 88.536 28.000 76.000 40.536 76.000 56.000 L 76.000 64.000 L 32.000 64.000 C 20.954 64.000 12.000 72.954 12.000 84.000 L 12.000 192.000 C 12.000 203.046 20.954 212.000 32.000 212.000 L 224.000 212.000 C 235.046 212.000 244.000 203.046 244.000 192.000 L 244.000 84.000 C 244.000 72.954 235.046 64.000 224.000 64.000 ZM 100.000 56.000 C 100.000 53.791 101.791 52.000 104.000 52.000 L 152.000 52.000 C 154.209 52.000 156.000 53.791 156.000 56.000 L 156.000 64.000 L 100.000 64.000 ZM 220.000 88.000 L 220.000 120.000 L 196.000 120.000 L 196.000 116.000 C 196.000 109.373 190.627 104.000 184.000 104.000 C 177.373 104.000 172.000 109.373 172.000 116.000 L 172.000 120.000 L 84.000 120.000 L 84.000 116.000 C 84.000 109.373 78.627 104.000 72.000 104.000 C 65.373 104.000 60.000 109.373 60.000 116.000 L 60.000 120.000 L 36.000 120.000 L 36.000 88.000 ZM 36.000 188.000 L 36.000 144.000 L 60.000 144.000 L 60.000 148.000 C 60.000 154.627 65.373 160.000 72.000 160.000 C 78.627 160.000 84.000 154.627 84.000 148.000 L 84.000 144.000 L 172.000 144.000 L 172.000 148.000 C 172.000 154.627 177.373 160.000 184.000 160.000 C 190.627 160.000 196.000 154.627 196.000 148.000 L 196.000 144.000 L 220.000 144.000 L 220.000 188.000 Z"),
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
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
