package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GrillSpatula: ImageVector
    get() {
        if (_grillSpatula != null) return _grillSpatula!!
        _grillSpatula = tablerOutlineIcon(
            name = "GrillSpatula",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.2f, 10.2f),
                    PathNode.LineTo(16.5f, 16.5f)
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
                    PathNode.MoveTo(19.347f, 16.575f),
                    PathNode.LineTo(20.427f, 17.654f),
                    PathNode.CurveTo(21.192467f, 18.419743f, 21.192244f, 19.661034f, 20.4265f, 20.4265f),
                    PathNode.CurveTo(19.660757f, 21.191969f, 18.419466f, 21.191742f, 17.654f, 20.426f),
                    PathNode.LineTo(16.574f, 19.347f),
                    PathNode.CurveTo(15.808534f, 18.581257f, 15.808757f, 17.339966f, 16.5745f, 16.5745f),
                    PathNode.CurveTo(17.340242f, 15.809033f, 18.581533f, 15.809258f, 19.347f, 16.575f)
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
                    PathNode.MoveTo(3.0f, 7.0f),
                    PathNode.LineTo(6.05f, 10.15f),
                    PathNode.CurveTo(7.18985f, 11.235571f, 8.987569f, 11.213651f, 10.10061f, 10.10061f),
                    PathNode.CurveTo(11.213651f, 8.987569f, 11.235571f, 7.18985f, 10.15f, 6.05f),
                    PathNode.LineTo(7.0f, 3.0f),
                    PathNode.LineTo(3.0f, 7.0f)
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
        return _grillSpatula!!
    }

private var _grillSpatula: ImageVector? = null
