package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAuth0: ImageVector
    get() {
        if (_brandAuth0 != null) return _brandAuth0!!
        _brandAuth0 = tablerOutlineIcon(
            name = "BrandAuth0",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 14.5f),
                    PathNode.LineTo(6.5f, 18.0f),
                    PathNode.LineTo(8.5f, 12.0f),
                    PathNode.LineTo(4.0f, 8.0f),
                    PathNode.LineTo(10.0f, 8.0f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.LineTo(15.5f, 12.0f),
                    PathNode.LineTo(17.5f, 18.0f),
                    PathNode.LineTo(12.0f, 14.5f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.507f, 8.872f),
                    PathNode.LineTo(18.497f, 3.0f),
                    PathNode.LineTo(5.503f, 3.0f),
                    PathNode.LineTo(3.494f, 8.872f),
                    PathNode.CurveTo(2.252f, 12.465f, 3.359f, 15.966f, 6.743f, 18.279f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(17.257f, 18.279f),
                    PathNode.CurveTo(20.642f, 15.966f, 21.747f, 12.465f, 20.507f, 8.872f)
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
        return _brandAuth0!!
    }

private var _brandAuth0: ImageVector? = null
