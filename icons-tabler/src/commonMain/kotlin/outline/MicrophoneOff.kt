package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MicrophoneOff: ImageVector
    get() {
        if (_microphoneOff != null) return _microphoneOff!!
        _microphoneOff = tablerOutlineIcon(
            name = "MicrophoneOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 5.0f),
                    PathNode.CurveTo(9.0f, 3.343146f, 10.343145f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(13.656855f, 2.0f, 15.0f, 3.343146f, 15.0f, 5.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.CurveTo(15.000044f, 10.296153f, 14.956236f, 10.59068f, 14.87f, 10.874f),
                    PathNode.MoveTo(12.87f, 12.874f),
                    PathNode.CurveTo(11.960879f, 13.149484f, 10.975004f, 12.978113f, 10.212174f, 12.412003f),
                    PathNode.CurveTo(9.449344f, 11.845892f, 8.999708f, 10.951942f, 9.0f, 10.002f),
                    PathNode.LineTo(9.0f, 9.002f)
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
                    PathNode.MoveTo(5.0f, 10.0f),
                    PathNode.CurveTo(4.999553f, 12.573847f, 6.411628f, 14.940323f, 8.676966f, 16.162176f),
                    PathNode.CurveTo(10.942305f, 17.384031f, 13.695446f, 17.264145f, 15.846f, 15.85f),
                    PathNode.MoveTo(17.846f, 13.85f),
                    PathNode.CurveTo(18.599821f, 12.707676f, 19.000492f, 11.368628f, 18.998f, 10.0f)
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
                    PathNode.MoveTo(8.0f, 21.0f),
                    PathNode.LineTo(16.0f, 21.0f)
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
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.LineTo(12.0f, 21.0f)
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
        return _microphoneOff!!
    }

private var _microphoneOff: ImageVector? = null
