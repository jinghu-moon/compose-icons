package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BulbOff: ImageVector
    get() {
        if (_bulbOff != null) return _bulbOff!!
        _bulbOff = tablerOutlineIcon(
            name = "BulbOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.LineTo(12.0f, 4.0f),
                    PathNode.MoveTo(20.0f, 12.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.MoveTo(5.6f, 5.6f),
                    PathNode.LineTo(6.3f, 6.3f),
                    PathNode.MoveTo(18.4f, 5.6f),
                    PathNode.LineTo(17.7f, 6.3f)
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
                    PathNode.MoveTo(11.089f, 7.083f),
                    PathNode.CurveTo(12.710528f, 6.782153f, 14.376114f, 7.300256f, 15.540874f, 8.467815f),
                    PathNode.CurveTo(16.705635f, 9.635375f, 17.219738f, 11.302198f, 16.915f, 12.923f),
                    PathNode.MoveTo(15.537f, 15.534f),
                    PathNode.CurveTo(15.369257f, 15.70185f, 15.189806f, 15.857575f, 15.0f, 16.0f),
                    PathNode.CurveTo(14.208162f, 16.783829f, 13.836827f, 17.897835f, 14.0f, 19.0f),
                    PathNode.CurveTo(14.0f, 20.10457f, 13.104569f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(10.895431f, 21.0f, 10.0f, 20.10457f, 10.0f, 19.0f),
                    PathNode.CurveTo(10.163173f, 17.897835f, 9.791838f, 16.783829f, 9.0f, 16.0f),
                    PathNode.CurveTo(7.838629f, 15.129217f, 7.113005f, 13.79671f, 7.011658f, 12.348685f),
                    PathNode.CurveTo(6.910312f, 10.900661f, 7.443248f, 9.480068f, 8.472f, 8.456f)
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
                    PathNode.MoveTo(9.7f, 17.0f),
                    PathNode.LineTo(14.3f, 17.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _bulbOff!!
    }

private var _bulbOff: ImageVector? = null
