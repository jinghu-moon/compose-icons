package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserSquare: ImageVector
    get() {
        if (_userSquare != null) return _userSquare!!
        _userSquare = phosphorDuotoneIcon(
            name = "UserSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(43.581722f, 40.0f, 40.0f, 43.581722f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 212.41827f, 43.581722f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(212.41827f, 216.0f, 216.0f, 212.41827f, 216.0f, 208.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 43.581722f, 212.41827f, 40.0f, 208.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(57.78f, 216.0f),
                    PathNode.CurveTo(65.248375f, 183.23262f, 94.3923f, 159.99052f, 128.0f, 160.0f),
                    PathNode.CurveTo(105.90861f, 160.0f, 88.0f, 142.09138f, 88.0f, 120.0f),
                    PathNode.CurveTo(88.0f, 97.90861f, 105.90861f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(150.09138f, 80.0f, 168.0f, 97.90861f, 168.0f, 120.0f),
                    PathNode.CurveTo(168.0f, 142.09138f, 150.09138f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(161.6077f, 159.99052f, 190.75162f, 183.23262f, 198.22f, 216.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 120.0f),
                    PathNode.CurveTo(96.0f, 102.32689f, 110.32689f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(145.67311f, 88.0f, 160.0f, 102.32689f, 160.0f, 120.0f),
                    PathNode.CurveTo(160.0f, 137.67311f, 145.67311f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(110.32689f, 152.0f, 96.0f, 137.67311f, 96.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.67f, 208.0f),
                    PathNode.CurveTo(72.767265f, 197.92345f, 79.34828f, 189.04784f, 87.8f, 182.2f),
                    PathNode.CurveTo(111.25568f, 163.2656f, 144.74432f, 163.2656f, 168.2f, 182.2f),
                    PathNode.CurveTo(176.65172f, 189.04784f, 183.23274f, 197.92345f, 187.33f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(204.33f, 208.0f),
                    PathNode.CurveTo(197.12805f, 185.06438f, 179.97855f, 166.59258f, 157.64f, 157.71f),
                    PathNode.CurveTo(173.73793f, 145.07227f, 180.05228f, 123.6175f, 173.36661f, 104.274345f),
                    PathNode.CurveTo(166.68095f, 84.93118f, 148.46597f, 71.9546f, 128.0f, 71.9546f),
                    PathNode.CurveTo(107.534035f, 71.9546f, 89.319046f, 84.93118f, 82.633385f, 104.274345f),
                    PathNode.CurveTo(75.94773f, 123.6175f, 82.26207f, 145.07227f, 98.36f, 157.71f),
                    PathNode.CurveTo(76.02145f, 166.59258f, 58.87195f, 185.06438f, 51.67f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userSquare!!
    }

private var _userSquare: ImageVector? = null
