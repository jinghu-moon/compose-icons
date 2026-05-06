package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) return _currencyKrw!!
        _currencyKrw = phosphorDuotoneIcon(
            name = "CurrencyKrw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M50 136h52L76 200ZM102 136h52L128 72ZM154 136l26 64 26-64Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M240 128h-22.11L239.41 75c1.202-2.673 .846-5.789-.927-8.122-1.773-2.333-4.68-3.51-7.577-3.068-2.897 .442-5.32 2.433-6.316 5.189l-24 59h-41.21l-24-59c-1.226-3.014-4.156-4.985-7.41-4.985-3.254 0-6.184 1.971-7.41 4.985l-24 59h-41.18L31.38 69C29.616 65.078 25.068 63.252 21.082 64.866 17.096 66.479 15.098 70.956 16.56 75l21.52 53h-22.08c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h28.61l24 59c1.226 3.014 4.156 4.985 7.41 4.985 3.254 0 6.184-1.971 7.41-4.985l24-59h41.24l24 59c1.226 3.014 4.156 4.985 7.41 4.985 3.254 0 6.184-1.971 7.41-4.985l24-59h28.51c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM76 178.75 61.88 144h28.24ZM113.88 128 128 93.26 142.12 128ZM180 178.75 165.88 144h28.24Z"),
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
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
