package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) return _circleHalf!!
        _circleHalf = phosphorRegularIcon(
            name = "CircleHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 40.37f),
                    PathNode.CurveTo(141.41586f, 40.86422f, 146.77296f, 41.868675f, 152.0f, 43.37f),
                    PathNode.LineTo(152.0f, 212.67f),
                    PathNode.CurveTo(146.77296f, 214.17133f, 141.41586f, 215.17578f, 136.0f, 215.67f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 49.63f),
                    PathNode.CurveTo(173.70181f, 52.549225f, 179.06708f, 56.08359f, 184.0f, 60.17f),
                    PathNode.LineTo(184.0f, 195.83f),
                    PathNode.CurveTo(179.06708f, 199.91641f, 173.70181f, 203.45078f, 168.0f, 206.37f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 128.0f),
                    PathNode.CurveTo(40.0547f, 82.52103f, 74.71405f, 44.556038f, 120.0f, 40.37f),
                    PathNode.LineTo(120.0f, 215.63f),
                    PathNode.CurveTo(74.71405f, 211.44395f, 40.0547f, 173.47897f, 40.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 178.54f),
                    PathNode.LineTo(200.0f, 77.46f),
                    PathNode.CurveTo(221.33382f, 107.77632f, 221.33382f, 148.22368f, 200.0f, 178.54f),
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
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
