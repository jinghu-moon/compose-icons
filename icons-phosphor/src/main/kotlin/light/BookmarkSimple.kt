package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BookmarkSimple: ImageVector
    get() {
        if (_bookmarkSimple != null) return _bookmarkSimple!!
        _bookmarkSimple = phosphorLightIcon(
            name = "BookmarkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 34.000 L 72.000 34.000 C 64.268 34.000 58.000 40.268 58.000 48.000 L 58.000 224.000 C 57.999 226.182 59.183 228.192 61.091 229.249 C 62.998 230.307 65.330 230.246 67.180 229.090 L 127.990 191.090 L 188.820 229.090 C 190.670 230.246 193.002 230.307 194.909 229.249 C 196.817 228.192 198.001 226.182 198.000 224.000 L 198.000 48.000 C 198.000 40.268 191.732 34.000 184.000 34.000 ZM 186.000 213.170 L 131.170 178.910 C 129.224 177.694 126.756 177.694 124.810 178.910 L 70.000 213.170 L 70.000 48.000 C 70.000 46.895 70.895 46.000 72.000 46.000 L 184.000 46.000 C 185.105 46.000 186.000 46.895 186.000 48.000 Z"),
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
        return _bookmarkSimple!!
    }

private var _bookmarkSimple: ImageVector? = null
