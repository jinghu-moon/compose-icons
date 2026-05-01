package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = tablerOutlineIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.LineTo(16.919f, 7.5f),
                    PathNode.CurveTo(17.529f, 8.087f, 18.096f, 8.677f, 18.622f, 9.271f),
                    PathNode.CurveTo(20.35484f, 11.239989f, 20.465136f, 14.155725f, 18.886f, 16.25f),
                    PathNode.CurveTo(17.706f, 17.81f, 15.548f, 18.17f, 14.0f, 17.0f),
                    PathNode.LineTo(14.0f, 18.0f),
                    PathNode.LineTo(15.0f, 21.0f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.LineTo(10.0f, 18.0f),
                    PathNode.LineTo(10.0f, 17.0f),
                    PathNode.CurveTo(8.46f, 18.07f, 6.265f, 17.772f, 5.114f, 16.25f),
                    PathNode.CurveTo(3.534865f, 14.155725f, 3.645161f, 11.239989f, 5.378f, 9.271f),
                    PathNode.CurveTo(5.92195f, 8.658311f, 6.490066f, 8.06751f, 7.081f, 7.5f),
                    PathNode.CurveTo(8.717422f, 5.996457f, 10.357092f, 4.496454f, 12.0f, 3.0f)
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
        return _spade!!
    }

private var _spade: ImageVector? = null
