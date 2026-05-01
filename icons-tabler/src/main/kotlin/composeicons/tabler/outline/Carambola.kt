package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Carambola: ImageVector
    get() {
        if (_carambola != null) return _carambola!!
        _carambola = tablerOutlineIcon(
            name = "Carambola",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.286f, 21.09f),
                    PathNode.QuadTo(15.596f, 21.091f, 11.998f, 18.475f),
                    PathNode.QuadTo(8.402f, 21.092f, 6.71f, 21.091f),
                    PathNode.QuadTo(3.984f, 21.091f, 6.215f, 14.291f),
                    PathNode.QuadTo(-3.174f, 7.516f, 8.350001f, 7.516f),
                    PathNode.LineTo(8.426f, 7.516f),
                    PathNode.QuadTo(10.211f, 2.0f, 12.0f, 2.0f),
                    PathNode.QuadTo(13.785f, 2.0f, 15.574f, 7.516f),
                    PathNode.LineTo(15.65f, 7.516f),
                    PathNode.QuadTo(27.175f, 7.516f, 17.783f, 14.29f),
                    PathNode.QuadTo(20.013f, 21.092f, 17.286f, 21.09f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _carambola!!
    }

private var _carambola: ImageVector? = null
