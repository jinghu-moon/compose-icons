package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAlgolia: ImageVector
    get() {
        if (_brandAlgolia != null) return _brandAlgolia!!
        _brandAlgolia = tablerOutlineIcon(
            name = "BrandAlgolia",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.5f, 11.0f),
                    PathNode.CurveTo(15.086f, 9.523f, 13.614f, 8.5f, 12.0f, 8.5f),
                    PathNode.CurveTo(11.069288f, 8.491919f, 10.174346f, 8.858071f, 9.516209f, 9.516209f),
                    PathNode.CurveTo(8.858071f, 10.174346f, 8.491919f, 11.069288f, 8.5f, 12.0f),
                    PathNode.CurveTo(8.491919f, 12.930712f, 8.858071f, 13.825654f, 9.516209f, 14.483791f),
                    PathNode.CurveTo(10.174346f, 15.141929f, 11.069288f, 15.508081f, 12.0f, 15.5f),
                    PathNode.CurveTo(12.974f, 15.5f, 13.861f, 15.143f, 14.5f, 14.5f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.LineTo(19.0f, 4.0f),
                    PathNode.LineTo(12.0f, 4.0f),
                    PathNode.CurveTo(7.614f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 16.418f, 7.614f, 20.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(13.030693f, 20.001371f, 14.050829f, 19.792444f, 14.998f, 19.386f)
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
        return _brandAlgolia!!
    }

private var _brandAlgolia: ImageVector? = null
