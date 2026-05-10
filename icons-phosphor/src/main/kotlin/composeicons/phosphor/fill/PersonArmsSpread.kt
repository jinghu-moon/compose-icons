package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonArmsSpread: ImageVector
    get() {
        if (_personArmsSpread != null) return _personArmsSpread!!
        _personArmsSpread = phosphorFillIcon(
            name = "PersonArmsSpread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 36C100 20.536 112.536 8 128 8c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28C112.536 64 100 51.464 100 36ZM227.6 92.57C226.096 85.176 219.545 79.897 212 80h-168C36.485 80 29.982 85.23 28.371 92.57c-1.611 7.341 2.104 14.813 8.929 17.96h.06l53.89 23.73L69.33 217.56c-3.479 7.959 .027 17.24 7.9 20.91 2.116 1.005 4.428 1.527 6.77 1.53 6.155 .009 11.77-3.514 14.44-9.06L128 180l29.58 51c3.826 7.783 13.155 11.101 21.036 7.481 7.881-3.619 11.444-12.858 8.034-20.831L164.73 134.35l54-23.76c6.915-3.082 10.645-10.66 8.87-18.02Z"),
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
        return _personArmsSpread!!
    }

private var _personArmsSpread: ImageVector? = null
