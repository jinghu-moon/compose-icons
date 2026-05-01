package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockRecord: ImageVector
    get() {
        if (_clockRecord != null) return _clockRecord!!
        _clockRecord = tablerOutlineIcon(
            name = "ClockRecord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 12.3f),
                    PathNode.CurveTo(21.123442f, 8.606073f, 18.975967f, 5.212197f, 15.584952f, 3.742043f),
                    PathNode.CurveTo(12.193938f, 2.271889f, 8.248837f, 3.024366f, 5.637033f, 5.639478f),
                    PathNode.CurveTo(3.02523f, 8.25459f, 2.277748f, 12.200642f, 3.752194f, 15.589791f),
                    PathNode.CurveTo(5.22664f, 18.97894f, 8.623233f, 21.122118f, 12.317f, 20.994f)
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.LineTo(14.0f, 14.0f)
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
                    PathNode.MoveTo(16.0f, 19.0f),
                    PathNode.CurveTo(16.0f, 20.656855f, 17.343145f, 22.0f, 19.0f, 22.0f),
                    PathNode.CurveTo(20.656855f, 22.0f, 22.0f, 20.656855f, 22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 17.343145f, 20.656855f, 16.0f, 19.0f, 16.0f),
                    PathNode.CurveTo(17.343145f, 16.0f, 16.0f, 17.343145f, 16.0f, 19.0f)
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
        return _clockRecord!!
    }

private var _clockRecord: ImageVector? = null
