package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cone2: ImageVector
    get() {
        if (_cone2 != null) return _cone2!!
        _cone2 = tablerFilledIcon(
            name = "Cone2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.0f),
                    PathNode.CurveTo(17.52f, 1.0f, 22.0f, 2.494f, 22.0f, 5.002f),
                    PathNode.LineTo(22.0f, 5.502f),
                    PathNode.CurveTo(22.00003f, 5.668597f, 21.958435f, 5.832562f, 21.879f, 5.979f),
                    PathNode.LineTo(13.74f, 20.985f),
                    PathNode.CurveTo(13.383264f, 21.61449f, 12.714352f, 22.00222f, 11.990813f, 21.998901f),
                    PathNode.CurveTo(11.267276f, 21.995583f, 10.601948f, 21.601736f, 10.251f, 20.969f),
                    PathNode.LineTo(2.121f, 5.979f),
                    PathNode.CurveTo(2.041885f, 5.833157f, 2.000303f, 5.66992f, 2.0f, 5.504f),
                    PathNode.LineTo(2.0f, 5.004f),
                    PathNode.CurveTo(2.0f, 2.495f, 6.48f, 1.0f, 12.0f, 1.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _cone2!!
    }

private var _cone2: ImageVector? = null
