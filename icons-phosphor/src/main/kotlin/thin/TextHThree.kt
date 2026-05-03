package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextHThree: ImageVector
    get() {
        if (_textHThree != null) return _textHThree!!
        _textHThree = phosphorThinIcon(
            name = "TextHThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 180.000 C 244.003 193.004 236.136 204.717 224.096 209.633 C 212.057 214.549 198.240 211.690 189.140 202.400 C 187.594 200.820 187.620 198.286 189.200 196.740 C 190.780 195.194 193.314 195.220 194.860 196.800 C 202.485 204.579 214.391 206.247 223.860 200.864 C 233.329 195.481 237.986 184.396 235.202 173.866 C 232.418 163.336 222.892 156.000 212.000 156.000 C 210.509 156.000 209.142 155.171 208.453 153.849 C 207.764 152.528 207.867 150.932 208.720 149.710 L 232.320 116.000 L 192.000 116.000 C 189.791 116.000 188.000 114.209 188.000 112.000 C 188.000 109.791 189.791 108.000 192.000 108.000 L 240.000 108.000 C 241.491 108.000 242.858 108.829 243.547 110.151 C 244.236 111.472 244.133 113.068 243.280 114.290 L 219.120 148.800 C 233.664 152.142 243.979 165.077 244.000 180.000 ZM 144.000 52.000 C 141.791 52.000 140.000 53.791 140.000 56.000 L 140.000 112.000 L 44.000 112.000 L 44.000 56.000 C 44.000 53.791 42.209 52.000 40.000 52.000 C 37.791 52.000 36.000 53.791 36.000 56.000 L 36.000 176.000 C 36.000 178.209 37.791 180.000 40.000 180.000 C 42.209 180.000 44.000 178.209 44.000 176.000 L 44.000 120.000 L 140.000 120.000 L 140.000 176.000 C 140.000 178.209 141.791 180.000 144.000 180.000 C 146.209 180.000 148.000 178.209 148.000 176.000 L 148.000 56.000 C 148.000 53.791 146.209 52.000 144.000 52.000 Z"),
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
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
