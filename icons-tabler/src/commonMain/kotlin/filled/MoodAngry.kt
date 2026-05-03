package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodAngry: ImageVector
    get() {
        if (_moodAngry != null) return _moodAngry!!
        _moodAngry = tablerFilledIcon(
            name = "MoodAngry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477153f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477153f, 6.477153f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(12.0f, 14.0f),
                    PathNode.CurveTo(10.790799f, 13.999904f, 9.632441f, 14.486458f, 8.786f, 15.35f),
                    PathNode.CurveTo(8.529853f, 15.603911f, 8.430281f, 15.976083f, 8.525418f, 16.323978f),
                    PathNode.CurveTo(8.620556f, 16.671875f, 8.89566f, 16.941586f, 9.245372f, 17.029816f),
                    PathNode.CurveTo(9.595083f, 17.118046f, 9.96521f, 17.011124f, 10.214f, 16.75f),
                    PathNode.CurveTo(10.684243f, 16.269903f, 11.327972f, 15.999344f, 12.0f, 15.999344f),
                    PathNode.CurveTo(12.672028f, 15.999344f, 13.315757f, 16.269903f, 13.786f, 16.75f),
                    PathNode.CurveTo(14.174276f, 17.134888f, 14.799678f, 17.136614f, 15.190072f, 16.753874f),
                    PathNode.CurveTo(15.580466f, 16.371134f, 15.591125f, 15.745821f, 15.214f, 15.35f),
                    PathNode.CurveTo(14.367559f, 14.486458f, 13.209201f, 13.999904f, 12.0f, 14.0f),
                    PathNode.MoveTo(8.447f, 8.105f),
                    PathNode.CurveTo(7.956548f, 7.87844f, 7.374822f, 8.08239f, 7.133214f, 8.565607f),
                    PathNode.CurveTo(6.891605f, 9.048823f, 7.077481f, 9.636574f, 7.553f, 9.893f),
                    PathNode.LineTo(9.553f, 10.893f),
                    PathNode.CurveTo(10.043452f, 11.11956f, 10.625178f, 10.91561f, 10.866787f, 10.432393f),
                    PathNode.CurveTo(11.108395f, 9.949177f, 10.92252f, 9.361425f, 10.447f, 9.105f),
                    PathNode.Close,
                    PathNode.MoveTo(16.894f, 8.552f),
                    PathNode.CurveTo(16.646942f, 8.058473f, 16.046762f, 7.858413f, 15.553f, 8.105f),
                    PathNode.LineTo(13.553f, 9.105f),
                    PathNode.CurveTo(13.07748f, 9.361425f, 12.891605f, 9.949177f, 13.133213f, 10.432393f),
                    PathNode.CurveTo(13.374822f, 10.91561f, 13.956548f, 11.11956f, 14.447f, 10.893f),
                    PathNode.LineTo(16.447f, 9.893f),
                    PathNode.CurveTo(16.940525f, 9.645942f, 17.140587f, 9.045763f, 16.894f, 8.552f)
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
        return _moodAngry!!
    }

private var _moodAngry: ImageVector? = null
