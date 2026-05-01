package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PaperBagOff: ImageVector
    get() {
        if (_paperBagOff != null) return _paperBagOff!!
        _paperBagOff = tablerOutlineIcon(
            name = "PaperBagOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.158f, 3.185f),
                    PathNode.CurveTo(7.414f, 3.066f, 7.7f, 3.0f, 8.0f, 3.0f),
                    PathNode.LineTo(16.0f, 3.0f),
                    PathNode.CurveTo(17.10457f, 3.0f, 18.0f, 3.895431f, 18.0f, 5.0f),
                    PathNode.LineTo(18.0f, 6.82f),
                    PathNode.CurveTo(18.000053f, 7.596214f, 18.180824f, 8.361755f, 18.528f, 9.056f),
                    PathNode.LineTo(19.472f, 10.944f),
                    PathNode.CurveTo(19.819176f, 11.638246f, 19.999947f, 12.403787f, 20.0f, 13.18f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.MoveTo(19.823f, 19.824f),
                    PathNode.CurveTo(19.49919f, 20.540146f, 18.78595f, 21.000248f, 18.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.895431f, 21.0f, 4.0f, 20.10457f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 13.18f),
                    PathNode.CurveTo(4.000053f, 12.403787f, 4.180825f, 11.638246f, 4.528f, 10.944f),
                    PathNode.LineTo(6.0f, 8.0f),
                    PathNode.LineTo(6.0f, 6.0f)
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
                    PathNode.MoveTo(13.185f, 13.173f),
                    PathNode.CurveTo(12.371775f, 13.536617f, 11.89707f, 14.394253f, 12.020735f, 15.276443f),
                    PathNode.CurveTo(12.144401f, 16.158634f, 12.83662f, 16.85269f, 13.718481f, 16.978691f),
                    PathNode.CurveTo(14.600341f, 17.104692f, 15.45923f, 16.63226f, 15.825f, 15.82f)
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
                    PathNode.MoveTo(6.0f, 21.0f),
                    PathNode.CurveTo(7.10457f, 21.0f, 8.0f, 20.10457f, 8.0f, 19.0f),
                    PathNode.LineTo(8.0f, 13.18f),
                    PathNode.CurveTo(7.999947f, 12.403787f, 7.819175f, 11.638246f, 7.472f, 10.944f),
                    PathNode.LineTo(6.0f, 8.0f)
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
                    PathNode.MoveTo(11.0f, 7.0f),
                    PathNode.LineTo(13.0f, 7.0f)
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
        return _paperBagOff!!
    }

private var _paperBagOff: ImageVector? = null
