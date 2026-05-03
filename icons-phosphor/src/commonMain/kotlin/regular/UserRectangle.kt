package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserRectangle: ImageVector
    get() {
        if (_userRectangle != null) return _userRectangle!!
        _userRectangle = phosphorRegularIcon(
            name = "UserRectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 120.0f),
                    PathNode.CurveTo(96.0f, 102.32689f, 110.32689f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(145.67311f, 88.0f, 160.0f, 102.32689f, 160.0f, 120.0f),
                    PathNode.CurveTo(160.0f, 137.67311f, 145.67311f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(110.32689f, 152.0f, 96.0f, 137.67311f, 96.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.57f, 200.0f),
                    PathNode.CurveTo(84.00136f, 180.19406f, 105.131874f, 167.99242f, 128.0f, 167.99242f),
                    PathNode.CurveTo(150.86812f, 167.99242f, 171.99864f, 180.19406f, 183.43f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(201.33f, 200.0f),
                    PathNode.CurveTo(192.88547f, 180.71507f, 177.19147f, 165.52757f, 157.64f, 157.72f),
                    PathNode.CurveTo(173.73793f, 145.08226f, 180.05228f, 123.6275f, 173.36661f, 104.28435f),
                    PathNode.CurveTo(166.68095f, 84.941185f, 148.46597f, 71.9646f, 128.0f, 71.9646f),
                    PathNode.CurveTo(107.534035f, 71.9646f, 89.319046f, 84.941185f, 82.633385f, 104.28435f),
                    PathNode.CurveTo(75.94773f, 123.6275f, 82.26207f, 145.08226f, 98.36f, 157.72f),
                    PathNode.CurveTo(78.808525f, 165.52757f, 63.114532f, 180.71507f, 54.67f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userRectangle!!
    }

private var _userRectangle: ImageVector? = null
