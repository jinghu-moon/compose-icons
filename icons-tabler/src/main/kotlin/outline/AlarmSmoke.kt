package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlarmSmoke: ImageVector
    get() {
        if (_alarmSmoke != null) return _alarmSmoke!!
        _alarmSmoke = tablerOutlineIcon(
            name = "AlarmSmoke",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 8.000 L 17.200 11.000 C 17.083 11.573 16.585 11.988 16.000 12.000 L 8.000 12.000 C 7.415 11.988 6.917 11.573 6.800 11.000 L 6.000 8.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 5.000 C 3.000 4.448 3.448 4.000 4.000 4.000 L 20.000 4.000 C 20.552 4.000 21.000 4.448 21.000 5.000 L 21.000 7.000 C 21.000 7.552 20.552 8.000 20.000 8.000 L 4.000 8.000 C 3.448 8.000 3.000 7.552 3.000 7.000 L 3.000 5.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 16.000 C 12.643 16.288 13.017 16.756 13.000 17.250 C 13.017 17.744 12.643 18.212 12.000 18.500 C 11.357 18.788 10.983 19.256 11.000 19.750 C 10.983 20.244 11.357 20.712 12.000 21.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 7.000 16.000 C 7.643 16.288 8.017 16.756 8.000 17.250 C 8.017 17.744 7.643 18.212 7.000 18.500 C 6.357 18.788 5.983 19.256 6.000 19.750 C 5.983 20.244 6.357 20.712 7.000 21.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 17.000 16.000 C 17.643 16.288 18.017 16.756 18.000 17.250 C 18.017 17.744 17.643 18.212 17.000 18.500 C 16.357 18.788 15.983 19.256 16.000 19.750 C 15.983 20.244 16.357 20.712 17.000 21.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _alarmSmoke!!
    }

private var _alarmSmoke: ImageVector? = null
