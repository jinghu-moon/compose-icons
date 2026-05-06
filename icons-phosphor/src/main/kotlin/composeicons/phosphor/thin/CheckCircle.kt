package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CheckCircle: ImageVector
    get() {
        if (_checkCircle != null) return _checkCircle!!
        _checkCircle = phosphorThinIcon(
            name = "CheckCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M170.83 101.17c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-56 56c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173l-24-24c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L112 154.34l53.17-53.17c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173ZM228 128c0 55.228-44.772 100-100 100C72.772 228 28 183.228 28 128 28 72.772 72.772 28 128 28c55.203 .061 99.939 44.797 100 100ZM220 128C220 77.19 178.81 36 128 36 77.19 36 36 77.19 36 128c0 50.81 41.19 92 92 92 50.787-.055 91.945-41.213 92-92Z"),
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
        return _checkCircle!!
    }

private var _checkCircle: ImageVector? = null
