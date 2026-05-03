package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TriangleInverted: ImageVector
    get() {
        if (_triangleInverted != null) return _triangleInverted!!
        _triangleInverted = tablerOutlineIcon(
            name = "TriangleInverted",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.363f, 20.405f),
                    PathNode.LineTo(2.257f, 6.871f),
                    PathNode.CurveTo(1.916961f, 6.282135f, 1.914885f, 5.557069f, 2.251546f, 4.966266f),
                    PathNode.CurveTo(2.588207f, 4.375464f, 3.213051f, 4.00764f, 3.893f, 4.0f),
                    PathNode.LineTo(20.107f, 4.0f),
                    PathNode.CurveTo(20.78695f, 4.00764f, 21.411793f, 4.375464f, 21.748453f, 4.966266f),
                    PathNode.CurveTo(22.085115f, 5.557069f, 22.083038f, 6.282135f, 21.743f, 6.871f),
                    PathNode.LineTo(13.637f, 20.405f),
                    PathNode.CurveTo(13.290141f, 20.977514f, 12.66939f, 21.32722f, 12.0f, 21.32722f),
                    PathNode.CurveTo(11.33061f, 21.32722f, 10.709859f, 20.977514f, 10.363f, 20.405f)
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
        return _triangleInverted!!
    }

private var _triangleInverted: ImageVector? = null
