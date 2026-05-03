package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Newspaper: ImageVector
    get() {
        if (_newspaper != null) return _newspaper!!
        _newspaper = phosphorBoldIcon(
            name = "Newspaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 92.000 108.000 C 92.000 101.373 97.373 96.000 104.000 96.000 L 176.000 96.000 C 182.627 96.000 188.000 101.373 188.000 108.000 C 188.000 114.627 182.627 120.000 176.000 120.000 L 104.000 120.000 C 97.373 120.000 92.000 114.627 92.000 108.000 ZM 104.000 160.000 L 176.000 160.000 C 182.627 160.000 188.000 154.627 188.000 148.000 C 188.000 141.373 182.627 136.000 176.000 136.000 L 104.000 136.000 C 97.373 136.000 92.000 141.373 92.000 148.000 C 92.000 154.627 97.373 160.000 104.000 160.000 ZM 236.000 64.000 L 236.000 184.000 C 236.000 199.464 223.464 212.000 208.000 212.000 L 36.000 212.000 C 18.327 212.000 4.000 197.673 4.000 180.000 L 4.000 88.000 C 4.000 81.373 9.373 76.000 16.000 76.000 C 22.627 76.000 28.000 81.373 28.000 88.000 L 28.000 180.000 C 28.000 184.418 31.582 188.000 36.000 188.000 C 40.418 188.000 44.000 184.418 44.000 180.000 L 44.000 64.000 C 44.000 52.954 52.954 44.000 64.000 44.000 L 216.000 44.000 C 227.046 44.000 236.000 52.954 236.000 64.000 ZM 212.000 68.000 L 68.000 68.000 L 68.000 180.000 C 68.005 182.698 67.669 185.386 67.000 188.000 L 208.000 188.000 C 210.209 188.000 212.000 186.209 212.000 184.000 Z"),
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
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
