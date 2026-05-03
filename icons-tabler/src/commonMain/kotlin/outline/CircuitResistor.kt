package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircuitResistor: ImageVector
    get() {
        if (_circuitResistor != null) return _circuitResistor!!
        _circuitResistor = tablerOutlineIcon(
            name = "CircuitResistor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 12.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.LineTo(12.0f, 7.0f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.LineTo(18.0f, 7.0f),
                    PathNode.LineTo(19.5f, 12.0f),
                    PathNode.LineTo(22.0f, 12.0f)
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
        return _circuitResistor!!
    }

private var _circuitResistor: ImageVector? = null
