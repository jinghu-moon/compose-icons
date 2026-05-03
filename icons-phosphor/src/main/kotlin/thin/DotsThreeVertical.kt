package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DotsThreeVertical: ImageVector
    get() {
        if (_dotsThreeVertical != null) return _dotsThreeVertical!!
        _dotsThreeVertical = phosphorThinIcon(
            name = "DotsThreeVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 60.000 C 120.000 55.582 123.582 52.000 128.000 52.000 C 132.418 52.000 136.000 55.582 136.000 60.000 C 136.000 64.418 132.418 68.000 128.000 68.000 C 123.582 68.000 120.000 64.418 120.000 60.000 ZM 128.000 120.000 C 123.582 120.000 120.000 123.582 120.000 128.000 C 120.000 132.418 123.582 136.000 128.000 136.000 C 132.418 136.000 136.000 132.418 136.000 128.000 C 136.000 123.582 132.418 120.000 128.000 120.000 ZM 128.000 188.000 C 123.582 188.000 120.000 191.582 120.000 196.000 C 120.000 200.418 123.582 204.000 128.000 204.000 C 132.418 204.000 136.000 200.418 136.000 196.000 C 136.000 191.582 132.418 188.000 128.000 188.000 Z"),
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
        return _dotsThreeVertical!!
    }

private var _dotsThreeVertical: ImageVector? = null
