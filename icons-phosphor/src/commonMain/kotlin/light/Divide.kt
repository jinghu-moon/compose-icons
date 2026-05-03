package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Divide: ImageVector
    get() {
        if (_divide != null) return _divide!!
        _divide = phosphorLightIcon(
            name = "Divide",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 128.0f),
                    PathNode.CurveTo(222.0f, 131.3137f, 219.3137f, 134.0f, 216.0f, 134.0f),
                    PathNode.LineTo(40.0f, 134.0f),
                    PathNode.CurveTo(36.68629f, 134.0f, 34.0f, 131.3137f, 34.0f, 128.0f),
                    PathNode.CurveTo(34.0f, 124.686295f, 36.68629f, 122.0f, 40.0f, 122.0f),
                    PathNode.LineTo(216.0f, 122.0f),
                    PathNode.CurveTo(219.3137f, 122.0f, 222.0f, 124.686295f, 222.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 78.0f),
                    PathNode.CurveTo(135.73198f, 78.0f, 142.0f, 71.73199f, 142.0f, 64.0f),
                    PathNode.CurveTo(142.0f, 56.268013f, 135.73198f, 50.0f, 128.0f, 50.0f),
                    PathNode.CurveTo(120.26801f, 50.0f, 114.0f, 56.268013f, 114.0f, 64.0f),
                    PathNode.CurveTo(114.0f, 71.73199f, 120.26801f, 78.0f, 128.0f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 178.0f),
                    PathNode.CurveTo(120.26801f, 178.0f, 114.0f, 184.26802f, 114.0f, 192.0f),
                    PathNode.CurveTo(114.0f, 199.73198f, 120.26801f, 206.0f, 128.0f, 206.0f),
                    PathNode.CurveTo(135.73198f, 206.0f, 142.0f, 199.73198f, 142.0f, 192.0f),
                    PathNode.CurveTo(142.0f, 184.26802f, 135.73198f, 178.0f, 128.0f, 178.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _divide!!
    }

private var _divide: ImageVector? = null
