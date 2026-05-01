package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Deaf: ImageVector
    get() {
        if (_deaf != null) return _deaf!!
        _deaf = tablerOutlineIcon(
            name = "Deaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 10.0f),
                    PathNode.CurveTo(5.997656f, 7.041563f, 7.855435f, 4.401079f, 10.640786f, 3.403996f),
                    PathNode.CurveTo(13.426137f, 2.406913f, 16.537582f, 3.268544f, 18.413265f, 5.556375f),
                    PathNode.CurveTo(20.288948f, 7.844206f, 20.523827f, 11.064195f, 19.0f, 13.6f),
                    PathNode.CurveTo(18.431458f, 14.358057f, 17.758057f, 15.031458f, 17.0f, 15.6f),
                    PathNode.CurveTo(16.113735f, 16.434784f, 15.429698f, 17.46084f, 15.0f, 18.6f),
                    PathNode.CurveTo(14.371685f, 19.787363f, 13.245753f, 20.631926f, 11.929992f, 20.902819f),
                    PathNode.CurveTo(10.614231f, 21.17371f, 9.246248f, 20.8426f, 8.2f, 20.0f)
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
                    PathNode.MoveTo(10.0f, 10.0f),
                    PathNode.CurveTo(9.983461f, 8.617128f, 10.914399f, 7.402138f, 12.253949f, 7.058315f),
                    PathNode.CurveTo(13.593498f, 6.714492f, 14.994513f, 7.330938f, 15.646028f, 8.550829f),
                    PathNode.CurveTo(16.297543f, 9.77072f, 16.030716f, 11.277921f, 15.0f, 12.2f)
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
                    PathNode.MoveTo(5.0f, 13.0f),
                    PathNode.LineTo(9.0f, 17.0f)
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
                    PathNode.MoveTo(9.0f, 13.0f),
                    PathNode.LineTo(5.0f, 17.0f)
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
        return _deaf!!
    }

private var _deaf: ImageVector? = null
