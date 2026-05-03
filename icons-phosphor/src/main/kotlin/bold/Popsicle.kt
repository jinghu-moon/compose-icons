package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Popsicle: ImageVector
    get() {
        if (_popsicle != null) return _popsicle!!
        _popsicle = phosphorBoldIcon(
            name = "Popsicle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 4.000 C 86.045 4.044 52.044 38.045 52.000 80.000 L 52.000 176.000 C 52.000 187.046 60.954 196.000 72.000 196.000 L 96.000 196.000 L 96.000 224.000 C 96.000 241.673 110.327 256.000 128.000 256.000 C 145.673 256.000 160.000 241.673 160.000 224.000 L 160.000 196.000 L 184.000 196.000 C 195.046 196.000 204.000 187.046 204.000 176.000 L 204.000 80.000 C 203.956 38.045 169.955 4.044 128.000 4.000 ZM 136.000 224.000 C 136.000 228.418 132.418 232.000 128.000 232.000 C 123.582 232.000 120.000 228.418 120.000 224.000 L 120.000 196.000 L 136.000 196.000 ZM 180.000 172.000 L 76.000 172.000 L 76.000 80.000 C 76.000 51.281 99.281 28.000 128.000 28.000 C 156.719 28.000 180.000 51.281 180.000 80.000 ZM 120.000 76.000 L 120.000 144.000 C 120.000 150.627 114.627 156.000 108.000 156.000 C 101.373 156.000 96.000 150.627 96.000 144.000 L 96.000 76.000 C 96.000 69.373 101.373 64.000 108.000 64.000 C 114.627 64.000 120.000 69.373 120.000 76.000 ZM 160.000 76.000 L 160.000 144.000 C 160.000 150.627 154.627 156.000 148.000 156.000 C 141.373 156.000 136.000 150.627 136.000 144.000 L 136.000 76.000 C 136.000 69.373 141.373 64.000 148.000 64.000 C 154.627 64.000 160.000 69.373 160.000 76.000 Z"),
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
        return _popsicle!!
    }

private var _popsicle: ImageVector? = null
