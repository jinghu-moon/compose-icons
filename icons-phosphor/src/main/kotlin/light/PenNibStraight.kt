package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) return _penNibStraight!!
        _penNibStraight = phosphorLightIcon(
            name = "PenNibStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.54f, 124.77f),
                    PathNode.CurveTo(220.49785f, 124.67266f, 220.4477f, 124.57901f, 220.39f, 124.49f),
                    PathNode.LineTo(190.0f, 70.42f),
                    PathNode.LineTo(190.0f, 32.0f),
                    PathNode.CurveTo(190.0f, 24.268015f, 183.73198f, 18.0f, 176.0f, 18.0f),
                    PathNode.LineTo(80.0f, 18.0f),
                    PathNode.CurveTo(72.26801f, 18.0f, 66.0f, 24.268015f, 66.0f, 32.0f),
                    PathNode.LineTo(66.0f, 70.44f),
                    PathNode.LineTo(35.6f, 124.49f),
                    PathNode.CurveTo(35.542313f, 124.57901f, 35.492134f, 124.67266f, 35.45f, 124.77f),
                    PathNode.CurveTo(33.130028f, 129.46082f, 33.619904f, 135.05391f, 36.72f, 139.27f),
                    PathNode.CurveTo(36.7499f, 139.3042f, 36.776676f, 139.34102f, 36.8f, 139.38f),
                    PathNode.LineTo(123.24f, 251.66f),
                    PathNode.CurveTo(124.37582f, 253.13594f, 126.132614f, 254.00076f, 127.995f, 254.00076f),
                    PathNode.CurveTo(129.85739f, 254.00076f, 131.61418f, 253.13594f, 132.75f, 251.66f),
                    PathNode.LineTo(219.18f, 139.38f),
                    PathNode.CurveTo(219.20332f, 139.34102f, 219.2301f, 139.3042f, 219.26f, 139.27f),
                    PathNode.CurveTo(222.36336f, 135.05585f, 222.8571f, 129.46265f, 220.54f, 124.77f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 30.0f),
                    PathNode.LineTo(176.0f, 30.0f),
                    PathNode.CurveTo(177.10457f, 30.0f, 178.0f, 30.89543f, 178.0f, 32.0f),
                    PathNode.LineTo(178.0f, 66.0f),
                    PathNode.LineTo(78.0f, 66.0f),
                    PathNode.LineTo(78.0f, 32.0f),
                    PathNode.CurveTo(78.0f, 30.89543f, 78.89543f, 30.0f, 80.0f, 30.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 146.0f),
                    PathNode.CurveTo(120.26801f, 146.0f, 114.0f, 139.73198f, 114.0f, 132.0f),
                    PathNode.CurveTo(114.0f, 124.26801f, 120.26801f, 118.0f, 128.0f, 118.0f),
                    PathNode.CurveTo(135.73198f, 118.0f, 142.0f, 124.26801f, 142.0f, 132.0f),
                    PathNode.CurveTo(142.0f, 139.73198f, 135.73198f, 146.0f, 128.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(209.63f, 132.12f),
                    PathNode.LineTo(134.0f, 230.38f),
                    PathNode.LineTo(134.0f, 157.29f),
                    PathNode.CurveTo(146.83488f, 154.24594f, 155.35637f, 142.07297f, 153.82396f, 128.97133f),
                    PathNode.CurveTo(152.29155f, 115.869705f, 141.19093f, 105.991776f, 128.0f, 105.991776f),
                    PathNode.CurveTo(114.80907f, 105.991776f, 103.70845f, 115.869705f, 102.17604f, 128.97133f),
                    PathNode.CurveTo(100.64363f, 142.07297f, 109.16511f, 154.24594f, 122.0f, 157.29f),
                    PathNode.LineTo(122.0f, 230.36f),
                    PathNode.LineTo(46.37f, 132.12f),
                    PathNode.CurveTo(45.974827f, 131.55426f, 45.89923f, 130.82475f, 46.17f, 130.19f),
                    PathNode.LineTo(75.52f, 78.0f),
                    PathNode.LineTo(180.52f, 78.0f),
                    PathNode.LineTo(209.86f, 130.19f),
                    PathNode.CurveTo(210.12212f, 130.82983f, 210.03514f, 131.55968f, 209.63f, 132.12f),
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
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
