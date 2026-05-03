package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextHSix: ImageVector
    get() {
        if (_textHSix != null) return _textHSix!!
        _textHSix = phosphorDuotoneIcon(
            name = "TextHSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 240.000 72.000 L 240.000 192.000 C 240.000 200.837 232.837 208.000 224.000 208.000 L 56.000 208.000 C 47.163 208.000 40.000 200.837 40.000 192.000 L 40.000 56.000 L 224.000 56.000 C 232.837 56.000 240.000 63.163 240.000 72.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 152.000 56.000 L 152.000 176.000 C 152.000 180.418 148.418 184.000 144.000 184.000 C 139.582 184.000 136.000 180.418 136.000 176.000 L 136.000 124.000 L 48.000 124.000 L 48.000 176.000 C 48.000 180.418 44.418 184.000 40.000 184.000 C 35.582 184.000 32.000 180.418 32.000 176.000 L 32.000 56.000 C 32.000 51.582 35.582 48.000 40.000 48.000 C 44.418 48.000 48.000 51.582 48.000 56.000 L 48.000 108.000 L 136.000 108.000 L 136.000 56.000 C 136.000 51.582 139.582 48.000 144.000 48.000 C 148.418 48.000 152.000 51.582 152.000 56.000 ZM 248.000 180.000 C 248.014 195.098 238.606 208.602 224.437 213.818 C 210.269 219.034 194.350 214.855 184.571 203.351 C 174.792 191.847 173.231 175.464 180.660 162.320 C 180.730 162.180 180.800 162.040 180.880 161.900 L 213.130 107.900 C 215.394 104.106 220.306 102.866 224.100 105.130 C 227.894 107.394 229.134 112.306 226.870 116.100 L 210.180 144.100 C 210.780 144.100 211.390 144.050 212.000 144.050 C 231.863 144.050 247.972 160.137 248.000 180.000 ZM 232.000 180.000 C 232.000 168.954 223.046 160.000 212.000 160.000 C 200.954 160.000 192.000 168.954 192.000 180.000 C 192.000 191.046 200.954 200.000 212.000 200.000 C 223.046 200.000 232.000 191.046 232.000 180.000 Z"),
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
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
