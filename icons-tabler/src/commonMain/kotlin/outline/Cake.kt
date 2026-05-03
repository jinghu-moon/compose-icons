package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cake: ImageVector
    get() {
        if (_cake != null) return _cake!!
        _cake = tablerOutlineIcon(
            name = "Cake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 20.0f),
                    PathNode.LineTo(21.0f, 20.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 10.343145f, 19.656855f, 9.0f, 18.0f, 9.0f),
                    PathNode.LineTo(6.0f, 9.0f),
                    PathNode.CurveTo(4.343146f, 9.0f, 3.0f, 10.343145f, 3.0f, 12.0f),
                    PathNode.LineTo(3.0f, 20.0f)
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
                    PathNode.MoveTo(3.0f, 14.803f),
                    PathNode.CurveTo(3.312f, 14.938f, 3.654f, 15.007f, 4.0f, 15.0f),
                    PathNode.CurveTo(4.790712f, 15.016563f, 5.538824f, 14.642508f, 6.0f, 14.0f),
                    PathNode.CurveTo(6.461177f, 13.357492f, 7.209288f, 12.983437f, 8.0f, 13.0f),
                    PathNode.CurveTo(8.790711f, 12.983437f, 9.538824f, 13.357492f, 10.0f, 14.0f),
                    PathNode.CurveTo(10.461176f, 14.642508f, 11.209289f, 15.016563f, 12.0f, 15.0f),
                    PathNode.CurveTo(12.790711f, 15.016563f, 13.538824f, 14.642508f, 14.0f, 14.0f),
                    PathNode.CurveTo(14.461176f, 13.357492f, 15.209289f, 12.983437f, 16.0f, 13.0f),
                    PathNode.CurveTo(16.790712f, 12.983437f, 17.538824f, 13.357492f, 18.0f, 14.0f),
                    PathNode.CurveTo(18.461176f, 14.642508f, 19.209288f, 15.016563f, 20.0f, 15.0f),
                    PathNode.CurveTo(20.35f, 15.007f, 20.692f, 14.938f, 21.0f, 14.803f)
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
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.LineTo(13.465f, 5.638f),
                    PathNode.CurveTo(14.192967f, 6.420593f, 14.17696f, 7.637252f, 13.428656f, 8.40042f),
                    PathNode.CurveTo(12.68035f, 9.16359f, 11.464241f, 9.203522f, 10.667483f, 8.491086f),
                    PathNode.CurveTo(9.870726f, 7.778651f, 9.77494f, 6.565662f, 10.45f, 5.737f),
                    PathNode.LineTo(12.0f, 4.0f)
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
        return _cake!!
    }

private var _cake: ImageVector? = null
