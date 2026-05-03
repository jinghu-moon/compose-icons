package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.StarHalf: ImageVector
    get() {
        if (_starHalf != null) return _starHalf!!
        _starHalf = lucideOutlineIcon(
            name = "StarHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 18.338f),
                    PathNode.CurveTo(11.65598f, 18.337261f, 11.317047f, 18.42105f, 11.013f, 18.582f),
                    PathNode.LineTo(6.396f, 21.01f),
                    PathNode.CurveTo(6.217139f, 21.104689f, 5.999967f, 21.089252f, 5.836295f, 20.970219f),
                    PathNode.CurveTo(5.672624f, 20.851185f, 5.591028f, 20.649334f, 5.626f, 20.45f),
                    PathNode.LineTo(6.507f, 15.311f),
                    PathNode.CurveTo(6.625498f, 14.622244f, 6.396931f, 13.919335f, 5.896f, 13.432f),
                    PathNode.LineTo(2.16f, 9.795f),
                    PathNode.CurveTo(2.014313f, 9.654288f, 1.961561f, 9.442847f, 2.024079f, 9.250191f),
                    PathNode.CurveTo(2.086596f, 9.057535f, 2.253449f, 8.917356f, 2.454f, 8.889f),
                    PathNode.LineTo(7.619f, 8.134f),
                    PathNode.CurveTo(8.309849f, 8.033845f, 8.907115f, 7.600014f, 9.216f, 6.974f),
                    PathNode.LineTo(11.525f, 2.295f),
                    PathNode.CurveTo(11.614364f, 2.114351f, 11.798455f, 2.00002f, 12.0f, 2.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
