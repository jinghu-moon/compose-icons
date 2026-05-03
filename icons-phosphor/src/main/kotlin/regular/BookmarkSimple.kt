package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BookmarkSimple: ImageVector
    get() {
        if (_bookmarkSimple != null) return _bookmarkSimple!!
        _bookmarkSimple = phosphorRegularIcon(
            name = "BookmarkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 32.000 L 72.000 32.000 C 63.163 32.000 56.000 39.163 56.000 48.000 L 56.000 224.000 C 56.001 226.907 57.580 229.585 60.124 230.994 C 62.667 232.403 65.774 232.321 68.240 230.780 L 128.000 193.430 L 187.770 230.780 C 190.235 232.316 193.339 232.395 195.879 230.987 C 198.419 229.578 199.996 226.904 200.000 224.000 L 200.000 48.000 C 200.000 39.163 192.837 32.000 184.000 32.000 ZM 184.000 209.570 L 132.230 177.220 C 129.636 175.599 126.344 175.599 123.750 177.220 L 72.000 209.570 L 72.000 48.000 L 184.000 48.000 Z"),
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
