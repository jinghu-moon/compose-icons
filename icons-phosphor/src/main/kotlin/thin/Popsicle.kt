package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Popsicle: ImageVector
    get() {
        if (_popsicle != null) return _popsicle!!
        _popsicle = phosphorThinIcon(
            name = "Popsicle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 12.000 C 90.461 12.039 60.039 42.461 60.000 80.000 L 60.000 176.000 C 60.000 182.627 65.373 188.000 72.000 188.000 L 108.000 188.000 L 108.000 232.000 C 108.000 243.046 116.954 252.000 128.000 252.000 C 139.046 252.000 148.000 243.046 148.000 232.000 L 148.000 188.000 L 184.000 188.000 C 190.627 188.000 196.000 182.627 196.000 176.000 L 196.000 80.000 C 195.961 42.461 165.539 12.039 128.000 12.000 ZM 140.000 232.000 C 140.000 238.627 134.627 244.000 128.000 244.000 C 121.373 244.000 116.000 238.627 116.000 232.000 L 116.000 188.000 L 140.000 188.000 ZM 188.000 176.000 C 188.000 178.209 186.209 180.000 184.000 180.000 L 72.000 180.000 C 69.791 180.000 68.000 178.209 68.000 176.000 L 68.000 80.000 C 68.000 46.863 94.863 20.000 128.000 20.000 C 161.137 20.000 188.000 46.863 188.000 80.000 ZM 116.000 72.000 L 116.000 152.000 C 116.000 154.209 114.209 156.000 112.000 156.000 C 109.791 156.000 108.000 154.209 108.000 152.000 L 108.000 72.000 C 108.000 69.791 109.791 68.000 112.000 68.000 C 114.209 68.000 116.000 69.791 116.000 72.000 ZM 148.000 72.000 L 148.000 152.000 C 148.000 154.209 146.209 156.000 144.000 156.000 C 141.791 156.000 140.000 154.209 140.000 152.000 L 140.000 72.000 C 140.000 69.791 141.791 68.000 144.000 68.000 C 146.209 68.000 148.000 69.791 148.000 72.000 Z"),
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
        return _popsicle!!
    }

private var _popsicle: ImageVector? = null
