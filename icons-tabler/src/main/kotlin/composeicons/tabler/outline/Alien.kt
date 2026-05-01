package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = tablerOutlineIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 17.0f),
                    PathNode.CurveTo(11.637626f, 17.278282f, 12.362374f, 17.278282f, 13.0f, 17.0f)
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
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(7.336f, 3.0f, 4.604f, 5.331f, 4.138f, 8.595f),
                    PathNode.CurveTo(3.67046f, 11.609798f, 4.387126f, 14.688592f, 6.138f, 17.187f),
                    PathNode.CurveTo(6.980668f, 18.418825f, 8.070009f, 19.462194f, 9.337f, 20.251f),
                    PathNode.CurveTo(11.003f, 21.251f, 13.001f, 21.251f, 14.667f, 20.251f),
                    PathNode.CurveTo(15.933992f, 19.462194f, 17.023333f, 18.418825f, 17.866f, 17.187f),
                    PathNode.CurveTo(19.609774f, 14.685427f, 20.32577f, 11.609503f, 19.866f, 8.595f),
                    PathNode.CurveTo(19.4f, 5.33f, 16.668f, 3.0f, 12.004f, 3.0f),
                    PathNode.LineTo(12.0f, 3.0f)
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
                    PathNode.MoveTo(8.0f, 11.0f),
                    PathNode.LineTo(10.0f, 13.0f)
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
                    PathNode.MoveTo(16.0f, 11.0f),
                    PathNode.LineTo(14.0f, 13.0f)
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
        return _alien!!
    }

private var _alien: ImageVector? = null
