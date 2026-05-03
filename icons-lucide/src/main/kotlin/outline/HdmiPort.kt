package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HdmiPort: ImageVector
    get() {
        if (_hdmiPort != null) return _hdmiPort!!
        _hdmiPort = lucideOutlineIcon(
            name = "HdmiPort",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 9.000 C 22.000 8.448 21.552 8.000 21.000 8.000 L 3.000 8.000 C 2.448 8.000 2.000 8.448 2.000 9.000 L 2.000 13.000 C 2.000 13.552 2.448 14.000 3.000 14.000 L 4.000 14.000 L 6.000 16.000 L 18.000 16.000 L 20.000 14.000 L 21.000 14.000 C 21.552 14.000 22.000 13.552 22.000 13.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 7.500 12.000 L 16.500 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _hdmiPort!!
    }

private var _hdmiPort: ImageVector? = null
