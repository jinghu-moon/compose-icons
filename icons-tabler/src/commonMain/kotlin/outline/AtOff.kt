package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AtOff: ImageVector
    get() {
        if (_atOff != null) return _atOff!!
        _atOff = tablerOutlineIcon(
            name = "AtOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.174f, 9.17f),
                    PathNode.CurveTo(7.608825f, 10.7291f, 7.6039f, 13.261825f, 9.163f, 14.827f),
                    PathNode.CurveTo(10.7221f, 16.392176f, 13.254825f, 16.3971f, 14.82f, 14.838f),
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.CurveTo(16.0f, 9.790861f, 14.209139f, 8.0f, 12.0f, 8.0f)
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
                    PathNode.MoveTo(19.695f, 15.697f),
                    PathNode.CurveTo(20.499687f, 15.259092f, 21.000402f, 14.416124f, 21.0f, 13.5f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.CurveTo(21.004263f, 8.872629f, 19.384739f, 5.967248f, 16.722483f, 4.326254f),
                    PathNode.CurveTo(14.060227f, 2.685261f, 10.736956f, 2.543942f, 7.945f, 3.953f),
                    PathNode.MoveTo(5.623f, 5.636f),
                    PathNode.CurveTo(2.585413f, 8.683525f, 2.129862f, 13.454854f, 4.53589f, 17.02212f),
                    PathNode.CurveTo(6.941918f, 20.589382f, 11.536405f, 21.954592f, 15.5f, 20.28f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _atOff!!
    }

private var _atOff: ImageVector? = null
