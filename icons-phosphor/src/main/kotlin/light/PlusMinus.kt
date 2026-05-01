package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) return _plusMinus!!
        _plusMinus = phosphorLightIcon(
            name = "PlusMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.24f, 60.24f),
                    PathNode.LineTo(60.24f, 204.24f),
                    PathNode.CurveTo(57.875923f, 206.44287f, 54.19192f, 206.37787f, 51.907024f, 204.09297f),
                    PathNode.CurveTo(49.622128f, 201.80807f, 49.55713f, 198.12408f, 51.76f, 195.76f),
                    PathNode.LineTo(195.76f, 51.76f),
                    PathNode.CurveTo(198.12408f, 49.55713f, 201.80807f, 49.622128f, 204.09297f, 51.907024f),
                    PathNode.CurveTo(206.37787f, 54.19192f, 206.44287f, 57.875923f, 204.24f, 60.24f),
                    PathNode.Close,
                    PathNode.MoveTo(66.0f, 112.0f),
                    PathNode.CurveTo(66.0f, 115.313705f, 68.686295f, 118.0f, 72.0f, 118.0f),
                    PathNode.CurveTo(75.313705f, 118.0f, 78.0f, 115.313705f, 78.0f, 112.0f),
                    PathNode.LineTo(78.0f, 78.0f),
                    PathNode.LineTo(112.0f, 78.0f),
                    PathNode.CurveTo(115.313705f, 78.0f, 118.0f, 75.313705f, 118.0f, 72.0f),
                    PathNode.CurveTo(118.0f, 68.686295f, 115.313705f, 66.0f, 112.0f, 66.0f),
                    PathNode.LineTo(78.0f, 66.0f),
                    PathNode.LineTo(78.0f, 32.0f),
                    PathNode.CurveTo(78.0f, 28.68629f, 75.313705f, 26.0f, 72.0f, 26.0f),
                    PathNode.CurveTo(68.686295f, 26.0f, 66.0f, 28.68629f, 66.0f, 32.0f),
                    PathNode.LineTo(66.0f, 66.0f),
                    PathNode.LineTo(32.0f, 66.0f),
                    PathNode.CurveTo(28.68629f, 66.0f, 26.0f, 68.686295f, 26.0f, 72.0f),
                    PathNode.CurveTo(26.0f, 75.313705f, 28.68629f, 78.0f, 32.0f, 78.0f),
                    PathNode.LineTo(66.0f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 178.0f),
                    PathNode.LineTo(144.0f, 178.0f),
                    PathNode.CurveTo(140.6863f, 178.0f, 138.0f, 180.6863f, 138.0f, 184.0f),
                    PathNode.CurveTo(138.0f, 187.3137f, 140.6863f, 190.0f, 144.0f, 190.0f),
                    PathNode.LineTo(224.0f, 190.0f),
                    PathNode.CurveTo(227.3137f, 190.0f, 230.0f, 187.3137f, 230.0f, 184.0f),
                    PathNode.CurveTo(230.0f, 180.6863f, 227.3137f, 178.0f, 224.0f, 178.0f),
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
        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null
