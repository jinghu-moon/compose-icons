package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CrownOff: ImageVector
    get() {
        if (_crownOff != null) return _crownOff!!
        _crownOff = tablerOutlineIcon(
            name = "CrownOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.LineTo(3.135f, 8.673f),
                    PathNode.CurveTo(3.115163f, 8.570491f, 3.161121f, 8.46645f, 3.250257f, 8.412077f),
                    PathNode.CurveTo(3.339393f, 8.357703f, 3.452932f, 8.364452f, 3.535f, 8.429f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.LineTo(9.6f, 9.6f),
                    PathNode.MoveTo(11.196f, 7.206f),
                    PathNode.LineTo(12.0f, 6.0f),
                    PathNode.LineTo(16.0f, 12.0f),
                    PathNode.LineTo(20.464f, 8.429f),
                    PathNode.CurveTo(20.54603f, 8.363677f, 20.660109f, 8.356488f, 20.74969f, 8.410996f),
                    PathNode.CurveTo(20.839272f, 8.465505f, 20.885315f, 8.570125f, 20.865f, 8.673f),
                    PathNode.LineTo(19.502f, 15.491f)
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
        }
        return _crownOff!!
    }

private var _crownOff: ImageVector? = null
