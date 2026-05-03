package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DotsThreeVertical: ImageVector
    get() {
        if (_dotsThreeVertical != null) return _dotsThreeVertical!!
        _dotsThreeVertical = phosphorDuotoneIcon(
            name = "DotsThreeVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 176.000 32.000 L 176.000 224.000 C 176.000 232.837 168.837 240.000 160.000 240.000 L 96.000 240.000 C 87.163 240.000 80.000 232.837 80.000 224.000 L 80.000 32.000 C 80.000 23.163 87.163 16.000 96.000 16.000 L 160.000 16.000 C 168.837 16.000 176.000 23.163 176.000 32.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 140.000 128.000 C 140.000 134.627 134.627 140.000 128.000 140.000 C 121.373 140.000 116.000 134.627 116.000 128.000 C 116.000 121.373 121.373 116.000 128.000 116.000 C 134.627 116.000 140.000 121.373 140.000 128.000 ZM 128.000 72.000 C 134.627 72.000 140.000 66.627 140.000 60.000 C 140.000 53.373 134.627 48.000 128.000 48.000 C 121.373 48.000 116.000 53.373 116.000 60.000 C 116.000 66.627 121.373 72.000 128.000 72.000 ZM 128.000 184.000 C 121.373 184.000 116.000 189.373 116.000 196.000 C 116.000 202.627 121.373 208.000 128.000 208.000 C 134.627 208.000 140.000 202.627 140.000 196.000 C 140.000 189.373 134.627 184.000 128.000 184.000 Z"),
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
