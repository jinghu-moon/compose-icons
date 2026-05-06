package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) return _bracketsAngle!!
        _bracketsAngle = phosphorFillIcon(
            name = "BracketsAngle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM103 180c2.209 3.852 .877 8.766-2.975 10.975-3.852 2.209-8.766 .877-10.975-2.975L57.05 132c-1.406-2.46-1.406-5.48 0-7.94l32-56c2.193-3.852 7.093-5.198 10.945-3.005 3.852 2.193 5.198 7.093 3.005 10.945L73.21 128ZM199 132l-32 56c-2.193 3.838-7.082 5.173-10.92 2.98-3.838-2.193-5.173-7.082-2.98-10.92l29.74-52L153.05 76c-2.209-3.852-.877-8.766 2.975-10.975 3.852-2.209 8.766-.877 10.975 2.975l32 56c1.429 2.475 1.429 5.525 0 8Z"),
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
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
