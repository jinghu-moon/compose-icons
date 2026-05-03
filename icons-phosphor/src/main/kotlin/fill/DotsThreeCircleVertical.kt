package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DotsThreeCircleVertical: ImageVector
    get() {
        if (_dotsThreeCircleVertical != null) return _dotsThreeCircleVertical!!
        _dotsThreeCircleVertical = phosphorFillIcon(
            name = "DotsThreeCircleVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 128.000 C 232.000 70.562 185.438 24.000 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.408 231.928 231.928 185.408 232.000 128.000 ZM 116.000 84.000 C 116.000 77.373 121.373 72.000 128.000 72.000 C 134.627 72.000 140.000 77.373 140.000 84.000 C 140.000 90.627 134.627 96.000 128.000 96.000 C 121.373 96.000 116.000 90.627 116.000 84.000 ZM 116.000 128.000 C 116.000 121.373 121.373 116.000 128.000 116.000 C 134.627 116.000 140.000 121.373 140.000 128.000 C 140.000 134.627 134.627 140.000 128.000 140.000 C 121.373 140.000 116.000 134.627 116.000 128.000 ZM 116.000 172.000 C 116.000 165.373 121.373 160.000 128.000 160.000 C 134.627 160.000 140.000 165.373 140.000 172.000 C 140.000 178.627 134.627 184.000 128.000 184.000 C 121.373 184.000 116.000 178.627 116.000 172.000 Z"),
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
        return _dotsThreeCircleVertical!!
    }

private var _dotsThreeCircleVertical: ImageVector? = null
