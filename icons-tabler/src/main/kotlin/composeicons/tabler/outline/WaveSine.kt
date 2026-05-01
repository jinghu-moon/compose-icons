package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WaveSine: ImageVector
    get() {
        if (_waveSine != null) return _waveSine!!
        _waveSine = tablerOutlineIcon(
            name = "WaveSine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.LineTo(19.0f, 12.0f),
                    PathNode.CurveTo(18.106f, 12.0f, 17.338f, 11.143f, 17.239f, 10.0f),
                    PathNode.CurveTo(16.943f, 6.55f, 16.49f, 4.0f, 14.49f, 4.0f),
                    PathNode.CurveTo(12.49f, 4.0f, 11.99f, 7.582f, 11.99f, 12.0f),
                    PathNode.CurveTo(11.99f, 16.418f, 11.49f, 20.0f, 9.49f, 20.0f),
                    PathNode.CurveTo(7.49f, 20.0f, 7.038f, 17.453f, 6.741f, 14.0f),
                    PathNode.CurveTo(6.641f, 12.853f, 5.874f, 12.0f, 4.978f, 12.0f),
                    PathNode.LineTo(2.978f, 12.0f)
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
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
