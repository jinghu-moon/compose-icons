package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DotsThree: ImageVector
    get() {
        if (_dotsThree != null) return _dotsThree!!
        _dotsThree = phosphorDuotoneIcon(
            name = "DotsThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 240.000 96.000 L 240.000 160.000 C 240.000 168.837 232.837 176.000 224.000 176.000 L 32.000 176.000 C 23.163 176.000 16.000 168.837 16.000 160.000 L 16.000 96.000 C 16.000 87.163 23.163 80.000 32.000 80.000 L 224.000 80.000 C 232.837 80.000 240.000 87.163 240.000 96.000 Z"),
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
                pathData = parseSvgPathData("M 140.000 128.000 C 140.000 134.627 134.627 140.000 128.000 140.000 C 121.373 140.000 116.000 134.627 116.000 128.000 C 116.000 121.373 121.373 116.000 128.000 116.000 C 134.627 116.000 140.000 121.373 140.000 128.000 ZM 196.000 116.000 C 189.373 116.000 184.000 121.373 184.000 128.000 C 184.000 134.627 189.373 140.000 196.000 140.000 C 202.627 140.000 208.000 134.627 208.000 128.000 C 208.000 121.373 202.627 116.000 196.000 116.000 ZM 60.000 116.000 C 53.373 116.000 48.000 121.373 48.000 128.000 C 48.000 134.627 53.373 140.000 60.000 140.000 C 66.627 140.000 72.000 134.627 72.000 128.000 C 72.000 121.373 66.627 116.000 60.000 116.000 Z"),
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
