package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GreaterThan: ImageVector
    get() {
        if (_greaterThan != null) return _greaterThan!!
        _greaterThan = phosphorDuotoneIcon(
            name = "GreaterThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 128 64 200v-144Z"),
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
                pathData = parseSvgPathData("M224 128c-.001 3.093-1.784 5.908-4.58 7.23l-152 72c-3.993 1.892-8.763 .188-10.655-3.805-1.892-3.993-.188-8.763 3.805-10.655L197.31 128 60.58 63.23C56.587 61.338 54.883 56.568 56.775 52.575c1.892-3.993 6.662-5.697 10.655-3.805l152 72c2.792 1.325 4.571 4.14 4.57 7.23Z"),
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
        return _greaterThan!!
    }

private var _greaterThan: ImageVector? = null
