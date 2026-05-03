package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Volume4: ImageVector
    get() {
        if (_volume4 != null) return _volume4!!
        _volume4 = tablerOutlineIcon(
            name = "Volume4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.5f, 15.0f),
                    PathNode.LineTo(7.5f, 15.0f),
                    PathNode.CurveTo(6.947716f, 15.0f, 6.5f, 14.552285f, 6.5f, 14.0f),
                    PathNode.LineTo(6.5f, 10.0f),
                    PathNode.CurveTo(6.5f, 9.447715f, 6.947716f, 9.0f, 7.5f, 9.0f),
                    PathNode.LineTo(9.5f, 9.0f),
                    PathNode.LineTo(13.0f, 4.5f),
                    PathNode.CurveTo(13.180595f, 4.14922f, 13.58996f, 3.982479f, 13.964252f, 4.107243f),
                    PathNode.CurveTo(14.338545f, 4.232007f, 14.565991f, 4.611019f, 14.5f, 5.0f),
                    PathNode.LineTo(14.5f, 19.0f),
                    PathNode.CurveTo(14.565991f, 19.38898f, 14.338545f, 19.767992f, 13.964252f, 19.892757f),
                    PathNode.CurveTo(13.58996f, 20.01752f, 13.180595f, 19.85078f, 13.0f, 19.5f),
                    PathNode.LineTo(9.5f, 15.0f)
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
        return _volume4!!
    }

private var _volume4: ImageVector? = null
