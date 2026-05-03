package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) return _closedCaptioning!!
        _closedCaptioning = phosphorLightIcon(
            name = "ClosedCaptioning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 50.000 L 32.000 50.000 C 24.268 50.000 18.000 56.268 18.000 64.000 L 18.000 192.000 C 18.000 199.732 24.268 206.000 32.000 206.000 L 224.000 206.000 C 231.732 206.000 238.000 199.732 238.000 192.000 L 238.000 64.000 C 238.000 56.268 231.732 50.000 224.000 50.000 ZM 226.000 192.000 C 226.000 193.105 225.105 194.000 224.000 194.000 L 32.000 194.000 C 30.895 194.000 30.000 193.105 30.000 192.000 L 30.000 64.000 C 30.000 62.895 30.895 62.000 32.000 62.000 L 224.000 62.000 C 225.105 62.000 226.000 62.895 226.000 64.000 ZM 117.190 152.710 C 117.987 154.088 118.205 155.726 117.794 157.264 C 117.383 158.802 116.378 160.113 115.000 160.910 C 99.029 170.129 78.745 166.552 66.892 152.425 C 55.039 138.299 55.039 117.701 66.892 103.575 C 78.745 89.448 99.029 85.871 115.000 95.090 C 116.953 96.112 118.188 98.122 118.218 100.325 C 118.248 102.529 117.067 104.572 115.143 105.646 C 113.218 106.720 110.860 106.652 109.000 105.470 C 98.072 99.170 84.199 101.623 76.094 111.287 C 67.988 120.951 67.988 135.039 76.094 144.703 C 84.199 154.367 98.072 156.820 109.000 150.520 C 111.867 148.866 115.531 149.846 117.190 152.710 ZM 197.190 152.710 C 197.987 154.088 198.205 155.726 197.794 157.264 C 197.383 158.802 196.378 160.113 195.000 160.910 C 179.029 170.129 158.745 166.552 146.892 152.425 C 135.038 138.299 135.038 117.701 146.892 103.575 C 158.745 89.448 179.029 85.871 195.000 95.090 C 196.953 96.112 198.188 98.122 198.218 100.325 C 198.248 102.529 197.067 104.572 195.143 105.646 C 193.218 106.720 190.860 106.652 189.000 105.470 C 178.072 99.170 164.199 101.623 156.094 111.287 C 147.988 120.951 147.988 135.039 156.094 144.703 C 164.199 154.367 178.072 156.820 189.000 150.520 C 191.867 148.866 195.531 149.846 197.190 152.710 Z"),
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
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
