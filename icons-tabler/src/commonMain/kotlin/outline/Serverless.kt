package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Serverless: ImageVector
    get() {
        if (_serverless != null) return _serverless!!
        _serverless = tablerOutlineIcon(
            name = "Serverless",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 19.0f),
                    PathNode.LineTo(11.03f, 20.748f),
                    PathNode.CurveTo(11.633377f, 21.082628f, 12.366623f, 21.082628f, 12.97f, 20.748f),
                    PathNode.LineTo(18.97f, 16.905f),
                    PathNode.CurveTo(19.606895f, 16.551785f, 20.001446f, 15.880282f, 20.0f, 15.152f),
                    PathNode.LineTo(20.0f, 9.0f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.LineTo(4.0f, 15.0f),
                    PathNode.LineTo(4.0f, 8.595f),
                    PathNode.CurveTo(4.0f, 7.867f, 4.394f, 7.196f, 5.03f, 6.843f),
                    PathNode.LineTo(11.03f, 3.261f),
                    PathNode.CurveTo(11.651445f, 2.913737f, 12.408555f, 2.913737f, 13.03f, 3.261f),
                    PathNode.LineTo(16.0f, 5.0f)
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
        return _serverless!!
    }

private var _serverless: ImageVector? = null
