package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = phosphorRegularIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 247.350 148.850 L 199.350 36.850 C 198.090 33.909 195.199 32.001 192.000 32.000 L 64.000 32.000 C 60.801 32.001 57.910 33.909 56.650 36.850 L 8.650 148.850 C 7.592 151.321 7.845 154.159 9.324 156.403 C 10.804 158.647 13.312 159.999 16.000 160.000 L 120.000 160.000 L 120.000 208.000 L 96.000 208.000 C 91.582 208.000 88.000 211.582 88.000 216.000 C 88.000 220.418 91.582 224.000 96.000 224.000 L 160.000 224.000 C 164.418 224.000 168.000 220.418 168.000 216.000 C 168.000 211.582 164.418 208.000 160.000 208.000 L 136.000 208.000 L 136.000 160.000 L 192.000 160.000 L 192.000 192.000 C 192.000 196.418 195.582 200.000 200.000 200.000 C 204.418 200.000 208.000 196.418 208.000 192.000 L 208.000 160.000 L 240.000 160.000 C 242.688 159.999 245.196 158.647 246.676 156.403 C 248.155 154.159 248.408 151.321 247.350 148.850 ZM 28.130 144.000 L 69.280 48.000 L 186.720 48.000 L 227.870 144.000 Z"),
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
        return _lamp!!
    }

private var _lamp: ImageVector? = null
