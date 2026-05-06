package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleCircle: ImageVector
    get() {
        if (_personSimpleCircle != null) return _personSimpleCircle!!
        _personSimpleCircle = phosphorThinIcon(
            name = "PersonSimpleCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM116 80c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM180 112c0 2.209-1.791 4-4 4h-44v18.79l31.33 47c1.226 1.839 .729 4.324-1.11 5.55-1.839 1.226-4.324 .729-5.55-1.11L128 143.23l-28.67 43c-1.226 1.839-3.711 2.336-5.55 1.11-1.839-1.226-2.336-3.711-1.11-5.55l31.33-47v-18.79h-44c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h96c2.209 0 4 1.791 4 4Z"),
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
        return _personSimpleCircle!!
    }

private var _personSimpleCircle: ImageVector? = null
