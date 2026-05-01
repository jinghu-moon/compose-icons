package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GoodreadsLogo: ImageVector
    get() {
        if (_goodreadsLogo != null) return _goodreadsLogo!!
        _goodreadsLogo = phosphorLightIcon(
            name = "GoodreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 26.0f),
                    PathNode.CurveTo(180.6863f, 26.0f, 178.0f, 28.68629f, 178.0f, 32.0f),
                    PathNode.LineTo(178.0f, 51.4f),
                    PathNode.CurveTo(162.15367f, 29.787746f, 134.215f, 20.80308f, 108.74148f, 29.127464f),
                    PathNode.CurveTo(83.267944f, 37.45185f, 66.02618f, 61.200836f, 66.0f, 88.0f),
                    PathNode.LineTo(66.0f, 112.0f),
                    PathNode.CurveTo(66.02618f, 138.79916f, 83.267944f, 162.54816f, 108.74148f, 170.87253f),
                    PathNode.CurveTo(134.215f, 179.19691f, 162.15367f, 170.21225f, 178.0f, 148.6f),
                    PathNode.LineTo(178.0f, 168.0f),
                    PathNode.CurveTo(177.96693f, 195.60052f, 155.60052f, 217.96693f, 128.0f, 218.0f),
                    PathNode.CurveTo(110.91f, 218.0f, 94.0f, 209.59f, 84.92f, 196.57f),
                    PathNode.CurveTo(83.72207f, 194.74385f, 81.626465f, 193.71286f, 79.44874f, 193.87825f),
                    PathNode.CurveTo(77.27101f, 194.04366f, 75.35515f, 195.3793f, 74.44675f, 197.36542f),
                    PathNode.CurveTo(73.538345f, 199.35153f, 73.78089f, 201.6744f, 75.08f, 203.43f),
                    PathNode.CurveTo(86.34f, 219.57f, 107.11f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(162.22566f, 229.96143f, 189.96143f, 202.22566f, 190.0f, 168.0f),
                    PathNode.LineTo(190.0f, 32.0f),
                    PathNode.CurveTo(190.0f, 28.68629f, 187.3137f, 26.0f, 184.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 162.0f),
                    PathNode.CurveTo(100.39947f, 161.96693f, 78.03306f, 139.60052f, 78.0f, 112.0f),
                    PathNode.LineTo(78.0f, 88.0f),
                    PathNode.CurveTo(78.0f, 60.38576f, 100.385765f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(155.61424f, 38.0f, 178.0f, 60.38576f, 178.0f, 88.0f),
                    PathNode.LineTo(178.0f, 112.0f),
                    PathNode.CurveTo(177.96693f, 139.60052f, 155.60052f, 161.96693f, 128.0f, 162.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _goodreadsLogo!!
    }

private var _goodreadsLogo: ImageVector? = null
