package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DotsSixVertical: ImageVector
    get() {
        if (_dotsSixVertical != null) return _dotsSixVertical!!
        _dotsSixVertical = phosphorRegularIcon(
            name = "DotsSixVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 104.000 60.000 C 104.000 66.627 98.627 72.000 92.000 72.000 C 85.373 72.000 80.000 66.627 80.000 60.000 C 80.000 53.373 85.373 48.000 92.000 48.000 C 98.627 48.000 104.000 53.373 104.000 60.000 ZM 164.000 72.000 C 170.627 72.000 176.000 66.627 176.000 60.000 C 176.000 53.373 170.627 48.000 164.000 48.000 C 157.373 48.000 152.000 53.373 152.000 60.000 C 152.000 66.627 157.373 72.000 164.000 72.000 ZM 92.000 116.000 C 85.373 116.000 80.000 121.373 80.000 128.000 C 80.000 134.627 85.373 140.000 92.000 140.000 C 98.627 140.000 104.000 134.627 104.000 128.000 C 104.000 121.373 98.627 116.000 92.000 116.000 ZM 164.000 116.000 C 157.373 116.000 152.000 121.373 152.000 128.000 C 152.000 134.627 157.373 140.000 164.000 140.000 C 170.627 140.000 176.000 134.627 176.000 128.000 C 176.000 121.373 170.627 116.000 164.000 116.000 ZM 92.000 184.000 C 85.373 184.000 80.000 189.373 80.000 196.000 C 80.000 202.627 85.373 208.000 92.000 208.000 C 98.627 208.000 104.000 202.627 104.000 196.000 C 104.000 189.373 98.627 184.000 92.000 184.000 ZM 164.000 184.000 C 157.373 184.000 152.000 189.373 152.000 196.000 C 152.000 202.627 157.373 208.000 164.000 208.000 C 170.627 208.000 176.000 202.627 176.000 196.000 C 176.000 189.373 170.627 184.000 164.000 184.000 Z"),
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
        return _dotsSixVertical!!
    }

private var _dotsSixVertical: ImageVector? = null
