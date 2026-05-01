package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) return _paperPlaneRight!!
        _paperPlaneRight = phosphorBoldIcon(
            name = "PaperPlaneRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(233.86f, 110.48f),
                    PathNode.LineTo(65.8f, 14.58f),
                    PathNode.CurveTo(58.544872f, 10.515925f, 49.53192f, 11.365294f, 43.16377f, 16.71321f),
                    PathNode.CurveTo(36.795616f, 22.061125f, 34.401142f, 30.791601f, 37.15f, 38.64f),
                    PathNode.LineTo(67.33f, 128.0f),
                    PathNode.LineTo(37.15f, 217.36f),
                    PathNode.CurveTo(34.996998f, 223.47713f, 35.943546f, 230.25844f, 39.689316f, 235.55219f),
                    PathNode.CurveTo(43.435085f, 240.84595f, 49.51505f, 243.99495f, 56.0f, 244.0f),
                    PathNode.CurveTo(59.436794f, 243.99283f, 62.814346f, 243.10454f, 65.81f, 241.42f),
                    PathNode.LineTo(65.9f, 241.36f),
                    PathNode.LineTo(233.9f, 145.29f),
                    PathNode.CurveTo(240.17117f, 141.74017f, 244.04779f, 135.09117f, 244.04779f, 127.885f),
                    PathNode.CurveTo(244.04779f, 120.67883f, 240.17117f, 114.02983f, 233.9f, 110.48f),
                    PathNode.Close,
                    PathNode.MoveTo(63.19f, 215.26f),
                    PathNode.LineTo(88.61f, 140.0f),
                    PathNode.LineTo(144.0f, 140.0f),
                    PathNode.CurveTo(150.62741f, 140.0f, 156.0f, 134.62741f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 121.37258f, 150.62741f, 116.0f, 144.0f, 116.0f),
                    PathNode.LineTo(88.61f, 116.0f),
                    PathNode.LineTo(63.18f, 40.72f),
                    PathNode.LineTo(215.94f, 127.89f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
