package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CirclesFour: ImageVector
    get() {
        if (_circlesFour != null) return _circlesFour!!
        _circlesFour = phosphorThinIcon(
            name = "CirclesFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 80.000 44.000 C 60.118 44.000 44.000 60.118 44.000 80.000 C 44.000 99.882 60.118 116.000 80.000 116.000 C 99.882 116.000 116.000 99.882 116.000 80.000 C 116.000 60.118 99.882 44.000 80.000 44.000 ZM 80.000 108.000 C 64.536 108.000 52.000 95.464 52.000 80.000 C 52.000 64.536 64.536 52.000 80.000 52.000 C 95.464 52.000 108.000 64.536 108.000 80.000 C 108.000 95.464 95.464 108.000 80.000 108.000 ZM 176.000 116.000 C 195.882 116.000 212.000 99.882 212.000 80.000 C 212.000 60.118 195.882 44.000 176.000 44.000 C 156.118 44.000 140.000 60.118 140.000 80.000 C 140.000 99.882 156.118 116.000 176.000 116.000 ZM 176.000 52.000 C 191.464 52.000 204.000 64.536 204.000 80.000 C 204.000 95.464 191.464 108.000 176.000 108.000 C 160.536 108.000 148.000 95.464 148.000 80.000 C 148.000 64.536 160.536 52.000 176.000 52.000 ZM 80.000 140.000 C 60.118 140.000 44.000 156.118 44.000 176.000 C 44.000 195.882 60.118 212.000 80.000 212.000 C 99.882 212.000 116.000 195.882 116.000 176.000 C 116.000 156.118 99.882 140.000 80.000 140.000 ZM 80.000 204.000 C 64.536 204.000 52.000 191.464 52.000 176.000 C 52.000 160.536 64.536 148.000 80.000 148.000 C 95.464 148.000 108.000 160.536 108.000 176.000 C 108.000 191.464 95.464 204.000 80.000 204.000 ZM 176.000 140.000 C 156.118 140.000 140.000 156.118 140.000 176.000 C 140.000 195.882 156.118 212.000 176.000 212.000 C 195.882 212.000 212.000 195.882 212.000 176.000 C 212.000 156.118 195.882 140.000 176.000 140.000 ZM 176.000 204.000 C 160.536 204.000 148.000 191.464 148.000 176.000 C 148.000 160.536 160.536 148.000 176.000 148.000 C 191.464 148.000 204.000 160.536 204.000 176.000 C 204.000 191.464 191.464 204.000 176.000 204.000 Z"),
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
        return _circlesFour!!
    }

private var _circlesFour: ImageVector? = null
