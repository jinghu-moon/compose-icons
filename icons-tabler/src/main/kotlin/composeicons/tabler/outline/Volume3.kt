package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Volume3: ImageVector
    get() {
        if (_volume3 != null) return _volume3!!
        _volume3 = tablerOutlineIcon(
            name = "Volume3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 10.0f),
                    PathNode.LineTo(20.0f, 14.0f),
                    PathNode.MoveTo(20.0f, 10.0f),
                    PathNode.LineTo(16.0f, 14.0f)
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
        return _volume3!!
    }

private var _volume3: ImageVector? = null
