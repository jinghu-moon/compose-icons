package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CompassRose: ImageVector
    get() {
        if (_compassRose != null) return _compassRose!!
        _compassRose = phosphorFillIcon(
            name = "CompassRose",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(249.94f, 120.24f),
                    PathNode.LineTo(222.89f, 113.48f),
                    PathNode.CurveTo(216.58408f, 71.98395f, 184.01605f, 39.41592f, 142.52f, 33.11f),
                    PathNode.LineTo(135.76f, 6.11f),
                    PathNode.CurveTo(134.868f, 2.550885f, 131.66919f, 0.054839f, 128.0f, 0.054839f),
                    PathNode.CurveTo(124.33081f, 0.054839f, 121.132f, 2.550885f, 120.24f, 6.11f),
                    PathNode.LineTo(113.48f, 33.16f),
                    PathNode.CurveTo(71.98395f, 39.46592f, 39.41592f, 72.03394f, 33.11f, 113.53f),
                    PathNode.LineTo(6.11f, 120.29f),
                    PathNode.CurveTo(2.550885f, 121.182f, 0.054839f, 124.380806f, 0.054839f, 128.05f),
                    PathNode.CurveTo(0.054839f, 131.7192f, 2.550885f, 134.918f, 6.11f, 135.81f),
                    PathNode.LineTo(33.16f, 142.57f),
                    PathNode.CurveTo(39.46592f, 184.06606f, 72.03394f, 216.63408f, 113.53f, 222.94f),
                    PathNode.LineTo(120.29f, 249.99f),
                    PathNode.CurveTo(121.182f, 253.54912f, 124.380806f, 256.04517f, 128.05f, 256.04517f),
                    PathNode.CurveTo(131.7192f, 256.04517f, 134.918f, 253.54912f, 135.81f, 249.99f),
                    PathNode.LineTo(142.57f, 222.94f),
                    PathNode.CurveTo(184.06606f, 216.63408f, 216.63408f, 184.06606f, 222.94f, 142.57f),
                    PathNode.LineTo(249.99f, 135.81f),
                    PathNode.CurveTo(253.54912f, 134.918f, 256.04517f, 131.7192f, 256.04517f, 128.05f),
                    PathNode.CurveTo(256.04517f, 124.380806f, 253.54912f, 121.182f, 249.99f, 120.29f),
                    PathNode.Close,
                    PathNode.MoveTo(205.77f, 109.24f),
                    PathNode.LineTo(158.6f, 97.4f),
                    PathNode.LineTo(146.8f, 50.23f),
                    PathNode.CurveTo(175.97192f, 57.25127f, 198.74873f, 80.02808f, 205.77f, 109.2f),
                    PathNode.Close,
                    PathNode.MoveTo(109.2f, 50.24f),
                    PathNode.LineTo(97.4f, 97.4f),
                    PathNode.LineTo(50.23f, 109.2f),
                    PathNode.CurveTo(57.25127f, 80.02808f, 80.02808f, 57.25127f, 109.2f, 50.23f),
                    PathNode.Close,
                    PathNode.MoveTo(50.2f, 146.81f),
                    PathNode.LineTo(97.4f, 158.6f),
                    PathNode.LineTo(109.2f, 205.77f),
                    PathNode.CurveTo(80.02808f, 198.74873f, 57.25127f, 175.97192f, 50.23f, 146.8f),
                    PathNode.Close,
                    PathNode.MoveTo(146.77f, 205.81f),
                    PathNode.LineTo(158.57f, 158.64f),
                    PathNode.LineTo(205.74f, 146.84f),
                    PathNode.CurveTo(198.71056f, 175.98848f, 175.94968f, 198.7455f, 146.8f, 205.77f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _compassRose!!
    }

private var _compassRose: ImageVector? = null
