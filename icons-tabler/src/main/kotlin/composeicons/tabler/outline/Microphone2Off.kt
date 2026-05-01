package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Microphone2Off: ImageVector
    get() {
        if (_microphone2Off != null) return _microphone2Off!!
        _microphone2Off = tablerOutlineIcon(
            name = "Microphone2Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.908f, 12.917f),
                    PathNode.CurveTo(19.393063f, 12.457509f, 21.144562f, 10.215939f, 20.98948f, 7.693517f),
                    PathNode.CurveTo(20.834402f, 5.171094f, 18.821505f, 3.160961f, 16.298872f, 3.009346f),
                    PathNode.CurveTo(13.776238f, 2.857732f, 11.537076f, 4.612309f, 11.081f, 7.098f)
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
                    PathNode.MoveTo(10.116f, 10.125f),
                    PathNode.LineTo(3.587f, 17.585f),
                    PathNode.CurveTo(2.805517f, 18.365654f, 2.804846f, 19.632017f, 3.5855f, 20.4135f),
                    PathNode.CurveTo(4.366155f, 21.194983f, 5.632517f, 21.195654f, 6.414f, 20.415f),
                    PathNode.LineTo(13.875f, 13.886f)
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
        return _microphone2Off!!
    }

private var _microphone2Off: ImageVector? = null
