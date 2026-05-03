package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DotsThree: ImageVector
    get() {
        if (_dotsThree != null) return _dotsThree!!
        _dotsThree = phosphorThinIcon(
            name = "DotsThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 128.000 C 136.000 132.418 132.418 136.000 128.000 136.000 C 123.582 136.000 120.000 132.418 120.000 128.000 C 120.000 123.582 123.582 120.000 128.000 120.000 C 132.418 120.000 136.000 123.582 136.000 128.000 ZM 60.000 120.000 C 55.582 120.000 52.000 123.582 52.000 128.000 C 52.000 132.418 55.582 136.000 60.000 136.000 C 64.418 136.000 68.000 132.418 68.000 128.000 C 68.000 123.582 64.418 120.000 60.000 120.000 ZM 196.000 120.000 C 191.582 120.000 188.000 123.582 188.000 128.000 C 188.000 132.418 191.582 136.000 196.000 136.000 C 200.418 136.000 204.000 132.418 204.000 128.000 C 204.000 123.582 200.418 120.000 196.000 120.000 Z"),
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
        return _dotsThree!!
    }

private var _dotsThree: ImageVector? = null
