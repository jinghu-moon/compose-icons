package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CakeOff: ImageVector
    get() {
        if (_cakeOff != null) return _cakeOff!!
        _cakeOff = tablerOutlineIcon(
            name = "CakeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 17.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 10.343145f, 19.656855f, 9.0f, 18.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.LineTo(6.0f, 9.0f),
                    PathNode.CurveTo(4.343146f, 9.0f, 3.0f, 10.343145f, 3.0f, 12.0f),
                    PathNode.LineTo(3.0f, 20.0f),
                    PathNode.LineTo(20.0f, 20.0f)
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
                    PathNode.MoveTo(3.0f, 14.803f),
                    PathNode.CurveTo(3.312f, 14.938f, 3.654f, 15.007f, 4.0f, 15.0f),
                    PathNode.CurveTo(4.790712f, 15.016563f, 5.538824f, 14.642508f, 6.0f, 14.0f),
                    PathNode.CurveTo(6.461177f, 13.357492f, 7.209288f, 12.983437f, 8.0f, 13.0f),
                    PathNode.CurveTo(8.790711f, 12.983437f, 9.538824f, 13.357492f, 10.0f, 14.0f),
                    PathNode.CurveTo(10.461176f, 14.642508f, 11.209289f, 15.016563f, 12.0f, 15.0f),
                    PathNode.CurveTo(12.790711f, 15.016563f, 13.538824f, 14.642508f, 14.0f, 14.0f),
                    PathNode.MoveTo(18.0f, 14.0f),
                    PathNode.CurveTo(18.461176f, 14.642508f, 19.209288f, 15.016563f, 20.0f, 15.0f),
                    PathNode.CurveTo(20.35f, 15.007f, 20.692f, 14.938f, 21.0f, 14.803f)
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
                    PathNode.MoveTo(10.172f, 6.188f),
                    PathNode.CurveTo(10.242f, 6.03f, 10.335f, 5.878f, 10.45f, 5.737f),
                    PathNode.LineTo(12.0f, 4.0f),
                    PathNode.LineTo(13.465f, 5.638f),
                    PathNode.CurveTo(13.905306f, 6.110824f, 14.09008f, 6.767225f, 13.961082f, 7.400306f),
                    PathNode.CurveTo(13.832085f, 8.033386f, 13.405207f, 8.565155f, 12.815f, 8.828f)
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
        return _cakeOff!!
    }

private var _cakeOff: ImageVector? = null
