package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VolumeOff: ImageVector
    get() {
        if (_volumeOff != null) return _volumeOff!!
        _volumeOff = tablerOutlineIcon(
            name = "VolumeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.CurveTo(16.5267f, 9.145019f, 17.26848f, 11.05922f, 16.912f, 12.934f),
                    PathNode.MoveTo(15.535f, 15.536f),
                    PathNode.CurveTo(15.367858f, 15.703117f, 15.189076f, 15.858172f, 15.0f, 16.0f)
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
                    PathNode.MoveTo(17.7f, 5.0f),
                    PathNode.CurveTo(21.007717f, 7.673128f, 21.99283f, 12.29674f, 20.062f, 16.086f),
                    PathNode.MoveTo(18.386f, 18.385f),
                    PathNode.CurveTo(18.167982f, 18.601578f, 17.939016f, 18.806847f, 17.7f, 19.0f)
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
                    PathNode.MoveTo(9.069f, 5.054f),
                    PathNode.LineTo(9.5f, 4.5f),
                    PathNode.CurveTo(9.680595f, 4.14922f, 10.08996f, 3.982479f, 10.464252f, 4.107243f),
                    PathNode.CurveTo(10.838545f, 4.232007f, 11.065991f, 4.611019f, 11.0f, 5.0f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.MoveTo(11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 19.0f),
                    PathNode.CurveTo(11.065991f, 19.38898f, 10.838545f, 19.767992f, 10.464252f, 19.892757f),
                    PathNode.CurveTo(10.08996f, 20.01752f, 9.680595f, 19.85078f, 9.5f, 19.5f),
                    PathNode.LineTo(6.0f, 15.0f),
                    PathNode.LineTo(4.0f, 15.0f),
                    PathNode.CurveTo(3.447715f, 15.0f, 3.0f, 14.552285f, 3.0f, 14.0f),
                    PathNode.LineTo(3.0f, 10.0f),
                    PathNode.CurveTo(3.0f, 9.447715f, 3.447715f, 9.0f, 4.0f, 9.0f),
                    PathNode.LineTo(6.0f, 9.0f),
                    PathNode.LineTo(7.294f, 7.336f)
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
        return _volumeOff!!
    }

private var _volumeOff: ImageVector? = null
