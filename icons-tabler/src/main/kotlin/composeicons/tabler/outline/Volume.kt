package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Volume: ImageVector
    get() {
        if (_volume != null) return _volume!!
        _volume = tablerOutlineIcon(
            name = "Volume",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.CurveTo(16.25903f, 8.944272f, 17.0f, 10.426213f, 17.0f, 12.0f),
                    PathNode.CurveTo(17.0f, 13.573787f, 16.25903f, 15.055728f, 15.0f, 16.0f)
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
                    PathNode.CurveTo(19.814383f, 6.708679f, 21.043146f, 9.281509f, 21.043146f, 12.0f),
                    PathNode.CurveTo(21.043146f, 14.718491f, 19.814383f, 17.29132f, 17.7f, 19.0f)
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
                    PathNode.MoveTo(6.0f, 15.0f),
                    PathNode.LineTo(4.0f, 15.0f),
                    PathNode.CurveTo(3.447715f, 15.0f, 3.0f, 14.552285f, 3.0f, 14.0f),
                    PathNode.LineTo(3.0f, 10.0f),
                    PathNode.CurveTo(3.0f, 9.447715f, 3.447715f, 9.0f, 4.0f, 9.0f),
                    PathNode.LineTo(6.0f, 9.0f),
                    PathNode.LineTo(9.5f, 4.5f),
                    PathNode.CurveTo(9.680595f, 4.14922f, 10.08996f, 3.982479f, 10.464252f, 4.107243f),
                    PathNode.CurveTo(10.838545f, 4.232007f, 11.065991f, 4.611019f, 11.0f, 5.0f),
                    PathNode.LineTo(11.0f, 19.0f),
                    PathNode.CurveTo(11.065991f, 19.38898f, 10.838545f, 19.767992f, 10.464252f, 19.892757f),
                    PathNode.CurveTo(10.08996f, 20.01752f, 9.680595f, 19.85078f, 9.5f, 19.5f),
                    PathNode.LineTo(6.0f, 15.0f)
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
        return _volume!!
    }

private var _volume: ImageVector? = null
