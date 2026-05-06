package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Checks: ImageVector
    get() {
        if (_checks != null) return _checks!!
        _checks = phosphorBoldIcon(
            name = "Checks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152.41 88.56l-89.6 88c-4.669 4.587-12.151 4.587-16.82 0L7.59 138.85C2.86 134.205 2.79 126.605 7.435 121.875c4.645-4.73 12.245-4.8 16.975-.155l30 29.46L135.6 71.44c4.728-4.645 12.325-4.578 16.97 .15 4.645 4.728 4.578 12.325-.15 16.97ZM248.56 71.56c-2.232-2.279-5.279-3.577-8.469-3.605-3.19-.028-6.26 1.215-8.531 3.455l-81.16 79.77-7.88-7.74c-4.728-4.645-12.325-4.578-16.97 .15-4.645 4.728-4.578 12.325 .15 16.97l16.29 16c4.669 4.587 12.151 4.587 16.82 0l89.6-88c2.27-2.23 3.561-5.271 3.59-8.454 .028-3.182-1.209-6.246-3.44-8.516Z"),
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
        return _checks!!
    }

private var _checks: ImageVector? = null
