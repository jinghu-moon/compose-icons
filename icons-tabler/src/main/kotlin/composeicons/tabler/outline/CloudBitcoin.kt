package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudBitcoin: ImageVector
    get() {
        if (_cloudBitcoin != null) return _cloudBitcoin!!
        _cloudBitcoin = tablerOutlineIcon(
            name = "CloudBitcoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 21.0f),
                    PathNode.LineTo(17.0f, 15.0f),
                    PathNode.MoveTo(19.0f, 15.0f),
                    PathNode.LineTo(19.0f, 13.5f),
                    PathNode.MoveTo(19.0f, 22.5f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.MoveTo(17.0f, 18.0f),
                    PathNode.LineTo(20.0f, 18.0f),
                    PathNode.MoveTo(19.0f, 18.0f),
                    PathNode.LineTo(19.5f, 18.0f),
                    PathNode.CurveTo(20.328426f, 18.0f, 21.0f, 18.671574f, 21.0f, 19.5f),
                    PathNode.CurveTo(21.0f, 20.328426f, 20.328426f, 21.0f, 19.5f, 21.0f),
                    PathNode.LineTo(16.0f, 21.0f),
                    PathNode.MoveTo(19.0f, 18.0f),
                    PathNode.LineTo(19.5f, 18.0f),
                    PathNode.CurveTo(20.328426f, 18.0f, 21.0f, 17.328426f, 21.0f, 16.5f),
                    PathNode.CurveTo(21.0f, 15.671573f, 20.328426f, 15.0f, 19.5f, 15.0f),
                    PathNode.LineTo(16.0f, 15.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.5f, 18.004f),
                    PathNode.LineTo(6.657f, 18.004f),
                    PathNode.CurveTo(4.085f, 18.0f, 2.0f, 15.993f, 2.0f, 13.517f),
                    PathNode.CurveTo(2.0f, 11.041f, 4.085f, 9.035f, 6.657f, 9.035f),
                    PathNode.CurveTo(7.05f, 7.273f, 8.451f, 5.835f, 10.332f, 5.262f),
                    PathNode.CurveTo(12.212f, 4.69f, 14.288f, 5.069f, 15.776f, 6.262f),
                    PathNode.CurveTo(17.056f, 7.285f, 17.733f, 8.772f, 17.649f, 10.289f)
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
        return _cloudBitcoin!!
    }

private var _cloudBitcoin: ImageVector? = null
