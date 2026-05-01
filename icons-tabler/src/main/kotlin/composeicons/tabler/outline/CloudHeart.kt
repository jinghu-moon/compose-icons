package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudHeart: ImageVector
    get() {
        if (_cloudHeart != null) return _cloudHeart!!
        _cloudHeart = tablerOutlineIcon(
            name = "CloudHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 18.004f),
                    PathNode.LineTo(6.657f, 18.004f),
                    PathNode.CurveTo(4.085f, 18.0f, 2.0f, 15.993f, 2.0f, 13.517f),
                    PathNode.CurveTo(2.0f, 11.042f, 4.085f, 9.035f, 6.657f, 9.035f),
                    PathNode.CurveTo(7.05f, 7.273f, 8.451f, 5.835f, 10.332f, 5.262f),
                    PathNode.CurveTo(12.212f, 4.69f, 14.288f, 5.069f, 15.776f, 6.262f),
                    PathNode.CurveTo(17.264f, 7.452f, 17.938f, 9.269f, 17.546f, 11.031f),
                    PathNode.LineTo(18.536f, 11.031f)
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
                    PathNode.MoveTo(18.0f, 22.0f),
                    PathNode.LineTo(21.35f, 18.716f),
                    PathNode.CurveTo(21.765032f, 18.31326f, 21.999672f, 17.759872f, 22.000614f, 17.181555f),
                    PathNode.CurveTo(22.001554f, 16.603237f, 21.768719f, 16.04909f, 21.355f, 15.645f),
                    PathNode.CurveTo(20.486048f, 14.795191f, 19.098206f, 14.792529f, 18.226f, 15.639f),
                    PathNode.LineTo(18.002f, 15.859f),
                    PathNode.LineTo(17.779f, 15.639f),
                    PathNode.CurveTo(16.910172f, 14.78984f, 15.52308f, 14.787179f, 14.651f, 15.633f),
                    PathNode.CurveTo(14.235836f, 16.035604f, 14.001016f, 16.588917f, 13.999886f, 17.167234f),
                    PathNode.CurveTo(13.998755f, 17.745552f, 14.231412f, 18.299776f, 14.645f, 18.704f),
                    PathNode.LineTo(18.0f, 22.0f)
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
        return _cloudHeart!!
    }

private var _cloudHeart: ImageVector? = null
