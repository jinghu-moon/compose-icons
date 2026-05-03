package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Quote: ImageVector
    get() {
        if (_quote != null) return _quote!!
        _quote = tablerFilledIcon(
            name = "Quote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 5.0f),
                    PathNode.CurveTo(10.104569f, 5.0f, 11.0f, 5.895431f, 11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.CurveTo(11.0f, 16.13f, 9.35f, 18.193f, 6.243f, 18.97f),
                    PathNode.CurveTo(5.895425f, 19.059715f, 5.526429f, 18.956251f, 5.276168f, 18.698906f),
                    PathNode.CurveTo(5.025906f, 18.44156f, 4.93278f, 18.06982f, 5.03216f, 17.724884f),
                    PathNode.CurveTo(5.131541f, 17.379948f, 5.408179f, 17.114742f, 5.757f, 17.03f),
                    PathNode.CurveTo(7.984f, 16.473f, 9.0f, 15.203f, 9.0f, 13.0f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.CurveTo(4.953376f, 12.000331f, 4.083497f, 11.193677f, 4.005f, 10.15f),
                    PathNode.LineTo(4.0f, 10.0f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.CurveTo(4.0f, 5.895431f, 4.895431f, 5.0f, 6.0f, 5.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 5.0f),
                    PathNode.CurveTo(19.10457f, 5.0f, 20.0f, 5.895431f, 20.0f, 7.0f),
                    PathNode.LineTo(20.0f, 13.0f),
                    PathNode.CurveTo(20.0f, 16.13f, 18.35f, 18.193f, 15.243f, 18.97f),
                    PathNode.CurveTo(14.895425f, 19.059715f, 14.526428f, 18.956251f, 14.276167f, 18.698906f),
                    PathNode.CurveTo(14.025906f, 18.44156f, 13.932779f, 18.06982f, 14.03216f, 17.724884f),
                    PathNode.CurveTo(14.13154f, 17.379948f, 14.408179f, 17.114742f, 14.757f, 17.03f),
                    PathNode.CurveTo(16.984f, 16.473f, 18.0f, 15.203f, 18.0f, 13.0f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.CurveTo(13.953375f, 12.000331f, 13.083497f, 11.193677f, 13.005f, 10.15f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.CurveTo(13.0f, 5.895431f, 13.895431f, 5.0f, 15.0f, 5.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _quote!!
    }

private var _quote: ImageVector? = null
