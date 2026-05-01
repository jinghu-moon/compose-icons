package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) return _appStoreLogo!!
        _appStoreLogo = phosphorRegularIcon(
            name = "AppStoreLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(64.34f, 196.07f),
                    PathNode.LineTo(54.89f, 212.07f),
                    PathNode.CurveTo(52.6422f, 215.87524f, 47.73524f, 217.1378f, 43.93f, 214.89f),
                    PathNode.CurveTo(40.12476f, 212.6422f, 38.8622f, 207.73524f, 41.11f, 203.93f),
                    PathNode.LineTo(50.57f, 187.93f),
                    PathNode.CurveTo(51.99f, 185.40065f, 54.6679f, 183.83812f, 57.56858f, 183.84633f),
                    PathNode.CurveTo(60.469265f, 183.85457f, 63.138237f, 185.43233f, 64.543846f, 187.9697f),
                    PathNode.CurveTo(65.949455f, 190.5071f, 65.87145f, 193.60654f, 64.34f, 196.07f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 152.0f),
                    PathNode.LineTo(184.2f, 152.0f),
                    PathNode.LineTo(153.47f, 100.0f),
                    PathNode.CurveTo(152.05f, 97.47065f, 149.3721f, 95.908104f, 146.47142f, 95.91634f),
                    PathNode.CurveTo(143.57074f, 95.92458f, 140.90176f, 97.50232f, 139.49615f, 100.0397f),
                    PathNode.CurveTo(138.09055f, 102.57708f, 138.16855f, 105.67653f, 139.7f, 108.14f),
                    PathNode.LineTo(201.11f, 212.07f),
                    PathNode.CurveTo(203.3578f, 215.87524f, 208.26476f, 217.1378f, 212.07f, 214.89f),
                    PathNode.CurveTo(215.87524f, 212.6422f, 217.1378f, 207.73524f, 214.89f, 203.93f),
                    PathNode.LineTo(193.66f, 168.0f),
                    PathNode.LineTo(232.0f, 168.0f),
                    PathNode.CurveTo(236.41827f, 168.0f, 240.0f, 164.41827f, 240.0f, 160.0f),
                    PathNode.CurveTo(240.0f, 155.58173f, 236.41827f, 152.0f, 232.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(142.47f, 152.0f),
                    PathNode.LineTo(90.38f, 152.0f),
                    PathNode.LineTo(158.89f, 36.07f),
                    PathNode.CurveTo(161.1378f, 32.26476f, 159.87524f, 27.3578f, 156.07f, 25.11f),
                    PathNode.CurveTo(152.26476f, 22.862202f, 147.3578f, 24.124758f, 145.11f, 27.93f),
                    PathNode.LineTo(128.0f, 56.89f),
                    PathNode.LineTo(110.89f, 27.89f),
                    PathNode.CurveTo(108.642204f, 24.084759f, 103.735245f, 22.8222f, 99.93f, 25.07f),
                    PathNode.CurveTo(96.12475f, 27.317799f, 94.8622f, 32.22476f, 97.11f, 36.03f),
                    PathNode.LineTo(118.71f, 72.58f),
                    PathNode.LineTo(71.8f, 152.0f),
                    PathNode.LineTo(24.0f, 152.0f),
                    PathNode.CurveTo(19.581722f, 152.0f, 16.0f, 155.58173f, 16.0f, 160.0f),
                    PathNode.CurveTo(16.0f, 164.41827f, 19.581722f, 168.0f, 24.0f, 168.0f),
                    PathNode.LineTo(142.47f, 168.0f),
                    PathNode.CurveTo(146.88828f, 168.0f, 150.47f, 164.41827f, 150.47f, 160.0f),
                    PathNode.CurveTo(150.47f, 155.58173f, 146.88828f, 152.0f, 142.47f, 152.0f),
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
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
