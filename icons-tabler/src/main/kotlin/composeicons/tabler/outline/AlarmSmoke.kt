package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlarmSmoke: ImageVector
    get() {
        if (_alarmSmoke != null) return _alarmSmoke!!
        _alarmSmoke = tablerOutlineIcon(
            name = "AlarmSmoke",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 8.0f),
                    PathNode.LineTo(17.2f, 11.0f),
                    PathNode.CurveTo(17.083158f, 11.572993f, 16.58467f, 11.9884f, 16.0f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(7.415331f, 11.9884f, 6.916842f, 11.572993f, 6.8f, 11.0f),
                    PathNode.LineTo(6.0f, 8.0f)
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
                    PathNode.MoveTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 4.447716f, 3.447715f, 4.0f, 4.0f, 4.0f),
                    PathNode.LineTo(20.0f, 4.0f),
                    PathNode.CurveTo(20.552284f, 4.0f, 21.0f, 4.447716f, 21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 7.0f),
                    PathNode.CurveTo(21.0f, 7.552285f, 20.552284f, 8.0f, 20.0f, 8.0f),
                    PathNode.LineTo(4.0f, 8.0f),
                    PathNode.CurveTo(3.447715f, 8.0f, 3.0f, 7.552285f, 3.0f, 7.0f),
                    PathNode.LineTo(3.0f, 5.0f)
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
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.CurveTo(12.643f, 16.288f, 13.017f, 16.756f, 13.0f, 17.25f),
                    PathNode.CurveTo(13.017f, 17.744f, 12.643f, 18.212f, 12.0f, 18.5f),
                    PathNode.CurveTo(11.357f, 18.788f, 10.983f, 19.256f, 11.0f, 19.75f),
                    PathNode.CurveTo(10.983f, 20.244f, 11.357f, 20.712f, 12.0f, 21.0f)
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
                    PathNode.MoveTo(7.0f, 16.0f),
                    PathNode.CurveTo(7.643f, 16.288f, 8.017f, 16.756f, 8.0f, 17.25f),
                    PathNode.CurveTo(8.017f, 17.744f, 7.643f, 18.212f, 7.0f, 18.5f),
                    PathNode.CurveTo(6.357f, 18.788f, 5.983f, 19.256f, 6.0f, 19.75f),
                    PathNode.CurveTo(5.983f, 20.244f, 6.357f, 20.712f, 7.0f, 21.0f)
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
                    PathNode.MoveTo(17.0f, 16.0f),
                    PathNode.CurveTo(17.643f, 16.288f, 18.017f, 16.756f, 18.0f, 17.25f),
                    PathNode.CurveTo(18.017f, 17.744f, 17.643f, 18.212f, 17.0f, 18.5f),
                    PathNode.CurveTo(16.357f, 18.788f, 15.983f, 19.256f, 16.0f, 19.75f),
                    PathNode.CurveTo(15.983f, 20.244f, 16.357f, 20.712f, 17.0f, 21.0f)
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
        return _alarmSmoke!!
    }

private var _alarmSmoke: ImageVector? = null
