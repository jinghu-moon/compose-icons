package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DotsThreeCircle: ImageVector
    get() {
        if (_dotsThreeCircle != null) return _dotsThreeCircle!!
        _dotsThreeCircle = phosphorFillIcon(
            name = "DotsThreeCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.928 70.592 185.408 24.072 128.000 24.000 ZM 84.000 140.000 C 77.373 140.000 72.000 134.627 72.000 128.000 C 72.000 121.373 77.373 116.000 84.000 116.000 C 90.627 116.000 96.000 121.373 96.000 128.000 C 96.000 134.627 90.627 140.000 84.000 140.000 ZM 128.000 140.000 C 121.373 140.000 116.000 134.627 116.000 128.000 C 116.000 121.373 121.373 116.000 128.000 116.000 C 134.627 116.000 140.000 121.373 140.000 128.000 C 140.000 134.627 134.627 140.000 128.000 140.000 ZM 172.000 140.000 C 165.373 140.000 160.000 134.627 160.000 128.000 C 160.000 121.373 165.373 116.000 172.000 116.000 C 178.627 116.000 184.000 121.373 184.000 128.000 C 184.000 134.627 178.627 140.000 172.000 140.000 Z"),
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
        return _dotsThreeCircle!!
    }

private var _dotsThreeCircle: ImageVector? = null
