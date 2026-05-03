package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DotsSix: ImageVector
    get() {
        if (_dotsSix != null) return _dotsSix!!
        _dotsSix = phosphorDuotoneIcon(
            name = "DotsSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 240.000 64.000 L 240.000 192.000 C 240.000 200.837 232.837 208.000 224.000 208.000 L 32.000 208.000 C 23.163 208.000 16.000 200.837 16.000 192.000 L 16.000 64.000 C 16.000 55.163 23.163 48.000 32.000 48.000 L 224.000 48.000 C 232.837 48.000 240.000 55.163 240.000 64.000 Z"),
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
                pathData = parseSvgPathData("M 72.000 92.000 C 72.000 98.627 66.627 104.000 60.000 104.000 C 53.373 104.000 48.000 98.627 48.000 92.000 C 48.000 85.373 53.373 80.000 60.000 80.000 C 66.627 80.000 72.000 85.373 72.000 92.000 ZM 128.000 80.000 C 121.373 80.000 116.000 85.373 116.000 92.000 C 116.000 98.627 121.373 104.000 128.000 104.000 C 134.627 104.000 140.000 98.627 140.000 92.000 C 140.000 85.373 134.627 80.000 128.000 80.000 ZM 196.000 104.000 C 202.627 104.000 208.000 98.627 208.000 92.000 C 208.000 85.373 202.627 80.000 196.000 80.000 C 189.373 80.000 184.000 85.373 184.000 92.000 C 184.000 98.627 189.373 104.000 196.000 104.000 ZM 60.000 152.000 C 53.373 152.000 48.000 157.373 48.000 164.000 C 48.000 170.627 53.373 176.000 60.000 176.000 C 66.627 176.000 72.000 170.627 72.000 164.000 C 72.000 157.373 66.627 152.000 60.000 152.000 ZM 128.000 152.000 C 121.373 152.000 116.000 157.373 116.000 164.000 C 116.000 170.627 121.373 176.000 128.000 176.000 C 134.627 176.000 140.000 170.627 140.000 164.000 C 140.000 157.373 134.627 152.000 128.000 152.000 ZM 196.000 152.000 C 189.373 152.000 184.000 157.373 184.000 164.000 C 184.000 170.627 189.373 176.000 196.000 176.000 C 202.627 176.000 208.000 170.627 208.000 164.000 C 208.000 157.373 202.627 152.000 196.000 152.000 Z"),
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
        return _dotsSix!!
    }

private var _dotsSix: ImageVector? = null
