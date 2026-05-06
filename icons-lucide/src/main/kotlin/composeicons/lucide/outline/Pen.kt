package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pen: ImageVector
    get() {
        if (_pen != null) return _pen!!
        _pen = lucideOutlineIcon(
            name = "Pen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.174 6.812c1.101-1.101 1.101-2.886 0-3.986C20.074 1.725 18.289 1.724 17.188 2.825L3.842 16.174c-.232 .232-.404 .517-.5 .83L2.021 21.356c-.053 .176-.004 .367 .126 .497 .13 .13 .321 .178 .497 .125L6.997 20.658c.313-.095 .598-.266 .83-.497Z"),
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
        return _pen!!
    }

private var _pen: ImageVector? = null
