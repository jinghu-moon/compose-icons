package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) return _crosshairSimple!!
        _crosshairSimple = phosphorRegularIcon(
            name = "CrosshairSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 136.000 215.630 L 136.000 184.000 C 136.000 179.582 132.418 176.000 128.000 176.000 C 123.582 176.000 120.000 179.582 120.000 184.000 L 120.000 215.630 C 77.748 211.718 44.282 178.252 40.370 136.000 L 72.000 136.000 C 76.418 136.000 80.000 132.418 80.000 128.000 C 80.000 123.582 76.418 120.000 72.000 120.000 L 40.370 120.000 C 44.282 77.748 77.748 44.282 120.000 40.370 L 120.000 72.000 C 120.000 76.418 123.582 80.000 128.000 80.000 C 132.418 80.000 136.000 76.418 136.000 72.000 L 136.000 40.370 C 178.252 44.282 211.718 77.748 215.630 120.000 L 184.000 120.000 C 179.582 120.000 176.000 123.582 176.000 128.000 C 176.000 132.418 179.582 136.000 184.000 136.000 L 215.630 136.000 C 211.718 178.252 178.252 211.718 136.000 215.630 Z"),
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
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null
