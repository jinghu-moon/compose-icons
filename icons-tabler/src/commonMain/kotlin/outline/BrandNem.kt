package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNem: ImageVector
    get() {
        if (_brandNem != null) return _brandNem!!
        _brandNem = tablerOutlineIcon(
            name = "BrandNem",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.182f, 2.0f),
                    PathNode.CurveTo(14.122f, 2.022f, 16.061f, 2.382f, 18.0f, 3.08f),
                    PathNode.LineTo(18.364f, 3.215f),
                    PathNode.CurveTo(19.62598f, 3.702269f, 20.842667f, 4.299569f, 22.0f, 5.0f),
                    PathNode.CurveTo(22.0f, 10.618f, 20.043f, 15.258f, 16.13f, 18.92f),
                    PathNode.CurveTo(14.89f, 20.159f, 13.63f, 21.124f, 12.35f, 21.818f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.CurveTo(10.6f, 21.297f, 9.223f, 20.271f, 7.87f, 18.921f),
                    PathNode.CurveTo(3.958f, 15.258f, 2.0f, 10.618f, 2.0f, 5.0f),
                    PathNode.CurveTo(4.545f, 3.473f, 7.09f, 2.529f, 9.636f, 2.168f),
                    PathNode.LineTo(10.0f, 2.12f),
                    PathNode.CurveTo(10.603381f, 2.047118f, 11.210275f, 2.007059f, 11.818f, 2.0f),
                    PathNode.LineTo(12.182f, 2.0f)
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
                    PathNode.MoveTo(2.1f, 7.07f),
                    PathNode.CurveTo(4.173f, 13.79f, 7.473f, 14.767f, 12.0f, 10.0f),
                    PathNode.CurveTo(12.0f, 6.0f, 13.357f, 3.647f, 16.07f, 2.94f),
                    PathNode.LineTo(16.66f, 2.83f)
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
                    PathNode.MoveTo(16.35f, 18.51f),
                    PathNode.CurveTo(16.35f, 18.51f, 19.0f, 13.0f, 12.0f, 10.0f)
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
        return _brandNem!!
    }

private var _brandNem: ImageVector? = null
